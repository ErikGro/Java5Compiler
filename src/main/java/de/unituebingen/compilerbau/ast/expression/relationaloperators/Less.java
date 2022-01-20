package de.unituebingen.compilerbau.ast.expression.relationaloperators;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Less extends RelationalOperator
{
    public Less(
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
        if (!(o instanceof Less)) return false;
        return super.equals(o);
    }
}
