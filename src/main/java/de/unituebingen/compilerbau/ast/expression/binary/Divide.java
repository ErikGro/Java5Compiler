package de.unituebingen.compilerbau.ast.expression.binary;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

public class Divide extends Binary {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
