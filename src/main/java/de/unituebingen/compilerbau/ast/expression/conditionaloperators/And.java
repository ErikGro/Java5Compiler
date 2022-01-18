package de.unituebingen.compilerbau.ast.expression.conditionaloperators;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.arithmetic.Divide;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof And)) return false;
        return super.equals(o);
    }
}
