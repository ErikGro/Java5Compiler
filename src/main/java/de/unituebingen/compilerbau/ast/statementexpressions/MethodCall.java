package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

import java.util.List;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class MethodCall extends StatementExpression
{
    public final Expression expr;
    public final String name;
    public final List<Expression> args;

    public MethodCall(
            Expression expr, String name, List<Expression> args)
    {
        this.expr = expr;
        this.name = name;
        this.args = args;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
