package de.unituebingen.compilerbau.ast.expression;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;

public abstract class Unary implements Expression {
    public Expression expression;
    protected Type type;

    public Unary(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
