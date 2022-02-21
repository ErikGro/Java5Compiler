package de.unituebingen.compilerbau.ast.expression.literal;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Type;

import java.util.Objects;

public class BooleanLiteral extends Literal {
    public final boolean value;

    public BooleanLiteral(boolean value) {
        super(Type.BOOLEAN);
        this.value = value;
    }

    @Override
    public void visit(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BooleanLiteral)) return false;
        BooleanLiteral that = (BooleanLiteral) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "BooleanLiteral{" +
                "value=" + value +
                '}';
    }
}
