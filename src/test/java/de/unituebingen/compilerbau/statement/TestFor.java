package de.unituebingen.compilerbau.statement;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Equal;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Less;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.LessOrEqual;
import de.unituebingen.compilerbau.ast.statementexpressions.Increment;
import de.unituebingen.compilerbau.ast.statements.*;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
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

        Statement init2 = new LocalVarDeclaration("i", new IntLiteral(0));
        init2.setType(Type.INT);
        Expression termination2 = new LessOrEqual(new Identifier("i", null), new IntLiteral(42));
        Statement increment2 = new Increment(new Identifier("i", null), true);
        If bodyForLoop = new If(
                new Equal(new Identifier("i", null), new IntLiteral(42)),
                new Block(Arrays.asList(new Return(new IntLiteral(42)))),
                null);
        Statement forLoop2 = new For(init2, termination2, increment2, new Block(Arrays.asList(bodyForLoop)));
        Statement returnStmt = new Return(new IntLiteral(0));
        Block body2 = new Block(Arrays.asList(forLoop2, returnStmt));
        Method returns42Method = new Method(PUBLIC, false, "returns42", Type.INT, Collections.emptyList(), body2);

        List<Method> methods = Arrays.asList(testMethod, returns42Method);

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
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ReflectiveOperationException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockFor");

        Object instance = c.getDeclaredConstructor().newInstance();
        int returnValue = (int) c.getDeclaredMethod("returns42").invoke(instance);

        assertEquals(42, returnValue);
    }
}
