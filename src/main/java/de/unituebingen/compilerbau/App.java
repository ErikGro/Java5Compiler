package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CodeGenException;
import de.unituebingen.compilerbau.exception.TypeCheckException;

import java.io.IOException;

public class App {
    public static void main( String[] args ) {
        Compiler compiler = new Compiler();

        try {
            compiler.compile("InputClass.java");
        } catch (ASTException e) {
            System.err.println("AST generation failed");
            e.printStackTrace();
        } catch (TypeCheckException e) {
            System.err.println("Type checking failed");
            e.printStackTrace();
        } catch (CodeGenException e) {
            System.err.println("Byte code generation failed");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
