package de.unituebingen.compilerbau.clazz;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.statementexpressions.Assignment;
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

public class TestClass extends CompilerTest {
    public String getMockFilePath() {
        return "/clazz/MockClass.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockClass");

        // TODO: Why is owner always null? Expected behaviour? Should this be done in TypeChecking?
        // TODO: Why is type null here? The explicit type information would be lost otherwise, or?
        Field fieldA = new Field(null, PUBLIC, false, "a", null, null);
        Field fieldB = new Field(null, PUBLIC, false, "b", null, null);
        Field fieldC = new Field(null, PUBLIC, true, "c", null, null);
        Field fieldD = new Field(null, PRIVATE, false, "d", null, null);
        Field fieldE = new Field(null, PRIVATE, true, "e", null, null);
        List<Field> fields = new ArrayList<>();
        fields.add(fieldA);
        fields.add(fieldB);
        fields.add(fieldC);
        fields.add(fieldD);
        fields.add(fieldE);

        Method test = new Method(PUBLIC, false, "test", new Type("void"), Collections.emptyList(), new Block(Collections.emptyList()));
        // TODO: Be consistent in terms of Type, use predefined Type if exists - or use always string value
        Method test2 = new Method(PUBLIC, false, "test2", new Type("int"), Collections.emptyList(), new Block(Arrays.asList(new Return(new IntLiteral(42)))));
        List<Method> methods = new ArrayList<>();
        methods.add(test);
        methods.add(test2);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockClass",
                fields,
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
