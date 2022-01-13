package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.Expression;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Return
{
    private Expression expr;

    public Return(Expression expr)
    {
        this.expr = expr;
    }

    public Expression getExpr()
    {
        return expr;
    }
}
