package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Increment extends StatementExpression
{
    public final Expression expression;
    public final boolean isPostIncrement;

    public Increment(Expression expression, boolean isPostIncrement)
    {
        this.expression = expression;
        this.isPostIncrement = isPostIncrement;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
