package de.unituebingen.compilerbau.ast.expression.literal;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;

public abstract class Literal implements Expression {
    protected final Type type;

    public Literal(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }
}
