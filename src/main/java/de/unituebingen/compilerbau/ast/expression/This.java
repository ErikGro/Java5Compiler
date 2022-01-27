package de.unituebingen.compilerbau.ast.expression;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class This implements Expression
{
    protected Type type;

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

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        This aThis = (This) o;
        return Objects.equals(type, aThis.type);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(type);
    }
}
