package de.unituebingen.compilerbau.ast;

import java.util.Objects;

public class Type {
    public static final Type CHAR = new Type("C");
    public static final Type INT = new Type("I");
    public static final Type BOOLEAN = new Type("Z");
    public static final Type VOID = new Type("V");

    public String name;

    public Type(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Type)) return false;
        Type type = (Type) o;
        return name.equals(type.name);
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
