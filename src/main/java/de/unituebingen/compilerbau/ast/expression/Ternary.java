package de.unituebingen.compilerbau.ast.expression;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;

import java.util.Objects;

public class Ternary implements Expression {
    public final Expression first;
    public final Expression second;
    public final Expression third;
    protected Type type;

    public Ternary(Expression first, Expression second, Expression third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ternary)) return false;
        Ternary ternary = (Ternary) o;
        return Objects.equals(first, ternary.first) &&
                Objects.equals(second, ternary.second) &&
                Objects.equals(third, ternary.third) &&
                Objects.equals(type, ternary.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, type);
    }
}
