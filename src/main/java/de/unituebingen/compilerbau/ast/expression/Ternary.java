package de.unituebingen.compilerbau.ast.expression;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;

public class Ternary implements Expression {
    public Expression first;
    public Expression second;
    public Expression third;
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
}
