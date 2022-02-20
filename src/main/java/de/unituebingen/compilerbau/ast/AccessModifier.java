package de.unituebingen.compilerbau.ast;

import org.objectweb.asm.Opcodes;

public enum AccessModifier
{
    PUBLIC(Opcodes.ACC_PUBLIC), PROTECTED(Opcodes.ACC_PROTECTED), PRIVATE(Opcodes.ACC_PRIVATE);

    public final int asm;

    AccessModifier(int asm)
    {
        this.asm = asm;
    }
}
