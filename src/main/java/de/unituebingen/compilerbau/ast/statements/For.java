package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class For extends Statement
{
    private Statement init;
    private Expression termination;
    private Statement increment;
    private Statement body;

    public For(
            Statement init, Expression termination, Statement increment, Statement body)
    {
        this.init = init;
        this.termination = termination;
        this.increment = increment;
        this.body = body;
    }

    public Statement getInit()
    {
        return init;
    }

    public Expression getTermination()
    {
        return termination;
    }

    public Statement getIncrement()
    {
        return increment;
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
