package de.unituebingen.compilerbau.typing;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Clazz;
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
    /**
     *
     * @param input Abstract Syntax tree
     * @return true, if the input has no type errors
     */
    public Clazz check(Map<String, Clazz> input) throws TypeCheckException {
        throw new TypeCheckException("Not implemented");
    }

    @Override
    public void visit(Identifier identifier) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(IntLiteral intLiteral) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(BooleanLiteral booleanLiteral) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(CharLiteral charLiteral) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(DotOperator dotOperator) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Add add) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Divide divide) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Multiply multiply) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Remainder reminder) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Subtract subtract) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(And and) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Or or) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(BitAnd bitand) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(BitOr bitor) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(BitXOR bitxor) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(ShiftLeft shiftLeft) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(ShiftRight shiftRight) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(UnsignedShiftRight unsignedShiftRight) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Ternary ternary) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Equal equal) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Greater greater) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(GreaterOrEqual greaterOrEqual) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Less less) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(LessOrEqual lessOrEqual) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(NotEqual notEqual) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Negate negate) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Not not) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Increment increment) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Decrement decrement) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Assignment assignment) throws TypeCheckException {
        // TODO:
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
        // TODO:
    }

    @Override
    public void visit(If _if) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(LocalVarDeclaration localVarDeclaration) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Return _return) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(While _while) throws TypeCheckException {
        // TODO:
    }

    @Override
    public void visit(Block block) throws TypeCheckException {
        // TODO:
    }
}
