package de.unituebingen.compilerbau.clazz.method;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.Return;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;

import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PRIVATE;
import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestMethodAccess extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/method/MockMethodAccess.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockMethodAccess");

        Method privateMethod = new Method(PUBLIC, false, "privateMethod", new Type("void"), Collections.emptyMap(), new Block(Collections.emptyList()));
        Method publicMethod = new Method(PUBLIC, false, "publicMethod", new Type("void"), Collections.emptyMap(), new Block(Collections.emptyList()));
        // TODO: Add package private Access
        Method packagePrivateMethod = new Method(PUBLIC, false, "packagePrivateMethod", new Type("void"), Collections.emptyMap(), new Block(Collections.emptyList()));

        List<Method> methods = new ArrayList<>();
        methods.add(privateMethod);
        methods.add(publicMethod);
        methods.add(packagePrivateMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockMethodAccess",
                Collections.emptyList(),
                methods);

        assertEquals(expectedAST, mockClass);
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {

    }

    @Override
    public void testGeneratedBytecode() throws CompilerException {

    }
}
