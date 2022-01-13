package de.unituebingen.compilerbau.ast.expression.binary;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

public class Multiply extends Binary {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }
}
