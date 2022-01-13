package de.unituebingen.compilerbau.ast.expression.bitwisebinary;

import de.unituebingen.compilerbau.ast.Expression;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class ShiftLeft extends BitwiseBinary
{
    public ShiftLeft(
            Expression left, Expression right)
    {
        super(left, right);
    }
}
