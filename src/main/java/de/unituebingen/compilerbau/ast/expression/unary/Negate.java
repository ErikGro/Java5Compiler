package de.unituebingen.compilerbau.ast.expression.unary;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Unary;

public class Negate extends Unary {
    public Negate(Expression expression) {
        super(expression);
    }
}
