package de.unituebingen.compilerbau.expression.binary.bitwise;

import de.unituebingen.compilerbau.CompilerTest;
import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.BitAnd;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.BitOr;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.Equal;
import de.unituebingen.compilerbau.ast.statements.Block;
import de.unituebingen.compilerbau.ast.statements.If;
import de.unituebingen.compilerbau.ast.statements.LocalVarDeclaration;
import de.unituebingen.compilerbau.ast.statements.Return;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.exception.CompilerException;
import de.unituebingen.compilerbau.exception.TypeCheckException;
import de.unituebingen.compilerbau.scanner.ScannerParser;
import de.unituebingen.compilerbau.typing.TypeChecker;

import java.io.IOException;
import java.util.*;

import static de.unituebingen.compilerbau.ast.AccessModifier.PUBLIC;
import static org.junit.Assert.assertEquals;

public class TestBitOr extends CompilerTest {
    public String getMockFilePath() {
        return "/expression/binary/bitwise/MockBitOr.java";
    }

    @Override
    public Map<String, Clazz> getExpectedClassMap() {
        Statement bitAndA = new LocalVarDeclaration("a", new BitOr(new IntLiteral(1), new IntLiteral(2)));
        Statement bitAndB = new LocalVarDeclaration("b", new BitOr(new IntLiteral(42), new IntLiteral(295)));
        Block body = new Block(Arrays.asList(bitAndA, bitAndB));
        Method testMethod = new Method(PUBLIC, false, "test", Type.VOID, Collections.emptyList(), body);

        Statement aDecl = new LocalVarDeclaration("a", new BitOr(new IntLiteral(1), new IntLiteral(2)));
        Statement ifStmt = new If(
                        new Equal(new Identifier("a", null), new IntLiteral(3)),
                        new Block(Arrays.asList(new Return(new IntLiteral(42)))),
                        new Block(Arrays.asList(new Return(new IntLiteral(0)))));
        Block body2 = new Block(Arrays.asList(aDecl, ifStmt));
        Method returns42Method = new Method(PUBLIC, false, "returns42", Type.INT, Collections.emptyList(), body2);

        List<Method> methods = Arrays.asList(testMethod, returns42Method);

        final Clazz expectedAST = new Clazz(
                PUBLIC,
                "MockBitOr",
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

        assertEquals(getExpectedClassMap().get("MockBitOr"), resultMap.get("MockBitOr"));
    }

    @Override
    public void testTypeCheckedAST() throws TypeCheckException {
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.check(getExpectedClassMap());
    }

    @Override
    public void testGeneratedBytecode() throws IOException, CloneNotSupportedException, ReflectiveOperationException {
        compileAndLoadClasses();
        Class c = this.compiledClasses.get("MockBitOr");

        Object instance = c.getDeclaredConstructor().newInstance();
        int returnValue = (int) c.getDeclaredMethod("returns42").invoke(instance);

        assertEquals(42, returnValue);
    }
}
