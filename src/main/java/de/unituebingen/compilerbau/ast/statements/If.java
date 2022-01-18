package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class If extends Statement
{
    public final Expression condition;
    public final Statement body;
    public final Statement elseBody;

    public If(Expression condition, Statement body, Statement elseBody)
    {
        this.condition = condition;
        this.body = body;
        this.elseBody = elseBody;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof If)) return false;
        If anIf = (If) o;
        return Objects.equals(condition, anIf.condition) &&
                Objects.equals(body, anIf.body) &&
                Objects.equals(elseBody, anIf.elseBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, body, elseBody);
    }
}
