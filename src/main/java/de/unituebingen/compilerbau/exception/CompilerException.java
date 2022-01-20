package de.unituebingen.compilerbau.exception;

public abstract class CompilerException extends RuntimeException {
    public CompilerException(String errorMessage) {
        super(errorMessage);
    }
}