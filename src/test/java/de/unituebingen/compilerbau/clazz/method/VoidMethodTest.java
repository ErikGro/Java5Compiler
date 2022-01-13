package de.unituebingen.compilerbau.clazz.method;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class VoidMethodTest extends CompilerTest {
    @Override
    public String getFileName() {
        return "MockVoidMethod";
    }

    @Override
    public void testAST() throws ASTException, IOException {
        // TODO: Implement test for AST generation
        ScannerParser scannerParser = new ScannerParser();
        String ast = scannerParser.parse(sourceFile);

        String expectedAST = "";

        assertEquals(ast, expectedAST);
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        // TODO: Implement test for type checked AST
        String ast = "ast";

        TypeChecker typeChecker = new TypeChecker();
        String modifiedAST = typeChecker.check(ast);

        String expectedAST = "";

        assertEquals(modifiedAST, expectedAST);
    }

    @Override
    public void testGeneratedBytecode() throws CompilerException, IOException {
        String byteCode = compiler.compile(getFileName() + ".java");
        assertEquals(byteCode, expectedByteCode);
    }
}