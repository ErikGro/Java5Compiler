package de.unituebingen.compilerbau.ast;

public class Field {
    public AccessModifier access;
    public String name;
    public Type type;

    public Field(AccessModifier access, String name, Type type) {
        this.access = access;
        this.name = name;
        this.type = type;
    }
}
