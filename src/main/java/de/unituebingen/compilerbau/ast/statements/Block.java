package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.Statement;

import java.util.List;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Block
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
}
