package de.unituebingen.compilerbau.ast;

import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.statements.Block;

import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.stream.Collectors;

public class Method {
    public final AccessModifier access;
    public final boolean isStatic;
    public final String name;
    public final Type returnType;
    public final List<Identifier> parameters;
    public final Statement body;

    public Method(AccessModifier access, boolean isStatic, String name, Type returnType, List<Identifier> parameters, Statement body) {
        this.access = access;
        this.isStatic = isStatic;
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
        this.body = body;
    }

    public static String getDescriptor(List<Type> types, Type returnType) {
        String descriptor = "(";
        for (Type t : types) {
            descriptor += t.name;
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
        descriptor = getDescriptor(parameters.stream().map(identifier -> identifier.getType()).collect(Collectors.toList()), returnType);
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
    public String toString() {
        String bodyString = "";
        if (body instanceof Block) {
            for (Statement s : ((Block) body).body) {
                bodyString += s.toString() + "\n";
            }
        } else {
            bodyString = body.toString();
        }

        return "Method{" +
                "\n\taccess=" + access +
                ", \n\tisStatic=" + isStatic +
                ", \n\tname='" + name +
                ", \n\treturnType=" + returnType +
                ", \n\tparameters=" + parameters +
                ", \n\tbody=" + bodyString +
                ", descriptor='" + descriptor + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(access, isStatic, name, returnType, parameters, body, descriptor);
    }
}
