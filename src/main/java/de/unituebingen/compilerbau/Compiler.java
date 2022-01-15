package de.unituebingen.compilerbau;

import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.codegen.CodeGenerator;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CodeGenException;
import de.unituebingen.compilerbau.exception.CompilerException;
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

    public byte[] compile(String filePath) throws CompilerException, IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath);

        input = readFromInputStream(inputStream);

        // Generate AST from input file
        Clazz clazz = scannerParser.parse(input);

        // Type check generated AST
        typeChecker.check(clazz);

        // Generate bytecode from AST
        byte[] bytecode = codeGenerator.generateBytecode(clazz);

        // Return bytecode as String for tests
        return bytecode;
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
