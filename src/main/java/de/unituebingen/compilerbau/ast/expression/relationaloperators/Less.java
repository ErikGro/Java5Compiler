package de.unituebingen.compilerbau.ast.expression.relationaloperators;

import de.unituebingen.compilerbau.ast.Expression;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Less extends RelationalOperator
{
    public Less(
            Expression left, Expression right)
    {
        super(left, right);
    }
}
