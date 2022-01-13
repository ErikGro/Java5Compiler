package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class If
{
    private Expression condition;
    private Statement body;
    private Statement elseBody;

    public If(Expression condition, Statement body, Statement elseBody)
    {
        this.condition = condition;
        this.body = body;
        this.elseBody = elseBody;
    }

    public Expression getCondition()
    {
        return condition;
    }

    public Statement getBody()
    {
        return body;
    }

    public Statement getElseBody()
    {
        return elseBody;
    }
}
