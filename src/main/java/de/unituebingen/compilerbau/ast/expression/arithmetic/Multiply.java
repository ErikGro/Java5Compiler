package de.unituebingen.compilerbau.ast.expression.arithmetic;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

import java.util.Objects;

public class Multiply extends ArithmeticOperator {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Multiply)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash("Multiply", left, right, type);
    }
}
