package de.unituebingen.compilerbau.ast.expression.literal;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Type;

public class BooleanLiteral extends Literal {
    public boolean value;

    public BooleanLiteral(boolean value) {
        super(Type.BOOLEAN);
        this.value = value;
    }

    @Override
    public void visit(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
