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
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.*;
import static org.junit.Assert.assertEquals;

public class TestMethodAccess extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/method/MockMethodAccess.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Method privateMethod = new Method(PRIVATE, false, "privateMethod", new Type("void"), Collections.emptyList(), new Block(Collections.emptyList()));
        Method publicMethod = new Method(PUBLIC, false, "publicMethod", new Type("void"), Collections.emptyList(), new Block(Collections.emptyList()));
        Method packagePrivateMethod = new Method(PACKAGEPRIVATE, false, "packagePrivateMethod", new Type("void"), Collections.emptyList(), new Block(Collections.emptyList()));

        List<Method> methods = new ArrayList<>();
        methods.add(privateMethod);
        methods.add(publicMethod);
        methods.add(packagePrivateMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockMethodAccess",
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
        Clazz mockClass = resultMap.get("MockMethodAccess");

        assertEquals(getExpectedClassMap(), mockClass);
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
