package de.unituebingen.compilerbau.expression.binary.relational;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.LessOrEqual;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.NotEqual;
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

public class TestNotEqual extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/binary/relational/MockNotEqual.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement statementA = new LocalVarDeclaration("a", new NotEqual(new IntLiteral(42), new IntLiteral(43)));
        Statement statementB = new LocalVarDeclaration("b", new NotEqual(new IntLiteral(42), new IntLiteral(42)));
        Block body = new Block(Arrays.asList(statementA, statementB));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockNotEqual",
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

        assertEquals(getExpectedClassMap().get("MockNotEqual"), resultMap.get("MockNotEqual"));
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
