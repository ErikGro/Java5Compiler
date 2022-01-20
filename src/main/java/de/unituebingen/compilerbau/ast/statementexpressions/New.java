package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

import java.util.List;
import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class New extends StatementExpression
{
    public final List<Expression> args;

    public New(List<Expression> args)
    {
        this.args = args;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof New)) return false;
        New aNew = (New) o;
        return Objects.equals(args, aNew.args);
    }

    @Override
    public int hashCode() {
        return Objects.hash(args);
    }
}
