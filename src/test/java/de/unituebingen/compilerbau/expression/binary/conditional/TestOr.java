package de.unituebingen.compilerbau.expression.binary.conditional;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.And;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.Or;
import de.unituebingen.compilerbau.ast.expression.literal.BooleanLiteral;
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

public class TestOr extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/binary/conditional/MockOr.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockOr");

        Statement statementA = new LocalVarDeclaration("a", new Or(new BooleanLiteral(true), new BooleanLiteral(true)));
        Statement statementB = new LocalVarDeclaration("b", new Or(new BooleanLiteral(true), new BooleanLiteral(false)));
        Statement statementC = new LocalVarDeclaration("c", new Or(new Or(new BooleanLiteral(true), new BooleanLiteral(true)), new BooleanLiteral(true)));
        Statement statementD = new LocalVarDeclaration("d", new Or(new Or(new Or(new BooleanLiteral(true), new BooleanLiteral(true)), new BooleanLiteral(false)), new BooleanLiteral(true)));
        Block body = new Block(Arrays.asList(statementA, statementB, statementC, statementD));
        Method testMethod = new Method(PUBLIC, false, "test", new Type("void"), Collections.emptyMap(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockOr",
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
