package de.unituebingen.compilerbau.statementexpression;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Method;
import de.unituebingen.compilerbau.ast.Statement;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statementexpressions.MethodCall;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.Return;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestMethodCall extends CompilerTest {
    public String getMockFilePath() {
        return "/statementexpression/MockMethodCall.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement methodCall1 = new MethodCall(null, "method", Collections.emptyList());
        Statement methodCall2 = new MethodCall(null, "method1Param", Arrays.asList(new IntLiteral(42)));
        Statement methodCall3 = new MethodCall(null, "method2Param", Arrays.asList(new IntLiteral(42), new IntLiteral(42)));
        Block body = new Block(Arrays.asList(methodCall1, methodCall2, methodCall3));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);

        Method methodEmpty = new Method(PUBLIC, false, "method", Type.VOID, Collections.emptyList(), new Block(Collections.emptyList()));

        Vector<Identifier> params1 = new Vector<>();
        params1.add(new Identifier("a", Type.INT));
        Method method1Param = new Method(PUBLIC, false, "method1Param", Type.VOID, params1, new Block(Collections.emptyList()));

        Vector<Identifier> params2 = new Vector<>();
        params2.add(new Identifier("a", Type.INT));
        params2.add(new Identifier("b", Type.INT));
        Method method2Param = new Method(PUBLIC, false, "method2Param", Type.VOID, params2, new Block(Collections.emptyList()));

        Block body3 = new Block(Arrays.asList(new Return(new MethodCall(null, "methodReturnsInt", Collections.emptyList()))));
        Method returns42Method = new Method(PUBLIC, false, "returns42", Type.INT, Collections.emptyList(), body3);

        Block body4 = new Block(Arrays.asList(new Return(new IntLiteral(42))));
        Method returnsIntMethod = new Method(PUBLIC, false, "methodReturnsInt", Type.INT, Collections.emptyList(), body4);


        List<Method> methods = Arrays.asList(testMethod, methodEmpty, method1Param, method2Param, returns42Method, returnsIntMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockMethodCall",
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

        assertEquals(getExpectedClassMap().get("MockMethodCall"), resultMap.get("MockMethodCall"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.check(getExpectedClassMap());
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ReflectiveOperationException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockMethodCall");

        Object instance = c.getDeclaredConstructor().newInstance();
        int returnValue = (int) c.getDeclaredMethod("returns42").invoke(instance);

        assertEquals(42, returnValue);
    }
}
