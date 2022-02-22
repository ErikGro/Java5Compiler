package de.unituebingen.compilerbau.statementexpression;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.DotOperator;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statementexpressions.New;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.ast.statements.Return;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PACKAGEPRIVATE;
import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestNew extends CompilerTest {
    public String getMockFilePath() {
        return "/statementexpression/MockNew.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        List<Field> fields = new ArrayList<>();
        Field hans = new Field(PUBLIC, false, "hans", new New(Collections.emptyList()), new Type("Hans"));
        fields.add(hans);

        Statement initHans = new LocalVarDeclaration("h", new New(Collections.emptyList()));
        initHans.setType(new Type("Hans"));
        Block body = new Block(Arrays.asList(initHans));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);

        Block body2 = new Block(Arrays.asList(new Return(new DotOperator(new Identifier("hans", null), "i"))));
        Method returns42Method = new Method(PUBLIC, false, "returns42", Type.INT, Collections.emptyList(), body2);
        List<Method> methods = Arrays.asList(testMethod, returns42Method);

        final Clazz expectedASTMockNew = new Clazz(
                PUBLIC,
                "MockNew",
                fields,
                methods);

        Field i = new Field(PUBLIC, false, "i", new IntLiteral(42), Type.INT);
        final Clazz expectedASTHans = new Clazz(
                PACKAGEPRIVATE,
                "Hans",
                Arrays.asList(i),
                Collections.emptyList());

        Map<String, Clazz> classMap = new HashMap<>();
        classMap.put(expectedASTMockNew.name, expectedASTMockNew);
        classMap.put(expectedASTHans.name, expectedASTHans);

        return classMap;
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());

        assertEquals(getExpectedClassMap().get("MockNew"), resultMap.get("MockNew"));
        assertEquals(getExpectedClassMap().get("Hans"), resultMap.get("Hans"));

    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.check(getExpectedClassMap());
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ReflectiveOperationException {
        compileAndLoadClasses();
        Class cMockNew = this.compiledClasses.get("MockNew");

        Object instance = cMockNew.getDeclaredConstructor().newInstance();
        int returnValue = (int) cMockNew.getDeclaredMethod("returns42").invoke(instance);

        assertEquals(42, returnValue);
    }
}
