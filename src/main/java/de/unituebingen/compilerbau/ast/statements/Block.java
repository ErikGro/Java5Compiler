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
    public final List<Statement> body;

    public Block(List<Statement> body)
    {
        this.body = body;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
