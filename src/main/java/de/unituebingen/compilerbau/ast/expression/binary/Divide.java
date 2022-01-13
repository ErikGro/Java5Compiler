package de.unituebingen.compilerbau.ast.expression.binary;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Binary;

public class Divide extends Binary {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }
}
