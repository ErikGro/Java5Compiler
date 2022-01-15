package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Assignment extends StatementExpression
{
    public final Expression left;
    public final Expression right;

    public Assignment(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
