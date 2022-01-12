package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.codegen.CodeGenerator;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CodeGenException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Compiler {
    /**
     * String input of the source file which should be compiled
     */
    private String input;

    private ScannerParser scannerParser = new ScannerParser();

    private TypeChecker typeChecker = new TypeChecker();

    private CodeGenerator codeGenerator = new CodeGenerator();

    public String compile(String filePath) throws ASTException, TypeCheckException, CodeGenException, IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath);

        input = readFromInputStream(inputStream);

        // Generate AST from input file
        String abstractSyntaxTree = scannerParser.parse(input);

        // Type check generated AST
        String checkedAST = typeChecker.check(abstractSyntaxTree);

        // Generate bytecode from AST
        String compiledClassFilePath = codeGenerator.generateBytecode(checkedAST);
        System.out.println("Compiling succeeded! Output: " + compiledClassFilePath);

        // Return bytecode as String for tests
        return "Compiled Bytecode";
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
