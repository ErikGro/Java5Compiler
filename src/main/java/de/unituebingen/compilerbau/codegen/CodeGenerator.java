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
import de.unituebingen.compilerbau.ast.statementexpressions.Decrement;
import de.unituebingen.compilerbau.ast.statementexpressions.Increment;
import de.unituebingen.compilerbau.ast.expression.unary.Negate;
import de.unituebingen.compilerbau.ast.expression.unary.Not;
import de.unituebingen.compilerbau.ast.statementexpressions.Assignment;
import de.unituebingen.compilerbau.ast.statementexpressions.MethodCall;
import de.unituebingen.compilerbau.ast.statementexpressions.New;
import de.unituebingen.compilerbau.ast.statements.*;
import de.unituebingen.compilerbau.exception.CodeGenException;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import static org.objectweb.asm.Opcodes.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CodeGenerator {

    // TODO Populate this
    Map<String, Scope> scopeMap;

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

        void addLocal(String name, Type type) {
            scope.add(new Local(localVarIndex, name, type));
            localVarIndex += 1;
        }

        @Override
        public void visit(Identifier identifier) {
            LocalOrFieldVar var = scope.get(identifier.name);
            if (var instanceof Local) {
                Local local = (Local) var;
                if (local.getType() == Type.BOOLEAN || local.getType() == Type.CHAR || local.getType() == Type.INT)
                    mv.visitVarInsn(ILOAD, local.index);
                else mv.visitVarInsn(ALOAD, local.index);
            } else if (var instanceof Field) {
                Field field = (Field) var;
                if (!field.isStatic) {
                    mv.visitVarInsn(ALOAD, 0);
                }
                mv.visitFieldInsn(field.isStatic ? GETSTATIC : GETFIELD, field.owner.name, field.getName(), field.getType().name);
            } else {
                throw new CodeGenException("Illegal operation");
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
            dotOperator.left.visit(this);
            Scope scope = scopeMap.get(dotOperator.left.getType().name);
            Field field = (Field) scope.get(dotOperator.right);
            if (field.isStatic) mv.visitInsn(POP);
            mv.visitFieldInsn(field.isStatic ? GETSTATIC : GETFIELD, field.owner.name, field.getName(), field.getType().name);
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
            if (increment.isPostIncrement) {

            } else {

            }
        }

        @Override
        public void visit(Decrement decrement) {
            if (decrement.isPostDecrement) {

            } else {

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
                    if (local.getType() == Type.BOOLEAN || local.getType() == Type.CHAR || local.getType() == Type.INT)
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
                    mv.visitFieldInsn(field.isStatic ? PUTSTATIC : PUTFIELD, field.owner.name, field.getName(), field.getType().name);
                } else {
                    throw new CodeGenException("Illegal operation");
                }
            } else if (assignment.left instanceof DotOperator) {
                DotOperator left = (DotOperator) assignment.left;
                String fieldName = left.right;
                left.left.visit(this);
                Scope scope = scopeMap.get(left.getType().name);
                Field field = (Field) scope.get(fieldName);
                if (field.isStatic)
                    mv.visitInsn(POP);
                assignment.right.visit(this);
                if (!field.isStatic)
                    mv.visitInsn(DUP_X1);
                else mv.visitInsn(DUP);
                mv.visitFieldInsn(field.isStatic ? PUTSTATIC : PUTFIELD, field.owner.name, field.getName(), field.getType().name);
            } else {
                throw new CodeGenException("Left of an assignment must be an identifier or field access");
            }
        }

        @Override
        public void visit(MethodCall methodCall) {
            Method method = clazz.methods.stream().filter(m -> m.name == methodCall.name).findFirst().get();
            if (!method.isStatic && methodCall.expr == null) {
                mv.visitVarInsn(ALOAD, 0);
            }
            if (methodCall.expr != null) {
                methodCall.expr.visit(this);
            }
            for (Expression expr : methodCall.args) {
                expr.visit(this);
            }
            mv.visitMethodInsn(method.isStatic ? INVOKESTATIC : INVOKEVIRTUAL, clazz.name, method.name, method.getDescriptor(), false);
        }

        @Override
        public void visit(New _new) {
            mv.visitInsn(NEW);
            mv.visitInsn(DUP);
            String descriptor = Method.getDescriptor(_new.args.stream().map(expr -> expr.getType()).collect(Collectors.toList()), null);
            mv.visitMethodInsn(INVOKESPECIAL, _new.getType().name, "<init>", descriptor, false);
        }

        @Override
        public void visit(For _for) {
            scope = new Scope(scope);
            _for.init.visit(this);
            Label start = new Label();
            Label end = new Label();
            mv.visitLabel(start);
            _for.termination.visit(this);
            mv.visitJumpInsn(IFEQ, end);
            _for.body.visit(this);
            _for.increment.visit(this);
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
            addLocal(localVarDeclaration.name, localVarDeclaration.getType());
            if (localVarDeclaration.expression != null) {
                localVarDeclaration.expression.visit(this);

                Local local = (Local) scope.get(localVarDeclaration.name);
                if (local.getType() == Type.BOOLEAN || local.getType() == Type.CHAR || local.getType() == Type.INT)
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
            for (Statement s : block.body) {
                s.visit(this);
                // Pop extra values on the stack
                if (s instanceof MethodCall) {
                    if (s.getType() != null) {
                        mv.visitInsn(POP);
                    }
                } else if (s instanceof Increment || s instanceof Decrement || s instanceof Assignment) {
                    mv.visitInsn(POP);
                }
            }
            scope = scope.parent;
        }
    }

    public byte[] generateBytecode(Map<String, Clazz> input) throws CodeGenException {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cw.visit(V1_4, ACC_PUBLIC | ACC_SUPER, input.name, null, "java/lang/Object", null);

        Scope classScope = new Scope(null);
        input.fields.forEach(classScope::add);

        for (Method method: input.methods) {
            MethodVisitor mv = cw.visitMethod(method.access.asm, method.name, method.getDescriptor(), null, null);

            Visitor visitor = new Visitor(input, new Scope(classScope), mv);
            if (!method.isStatic) {
                visitor.addLocal("this", new Type(input.name));
            }
            method.parameters.forEach(visitor::addLocal);

            mv.visitCode();
            method.body.visit(visitor);
            mv.visitEnd();
        }
        cw.visitEnd();
        return cw.toByteArray();
    }
}