package de.unituebingen.compilerbau.ast.expression.relationaloperators;

import de.unituebingen.compilerbau.ast.Expression;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class GreaterOrEqual extends RelationalOperator
{
    public GreaterOrEqual(
            Expression left, Expression right)
    {
        super(left, right);
    }
}