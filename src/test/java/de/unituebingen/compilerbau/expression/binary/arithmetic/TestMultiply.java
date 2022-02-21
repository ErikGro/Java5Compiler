package de.unituebingen.compilerbau.expression.binary.arithmetic;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.arithmetic.Divide;
import de.unituebingen.compilerbau.ast.expression.arithmetic.Multiply;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestMultiply extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/binary/arithmetic/MockMultiply.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement multiplyIntsStatement = new LocalVarDeclaration("a", new Multiply(new IntLiteral(42), new IntLiteral(43)));
        Block body = new Block(Arrays.asList(multiplyIntsStatement));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockMultiply",
                Collections.emptyList(),
                methods);

        Map<String, Clazz> classMap = new HashMap<>();
        classMap.put(expectedAST.name, expectedAST);

        return classMap;
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());

        assertEquals(getExpectedClassMap().get("MockMultiply"), resultMap.get("MockMultiply"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.check(getExpectedClassMap());
    }

    @Override
    public void testGeneratedBytecode() throws CompilerException {

    }
}
