package de.unituebingen.compilerbau.clazz.field;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Field;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PACKAGEPRIVATE;
import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPackagePrivateField extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/field/MockPackagePrivateField.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Field fieldA = new Field(PACKAGEPRIVATE, false, "a", null, Type.INT);
        List<Field> fields = new ArrayList<>();
        fields.add(fieldA);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockPackagePrivateField",
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

        assertEquals(getExpectedClassMap().get("MockPackagePrivateField"), resultMap.get("MockPackagePrivateField"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        assertTrue(typeChecker.check(getExpectedClassMap()));
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ClassNotFoundException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockPackagePrivateField");
    }
}
