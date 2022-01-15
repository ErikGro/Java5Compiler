package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Statement;
import de.unituebingen.compilerbau.ast.Type;

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
}
