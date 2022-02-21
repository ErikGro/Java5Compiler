package de.unituebingen.compilerbau.clazz.field;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.AccessModifier;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Field;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PRIVATE;
import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestStaticField extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/field/MockStaticField.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Field fieldA = new Field(null, PRIVATE, true, "a", null, Type.INT);
        List<Field> fields = new ArrayList<>();
        fields.add(fieldA);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockStaticField",
                fields,
                Collections.emptyList());

        Map<String, Clazz> classMap = new HashMap<>();
        classMap.put(expectedAST.name, expectedAST);

        return classMap;
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());

        assertEquals(getExpectedClassMap().get("MockStaticField"), resultMap.get("MockStaticField"));
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
