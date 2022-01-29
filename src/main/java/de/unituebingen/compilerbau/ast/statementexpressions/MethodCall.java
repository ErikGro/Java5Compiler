package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

import java.util.List;
import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class MethodCall extends StatementExpression
{
    public Expression expr;
    public final String name;
    public final List<Expression> args;

    public MethodCall(
            Expression expr, String name, List<Expression> args)
    {
        this.expr = expr;
        this.name = name;
        this.args = args;
    }

    public void setExpr(Expression expr)
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
        if (!(o instanceof MethodCall)) return false;
        MethodCall that = (MethodCall) o;
        return Objects.equals(expr, that.expr) &&
                Objects.equals(name, that.name) &&
                Objects.equals(args, that.args);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expr, name, args);
    }
}
