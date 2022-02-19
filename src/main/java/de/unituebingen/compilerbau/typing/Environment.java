package de.unituebingen.compilerbau.typing;

import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.exception.TypeCheckException;

import java.util.Vector;

/* Runtime environment */
public class Environment implements Cloneable {
    protected Environment prev = null;
    protected Vector<Identifier> scope = new Vector<>();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void openScope() throws CloneNotSupportedException {
        this.prev = (Environment) this.clone();
        this.scope = new Vector<>();
    }

    public void closeScope() throws TypeCheckException {
        if (this.prev == null)
            throw new TypeCheckException("No scope to be closed");

        this.scope = this.prev.scope;
        this.prev = this.prev.prev;
    }

    public void addToScope(Identifier id) {
        this.scope.add(id);
    }

    public Type lookup(String name) throws TypeCheckException {
        // Lookup in closest scope
        for (Identifier id: this.scope) {
            if (id.name.equals(name))
                return id.getType();
        }

        // Lookup in wider scope
        if (this.prev != null)
            return prev.lookup(name);
        return null;
    }
}
