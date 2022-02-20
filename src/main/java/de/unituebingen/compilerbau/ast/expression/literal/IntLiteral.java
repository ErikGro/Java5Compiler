package de.unituebingen.compilerbau.ast.expression.literal;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Type;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntLiteral)) return false;
        IntLiteral that = (IntLiteral) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "IntLiteral{" +
                "value=" + value +
                '}';
    }
}
