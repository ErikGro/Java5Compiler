package de.unituebingen.compilerbau.ast.expression.unary;

import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.Unary;

public class Not extends Unary {
    public Not(Expression expression) {
        super(expression);
    }
}