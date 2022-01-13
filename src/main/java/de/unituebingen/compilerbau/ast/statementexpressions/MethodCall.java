package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.Expression;

import java.util.List;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class MethodCall extends StatementExpression
{
    private Expression expr;
    private String name;
    private List<Expression> args;

    public MethodCall(
            Expression expr, String name, List<Expression> args)
    {
        this.expr = expr;
        this.name = name;
        this.args = args;
    }

    public Expression getExpr()
    {
        return expr;
    }

    public String getName()
    {
        return name;
    }

    public List<Expression> getArgs()
    {
        return args;
    }
}
