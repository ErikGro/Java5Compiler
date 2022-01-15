package de.unituebingen.compilerbau.ast;

import org.objectweb.asm.MethodVisitor;

public interface LocalOrFieldVar {
    String getName();
    Type getType();
    void load(MethodVisitor mv);
    void store(MethodVisitor mv);
}
