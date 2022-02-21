package de.unituebingen.compilerbau.clazz.method;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.AccessModifier;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Method;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;

import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestMethodParameter extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/method/MockMethodParameter.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockMethodParameter");

        Vector<Identifier> parametersA = new Vector<>();
        parametersA.add(new Identifier("a", new Type("int")));
        Method oneParameter = new Method(PUBLIC, false, "method", new Type("void"), parametersA, new Block(Collections.emptyList()));

        // TODO: Be consistent in terms of predefined primitive types and custom types
        Vector<Identifier> parametersB = new Vector<>();
        parametersB.add(new Identifier("a", new Type("int")));
        parametersB.add(new Identifier("b", new Type("int")));
        parametersB.add(new Identifier("c", new Type("int")));
        parametersB.add(new Identifier("d", new Type("int")));
        parametersB.add(new Identifier("e", new Type("int")));
        Method multipleParameters = new Method(PUBLIC, false, "method", new Type("void"), parametersB, new Block(Collections.emptyList()));

        List<Method> methods = new ArrayList<>();
        methods.add(oneParameter);
        methods.add(multipleParameters);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockMethodParameter",
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
