package de.unituebingen.compilerbau.statementexpression;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Method;
import de.unituebingen.compilerbau.ast.Statement;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statementexpressions.Assignment;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAssignment extends CompilerTest {
    public String getMockFilePath() {
        return "/statementexpression/MockAssignment.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement initA = new LocalVarDeclaration("a", null);
        initA.setType(Type.INT);
        Statement assignment = new Assignment(new Identifier("a", null), new IntLiteral(42));
        Statement b = new LocalVarDeclaration("b", new IntLiteral(43));
        b.setType(Type.INT);

        Block body = new Block(Arrays.asList(initA, assignment, b));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockAssignment",
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

        assertEquals(getExpectedClassMap().get("MockAssignment"), resultMap.get("MockAssignment"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        assertTrue(typeChecker.check(getExpectedClassMap()));
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ClassNotFoundException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockAssignment");
    }
}
