package de.unituebingen.compilerbau.ast;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class Local implements LocalOrFieldVar {
    public final int index;
    protected String name;
    protected Type type;

    public Local(int index, String name, Type type) {
        this.index = index;
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
