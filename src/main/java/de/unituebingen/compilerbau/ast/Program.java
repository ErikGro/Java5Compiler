package de.unituebingen.compilerbau.ast;

import java.util.List;
import java.util.Objects;

/**
 * @author Matthias Walz
 * @version 1.0
 */
public class Program
{
    public final List<Clazz> classes;

    public Program(List<Clazz> classes)
    {
        this.classes = classes;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return Objects.equals(classes, program.classes);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(classes);
    }
}
