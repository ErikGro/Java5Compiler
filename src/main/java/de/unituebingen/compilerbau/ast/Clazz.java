package de.unituebingen.compilerbau.ast;

import java.util.List;
import java.util.Objects;

public class Clazz {
    public final AccessModifier access;
    public final String name;
    public final List<Field> fields;
    public final List<Method> methods;

    public Clazz(AccessModifier access, String name, List<Field> fields, List<Method> methods) {
        this.access = access;
        this.name = name;
        this.fields = fields;
        this.methods = methods;
    }

    public Field fieldByName(String name) {
        for (Field f: this.fields) {
            if (f.getName().equals(name))
                return f;
        }

        return null;
    }

    public Method methodByName(String name) {
        for (Method m: this.methods) {
            if (m.name.equals(name))
                return m;
        }

        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clazz)) return false;
        Clazz clazz = (Clazz) o;
        return access == clazz.access &&
                Objects.equals(name, clazz.name) &&
                Objects.equals(fields, clazz.fields) &&
                Objects.equals(methods, clazz.methods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(access, name, fields, methods);
    }

    @Override
    public String toString() {
        String fieldsString = "";
        for (Field f : fields) {
            fieldsString += f.toString() + "\n";
        }

        String methodsString = "";
        for (Method m : methods) {
            methodsString += m.toString() + "\n";
        }

        return "Clazz{" +
                "\naccess=" + access +
                ",\nname='" + name + '\'' +
                ",\nfields=" + fieldsString +
                ",\nmethods=" + methodsString +
                '}';
    }
}
