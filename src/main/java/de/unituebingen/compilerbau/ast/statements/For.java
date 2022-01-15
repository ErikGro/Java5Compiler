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
    public final Statement init;
    public final Expression termination;
    public final Statement increment;
    public final Statement body;

    public For(
            Statement init, Expression termination, Statement increment, Statement body)
    {
        this.init = init;
        this.termination = termination;
        this.increment = increment;
        this.body = body;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
