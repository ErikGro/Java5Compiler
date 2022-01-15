package de.unituebingen.compilerbau.ast.expression.literal;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Type;

public class IntLiteral extends Literal {
    public final int value;

    public IntLiteral(int value) {
        super(Type.INT);
        this.value = value;
    }

    @Override
    public void visit(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
