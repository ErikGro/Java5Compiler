package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class While
{
    private Expression condition;
    private Statement body;

    public While(Expression condition, Statement body)
    {
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition()
    {
        return condition;
    }

    public Statement getBody()
    {
        return body;
    }
}
