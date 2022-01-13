package de.unituebingen.compilerbau.ast;

import de.unituebingen.compilerbau.ast.expression.Ternary;
import de.unituebingen.compilerbau.ast.expression.binary.*;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.*;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.And;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.Or;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.*;
import de.unituebingen.compilerbau.ast.expression.unary.Negate;
import de.unituebingen.compilerbau.ast.expression.unary.Not;
import de.unituebingen.compilerbau.ast.statementexpressions.Assignment;
import de.unituebingen.compilerbau.ast.statementexpressions.MethodCall;
import de.unituebingen.compilerbau.ast.statementexpressions.New;
import de.unituebingen.compilerbau.ast.statements.*;

public interface ASTVisitor {
    void visit(Add add);
    void visit(Divide divide);
    void visit(Multiply multiply);
    void visit(Reminder reminder);
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

    void visit(Assignment assignment);
    void visit(MethodCall methodCall);
    void visit(New _new);

    void visit(For _for);
    void visit(If _if);
    void visit(LocalVarDeclaration localVarDeclaration);
    void visit(Return _return);
    void visit(While _while);
}
