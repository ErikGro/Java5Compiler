package de.unituebingen.compilerbau.expression.binary.relational;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.ast.Clazz;

import java.io.IOException;

import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import static org.junit.Assert.assertEquals;

public class TestGreaterOrEqual extends CompilerTest {
    @Override
    public String getFileName() {
        return "/expression/binary/relational/MockGreaterOrEqual";
    }

    @Override
    public void testAST() throws ASTException, IOException {
        // TODO: Implement test for AST generation
        ScannerParser scannerParser = new ScannerParser();
        Clazz ast = scannerParser.parse(this.getSourcecode());

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
        byte[] byteCode = compiler.compile(this.getFileName() + ".java");
        assertEquals(byteCode, this.getExpectedByteCode());
    }
}
