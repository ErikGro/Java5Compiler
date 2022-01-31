package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Decrement extends StatementExpression
{
    public final Expression expression;
    public final boolean isPostDecrement;

    public Decrement(Expression expression, boolean isPostDecrement)
    {
        this.expression = expression;
        this.isPostDecrement = isPostDecrement;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
