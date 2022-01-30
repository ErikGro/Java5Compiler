package de.unituebingen.compilerbau.ast.expression;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.statementexpressions.MethodCall;

import java.util.Objects;

public class DotOperator implements Expression
{
    public final Expression left;
    public final String right;
    protected Type type;

    public DotOperator(Expression left, String right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
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
        DotOperator that = (DotOperator) o;
        return Objects.equals(left, that.left)
                && Objects.equals(right, that.right)
                && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(left, right, type);
    }
}
