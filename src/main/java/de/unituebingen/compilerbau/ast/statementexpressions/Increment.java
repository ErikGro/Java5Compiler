package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Increment increment = (Increment) o;
        return isPostIncrement == increment.isPostIncrement && Objects.equals(expression,
                increment.expression
        );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(expression, isPostIncrement);
    }

    @Override
    public String toString()
    {
        return "Increment{"
                + "expression="
                + expression
                + ", isPostIncrement="
                + isPostIncrement
                + '}';
    }
}
