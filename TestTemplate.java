import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.AccessModifier;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;

import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestTemplate extends CompilerTest {
    public String getMockFilePath() {
        return "/MockFolder/MockTemplate.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockEmptyClass = resultMap.get("MockEmptyClass");

        final Clazz expectedAST = new Clazz(
                AccessModifier.PUBLIC,
                "MockEmptyClass",
                Collections.emptyList(),
                Collections.emptyList());

        assertEquals(mockEmptyClass, expectedAST);
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {

    }

    @Override
    public void testGeneratedBytecode() throws CompilerException {

    }
}
