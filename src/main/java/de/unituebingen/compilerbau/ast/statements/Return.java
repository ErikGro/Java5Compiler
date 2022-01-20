package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Return extends Statement
{
    public final Expression expr;

    public Return(Expression expr)
    {
        this.expr = expr;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Return)) return false;
        Return aReturn = (Return) o;
        return Objects.equals(expr, aReturn.expr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expr);
    }
}
