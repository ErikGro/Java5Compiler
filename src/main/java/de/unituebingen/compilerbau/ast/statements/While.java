package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class While extends Statement
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

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
