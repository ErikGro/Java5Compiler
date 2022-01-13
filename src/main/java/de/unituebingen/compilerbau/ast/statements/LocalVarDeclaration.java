package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.Type;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class LocalVarDeclaration
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
}
