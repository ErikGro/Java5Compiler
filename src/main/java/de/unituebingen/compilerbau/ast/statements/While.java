package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class While extends Statement
{
    public final Expression condition;
    public final Statement body;

    public While(Expression condition, Statement body)
    {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof While)) return false;
        While aWhile = (While) o;
        return Objects.equals(condition, aWhile.condition) &&
                Objects.equals(body, aWhile.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, body);
    }
}
