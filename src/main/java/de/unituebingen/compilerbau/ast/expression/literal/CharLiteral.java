package de.unituebingen.compilerbau.ast.expression.literal;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Type;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharLiteral)) return false;
        CharLiteral that = (CharLiteral) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "CharLiteral{" +
                "value=" + value +
                '}';
    }
}
