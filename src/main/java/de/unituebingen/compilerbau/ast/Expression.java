package de.unituebingen.compilerbau.ast;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public interface Expression extends Node
{
    Type getType();
}
