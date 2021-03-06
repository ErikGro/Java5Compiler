package de.unituebingen.compilerbau.ast;

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

public interface ASTVisitor {
    void visit(Identifier identifier);
    void visit(IntLiteral intLiteral);
    void visit(BooleanLiteral booleanLiteral);
    void visit(CharLiteral charLiteral);
    void visit(DotOperator dotOperator);

    void visit(Add add);
    void visit(Divide divide);
    void visit(Multiply multiply);
    void visit(Remainder reminder);
    void visit(Subtract subtract);

    void visit(And and);
    void visit(Or or);

    void visit(BitAnd bitand);
    void visit(BitOr bitor);
    void visit(BitXOR bitxor);
    void visit(ShiftLeft shiftLeft);
    void visit(ShiftRight shiftRight);
    void visit(UnsignedShiftRight unsignedShiftRight);

    void visit(Ternary ternary);

    void visit(Equal equal);
    void visit(Greater greater);
    void visit(GreaterOrEqual greaterOrEqual);
    void visit(Less less);
    void visit(LessOrEqual lessOrEqual);
    void visit(NotEqual notEqual);

    void visit(Negate negate);
    void visit(Not not);
    void visit(Increment increment);
    void visit(Decrement decrement);

    void visit(Assignment assignment);
    void visit(MethodCall methodCall);
    void visit(New _new);

    void visit(For _for);
    void visit(If _if);
    void visit(LocalVarDeclaration localVarDeclaration);
    void visit(Return _return);
    void visit(While _while);

    void visit(Block block);
}
