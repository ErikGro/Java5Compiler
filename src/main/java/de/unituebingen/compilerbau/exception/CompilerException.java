package de.unituebingen.compilerbau.exception;

public abstract class CompilerException extends Exception {
    public CompilerException(String errorMessage) {
        super(errorMessage);
    }
}