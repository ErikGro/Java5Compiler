package de.unituebingen.compilerbau.ast.expression.arithmetic;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Equal;

import java.util.Objects;

public class Add extends ArithmeticOperator {
    public Add(Expression left, Expression right) {
        super(left, right);
    }


    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public int hashCode() {
        return Objects.hash("Add", left, right, type);
    }
}
