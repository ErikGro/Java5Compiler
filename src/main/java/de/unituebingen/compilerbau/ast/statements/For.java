package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class For extends Statement
{
    public final Statement init;
    public final Expression termination;
    public final Statement increment;
    public final Statement body;

    public For(
            Statement init, Expression termination, Statement increment, Statement body)
    {
        this.init = init;
        this.termination = termination;
        this.increment = increment;
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
        if (!(o instanceof For)) return false;
        For aFor = (For) o;
        return Objects.equals(init, aFor.init) &&
                Objects.equals(termination, aFor.termination) &&
                Objects.equals(increment, aFor.increment) &&
                Objects.equals(body, aFor.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(init, termination, increment, body);
    }

    @Override
    public String toString() {
        return "For{" +
                "init=" + init +
                ", termination=" + termination +
                ", increment=" + increment +
                ", body=" + body +
                '}';
    }
}
