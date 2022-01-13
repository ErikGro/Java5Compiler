package de.unituebingen.compilerbau.ast.expression.bitwisebinary;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class BitwiseBinary extends Binary
{
    public BitwiseBinary(
            Expression left, Expression right)
    {
        super(left, right);
    }
}
