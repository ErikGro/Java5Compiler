package de.unituebingen.compilerbau.expression.binary.bitwise;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.BitAnd;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.BitOr;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
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

public class TestBitOr extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/binary/bitwise/MockBitOr.java";
    }

    @Override
    public void testAST() throws ASTException {
        final ScannerParser scannerParser = new ScannerParser();
        Map<String, Clazz> resultMap = scannerParser.parse(this.getSourcecode());
        Clazz mockClass = resultMap.get("MockBitOr");

        Statement bitAndA = new LocalVarDeclaration("a", new BitOr(new IntLiteral(1), new IntLiteral(2)));
        Statement bitAndB = new LocalVarDeclaration("b", new BitOr(new IntLiteral(42), new IntLiteral(295)));
        Block body = new Block(Arrays.asList(bitAndA, bitAndB));
        Method testMethod = new Method(PUBLIC, false, "test", new Type("void"), Collections.emptyList(), body);
        List<Method> methods = Arrays.asList(testMethod);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockBitOr",
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
