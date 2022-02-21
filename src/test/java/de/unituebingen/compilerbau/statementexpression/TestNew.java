package de.unituebingen.compilerbau.statementexpression;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statementexpressions.MethodCall;
import de.unituebingen.compilerbau.ast.statementexpressions.New;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.awt.*;
import java.util.*;
import java.util.List;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestNew extends CompilerTest {
    public String getMockFilePath() {
        return "/statementexpression/MockNew.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        List<Field> fields = new ArrayList<>();
        Field hans = new Field(null, PUBLIC, false, "hans", new New(Collections.emptyList()), new Type("Hans"));
        fields.add(hans);

        List<Method> methods = new ArrayList<>();
        Statement initHans = new LocalVarDeclaration("h", new New(Collections.emptyList()));
        Block body = new Block(Arrays.asList(initHans));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);
        methods.add(testMethod);

        final Clazz expectedASTMockNew = new Clazz(
                PUBLIC,
                "MockNew",
                fields,
                methods);

        final Clazz expectedASTHans = new Clazz(
                null,
                "Hans",
                Collections.emptyList(),
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
    public void testGeneratedBytecode() throws CompilerException {

    }
}
