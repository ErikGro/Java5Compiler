package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Decrement decrement = (Decrement) o;
        return isPostDecrement == decrement.isPostDecrement && Objects.equals(expression,
                decrement.expression
        );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(expression, isPostDecrement);
    }

    @Override
    public String toString()
    {
        return "Decrement{"
                + "expression="
                + expression
                + ", isPostDecrement="
                + isPostDecrement
                + '}';
    }
}
