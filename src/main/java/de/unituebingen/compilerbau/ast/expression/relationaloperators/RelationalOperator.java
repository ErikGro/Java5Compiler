package de.unituebingen.compilerbau.ast.expression.relationaloperators;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public abstract class RelationalOperator extends Binary
{
    public RelationalOperator(
            Expression left, Expression right)
    {
        super(left, right);
    }
}
