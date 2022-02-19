package de.unituebingen.compilerbau.typing;

import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.exception.TypeCheckException;

/* Runtime environment */
public class Environment {
    public Environment() {
        // TODO:
    }

    public void openScope() {
        // TODO:
    }

    public void closeScope() {
        // TODO:
    }

    public void addToScope(Identifier id) {
        // TODO:
    }

    public Type lookup(String name) throws TypeCheckException {
        // TODO:
        return null;
    }
}
