package de.unituebingen.compilerbau.statement;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.ast.Clazz;

import java.io.IOException;

import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import static org.junit.Assert.assertEquals;

public class TestFor extends CompilerTest {
    @Override
    public String getFileName() {
        return "/statement/MockFor";
    }

    @Override
    public void testAST() throws ASTException, IOException {
        // TODO: Implement test for AST generation
        ScannerParser scannerParser = new ScannerParser();
        Clazz ast = scannerParser.parse(sourceFile);

        Clazz expectedAST = null;

        assertEquals(ast, expectedAST);
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        // TODO: Implement test for type checked AST
        Clazz ast = null;

        TypeChecker typeChecker = new TypeChecker();
        Clazz modifiedAST = typeChecker.check(ast);

        Clazz expectedAST = null;

        assertEquals(modifiedAST, expectedAST);
    }

    @Override
    public void testGeneratedBytecode() throws CompilerException, IOException {
        byte[] byteCode = compiler.compile(getFileName() + ".java");
        assertEquals(byteCode, expectedByteCode);
    }
}
