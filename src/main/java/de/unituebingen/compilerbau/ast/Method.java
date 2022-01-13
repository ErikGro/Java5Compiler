package de.unituebingen.compilerbau.ast;

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
}
