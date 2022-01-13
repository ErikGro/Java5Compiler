package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Statement;

import java.util.List;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Block extends Statement
{
    private List<Statement> body;

    public Block(List<Statement> body)
    {
        this.body = body;
    }

    public List<Statement> getBody()
    {
        return body;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        for (Statement statement : body)
        {
            statement.visit(visitor);
        }
    }
}
