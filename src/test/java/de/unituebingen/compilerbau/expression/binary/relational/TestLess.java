package de.unituebingen.compilerbau.expression.binary.relational;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.GreaterOrEqual;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Less;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestLess extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/binary/relational/MockLess.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockLess");

        Statement statementA = new LocalVarDeclaration("a", new Less(new IntLiteral(42), new IntLiteral(43)));
        Statement statementB = new LocalVarDeclaration("b", new Less(new IntLiteral(42), new IntLiteral(42)));
        Statement statementC = new LocalVarDeclaration("c", new Less(new IntLiteral(42), new IntLiteral(41)));
        Block body = new Block(Arrays.asList(statementA, statementB, statementC));
        Method testMethod = new Method(PUBLIC, false, "test", new Type("void"), Collections.emptyMap(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockLess",
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
