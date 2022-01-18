package de.unituebingen.compilerbau.ast.expression.arithmetic;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

import java.util.Objects;

public class Remainder extends ArithmeticOperator {
    public Remainder(Expression left, Expression right) {
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
        if (!(o instanceof Remainder)) return false;
        return super.equals(o);
    }
}
