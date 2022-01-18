package de.unituebingen.compilerbau.ast.expression.arithmetic;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

import java.util.Objects;

public abstract class ArithmeticOperator extends Binary {
    public ArithmeticOperator(
            Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}