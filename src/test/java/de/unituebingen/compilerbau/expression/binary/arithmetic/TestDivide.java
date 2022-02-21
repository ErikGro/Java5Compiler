package de.unituebingen.compilerbau.expression.binary.arithmetic;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.arithmetic.Add;
import de.unituebingen.compilerbau.ast.expression.arithmetic.Divide;
import de.unituebingen.compilerbau.ast.expression.literal.CharLiteral;
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

public class TestDivide extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/binary/arithmetic/MockDivide.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement addIntStatement = new LocalVarDeclaration("a", new Divide(new IntLiteral(10), new IntLiteral(5)));
        Block body = new Block(Arrays.asList(addIntStatement));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockDivide",
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

        assertEquals(getExpectedClassMap().get("MockDivide"), resultMap.get("MockDivide"));
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
