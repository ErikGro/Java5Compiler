package de.unituebingen.compilerbau.ast.expression;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;

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
}
