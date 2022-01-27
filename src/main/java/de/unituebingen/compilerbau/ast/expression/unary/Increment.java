package de.unituebingen.compilerbau.ast.expression.unary;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Unary;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Increment extends Unary
{
    public final boolean isPostIncrement;

    public Increment(Expression expression, boolean isPostIncrement)
    {
        super(expression);
        this.isPostIncrement = isPostIncrement;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
