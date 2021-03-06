package de.unituebingen.compilerbau.clazz;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Field;
import de.unituebingen.compilerbau.ast.Method;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.Return;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PRIVATE;
import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestClass extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/MockClass.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Field fieldA = new Field(PUBLIC, false, "a", null, Type.INT);
        Field fieldB = new Field(PUBLIC, false, "b", null, Type.INT);
        Field fieldC = new Field(PUBLIC, true, "c", null, Type.INT);
        Field fieldD = new Field(PRIVATE, false, "d", null, Type.INT);
        Field fieldE = new Field(PRIVATE, true, "e", null, Type.INT);
        List<Field> fields = new ArrayList<>();
        fields.add(fieldA);
        fields.add(fieldB);
        fields.add(fieldC);
        fields.add(fieldD);
        fields.add(fieldE);

        Method test = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), new Block(Collections.emptyList()));
        Method test2 = new Method(PUBLIC, false, "returns42", Type.INT, Collections.emptyList(), new Block(Arrays.asList(new Return(new IntLiteral(42)))));
        List<Method> methods = new ArrayList<>();
        methods.add(test);
        methods.add(test2);

        Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockClass",
                fields,
                methods);

        Map<String, Clazz> classMap = new HashMap<>();
        classMap.put(expectedAST.name, expectedAST);

        return classMap;
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());

        assertEquals(getExpectedClassMap().get("MockClass"), resultMap.get("MockClass"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException, CloneNotSupportedException {
        TypeChecker typeChecker = new TypeChecker();
        assertTrue(typeChecker.check(getExpectedClassMap()));
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ReflectiveOperationException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockClass");

        Object instance = c.getDeclaredConstructor().newInstance();
        int returnValue = (int) c.getDeclaredMethod("returns42").invoke(instance);

        assertEquals(42, returnValue);
    }
}
