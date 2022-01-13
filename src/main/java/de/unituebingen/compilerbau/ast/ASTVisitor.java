package de.unituebingen.compilerbau.ast;

import de.unituebingen.compilerbau.ast.expression.binary.*;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.*;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.And;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.Or;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Equal;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Greater;

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

    void visit(Equal equal);
    void visit(Greater greater);
}
