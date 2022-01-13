package de.unituebingen.compilerbau.ast.expression.conditionaloperators;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class And extends ConditionalOperator
{
    public And(
            Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
