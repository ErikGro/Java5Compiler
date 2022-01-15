package de.unituebingen.compilerbau.ast.expression;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Type;

public class Identifier implements Expression {
    public String name;
    public Type type;

    public Identifier(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void visit(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
