package de.unituebingen.compilerbau.statement;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.literal.BooleanLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Equal;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Greater;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Less;
import de.unituebingen.compilerbau.ast.statementexpressions.Increment;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.For;
import de.unituebingen.compilerbau.ast.statements.If;
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

public class TestIf extends CompilerTest {
    public String getMockFilePath() {
        return "/statement/MockIf.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockIf");

        Block emptyBody = new Block(Collections.emptyList());

        Statement if1 = new If(new Greater(new IntLiteral(42), new IntLiteral(0)), emptyBody, null);
        Statement if2 = new If(new Less(new IntLiteral(42), new IntLiteral(0)), emptyBody, null);

        Statement elseIf = new If(new BooleanLiteral(true), emptyBody, emptyBody);
        Statement if3 = new If(new Equal(new IntLiteral(42), new IntLiteral(42)), emptyBody, elseIf);

        Block body = new Block(Arrays.asList(if1, if2, if3));
        Method testMethod = new Method(PUBLIC, false, "test", new Type("void"), Collections.emptyMap(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockIf",
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
