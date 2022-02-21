package de.unituebingen.compilerbau.statement;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Less;
import de.unituebingen.compilerbau.ast.statementexpressions.Increment;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.For;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestFor extends CompilerTest {
    public String getMockFilePath() {
        return "/statement/MockFor.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement init = new LocalVarDeclaration("i", new IntLiteral(0));
        Expression termination = new Less(new Identifier("i", null), new IntLiteral(42));
        Statement increment = new Increment(new Identifier("i", null), true);
        Statement forLoop = new For(init, termination, increment, new Block(Collections.emptyList()));

        Block body = new Block(Arrays.asList(forLoop));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockFor",
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

        assertEquals(getExpectedClassMap().get("MockFor"), resultMap.get("MockFor"));
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
