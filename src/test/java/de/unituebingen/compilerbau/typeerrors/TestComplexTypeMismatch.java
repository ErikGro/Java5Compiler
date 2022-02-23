package de.unituebingen.compilerbau.typeerrors;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.AccessModifier;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Field;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.literal.CharLiteral;
import de.unituebingen.compilerbau.ast.statementexpressions.New;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestComplexTypeMismatch extends CompilerTest {
    @Override
    public String getMockFilePath() {
        return "/typeerrors/MockComplexTypeMismatch.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        New newStmtExpr = new New(Collections.emptyList());
        newStmtExpr.setType(new Type("TypeB"));
        Field testField = new Field(AccessModifier.PACKAGEPRIVATE, false, "test", newStmtExpr, new Type("TypeA"));

        final Clazz expectedAST = new Clazz(
                AccessModifier.PUBLIC,
                "MockComplexTypeMismatch",
                Arrays.asList(testField),
                Collections.emptyList());

        Map<String, Clazz> classMap = new HashMap<>();
        classMap.put(expectedAST.name, expectedAST);

        return classMap;
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());

        assertEquals(getExpectedClassMap().get("MockComplexTypeMismatch"), resultMap.get("MockComplexTypeMismatch"));
    }

    @Override
    @Test(expected = TypeCheckException.class)
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.check(getExpectedClassMap());
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ClassNotFoundException {
        // Compiling should be stopped after TypeChecker threw an error beforehand
    }
}
