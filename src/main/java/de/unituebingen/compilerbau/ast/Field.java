package de.unituebingen.compilerbau.ast;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class Field implements LocalOrFieldVar {
    public final Clazz owner;
    public final AccessModifier access;
    public final boolean isStatic;
    protected String name;
    protected Type type;

    public Field(Clazz owner, AccessModifier access, boolean isStatic, String name, Type type) {
        this.owner = owner;
        this.isStatic = isStatic;
        this.access = access;
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
