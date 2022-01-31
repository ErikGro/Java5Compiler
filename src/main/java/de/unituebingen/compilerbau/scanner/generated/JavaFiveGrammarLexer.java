// Generated from C:/Users/matth/IdeaProjects/compilerbau_ws2021/src/main/java/de/unituebingen/compilerbau/scanner\JavaFiveGrammar.g4 by ANTLR 4.9.2
package de.unituebingen.compilerbau.scanner.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaFiveGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IncDecOp=1, UnaryOp=2, MultOp=3, AddOp=4, ShiftOp=5, RelationalOp=6, EqualityOp=7, 
		BitwiseOp=8, ConditionalOp=9, QuestionMark=10, AdvancedAssignmentOp=11, 
		SimpleAssignmentOp=12, Selector=13, LCurlyBracket=14, RCurlyBracket=15, 
		LRoundBracket=16, RRoundBracket=17, Comma=18, Semicolon=19, Colon=20, 
		AccessModifier=21, Primitive=22, Bool=23, Class=24, Static=25, For=26, 
		While=27, Do=28, If=29, Switch=30, Case=31, Default=32, Else=33, Return=34, 
		This=35, New=36, Break=37, Continue=38, Int=39, Char=40, Identifier=41, 
		IdentifierChars=42, JavaLetterOrDigit=43, Digit=44, Hex=45, JavaLetter=46, 
		WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IncDecOp", "UnaryOp", "MultOp", "AddOp", "ShiftOp", "RelationalOp", 
			"EqualityOp", "BitwiseOp", "ConditionalOp", "QuestionMark", "AdvancedAssignmentOp", 
			"SimpleAssignmentOp", "Selector", "LCurlyBracket", "RCurlyBracket", "LRoundBracket", 
			"RRoundBracket", "Comma", "Semicolon", "Colon", "AccessModifier", "Primitive", 
			"Bool", "Class", "Static", "For", "While", "Do", "If", "Switch", "Case", 
			"Default", "Else", "Return", "This", "New", "Break", "Continue", "Int", 
			"Char", "Identifier", "IdentifierChars", "JavaLetterOrDigit", "Digit", 
			"Hex", "JavaLetter", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'?'", null, 
			"'='", "'.'", "'{'", "'}'", "'('", "')'", "','", "';'", "':'", null, 
			null, null, "'class'", "'static'", "'for'", "'while'", "'do'", "'if'", 
			"'switch'", "'case'", "'default'", "'else'", "'return'", "'this'", "'new'", 
			"'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IncDecOp", "UnaryOp", "MultOp", "AddOp", "ShiftOp", "RelationalOp", 
			"EqualityOp", "BitwiseOp", "ConditionalOp", "QuestionMark", "AdvancedAssignmentOp", 
			"SimpleAssignmentOp", "Selector", "LCurlyBracket", "RCurlyBracket", "LRoundBracket", 
			"RRoundBracket", "Comma", "Semicolon", "Colon", "AccessModifier", "Primitive", 
			"Bool", "Class", "Static", "For", "While", "Do", "If", "Switch", "Case", 
			"Default", "Else", "Return", "This", "New", "Break", "Continue", "Int", 
			"Char", "Identifier", "IdentifierChars", "JavaLetterOrDigit", "Digit", 
			"Hex", "JavaLetter", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public JavaFiveGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaFiveGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0189\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\5\2f\n\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6u\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7|\n\7\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n"+
		"\u008a\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00c9\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00dd\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e8\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u0140\n(\r(\16(\u0141"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)"+
		"\u0171\n)\3*\3*\3+\3+\7+\u0177\n+\f+\16+\u017a\13+\3,\3,\5,\u017e\n,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61\3\2\f\4\2##\u0080\u0080\5\2\'\',,\61\61\4\2--//\4\2>"+
		">@@\5\2((``~~\6\2\"\"\62;C\\c|\3\2\62;\5\2\62;CHch\6\2&&C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u01aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13t\3\2\2"+
		"\2\r{\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23\u0089\3\2\2\2\25\u008b"+
		"\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3"+
		"\2\2\2\37\u00af\3\2\2\2!\u00b1\3\2\2\2#\u00b3\3\2\2\2%\u00b5\3\2\2\2\'"+
		"\u00b7\3\2\2\2)\u00b9\3\2\2\2+\u00c8\3\2\2\2-\u00dc\3\2\2\2/\u00e7\3\2"+
		"\2\2\61\u00e9\3\2\2\2\63\u00ef\3\2\2\2\65\u00f6\3\2\2\2\67\u00fa\3\2\2"+
		"\29\u0100\3\2\2\2;\u0103\3\2\2\2=\u0106\3\2\2\2?\u010d\3\2\2\2A\u0112"+
		"\3\2\2\2C\u011a\3\2\2\2E\u011f\3\2\2\2G\u0126\3\2\2\2I\u012b\3\2\2\2K"+
		"\u012f\3\2\2\2M\u0135\3\2\2\2O\u013f\3\2\2\2Q\u0170\3\2\2\2S\u0172\3\2"+
		"\2\2U\u0174\3\2\2\2W\u017d\3\2\2\2Y\u017f\3\2\2\2[\u0181\3\2\2\2]\u0183"+
		"\3\2\2\2_\u0185\3\2\2\2ab\7-\2\2bf\7-\2\2cd\7/\2\2df\7/\2\2ea\3\2\2\2"+
		"ec\3\2\2\2f\4\3\2\2\2gh\t\2\2\2h\6\3\2\2\2ij\t\3\2\2j\b\3\2\2\2kl\t\4"+
		"\2\2l\n\3\2\2\2mn\7>\2\2nu\7>\2\2op\7@\2\2pu\7@\2\2qr\7@\2\2rs\7@\2\2"+
		"su\7@\2\2tm\3\2\2\2to\3\2\2\2tq\3\2\2\2u\f\3\2\2\2v|\t\5\2\2wx\7>\2\2"+
		"x|\7?\2\2yz\7@\2\2z|\7?\2\2{v\3\2\2\2{w\3\2\2\2{y\3\2\2\2|\16\3\2\2\2"+
		"}~\7?\2\2~\u0082\7?\2\2\177\u0080\7#\2\2\u0080\u0082\7?\2\2\u0081}\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0082\20\3\2\2\2\u0083\u0084\t\6\2\2\u0084\22\3"+
		"\2\2\2\u0085\u0086\7(\2\2\u0086\u008a\7(\2\2\u0087\u0088\7~\2\2\u0088"+
		"\u008a\7~\2\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\24\3\2\2\2"+
		"\u008b\u008c\7A\2\2\u008c\26\3\2\2\2\u008d\u008e\7-\2\2\u008e\u00a8\7"+
		"?\2\2\u008f\u0090\7/\2\2\u0090\u00a8\7?\2\2\u0091\u0092\7,\2\2\u0092\u00a8"+
		"\7?\2\2\u0093\u0094\7\61\2\2\u0094\u00a8\7?\2\2\u0095\u0096\7\'\2\2\u0096"+
		"\u00a8\7?\2\2\u0097\u0098\7(\2\2\u0098\u00a8\7?\2\2\u0099\u009a\7`\2\2"+
		"\u009a\u00a8\7?\2\2\u009b\u009c\7~\2\2\u009c\u00a8\7?\2\2\u009d\u009e"+
		"\7>\2\2\u009e\u009f\7>\2\2\u009f\u00a8\7?\2\2\u00a0\u00a1\7@\2\2\u00a1"+
		"\u00a2\7@\2\2\u00a2\u00a8\7?\2\2\u00a3\u00a4\7@\2\2\u00a4\u00a5\7@\2\2"+
		"\u00a5\u00a6\7@\2\2\u00a6\u00a8\7?\2\2\u00a7\u008d\3\2\2\2\u00a7\u008f"+
		"\3\2\2\2\u00a7\u0091\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7\u0095\3\2\2\2\u00a7"+
		"\u0097\3\2\2\2\u00a7\u0099\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009d\3\2"+
		"\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\30\3\2\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac\34\3\2\2\2\u00ad\u00ae"+
		"\7}\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7\177\2\2\u00b0 \3\2\2\2\u00b1\u00b2"+
		"\7*\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4$\3\2\2\2\u00b5\u00b6"+
		"\7.\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7"+
		"<\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be"+
		"\7d\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c9\7e\2\2\u00c1"+
		"\u00c2\7r\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7x\2\2"+
		"\u00c5\u00c6\7c\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c9\7g\2\2\u00c8\u00bb"+
		"\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc"+
		"\7j\2\2\u00cc\u00cd\7c\2\2\u00cd\u00dd\7t\2\2\u00ce\u00cf\7k\2\2\u00cf"+
		"\u00d0\7p\2\2\u00d0\u00dd\7v\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7q\2\2"+
		"\u00d3\u00d4\7q\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7c\2\2\u00d7\u00dd\7p\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7q\2\2\u00da"+
		"\u00db\7k\2\2\u00db\u00dd\7f\2\2\u00dc\u00ca\3\2\2\2\u00dc\u00ce\3\2\2"+
		"\2\u00dc\u00d1\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd.\3\2\2\2\u00de\u00df"+
		"\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e8\7g\2\2\u00e2"+
		"\u00e3\7h\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2"+
		"\u00e6\u00e8\7g\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e8\60\3"+
		"\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7c\2\2\u00ec"+
		"\u00ed\7u\2\2\u00ed\u00ee\7u\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7u\2\2\u00f0"+
		"\u00f1\7v\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7k\2\2"+
		"\u00f4\u00f5\7e\2\2\u00f5\64\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7"+
		"q\2\2\u00f8\u00f9\7t\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc"+
		"\7j\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"8\3\2\2\2\u0100\u0101\7f\2\2\u0101\u0102\7q\2\2\u0102:\3\2\2\2\u0103\u0104"+
		"\7k\2\2\u0104\u0105\7h\2\2\u0105<\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108"+
		"\7y\2\2\u0108\u0109\7k\2\2\u0109\u010a\7v\2\2\u010a\u010b\7e\2\2\u010b"+
		"\u010c\7j\2\2\u010c>\3\2\2\2\u010d\u010e\7e\2\2\u010e\u010f\7c\2\2\u010f"+
		"\u0110\7u\2\2\u0110\u0111\7g\2\2\u0111@\3\2\2\2\u0112\u0113\7f\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\7h\2\2\u0115\u0116\7c\2\2\u0116\u0117\7w\2\2"+
		"\u0117\u0118\7n\2\2\u0118\u0119\7v\2\2\u0119B\3\2\2\2\u011a\u011b\7g\2"+
		"\2\u011b\u011c\7n\2\2\u011c\u011d\7u\2\2\u011d\u011e\7g\2\2\u011eD\3\2"+
		"\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122\7v\2\2\u0122\u0123"+
		"\7w\2\2\u0123\u0124\7t\2\2\u0124\u0125\7p\2\2\u0125F\3\2\2\2\u0126\u0127"+
		"\7v\2\2\u0127\u0128\7j\2\2\u0128\u0129\7k\2\2\u0129\u012a\7u\2\2\u012a"+
		"H\3\2\2\2\u012b\u012c\7p\2\2\u012c\u012d\7g\2\2\u012d\u012e\7y\2\2\u012e"+
		"J\3\2\2\2\u012f\u0130\7d\2\2\u0130\u0131\7t\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7c\2\2\u0133\u0134\7m\2\2\u0134L\3\2\2\2\u0135\u0136\7e\2\2\u0136"+
		"\u0137\7q\2\2\u0137\u0138\7p\2\2\u0138\u0139\7v\2\2\u0139\u013a\7k\2\2"+
		"\u013a\u013b\7p\2\2\u013b\u013c\7w\2\2\u013c\u013d\7g\2\2\u013dN\3\2\2"+
		"\2\u013e\u0140\5Y-\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142P\3\2\2\2\u0143\u0144\7)\2\2\u0144\u0145"+
		"\t\7\2\2\u0145\u0171\7)\2\2\u0146\u0147\7)\2\2\u0147\u0148\7^\2\2\u0148"+
		"\u0149\7v\2\2\u0149\u0171\7)\2\2\u014a\u014b\7)\2\2\u014b\u014c\7^\2\2"+
		"\u014c\u014d\7)\2\2\u014d\u0171\7)\2\2\u014e\u014f\7)\2\2\u014f\u0150"+
		"\7^\2\2\u0150\u0151\7$\2\2\u0151\u0171\7)\2\2\u0152\u0153\7)\2\2\u0153"+
		"\u0154\7^\2\2\u0154\u0155\7t\2\2\u0155\u0171\7)\2\2\u0156\u0157\7)\2\2"+
		"\u0157\u0158\7^\2\2\u0158\u0159\7^\2\2\u0159\u0171\7)\2\2\u015a\u015b"+
		"\7)\2\2\u015b\u015c\7^\2\2\u015c\u015d\7p\2\2\u015d\u0171\7)\2\2\u015e"+
		"\u015f\7)\2\2\u015f\u0160\7^\2\2\u0160\u0161\7h\2\2\u0161\u0171\7)\2\2"+
		"\u0162\u0163\7)\2\2\u0163\u0164\7^\2\2\u0164\u0165\7d\2\2\u0165\u0171"+
		"\7)\2\2\u0166\u0167\7)\2\2\u0167\u0168\7^\2\2\u0168\u0169\7w\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\5[.\2\u016b\u016c\5[.\2\u016c\u016d\5[.\2\u016d"+
		"\u016e\5[.\2\u016e\u016f\7)\2\2\u016f\u0171\3\2\2\2\u0170\u0143\3\2\2"+
		"\2\u0170\u0146\3\2\2\2\u0170\u014a\3\2\2\2\u0170\u014e\3\2\2\2\u0170\u0152"+
		"\3\2\2\2\u0170\u0156\3\2\2\2\u0170\u015a\3\2\2\2\u0170\u015e\3\2\2\2\u0170"+
		"\u0162\3\2\2\2\u0170\u0166\3\2\2\2\u0171R\3\2\2\2\u0172\u0173\5U+\2\u0173"+
		"T\3\2\2\2\u0174\u0178\5]/\2\u0175\u0177\5W,\2\u0176\u0175\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179V\3\2\2\2"+
		"\u017a\u0178\3\2\2\2\u017b\u017e\5]/\2\u017c\u017e\5Y-\2\u017d\u017b\3"+
		"\2\2\2\u017d\u017c\3\2\2\2\u017eX\3\2\2\2\u017f\u0180\t\b\2\2\u0180Z\3"+
		"\2\2\2\u0181\u0182\t\t\2\2\u0182\\\3\2\2\2\u0183\u0184\t\n\2\2\u0184^"+
		"\3\2\2\2\u0185\u0186\t\13\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b\60\2\2"+
		"\u0188`\3\2\2\2\20\2et{\u0081\u0089\u00a7\u00c8\u00dc\u00e7\u0141\u0170"+
		"\u0178\u017d\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}