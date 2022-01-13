package de.unituebingen.compilerbau.ast;

import java.util.List;

public class Clazz {
    public AccessModifier access;
    public String name;
    public List<Field> fields;
    public List<Method> methods;

    public Clazz(AccessModifier access, String name, List<Field> fields, List<Method> methods) {
        this.access = access;
        this.name = name;
        this.fields = fields;
        this.methods = methods;
    }
}
