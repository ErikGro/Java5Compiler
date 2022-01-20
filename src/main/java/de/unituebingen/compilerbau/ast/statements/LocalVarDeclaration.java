package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Statement;
import de.unituebingen.compilerbau.ast.Type;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class LocalVarDeclaration extends Statement
{
    public final String name;

    public LocalVarDeclaration(String name) {
        this.name = name;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalVarDeclaration)) return false;
        LocalVarDeclaration that = (LocalVarDeclaration) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
