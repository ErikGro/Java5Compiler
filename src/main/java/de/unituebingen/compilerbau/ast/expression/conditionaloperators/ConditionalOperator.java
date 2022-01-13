package de.unituebingen.compilerbau.ast.expression.conditionaloperators;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public abstract class ConditionalOperator extends Binary
{
    public ConditionalOperator(
            Expression left, Expression right)
    {
        super(left, right);
    }
}
