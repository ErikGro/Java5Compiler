package de.unituebingen.compilerbau.expression.binary.conditional;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Method;
import de.unituebingen.compilerbau.ast.Statement;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.And;
import de.unituebingen.compilerbau.ast.expression.literal.BooleanLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.If;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.ast.statements.Return;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestAnd extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/binary/conditional/MockAnd.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement statementA = new LocalVarDeclaration("a", new And(new BooleanLiteral(true), new BooleanLiteral(true)));
        statementA.setType(Type.BOOLEAN);
        Statement statementB = new LocalVarDeclaration("b", new And(new BooleanLiteral(true), new BooleanLiteral(false)));
        statementB.setType(Type.BOOLEAN);
        Statement statementC = new LocalVarDeclaration("c", new And(new And(new BooleanLiteral(true), new BooleanLiteral(true)), new BooleanLiteral(true)));
        statementC.setType(Type.BOOLEAN);
        Statement statementD = new LocalVarDeclaration("d", new And(new And(new And(new BooleanLiteral(true), new BooleanLiteral(true)), new BooleanLiteral(false)), new BooleanLiteral(true)));
        statementD.setType(Type.BOOLEAN);
        Block body = new Block(Arrays.asList(statementA, statementB, statementC, statementD));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);

        Statement aDecl = new LocalVarDeclaration("a", new And(new BooleanLiteral(true), new BooleanLiteral(true)));
        aDecl.setType(Type.BOOLEAN);
        Statement ifStmt = new If(
                        new Identifier("a", null),
                        new Block(Arrays.asList(new Return(new IntLiteral(42)))),
                        new Block(Arrays.asList(new Return(new IntLiteral(0)))));
        Block body2 = new Block(Arrays.asList(aDecl, ifStmt));
        Method returns42Method = new Method(PUBLIC, false, "returns42", Type.INT, Collections.emptyList(), body2);

        List<Method> methods = Arrays.asList(testMethod, returns42Method);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockAnd",
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

        assertEquals(getExpectedClassMap().get("MockAnd"), resultMap.get("MockAnd"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.check(getExpectedClassMap());
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ReflectiveOperationException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockAnd");

        Object instance = c.getDeclaredConstructor().newInstance();
        int returnValue = (int) c.getDeclaredMethod("returns42").invoke(instance);

        assertEquals(42, returnValue);
    }
}
