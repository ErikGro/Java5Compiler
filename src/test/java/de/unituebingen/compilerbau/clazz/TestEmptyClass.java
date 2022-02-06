package de.unituebingen.compilerbau.clazz;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.AccessModifier;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.ast.Clazz;

import java.io.IOException;
import java.util.Collections;

import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import static org.junit.Assert.assertEquals;

public class TestEmptyClass extends CompilerTest {
    @Override
    public String getClassPackage() {
        return "clazz.MockEmptyClass";
    }

    @Override
    public void testAST() throws ASTException, IOException {
        final ScannerParser scannerParser = new ScannerParser();
        final Clazz ast = scannerParser.parse(this.getSourcecode());

        final Clazz expectedAST = new Clazz(
                AccessModifier.PUBLIC,
                "MockEmptyClass",
                Collections.emptyList(),
                Collections.emptyList());

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
    public void testGeneratedBytecode() throws CompilerException {

    }
}
