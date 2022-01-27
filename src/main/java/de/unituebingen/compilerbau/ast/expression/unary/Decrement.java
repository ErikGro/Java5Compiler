package de.unituebingen.compilerbau.ast.expression.unary;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Unary;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Decrement extends Unary
{
    public final boolean isPostDecrement;

    public Decrement(Expression expression, boolean isPostDecrement)
    {
        super(expression);
        this.isPostDecrement = isPostDecrement;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
