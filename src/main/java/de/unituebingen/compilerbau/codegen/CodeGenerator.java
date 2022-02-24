package de.unituebingen.compilerbau.codegen;

import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.DotOperator;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.Ternary;
import de.unituebingen.compilerbau.ast.expression.arithmetic.*;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.*;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.And;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.Or;
import de.unituebingen.compilerbau.ast.expression.literal.BooleanLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.CharLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.*;
import de.unituebingen.compilerbau.ast.statementexpressions.*;
import de.unituebingen.compilerbau.ast.expression.unary.Negate;
import de.unituebingen.compilerbau.ast.expression.unary.Not;
import de.unituebingen.compilerbau.ast.statements.*;
import de.unituebingen.compilerbau.exception.CodeGenException;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodeGenerator {

    String getDescriptor(Type type) {
        if (type.equals(Type.CHAR) || type.equals(Type.INT) || type.equals(Type.BOOLEAN) || type.equals(Type.VOID)) {
            return type.name;
        }
        return "L" + type.name + ";";
    }

    class Scope {
        Scope parent;
        Map<String, LocalOrFieldVar> vars = new HashMap<>();

        Scope(Scope parent) {
            this.parent = parent;
        }

        void add(LocalOrFieldVar variable) {
            vars.put(variable.getName(), variable);
        }

        LocalOrFieldVar get(String name) {
            LocalOrFieldVar variable = vars.get(name);
            if (variable != null) return variable;
            if (variable == null && parent != null) {
                return parent.get(name);
            }
            throw new CodeGenException("Couldn't find symbol '" + name + "'");
        }
    }

    class Visitor implements ASTVisitor {
        Scope scope;
        MethodVisitor mv;
        Clazz clazz;
        int localVarIndex = 0;

        Visitor(Clazz clazz, Scope scope, MethodVisitor mv) {
            this.clazz = clazz;
            this.scope = scope;
            this.mv = mv;
        }

        void addLocal(Identifier identifier) {
            scope.add(new Local(localVarIndex, identifier.name, identifier.getType()));
            localVarIndex += 1;
        }

        @Override
        public void visit(Identifier identifier) {
            LocalOrFieldVar var = scope.get(identifier.name);
            if (var instanceof Local) {
                Local local = (Local) var;
                if (local.getType().equals(Type.BOOLEAN) || local.getType().equals(Type.CHAR) || local.getType().equals(Type.INT))
                    mv.visitVarInsn(ILOAD, local.index);
                else mv.visitVarInsn(ALOAD, local.index);
            } else if (var instanceof Field) {
                Field field = (Field) var;
                if (!field.isStatic) {
                    mv.visitVarInsn(ALOAD, 0);
                }
                mv.visitFieldInsn(field.isStatic ? GETSTATIC : GETFIELD, clazz.name, field.getName(), getDescriptor(field.getType()));
            }
        }

        @Override
        public void visit(IntLiteral intLiteral) {
            mv.visitLdcInsn(intLiteral.value);
        }

        @Override
        public void visit(BooleanLiteral booleanLiteral) {
            if (booleanLiteral.value) {
                mv.visitInsn(ICONST_1);
            } else {
                mv.visitInsn(ICONST_0);
            }
        }

        @Override
        public void visit(CharLiteral charLiteral) {
            mv.visitIntInsn(BIPUSH, charLiteral.value);
        }

        @Override
        public void visit(DotOperator dotOperator) {
            if (!dotOperator.isStatic())
                dotOperator.left.visit(this);
            else mv.visitInsn(POP);
            mv.visitFieldInsn(dotOperator.isStatic() ? GETSTATIC : GETFIELD, dotOperator.left.getType().name, dotOperator.right, getDescriptor(dotOperator.getType()));
        }

        @Override
        public void visit(Add add) {
            add.left.visit(this);
            add.right.visit(this);
            mv.visitInsn(IADD);
        }

        @Override
        public void visit(Divide divide) {
            divide.left.visit(this);
            divide.right.visit(this);
            mv.visitInsn(IDIV);
        }

        @Override
        public void visit(Multiply multiply) {
            multiply.left.visit(this);
            multiply.right.visit(this);
            mv.visitInsn(IMUL);
        }

        @Override
        public void visit(Remainder reminder) {
            reminder.left.visit(this);
            reminder.right.visit(this);
            mv.visitInsn(IREM);
        }

        @Override
        public void visit(Subtract subtract) {
            subtract.left.visit(this);
            subtract.right.visit(this);
            mv.visitInsn(ISUB);
        }

        @Override
        public void visit(And and) {
            Label and_false = new Label();
            Label end = new Label();
            and.left.visit(this);
            mv.visitJumpInsn(IFEQ, and_false);
            and.right.visit(this);
            mv.visitJumpInsn(IFEQ, and_false);
            mv.visitInsn(ICONST_1);
            mv.visitJumpInsn(GOTO, end);
            mv.visitLabel(and_false);
            mv.visitInsn(ICONST_0);
            mv.visitLabel(end);
        }

        @Override
        public void visit(Or or) {
            Label or_false = new Label();
            Label or_true = new Label();
            Label end = new Label();
            or.left.visit(this);
            mv.visitJumpInsn(IFNE, or_true);
            or.right.visit(this);
            mv.visitJumpInsn(IFEQ, or_false);
            mv.visitLabel(or_true);
            mv.visitInsn(ICONST_1);
            mv.visitJumpInsn(GOTO, end);
            mv.visitLabel(or_false);
            mv.visitInsn(ICONST_0);
            mv.visitLabel(end);
        }

        @Override
        public void visit(BitAnd bitand) {
            bitand.left.visit(this);
            bitand.right.visit(this);
            mv.visitInsn(IAND);
        }

        @Override
        public void visit(BitOr bitor) {
            bitor.left.visit(this);
            bitor.right.visit(this);
            mv.visitInsn(IOR);
        }

        @Override
        public void visit(BitXOR bitxor) {
            bitxor.left.visit(this);
            bitxor.right.visit(this);
            mv.visitInsn(IXOR);
        }

        @Override
        public void visit(ShiftLeft shiftLeft) {
            shiftLeft.left.visit(this);
            shiftLeft.right.visit(this);
            mv.visitInsn(ISHL);
        }

        @Override
        public void visit(ShiftRight shiftRight) {
            shiftRight.left.visit(this);
            shiftRight.right.visit(this);
            mv.visitInsn(ISHR);
        }

        @Override
        public void visit(UnsignedShiftRight unsignedShiftRight) {
            unsignedShiftRight.left.visit(this);
            unsignedShiftRight.right.visit(this);
            mv.visitInsn(IUSHR);
        }

        @Override
        public void visit(Ternary ternary) {
            ternary.first.visit(this);
            Label _else = new Label();
            Label end = new Label();
            mv.visitJumpInsn(IFEQ, _else);
            ternary.second.visit(this);
            mv.visitJumpInsn(GOTO, end);
            mv.visitLabel(_else);
            ternary.third.visit(this);
            mv.visitLabel(end);
        }

        void visit(RelationalOperator rel, int op) {
            Label if_true = new Label();
            Label end = new Label();
            rel.left.visit(this);
            rel.right.visit(this);
            mv.visitJumpInsn(op, if_true);
            mv.visitInsn(ICONST_0);
            mv.visitJumpInsn(GOTO, end);
            mv.visitLabel(if_true);
            mv.visitInsn(ICONST_1);
            mv.visitLabel(end);
        }

        @Override
        public void visit(Equal equal) {
            visit(equal, IF_ICMPEQ);
        }

        @Override
        public void visit(NotEqual notEqual) {
            visit(notEqual, IF_ICMPNE);
        }

        @Override
        public void visit(Greater greater) {
            visit(greater, IF_ICMPGT);
        }

        @Override
        public void visit(GreaterOrEqual greaterOrEqual) {
            visit(greaterOrEqual, IF_ICMPGE);
        }

        @Override
        public void visit(Less less) {
            visit(less, IF_ICMPLT);
        }

        @Override
        public void visit(LessOrEqual lessOrEqual) {
            visit(lessOrEqual, IF_ICMPLE);
        }

        @Override
        public void visit(Negate negate) {
            negate.expression.visit(this);
            mv.visitInsn(INEG);
        }

        @Override
        public void visit(Not not) {
            not.expression.visit(this);
            mv.visitInsn(ICONST_M1);
            mv.visitInsn(IXOR);
        }

        @Override
        public void visit(Increment increment) {
            if (increment.expression instanceof Identifier) {
                Identifier ident = (Identifier) increment.expression;
                LocalOrFieldVar var = scope.get(ident.name);
                if (var instanceof Local) {
                    Local local = (Local) var;
                    if (increment.isPostIncrement) {
                        mv.visitVarInsn(ILOAD, local.index);
                        mv.visitIincInsn(local.index, 1);
                    } else {
                        mv.visitIincInsn(local.index, 1);
                        mv.visitVarInsn(ILOAD, local.index);
                    }
                } else if (var instanceof Field) {
                    Field field = (Field) var;
                    if (!field.isStatic) {
                        mv.visitVarInsn(ALOAD, 0);
                        mv.visitInsn(DUP);
                    }
                    mv.visitFieldInsn(field.isStatic ? GETSTATIC : GETFIELD, clazz.name, field.getName(), getDescriptor(field.getType()));
                    if (increment.isPostIncrement) {
                        if (!field.isStatic) mv.visitInsn(DUP_X1);
                        else mv.visitInsn(DUP);
                        mv.visitInsn(ICONST_1);
                        mv.visitInsn(IADD);
                    } else {
                        mv.visitInsn(ICONST_1);
                        mv.visitInsn(IADD);
                        if (!field.isStatic) mv.visitInsn(DUP_X1);
                        else mv.visitInsn(DUP);
                    }
                    mv.visitFieldInsn(field.isStatic ? PUTSTATIC : PUTFIELD, clazz.name, field.getName(), getDescriptor(field.getType()));
                } else {
                    throw new CodeGenException("Illegal operation");
                }
            } else if (increment.expression instanceof DotOperator) {
                DotOperator left = (DotOperator) increment.expression;
                left.left.visit(this);
                if (!left.isStatic())
                    mv.visitInsn(DUP);
                mv.visitFieldInsn(left.isStatic() ? GETSTATIC : GETFIELD, left.left.getType().name, left.right, getDescriptor(left.getType()));
                if (increment.isPostIncrement) {
                    if (!left.isStatic()) mv.visitInsn(DUP_X1);
                    else mv.visitInsn(DUP);
                    mv.visitInsn(ICONST_1);
                    mv.visitInsn(IADD);
                } else {
                    mv.visitInsn(ICONST_1);
                    mv.visitInsn(IADD);
                    if (!left.isStatic()) mv.visitInsn(DUP_X1);
                    else mv.visitInsn(DUP);
                }
                mv.visitFieldInsn(left.isStatic() ? PUTSTATIC : PUTFIELD, left.left.getType().name, left.right, getDescriptor(left.getType()));
            } else {
                throw new CodeGenException("Can only increment variables");
            }
        }

        @Override
        public void visit(Decrement decrement) {
            if (decrement.expression instanceof Identifier) {
                Identifier ident = (Identifier) decrement.expression;
                LocalOrFieldVar var = scope.get(ident.name);
                if (var instanceof Local) {
                    Local local = (Local) var;
                    if (decrement.isPostDecrement) {
                        mv.visitVarInsn(ILOAD, local.index);
                        mv.visitIincInsn(local.index, -1);
                    } else {
                        mv.visitIincInsn(local.index, -1);
                        mv.visitVarInsn(ILOAD, local.index);
                    }
                } else if (var instanceof Field) {
                    Field field = (Field) var;
                    if (!field.isStatic) {
                        mv.visitVarInsn(ALOAD, 0);
                        mv.visitInsn(DUP);
                    }
                    mv.visitFieldInsn(field.isStatic ? GETSTATIC : GETFIELD, clazz.name, field.getName(), getDescriptor(field.getType()));
                    if (decrement.isPostDecrement) {
                        if (!field.isStatic) mv.visitInsn(DUP_X1);
                        else mv.visitInsn(DUP);
                        mv.visitInsn(ICONST_1);
                        mv.visitInsn(ISUB);
                    } else {
                        mv.visitInsn(ICONST_1);
                        mv.visitInsn(ISUB);
                        if (!field.isStatic) mv.visitInsn(DUP_X1);
                        else mv.visitInsn(DUP);
                    }
                    mv.visitFieldInsn(field.isStatic ? PUTSTATIC : PUTFIELD, clazz.name, field.getName(), getDescriptor(field.getType()));
                } else {
                    throw new CodeGenException("Illegal operation");
                }
            } else if (decrement.expression instanceof DotOperator) {
                DotOperator left = (DotOperator) decrement.expression;
                left.left.visit(this);
                if (!left.isStatic())
                    mv.visitInsn(DUP);
                mv.visitFieldInsn(left.isStatic() ? GETSTATIC : GETFIELD, left.left.getType().name, left.right, getDescriptor(left.getType()));
                if (decrement.isPostDecrement) {
                    if (!left.isStatic()) mv.visitInsn(DUP_X1);
                    else mv.visitInsn(DUP);
                    mv.visitInsn(ICONST_1);
                    mv.visitInsn(ISUB);
                } else {
                    mv.visitInsn(ICONST_1);
                    mv.visitInsn(ISUB);
                    if (!left.isStatic()) mv.visitInsn(DUP_X1);
                    else mv.visitInsn(DUP);
                }
                mv.visitFieldInsn(left.isStatic() ? PUTSTATIC : PUTFIELD, left.left.getType().name, left.right, getDescriptor(left.getType()));
            } else {
                throw new CodeGenException("Can only increment variables");
            }
        }

        @Override
        public void visit(Assignment assignment) {
            if (assignment.left instanceof Identifier) {
                Identifier left = (Identifier) assignment.left;
                LocalOrFieldVar var = scope.get(left.name);
                if (var instanceof Local) {
                    assignment.right.visit(this);
                    mv.visitInsn(DUP);
                    Local local = (Local) var;
                    if (local.getType().equals(Type.BOOLEAN) || local.getType().equals(Type.CHAR) || local.getType().equals(Type.INT))
                        mv.visitVarInsn(ISTORE, local.index);
                    else mv.visitVarInsn(ASTORE, local.index);
                } else if (var instanceof Field) {
                    Field field = (Field) var;
                    if (!field.isStatic)
                        mv.visitVarInsn(ALOAD, 0);
                    assignment.right.visit(this);
                    if (!field.isStatic)
                        mv.visitInsn(DUP_X1);
                    else mv.visitInsn(DUP);
                    mv.visitFieldInsn(field.isStatic ? PUTSTATIC : PUTFIELD, clazz.name, field.getName(), getDescriptor(field.getType()));
                } else {
                    throw new CodeGenException("Illegal operation");
                }
            } else if (assignment.left instanceof DotOperator) {
                DotOperator left = (DotOperator) assignment.left;
                left.left.visit(this);
                //if (left.isStatic()) mv.visitInsn(POP);

                assignment.right.visit(this);
                if (!left.isStatic())
                    mv.visitInsn(DUP_X1);
                else mv.visitInsn(DUP);
                mv.visitFieldInsn(left.isStatic() ? PUTSTATIC : PUTFIELD, left.left.getType().name, left.right, getDescriptor(left.getType()));
            } else {
                throw new CodeGenException("Left of an assignment must be an identifier or field access");
            }
        }

        @Override
        public void visit(MethodCall methodCall) {
            Method method = methodCall.getMethod();
            if (!method.isStatic && methodCall.expr == null) {
                mv.visitVarInsn(ALOAD, 0);
            }
            if (methodCall.expr instanceof DotOperator) {
                ((DotOperator) methodCall.expr).left.visit(this);
            }
            for (Expression expr : methodCall.args) {
                expr.visit(this);
            }
            mv.visitMethodInsn(method.isStatic ? INVOKESTATIC : INVOKEVIRTUAL, clazz.name, method.name, method.getDescriptor(), false);
        }

        @Override
        public void visit(New _new) {
            mv.visitTypeInsn(NEW, _new.getType().name);
            mv.visitInsn(DUP);
            for (Expression expr : _new.args) {
                expr.visit(this);
            }
            String descriptor = Method.getDescriptor(_new.args.stream().map(expr -> expr.getType()).collect(Collectors.toList()), null);
            mv.visitMethodInsn(INVOKESPECIAL, _new.getType().name, "<init>", descriptor, false);
        }

        @Override
        public void visit(For _for) {
            scope = new Scope(scope);
            if (_for.init != null)
                _for.init.visit(this);
            Label start = new Label();
            Label end = new Label();
            mv.visitLabel(start);
            if (_for.termination != null)
                _for.termination.visit(this);
            mv.visitJumpInsn(IFEQ, end);
            _for.body.visit(this);
            if (_for.increment != null) {
                _for.increment.visit(this);
                if (!_for.increment.getType().equals(Type.VOID)) {
                    mv.visitInsn(POP);
                }
            }
            mv.visitJumpInsn(GOTO, start);
            mv.visitLabel(end);
            scope = scope.parent;
        }

        @Override
        public void visit(If _if) {
            _if.condition.visit(this);
            Label _else = new Label();
            Label end = new Label();
            mv.visitJumpInsn(IFEQ, _else);
            _if.body.visit(this);
            mv.visitJumpInsn(GOTO, end);
            mv.visitLabel(_else);
            if (_if.elseBody != null) {
                _if.elseBody.visit(this);
            }
            mv.visitLabel(end);
        }

        @Override
        public void visit(LocalVarDeclaration localVarDeclaration) {
            addLocal(new Identifier(localVarDeclaration.name, localVarDeclaration.getType()));
            if (localVarDeclaration.expression != null) {
                localVarDeclaration.expression.visit(this);

                Local local = (Local) scope.get(localVarDeclaration.name);
                if (local.getType().equals(Type.BOOLEAN) || local.getType().equals(Type.CHAR) || local.getType().equals(Type.INT))
                    mv.visitVarInsn(ISTORE, local.index);
                else mv.visitVarInsn(ASTORE, local.index);
            }
        }

        @Override
        public void visit(Return _return) {
            if (_return.expr != null) {
                _return.expr.visit(this);
                mv.visitInsn(IRETURN);
            } else {
                mv.visitInsn(RETURN);
            }
        }

        @Override
        public void visit(While _while) {
            Label start = new Label();
            Label end = new Label();
            mv.visitLabel(start);
            _while.condition.visit(this);
            mv.visitJumpInsn(IFEQ, end);
            _while.body.visit(this);
            mv.visitJumpInsn(GOTO, start);
            mv.visitLabel(end);
        }

        @Override
        public void visit(Block block) {
            scope = new Scope(scope);
            int currentIndex = localVarIndex;
            for (Statement s : block.body) {
                s.visit(this);
                // Pop extra values on the stack
                if (s instanceof MethodCall) {
                    if (!s.getType().equals(Type.VOID)) {
                        mv.visitInsn(POP);
                    }
                } else if (s instanceof StatementExpression) {
                    mv.visitInsn(POP);
                }
            }
            localVarIndex = currentIndex;
            scope = scope.parent;
        }
    }

    public Map<String, byte[]> generateBytecode(Map<String, Clazz> input) throws CodeGenException {
        Map<String, byte[]> resultMap = new HashMap<>();
        for (Map.Entry<String, Clazz> entry : input.entrySet()) {
            resultMap.put(entry.getKey(), generateBytecode(entry.getValue()));
        }
        return resultMap;
    }

    private void addFieldInitializers(Clazz input, Visitor visitor) {
        for (Field f: input.fields) {
            if (!f.isStatic && f.expression != null) {
                visitor.mv.visitVarInsn(ALOAD, 0);
                f.expression.visit(visitor);
                visitor.mv.visitFieldInsn(PUTFIELD, input.name, f.getName(), getDescriptor(f.getType()));
            }
        }
    }

    private byte[] generateBytecode(Clazz input) throws CodeGenException {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cw.visit(V1_4, input.access.asm | ACC_SUPER, input.name, null, "java/lang/Object", null);

        Scope classScope = new Scope(null);
        input.fields.forEach(classScope::add);
        boolean hasStaticInitializer = false;

        for (Field f: input.fields) {
            cw.visitField(f.access.asm | (f.isStatic ? ACC_STATIC : 0), f.getName(), getDescriptor(f.getType()), null, null).visitEnd();
            if (f.isStatic && f.expression != null) {
                hasStaticInitializer = true;
            }
        }

        boolean hasConstructor = false;
        for (Method method: input.methods) {
            String methodName = method.name;
            boolean isConstructor = method.name.equals(input.name);
            if (isConstructor) {
                hasConstructor = true;
                methodName = "<init>";
            }
            MethodVisitor mv = cw.visitMethod(method.access.asm, methodName, method.getDescriptor(), null, null);

            Visitor visitor = new Visitor(input, new Scope(classScope), mv);
            if (!method.isStatic) {
                visitor.addLocal(new Identifier("this", new Type(input.name)));
            }
            method.parameters.forEach(visitor::addLocal);

            mv.visitCode();
            if (isConstructor) {
                mv.visitVarInsn(ALOAD, 0);
                mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
                addFieldInitializers(input, visitor);
            }
            method.body.visit(visitor);
            if (method.returnType.equals(Type.VOID)) {
                mv.visitInsn(RETURN);
            }
            mv.visitMaxs(0, 0);
            mv.visitEnd();
        }

        if (!hasConstructor) {
            MethodVisitor mv = cw.visitMethod(AccessModifier.PUBLIC.asm, "<init>","()V", null, null);
            Visitor visitor = new Visitor(input, new Scope(classScope), mv);
            visitor.addLocal(new Identifier("this", new Type(input.name)));
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            addFieldInitializers(input, visitor);
            mv.visitInsn(RETURN);
            mv.visitMaxs(0, 0);
            mv.visitEnd();
        }

        if (hasStaticInitializer) {
            MethodVisitor mv = cw.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
            Visitor visitor = new Visitor(input, new Scope(classScope), mv);
            for (Field f: input.fields) {
                if (f.isStatic && f.expression != null) {
                    f.expression.visit(visitor);
                    visitor.mv.visitFieldInsn(PUTSTATIC, input.name, f.getName(), getDescriptor(f.getType()));
                }
            }
            mv.visitInsn(RETURN);
            mv.visitMaxs(0, 0);
            mv.visitEnd();
        }

        cw.visitEnd();
        return cw.toByteArray();
    }
}