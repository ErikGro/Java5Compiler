package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Statement;

import java.util.List;
import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Block extends Statement {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Block)) return false;
        Block block = (Block) o;
        return Objects.equals(body, block.body);
    }

    @Override
    public String toString() {
        String statements = "";
        for (Statement s : body) {
            statements += s.toString() + "\n";
        }
        return statements;
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
}
