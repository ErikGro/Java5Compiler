package de.unituebingen.compilerbau.ast.expression;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;

import java.util.Objects;

public abstract class Binary implements Expression {
    public final Expression left;
    public final Expression right;
    protected Type type;

    public Binary(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Binary)) return false;
        Binary binary = (Binary) o;
        return Objects.equals(left, binary.left) && Objects.equals(right, binary.right);
    }
}
