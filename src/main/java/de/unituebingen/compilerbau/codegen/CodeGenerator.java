package de.unituebingen.compilerbau.codegen;

import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.Ternary;
import de.unituebingen.compilerbau.ast.expression.binary.*;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.*;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.And;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.Or;
import de.unituebingen.compilerbau.ast.expression.literal.BooleanLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.CharLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.*;
import de.unituebingen.compilerbau.ast.expression.unary.Negate;
import de.unituebingen.compilerbau.ast.expression.unary.Not;
import de.unituebingen.compilerbau.ast.statementexpressions.Assignment;
import de.unituebingen.compilerbau.ast.statementexpressions.MethodCall;
import de.unituebingen.compilerbau.ast.statementexpressions.New;
import de.unituebingen.compilerbau.ast.statements.*;
import de.unituebingen.compilerbau.exception.CodeGenException;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import static org.objectweb.asm.Opcodes.*;

import java.util.HashMap;
import java.util.Map;

public class CodeGenerator {

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
        int localVarIndex = 0;

        Visitor(Scope scope, MethodVisitor mv) {
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
                // TODO Other types need different load instructions
                mv.visitVarInsn(ILOAD, local.index);
            } else if (var instanceof Field) {
                Field field = (Field) var;
                if (!field.isStatic) {
                    mv.visitVarInsn(ALOAD, 0);
                }
                mv.visitFieldInsn(GETSTATIC, field.owner.name, field.getName(), field.getType().name);
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
            mv.visitLdcInsn(charLiteral.value);
        }

        @Override
        public void visit(Add add) {

        }

        @Override
        public void visit(Divide divide) {

        }

        @Override
        public void visit(Multiply multiply) {

        }

        @Override
        public void visit(Reminder reminder) {

        }

        @Override
        public void visit(Subtract subtract) {

        }

        @Override
        public void visit(And and) {

        }

        @Override
        public void visit(Or or) {

        }

        @Override
        public void visit(BitAnd bitand) {

        }

        @Override
        public void visit(BitOr bitor) {

        }

        @Override
        public void visit(BitXOR bitxor) {

        }

        @Override
        public void visit(ShiftLeft shiftLeft) {

        }

        @Override
        public void visit(ShiftRight shiftRight) {

        }

        @Override
        public void visit(UnsignedShiftRight unsignedShiftRight) {

        }

        @Override
        public void visit(Ternary ternary) {

        }

        @Override
        public void visit(Equal equal) {

        }

        @Override
        public void visit(Greater greater) {

        }

        @Override
        public void visit(GreaterOrEqual greaterOrEqual) {

        }

        @Override
        public void visit(Less less) {

        }

        @Override
        public void visit(LessOrEqual lessOrEqual) {

        }

        @Override
        public void visit(NotEqual notEqual) {

        }

        @Override
        public void visit(Negate negate) {

        }

        @Override
        public void visit(Not not) {

        }

        @Override
        public void visit(Assignment assignment) {

        }

        @Override
        public void visit(MethodCall methodCall) {

        }

        @Override
        public void visit(New _new) {

        }

        @Override
        public void visit(For _for) {

        }

        @Override
        public void visit(If _if) {

        }

        @Override
        public void visit(LocalVarDeclaration localVarDeclaration) {

        }

        @Override
        public void visit(Return _return) {

        }

        @Override
        public void visit(While _while) {

        }

        @Override
        public void visit(Block block) {
            scope = new Scope(scope);
            for (Statement s : block.body) {
                s.visit(this);
            }
            scope = scope.parent;
        }
    }

    public byte[] generateBytecode(Clazz input) throws CodeGenException {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cw.visit(V1_4, ACC_PUBLIC | ACC_SUPER, input.name, null, "java/lang/Object", null);

        Scope classScope = new Scope(null);
        for (Field field: input.fields) {
            classScope.add(field);
        }
        for (Method method: input.methods) {
            MethodVisitor mv = cw.visitMethod(method.access.asm, method.name, method.getDescriptor(), null, null);

            Visitor visitor = new Visitor(new Scope(classScope), mv);
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