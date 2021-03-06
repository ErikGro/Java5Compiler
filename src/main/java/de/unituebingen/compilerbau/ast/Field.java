package de.unituebingen.compilerbau.ast;

import java.util.Objects;

public class Field implements LocalOrFieldVar
{
    public final AccessModifier access;
    public final boolean isStatic;
    public final String name;
    public final Expression expression;
    protected Type type;

    public Field(
            AccessModifier access,
            boolean isStatic,
            String name,
            Expression expression,
            Type type)
    {
        this.isStatic = isStatic;
        this.access = access;
        this.name = name;
        this.expression = expression;
        this.type = type;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public Type getType()
    {
        return type;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Field)) return false;
        Field field = (Field) o;
        return isStatic == field.isStatic
                && access == field.access
                && Objects.equals(name, field.name)
                && Objects.equals(type, field.type);
    }

    @Override
    public String toString() {
        return "Field{" +
                "access=" + access +
                ", isStatic=" + isStatic +
                ", name='" + name + '\'' +
                ", expression=" + expression +
                ", type=" + type +
                '}';
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(access, isStatic, name, type);
    }
}
