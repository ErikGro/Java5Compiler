package de.unituebingen.compilerbau.clazz.method;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.AccessModifier;
import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.ast.Method;
import de.unituebingen.compilerbau.ast.Type;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.Return;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;

import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestNonVoidReturnMethod extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/method/MockNonVoidReturnMethod.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockNonVoidReturnMethod");

        // TODO: Be consistent in terms of predefined primitive types and custom types
        Method nonVoidReturnMethod = new Method(PUBLIC, false, "intMethod", new Type("int"), Collections.emptyList(), new Block(Arrays.asList(new Return(new IntLiteral(42)))));

        List<Method> methods = new ArrayList<>();
        methods.add(nonVoidReturnMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockNonVoidReturnMethod",
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
