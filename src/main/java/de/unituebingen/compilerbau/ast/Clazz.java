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

    public Method findMethod(String name, List<Expression> params) {
        for (Method m: this.methods) {
            if (m.name.equals(name) && m.parameters.size() == params.size()) {
                boolean matches = true;
                for (int i = 0; i < params.size(); i++)
                    matches &= m.parameters.get(i).getType() == params.get(i).getType();

                if (matches)
                    return m;
            }
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
            methodsString += m.toString();
        }

        return "Clazz{" +
                "\naccess=" + access +
                ",\nname='" + name + '\'' +
                ",\nfields=\n" + fieldsString +
                ",\nmethods=\n" + methodsString +
                '}';
    }
}
