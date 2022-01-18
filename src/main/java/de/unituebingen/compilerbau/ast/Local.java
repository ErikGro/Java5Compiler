package de.unituebingen.compilerbau.ast;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Local)) return false;
        Local local = (Local) o;
        return index == local.index && name.equals(local.name) && type.equals(local.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name, type);
    }
}
