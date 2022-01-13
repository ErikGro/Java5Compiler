package de.unituebingen.compilerbau.ast;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public abstract class Statement
{
    private Type type;

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }
}
