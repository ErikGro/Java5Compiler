package de.unituebingen.compilerbau.ast;

import de.unituebingen.compilerbau.ast.expression.Identifier;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;

public class Method {
    public final AccessModifier access;
    public final boolean isStatic;
    public final String name;
    public final Type returnType;
    public final Vector<Identifier> parameters;
    public final Statement body;

    public Method(AccessModifier access, boolean isStatic, String name, Type returnType, Vector<Identifier> parameters, Statement body) {
        this.access = access;
        this.isStatic = isStatic;
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
        this.body = body;
    }

    public static String getDescriptor(Vector<Identifier> parameters, Type returnType) {
        String descriptor = "(";
        for (Identifier par : parameters) {
            descriptor += par.getType().name;
        }
        descriptor += ")";
        if (returnType == null) {
            descriptor += "V";
        } else {
            descriptor += returnType.name;
        }
        return descriptor;
    }

    private String descriptor;

    public String getDescriptor() {
        if (descriptor != null) {
            return descriptor;
        }
        descriptor = getDescriptor(parameters, returnType);
        return descriptor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Method)) return false;
        Method method = (Method) o;
        return isStatic == method.isStatic &&
                access == method.access &&
                Objects.equals(name, method.name) &&
                Objects.equals(returnType, method.returnType) &&
                Objects.equals(parameters, method.parameters) &&
                Objects.equals(body, method.body) &&
                Objects.equals(descriptor, method.descriptor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(access, isStatic, name, returnType, parameters, body, descriptor);
    }
}
