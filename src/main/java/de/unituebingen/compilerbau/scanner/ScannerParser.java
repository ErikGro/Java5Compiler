package de.unituebingen.compilerbau.scanner;

import de.unituebingen.compilerbau.ast.Clazz;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.scanner.generated.ExpLexer;
import de.unituebingen.compilerbau.scanner.generated.ExpParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class ScannerParser {
    public Clazz parse(String sourceCode) throws IOException, ASTException {
        CharStream input = CharStreams.fromString("2+4/42");
        ExpLexer lexer = new ExpLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        ExpParser parser = new ExpParser(tokenStream);

        return null;
    }
}
