package de.unituebingen.compilerbau.ast.expression.unary;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Unary;

public class Negate extends Unary {
    public Negate(Expression expression) {
        super(expression);
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return (o instanceof Negate);
    }
}
