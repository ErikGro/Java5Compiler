package de.unituebingen.compilerbau.expression.terniary;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.Ternary;
import de.unituebingen.compilerbau.ast.expression.literal.BooleanLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.NotEqual;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.If;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.ast.statements.Return;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestTerniary extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/terniary/MockTerniary.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement statementA = new LocalVarDeclaration("a", new Ternary(new BooleanLiteral(true), new IntLiteral(42), new IntLiteral(43)));
        statementA.setType(Type.BOOLEAN);
        Statement statementB = new LocalVarDeclaration("b", new Ternary(new BooleanLiteral(false), new IntLiteral(42), new IntLiteral(43)));
        statementB.setType(Type.BOOLEAN);
        Block body = new Block(Arrays.asList(statementA, statementB));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);

        Statement returnStmt = new Return(new Ternary(new BooleanLiteral(true), new IntLiteral(42), new IntLiteral(0)));
        Block body2 = new Block(Arrays.asList(returnStmt));
        Method returns42Method = new Method(PUBLIC, false, "returns42", Type.INT, Collections.emptyList(), body2);

        List<Method> methods = Arrays.asList(testMethod, returns42Method);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockTerniary",
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

        assertEquals(getExpectedClassMap().get("MockTerniary"), resultMap.get("MockTerniary"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.check(getExpectedClassMap());
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ReflectiveOperationException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockTerniary");

        Object instance = c.getDeclaredConstructor().newInstance();
        int returnValue = (int) c.getDeclaredMethod("returns42").invoke(instance);

        assertEquals(42, returnValue);
    }
}
