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

    // Codegen
    @Override
    public void load(MethodVisitor mv) {
        mv.visitFieldInsn(isStatic ? Opcodes.GETSTATIC : Opcodes.GETFIELD, owner.name, name, type.name);
    }

    @Override
    public void store(MethodVisitor mv) {
        mv.visitFieldInsn(isStatic ? Opcodes.PUTSTATIC : Opcodes.PUTFIELD, owner.name, name, type.name);
    }
}
