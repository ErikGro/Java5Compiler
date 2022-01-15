package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CodeGenException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;

import java.io.IOException;

public class App {
    public static void main( String[] args ) {
        Compiler compiler = new Compiler();

        try {
            compiler.compile("InputClass.java");
        } catch (CompilerException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
