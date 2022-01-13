package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Return extends Statement
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

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
