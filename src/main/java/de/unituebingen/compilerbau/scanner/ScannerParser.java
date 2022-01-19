package de.unituebingen.compilerbau.scanner;

import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.scanner.generated.JavaFiveGrammarLexer;
import de.unituebingen.compilerbau.scanner.generated.JavaFiveGrammarParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class ScannerParser {
    public String parse(String sourceCode) throws IOException, ASTException {
        CharStream input = CharStreams.fromString(sourceCode);
        JavaFiveGrammarLexer lexer = new JavaFiveGrammarLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        JavaFiveGrammarParser parser = new JavaFiveGrammarParser(tokenStream);

        return "lol";
    }
}