package de.unituebingen.compilerbau.clazz.method;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Method;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestMethodParameter extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/method/MockMethodParameter.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Vector<Identifier> parametersA = new Vector<>();
        parametersA.add(new Identifier("a", Type.INT));
        Method oneParameter = new Method(PUBLIC, false, "method", Type.VOID, parametersA, new Block(Collections.emptyList()));

        Vector<Identifier> parametersB = new Vector<>();
        parametersB.add(new Identifier("a", Type.INT));
        parametersB.add(new Identifier("b", Type.INT));
        parametersB.add(new Identifier("c", Type.INT));
        parametersB.add(new Identifier("d", Type.INT));
        parametersB.add(new Identifier("e", Type.INT));
        Method multipleParameters = new Method(PUBLIC, false, "method", Type.VOID, parametersB, new Block(Collections.emptyList()));

        List<Method> methods = new ArrayList<>();
        methods.add(oneParameter);
        methods.add(multipleParameters);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockMethodParameter",
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

        assertEquals(getExpectedClassMap().get("MockMethodParameter"), resultMap.get("MockMethodParameter"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.check(getExpectedClassMap());
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ClassNotFoundException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockMethodParameter");
    }
}
