package de.unituebingen.compilerbau.clazz.field;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.AccessModifier;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Field;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static de.unituebingen.compilerbau.ast.AccessModifier.PRIVATE;
import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestPrivateField extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/field/MockPrivateField.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockPrivateField");

        // TODO: Package private (alias no access modifier) should be part of our implementation
        Field fieldA = new Field(null, PRIVATE, false, "a", null, null);
        List<Field> fields = new ArrayList<>();
        fields.add(fieldA);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockPrivateField",
                fields,
                Collections.emptyList());

        assertEquals(expectedAST, mockClass);
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {

    }

    @Override
    public void testGeneratedBytecode() throws CompilerException {

    }
}
