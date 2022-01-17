package de.unituebingen.compilerbau.ast;

import java.util.Collection;
import java.util.Map;

public class Method {
    public AccessModifier access;
    public boolean isStatic;
    public String name;
    public Type returnType;
    public Map<String, Type> parameters;
    public Statement body;

    public Method(AccessModifier access, boolean isStatic, String name, Type returnType, Map<String, Type> parameters, Statement body) {
        this.access = access;
        this.isStatic = isStatic;
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
        this.body = body;
    }

    public static String getDescriptor(Collection<Type> parameters, Type returnType) {
        String descriptor = "(";
        for (Type par : parameters) {
            descriptor += par.name;
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
        descriptor = getDescriptor(parameters.values(), returnType);
        return descriptor;
    }
}
