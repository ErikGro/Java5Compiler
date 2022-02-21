package de.unituebingen.compilerbau.typing;

import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Binary;
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
import de.unituebingen.compilerbau.ast.expression.unary.Negate;
import de.unituebingen.compilerbau.ast.expression.unary.Not;
import de.unituebingen.compilerbau.ast.statementexpressions.*;
import de.unituebingen.compilerbau.ast.statements.*;
import de.unituebingen.compilerbau.exception.TypeCheckException;

import java.util.Map;

public class TypeChecker implements ASTVisitor {
    private final Environment env = new Environment();
    private Map<String, Clazz> clazzes = null;
    private String current = null;

    /**
     *
     * @param input Abstract Syntax tree
     * @return true, if the input has no type errors
     */
    public boolean check(Map<String, Clazz> input) throws TypeCheckException {
        this.clazzes = input;
        for (String name: input.keySet()) {
            this.current = name;
            this.checkClazz(input.get(name));
        }

        return true;
    }

    private void checkClazz(Clazz clazz) throws TypeCheckException {
        for (Field field: clazz.fields)
            env.addToScope(new Identifier(field.getName(), field.getType()));

        for (Method meth: clazz.methods) {
            env.openScope();
            for (Identifier param: meth.parameters)
                env.addToScope(param);
            meth.body.visit(this);
            env.closeScope();
        }
    }

    private void expect(Type t, Expression exp) throws TypeCheckException {
        exp.visit(this);
        if (exp.getType() != t)
            throw new TypeCheckException("Expected type " + t.name + ", got " + exp.getType().name);
    }

    private void checkBinary(Type argT, Type retT, Binary bin) {
        expect(argT, bin.left);
        expect(argT, bin.right);
        bin.setType(retT);
    }

    @Override
    public void visit(Identifier identifier) throws TypeCheckException {
        // TODO: Check if name is declared!
        identifier.setType(this.env.lookup(identifier.name));
    }

    @Override
    public void visit(IntLiteral intLiteral) throws TypeCheckException {
        // Nothing to do here...
    }

    @Override
    public void visit(BooleanLiteral booleanLiteral) throws TypeCheckException {
        // Nothing to do here...
    }

    @Override
    public void visit(CharLiteral charLiteral) throws TypeCheckException {
        // Nothing to do here...
    }

    @Override
    public void visit(DotOperator dotOperator) throws TypeCheckException {
        dotOperator.left.visit(this);
        // TODO: Does this class exist?
        Clazz clazz = this.clazzes.get(dotOperator.left.getType().name);
        // TODO: Does this field exist in that class?
        for (Field field: clazz.fields) {
            if (field.getName().equals(dotOperator.right)) {
                // TODO: Is it public?
                dotOperator.setType(field.getType());
                break;
            }
        }
    }

    @Override
    public void visit(Add add) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, add);
    }

    @Override
    public void visit(Divide divide) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, divide);
    }

    @Override
    public void visit(Multiply multiply) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, multiply);
    }

    @Override
    public void visit(Remainder reminder) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, reminder);
    }

    @Override
    public void visit(Subtract subtract) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, subtract);
    }

    @Override
    public void visit(And and) throws TypeCheckException {
        checkBinary(Type.BOOLEAN, Type.BOOLEAN, and);
    }

    @Override
    public void visit(Or or) throws TypeCheckException {
        checkBinary(Type.BOOLEAN, Type.BOOLEAN, or);
    }

    @Override
    public void visit(BitAnd bitand) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, bitand);
    }

    @Override
    public void visit(BitOr bitor) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, bitor);
    }

    @Override
    public void visit(BitXOR bitxor) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, bitxor);
    }

    @Override
    public void visit(ShiftLeft shiftLeft) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, shiftLeft);
    }

    @Override
    public void visit(ShiftRight shiftRight) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, shiftRight);
    }

    @Override
    public void visit(UnsignedShiftRight unsignedShiftRight) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, unsignedShiftRight);
    }

    @Override
    public void visit(Ternary ternary) throws TypeCheckException {
        expect(Type.BOOLEAN, ternary.first);
        ternary.second.visit(this);
        ternary.third.visit(this);
        if (ternary.second.getType() != ternary.third.getType())
            throw new TypeCheckException("Both branches of an inline if must be of the same type");
        ternary.setType(ternary.second.getType());
    }

    @Override
    public void visit(Equal equal) throws TypeCheckException {
        equal.left.visit(this);
        equal.right.visit(this);
        if (equal.left.getType() != equal.right.getType())
            throw new TypeCheckException("lhs and rhs of equality must be of the same type");
        equal.setType(Type.BOOLEAN);
    }

    @Override
    public void visit(Greater greater) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, greater);
    }

    @Override
    public void visit(GreaterOrEqual greaterOrEqual) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, greaterOrEqual);
    }

    @Override
    public void visit(Less less) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, less);
    }

    @Override
    public void visit(LessOrEqual lessOrEqual) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, lessOrEqual);
    }

    @Override
    public void visit(NotEqual notEqual) throws TypeCheckException {
        notEqual.left.visit(this);
        notEqual.right.visit(this);
        if (notEqual.left.getType() != notEqual.right.getType())
            throw new TypeCheckException("lhs and rhs of inequality must be of the same type");
        notEqual.setType(Type.BOOLEAN);
    }

    @Override
    public void visit(Negate negate) throws TypeCheckException {
        expect(Type.INT, negate.expression);
        negate.setType(Type.INT);
    }

    @Override
    public void visit(Not not) throws TypeCheckException {
        expect(Type.BOOLEAN, not.expression);
        not.setType(Type.BOOLEAN);
    }

    @Override
    public void visit(Increment increment) throws TypeCheckException {
        // TODO: Only identifiers may be incremented!
        expect(Type.INT, increment.expression);
        increment.setType(Type.INT);
    }

    @Override
    public void visit(Decrement decrement) throws TypeCheckException {
        // TODO: Only identifiers may be decremented!
        expect(Type.INT, decrement.expression);
        decrement.setType(Type.INT);
    }

    @Override
    public void visit(Assignment assignment) throws TypeCheckException {
        // TODO: LHS must be a field/variable!
        assignment.left.visit(this);
        assignment.right.visit(this);
        if (assignment.left.getType() != assignment.right.getType())
            throw new TypeCheckException("lhs and rhs of an assignment must be of the same type");
        assignment.setType(assignment.left.getType());
    }

    @Override
    public void visit(MethodCall methodCall) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(New _new) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(For _for) throws TypeCheckException {
        env.openScope();
        expect(Type.BOOLEAN, _for.termination);
        _for.body.visit(this);
        _for.setType(_for.body.getType());
        env.closeScope();
    }

    @Override
    public void visit(If _if) throws TypeCheckException {
        env.openScope();
        expect(Type.BOOLEAN, _if.condition);

        env.openScope();
        _if.body.visit(this);
        _if.setType(_if.body.getType());
        env.closeScope();

        if (_if.elseBody != null) {
            env.openScope();
            _if.elseBody.visit(this);
            if (_if.body.getType() != _if.elseBody.getType())
                throw new TypeCheckException("Inconsistent return types");

            env.closeScope();
        }
        env.closeScope();
    }

    @Override
    public void visit(LocalVarDeclaration localVarDeclaration) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Return _return) throws TypeCheckException {
        _return.expr.visit(this);
        _return.setType(_return.expr.getType());
    }

    @Override
    public void visit(While _while) throws TypeCheckException {
        env.openScope();
        expect(Type.BOOLEAN, _while.condition);
        _while.body.visit(this);
        _while.setType(_while.body.getType());
        env.closeScope();
    }

    @Override
    public void visit(Block block) throws TypeCheckException {
        // TODO:
    }
}
