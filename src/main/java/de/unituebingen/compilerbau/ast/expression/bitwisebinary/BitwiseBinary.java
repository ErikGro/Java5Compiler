package de.unituebingen.compilerbau.ast.expression.bitwisebinary;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public abstract class BitwiseBinary extends Binary
{
    public BitwiseBinary(
            Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
