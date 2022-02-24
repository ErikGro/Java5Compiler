package de.unituebingen.compilerbau.ast.statements;

import de.unituebingen.compilerbau.ast.ASTVisitor;
import de.unituebingen.compilerbau.ast.Expression;
import de.unituebingen.compilerbau.ast.Statement;
import de.unituebingen.compilerbau.ast.Type;

import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class LocalVarDeclaration extends Statement
{
    public final String name;
    public final Expression expression;
    protected Type fieldType;

    public LocalVarDeclaration(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    public void setFieldType(Type type) {
        this.fieldType = type;
    }

    public Type getFieldType() {
        return this.fieldType;
    }

    @Override
    public void visit(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalVarDeclaration that = (LocalVarDeclaration) o;
        return Objects.equals(name, that.name) && Objects.equals(expression, that.expression);
    }

    @Override
    public String toString() {
        return "LocalVarDeclaration{" +
                "name='" + name + '\'' +
                ", expression=" + expression +
                ", type=" + getType() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, expression);
    }
}
