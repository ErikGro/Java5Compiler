package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.codegen.CodeGenerator;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main( String[] args ) {
        Compiler compiler = new Compiler();
        compiler.compile("InputClass.java");
    }
}

class Compiler {
    /**
     * String input of the source file which should be compiled
     */
    private String input;

    private ScannerParser scannerParser = new ScannerParser();

    private TypeChecker typeChecker = new TypeChecker();

    private CodeGenerator codeGenerator = new CodeGenerator();

    public void compile(String filePath) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath);

        try {
            input = readFromInputStream(inputStream);
        } catch (IOException e) {
            System.err.println("Couldnt read file: " + filePath);
            System.err.println("Input file need to be in the classpath");
            e.printStackTrace();
            return;
        }
        String abstractSyntaxTree = null;
        try {
            abstractSyntaxTree = scannerParser.parse(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (abstractSyntaxTree == null) {
            System.err.println("Generating AST failed...");
            return;
        }

        boolean checkSucceeded = typeChecker.check(abstractSyntaxTree);
        if (!checkSucceeded) {
            System.out.println("Type checking failed...");
            return;
        }

        String compiledClassFilePath = codeGenerator.generateBytecode(abstractSyntaxTree);
        System.out.println("Compiling succeeded! Output: " + compiledClassFilePath);
    }

    private String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }

        return resultStringBuilder.toString();
    }
}
