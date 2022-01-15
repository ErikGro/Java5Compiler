package de.unituebingen.compilerbau.ast.expression.literal;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Type;

public class CharLiteral extends Literal {
    public final char value;

    public CharLiteral(char value) {
        super(Type.CHAR);
        this.value = value;
    }

    @Override
    public void visit(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
