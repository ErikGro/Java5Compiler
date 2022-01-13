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
    private String name;
    private Type type;

    public LocalVarDeclaration(String name, Type type)
    {
        this.name = name;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public Type getType()
    {
        return type;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
