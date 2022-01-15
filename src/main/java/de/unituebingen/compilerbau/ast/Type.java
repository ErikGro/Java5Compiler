package de.unituebingen.compilerbau.ast;

import java.util.Objects;

public class Type {
    public static final Type CHAR = new Type("char");
    public static final Type INT = new Type("int");
    public static final Type BOOLEAN = new Type("boolean");

    public String name;

    Type(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Type) {
            return ((Type)obj).name.equals(this.name);
        }
        return false;
    }
}
