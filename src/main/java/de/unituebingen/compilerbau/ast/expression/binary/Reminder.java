package de.unituebingen.compilerbau.ast.expression.binary;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

public class Reminder extends Binary {
    public Reminder(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
