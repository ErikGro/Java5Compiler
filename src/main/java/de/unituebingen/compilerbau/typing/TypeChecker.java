package de.unituebingen.compilerbau.typing;

import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.exception.TypeCheckException;

public class TypeChecker {
    /**
     *
     * @param input Abstract Syntax tree
     * @return true, if the input has no type errors
     */
    public Clazz check(Clazz input) throws TypeCheckException {
        throw new TypeCheckException("Not implemented");
    }
}
