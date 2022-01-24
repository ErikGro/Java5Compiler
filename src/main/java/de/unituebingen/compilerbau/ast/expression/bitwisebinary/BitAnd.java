package de.unituebingen.compilerbau.ast.expression.bitwisebinary;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.expression.arithmetic.Add;
import de.unituebingen.compilerbau.ast.expression.arithmetic.Subtract;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class BitAnd extends BitwiseBinary
{
    public BitAnd(
            Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BitAnd)) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash("BitAnd", left, right, type);
    }
}
