package de.unituebingen.compilerbau.ast.statementexpressions;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

import java.util.List;

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
}
