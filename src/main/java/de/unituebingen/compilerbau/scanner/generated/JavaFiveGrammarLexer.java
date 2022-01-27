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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, AccessModifier=45, 
		Primitive=46, Bool=47, Class=48, Static=49, For=50, While=51, Do=52, If=53, 
		Switch=54, Case=55, Default=56, Else=57, Return=58, This=59, New=60, Break=61, 
		Continue=62, Int=63, Char=64, Identifier=65, IdentifierChars=66, JavaLetterOrDigit=67, 
		Digit=68, Hex=69, JavaLetter=70, WS=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "AccessModifier", "Primitive", "Bool", "Class", 
			"Static", "For", "While", "Do", "If", "Switch", "Case", "Default", "Else", 
			"Return", "This", "New", "Break", "Continue", "Int", "Char", "Identifier", 
			"IdentifierChars", "JavaLetterOrDigit", "Digit", "Hex", "JavaLetter", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "','", "';'", "':'", "'='", "'++'", 
			"'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'<<'", "'>>'", 
			"'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'^'", 
			"'|'", "'&&'", "'||'", "'?'", "'.'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'&='", "'^='", "'|='", "'<<='", "'>>='", "'>>>='", null, null, 
			null, "'class'", "'static'", "'for'", "'while'", "'do'", "'if'", "'switch'", 
			"'case'", "'default'", "'else'", "'return'", "'this'", "'new'", "'break'", 
			"'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "AccessModifier", 
			"Primitive", "Bool", "Class", "Static", "For", "While", "Do", "If", "Switch", 
			"Case", "Default", "Else", "Return", "This", "New", "Break", "Continue", 
			"Int", "Char", "Identifier", "IdentifierChars", "JavaLetterOrDigit", 
			"Digit", "Hex", "JavaLetter", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u01d2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\5.\u0112\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u0126\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0131\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\6"+
		"@\u0189\n@\r@\16@\u018a\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\5A\u01ba\nA\3B\3B\3C\3C\7C\u01c0\nC\fC\16C\u01c3\13"+
		"C\3D\3D\5D\u01c7\nD\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\2\2I\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\3\2\7\6\2\""+
		"\"\62;C\\c|\3\2\62;\5\2\62;CHch\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u01e2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3\2\2\2\7\u0095\3\2\2\2\t\u0097"+
		"\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2\2\2\17\u009d\3\2\2\2\21\u009f\3"+
		"\2\2\2\23\u00a1\3\2\2\2\25\u00a4\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9\3\2"+
		"\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37\u00af\3\2\2\2!\u00b1\3\2\2\2"+
		"#\u00b3\3\2\2\2%\u00b5\3\2\2\2\'\u00b8\3\2\2\2)\u00bb\3\2\2\2+\u00bf\3"+
		"\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00c6\3\2\2\2\63\u00c9\3\2\2\2"+
		"\65\u00cc\3\2\2\2\67\u00cf\3\2\2\29\u00d1\3\2\2\2;\u00d3\3\2\2\2=\u00d5"+
		"\3\2\2\2?\u00d8\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00df\3\2\2\2G"+
		"\u00e2\3\2\2\2I\u00e5\3\2\2\2K\u00e8\3\2\2\2M\u00eb\3\2\2\2O\u00ee\3\2"+
		"\2\2Q\u00f1\3\2\2\2S\u00f4\3\2\2\2U\u00f7\3\2\2\2W\u00fb\3\2\2\2Y\u00ff"+
		"\3\2\2\2[\u0111\3\2\2\2]\u0125\3\2\2\2_\u0130\3\2\2\2a\u0132\3\2\2\2c"+
		"\u0138\3\2\2\2e\u013f\3\2\2\2g\u0143\3\2\2\2i\u0149\3\2\2\2k\u014c\3\2"+
		"\2\2m\u014f\3\2\2\2o\u0156\3\2\2\2q\u015b\3\2\2\2s\u0163\3\2\2\2u\u0168"+
		"\3\2\2\2w\u016f\3\2\2\2y\u0174\3\2\2\2{\u0178\3\2\2\2}\u017e\3\2\2\2\177"+
		"\u0188\3\2\2\2\u0081\u01b9\3\2\2\2\u0083\u01bb\3\2\2\2\u0085\u01bd\3\2"+
		"\2\2\u0087\u01c6\3\2\2\2\u0089\u01c8\3\2\2\2\u008b\u01ca\3\2\2\2\u008d"+
		"\u01cc\3\2\2\2\u008f\u01ce\3\2\2\2\u0091\u0092\7}\2\2\u0092\4\3\2\2\2"+
		"\u0093\u0094\7\177\2\2\u0094\6\3\2\2\2\u0095\u0096\7*\2\2\u0096\b\3\2"+
		"\2\2\u0097\u0098\7+\2\2\u0098\n\3\2\2\2\u0099\u009a\7.\2\2\u009a\f\3\2"+
		"\2\2\u009b\u009c\7=\2\2\u009c\16\3\2\2\2\u009d\u009e\7<\2\2\u009e\20\3"+
		"\2\2\2\u009f\u00a0\7?\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a3"+
		"\7-\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7/\2\2\u00a6\26"+
		"\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa"+
		"\32\3\2\2\2\u00ab\u00ac\7\u0080\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7#\2"+
		"\2\u00ae\36\3\2\2\2\u00af\u00b0\7,\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7\61"+
		"\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7\'\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7"+
		">\2\2\u00b6\u00b7\7>\2\2\u00b7&\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9\u00ba"+
		"\7@\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7@\2\2\u00bd\u00be"+
		"\7@\2\2\u00be*\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7"+
		"@\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5\7?\2\2\u00c5\60\3"+
		"\2\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c8\7?\2\2\u00c8\62\3\2\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca\u00cb\7?\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\66\3\2\2\2\u00cf\u00d0\7(\2\2\u00d08\3\2\2\2\u00d1\u00d2"+
		"\7`\2\2\u00d2:\3\2\2\2\u00d3\u00d4\7~\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7"+
		"(\2\2\u00d6\u00d7\7(\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7~\2\2\u00d9\u00da"+
		"\7~\2\2\u00da@\3\2\2\2\u00db\u00dc\7A\2\2\u00dcB\3\2\2\2\u00dd\u00de\7"+
		"\60\2\2\u00deD\3\2\2\2\u00df\u00e0\7-\2\2\u00e0\u00e1\7?\2\2\u00e1F\3"+
		"\2\2\2\u00e2\u00e3\7/\2\2\u00e3\u00e4\7?\2\2\u00e4H\3\2\2\2\u00e5\u00e6"+
		"\7,\2\2\u00e6\u00e7\7?\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea"+
		"\7?\2\2\u00eaL\3\2\2\2\u00eb\u00ec\7\'\2\2\u00ec\u00ed\7?\2\2\u00edN\3"+
		"\2\2\2\u00ee\u00ef\7(\2\2\u00ef\u00f0\7?\2\2\u00f0P\3\2\2\2\u00f1\u00f2"+
		"\7`\2\2\u00f2\u00f3\7?\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7~\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6T\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa"+
		"\7?\2\2\u00faV\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7@\2\2\u00fd\u00fe"+
		"\7?\2\2\u00feX\3\2\2\2\u00ff\u0100\7@\2\2\u0100\u0101\7@\2\2\u0101\u0102"+
		"\7@\2\2\u0102\u0103\7?\2\2\u0103Z\3\2\2\2\u0104\u0105\7r\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\7d\2\2\u0107\u0108\7n\2\2\u0108\u0109\7k\2\2\u0109"+
		"\u0112\7e\2\2\u010a\u010b\7r\2\2\u010b\u010c\7t\2\2\u010c\u010d\7k\2\2"+
		"\u010d\u010e\7x\2\2\u010e\u010f\7c\2\2\u010f\u0110\7v\2\2\u0110\u0112"+
		"\7g\2\2\u0111\u0104\3\2\2\2\u0111\u010a\3\2\2\2\u0112\\\3\2\2\2\u0113"+
		"\u0114\7e\2\2\u0114\u0115\7j\2\2\u0115\u0116\7c\2\2\u0116\u0126\7t\2\2"+
		"\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119\u0126\7v\2\2\u011a\u011b"+
		"\7d\2\2\u011b\u011c\7q\2\2\u011c\u011d\7q\2\2\u011d\u011e\7n\2\2\u011e"+
		"\u011f\7g\2\2\u011f\u0120\7c\2\2\u0120\u0126\7p\2\2\u0121\u0122\7x\2\2"+
		"\u0122\u0123\7q\2\2\u0123\u0124\7k\2\2\u0124\u0126\7f\2\2\u0125\u0113"+
		"\3\2\2\2\u0125\u0117\3\2\2\2\u0125\u011a\3\2\2\2\u0125\u0121\3\2\2\2\u0126"+
		"^\3\2\2\2\u0127\u0128\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a\7w\2\2\u012a"+
		"\u0131\7g\2\2\u012b\u012c\7h\2\2\u012c\u012d\7c\2\2\u012d\u012e\7n\2\2"+
		"\u012e\u012f\7u\2\2\u012f\u0131\7g\2\2\u0130\u0127\3\2\2\2\u0130\u012b"+
		"\3\2\2\2\u0131`\3\2\2\2\u0132\u0133\7e\2\2\u0133\u0134\7n\2\2\u0134\u0135"+
		"\7c\2\2\u0135\u0136\7u\2\2\u0136\u0137\7u\2\2\u0137b\3\2\2\2\u0138\u0139"+
		"\7u\2\2\u0139\u013a\7v\2\2\u013a\u013b\7c\2\2\u013b\u013c\7v\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7e\2\2\u013ed\3\2\2\2\u013f\u0140\7h\2\2\u0140"+
		"\u0141\7q\2\2\u0141\u0142\7t\2\2\u0142f\3\2\2\2\u0143\u0144\7y\2\2\u0144"+
		"\u0145\7j\2\2\u0145\u0146\7k\2\2\u0146\u0147\7n\2\2\u0147\u0148\7g\2\2"+
		"\u0148h\3\2\2\2\u0149\u014a\7f\2\2\u014a\u014b\7q\2\2\u014bj\3\2\2\2\u014c"+
		"\u014d\7k\2\2\u014d\u014e\7h\2\2\u014el\3\2\2\2\u014f\u0150\7u\2\2\u0150"+
		"\u0151\7y\2\2\u0151\u0152\7k\2\2\u0152\u0153\7v\2\2\u0153\u0154\7e\2\2"+
		"\u0154\u0155\7j\2\2\u0155n\3\2\2\2\u0156\u0157\7e\2\2\u0157\u0158\7c\2"+
		"\2\u0158\u0159\7u\2\2\u0159\u015a\7g\2\2\u015ap\3\2\2\2\u015b\u015c\7"+
		"f\2\2\u015c\u015d\7g\2\2\u015d\u015e\7h\2\2\u015e\u015f\7c\2\2\u015f\u0160"+
		"\7w\2\2\u0160\u0161\7n\2\2\u0161\u0162\7v\2\2\u0162r\3\2\2\2\u0163\u0164"+
		"\7g\2\2\u0164\u0165\7n\2\2\u0165\u0166\7u\2\2\u0166\u0167\7g\2\2\u0167"+
		"t\3\2\2\2\u0168\u0169\7t\2\2\u0169\u016a\7g\2\2\u016a\u016b\7v\2\2\u016b"+
		"\u016c\7w\2\2\u016c\u016d\7t\2\2\u016d\u016e\7p\2\2\u016ev\3\2\2\2\u016f"+
		"\u0170\7v\2\2\u0170\u0171\7j\2\2\u0171\u0172\7k\2\2\u0172\u0173\7u\2\2"+
		"\u0173x\3\2\2\2\u0174\u0175\7p\2\2\u0175\u0176\7g\2\2\u0176\u0177\7y\2"+
		"\2\u0177z\3\2\2\2\u0178\u0179\7d\2\2\u0179\u017a\7t\2\2\u017a\u017b\7"+
		"g\2\2\u017b\u017c\7c\2\2\u017c\u017d\7m\2\2\u017d|\3\2\2\2\u017e\u017f"+
		"\7e\2\2\u017f\u0180\7q\2\2\u0180\u0181\7p\2\2\u0181\u0182\7v\2\2\u0182"+
		"\u0183\7k\2\2\u0183\u0184\7p\2\2\u0184\u0185\7w\2\2\u0185\u0186\7g\2\2"+
		"\u0186~\3\2\2\2\u0187\u0189\5\u0089E\2\u0188\u0187\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0080\3\2\2\2\u018c"+
		"\u018d\7)\2\2\u018d\u018e\t\2\2\2\u018e\u01ba\7)\2\2\u018f\u0190\7)\2"+
		"\2\u0190\u0191\7^\2\2\u0191\u0192\7v\2\2\u0192\u01ba\7)\2\2\u0193\u0194"+
		"\7)\2\2\u0194\u0195\7^\2\2\u0195\u0196\7)\2\2\u0196\u01ba\7)\2\2\u0197"+
		"\u0198\7)\2\2\u0198\u0199\7^\2\2\u0199\u019a\7$\2\2\u019a\u01ba\7)\2\2"+
		"\u019b\u019c\7)\2\2\u019c\u019d\7^\2\2\u019d\u019e\7t\2\2\u019e\u01ba"+
		"\7)\2\2\u019f\u01a0\7)\2\2\u01a0\u01a1\7^\2\2\u01a1\u01a2\7^\2\2\u01a2"+
		"\u01ba\7)\2\2\u01a3\u01a4\7)\2\2\u01a4\u01a5\7^\2\2\u01a5\u01a6\7p\2\2"+
		"\u01a6\u01ba\7)\2\2\u01a7\u01a8\7)\2\2\u01a8\u01a9\7^\2\2\u01a9\u01aa"+
		"\7h\2\2\u01aa\u01ba\7)\2\2\u01ab\u01ac\7)\2\2\u01ac\u01ad\7^\2\2\u01ad"+
		"\u01ae\7d\2\2\u01ae\u01ba\7)\2\2\u01af\u01b0\7)\2\2\u01b0\u01b1\7^\2\2"+
		"\u01b1\u01b2\7w\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\5\u008bF\2\u01b4\u01b5"+
		"\5\u008bF\2\u01b5\u01b6\5\u008bF\2\u01b6\u01b7\5\u008bF\2\u01b7\u01b8"+
		"\7)\2\2\u01b8\u01ba\3\2\2\2\u01b9\u018c\3\2\2\2\u01b9\u018f\3\2\2\2\u01b9"+
		"\u0193\3\2\2\2\u01b9\u0197\3\2\2\2\u01b9\u019b\3\2\2\2\u01b9\u019f\3\2"+
		"\2\2\u01b9\u01a3\3\2\2\2\u01b9\u01a7\3\2\2\2\u01b9\u01ab\3\2\2\2\u01b9"+
		"\u01af\3\2\2\2\u01ba\u0082\3\2\2\2\u01bb\u01bc\5\u0085C\2\u01bc\u0084"+
		"\3\2\2\2\u01bd\u01c1\5\u008dG\2\u01be\u01c0\5\u0087D\2\u01bf\u01be\3\2"+
		"\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u0086\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\5\u008dG\2\u01c5\u01c7"+
		"\5\u0089E\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u0088\3\2\2"+
		"\2\u01c8\u01c9\t\3\2\2\u01c9\u008a\3\2\2\2\u01ca\u01cb\t\4\2\2\u01cb\u008c"+
		"\3\2\2\2\u01cc\u01cd\t\5\2\2\u01cd\u008e\3\2\2\2\u01ce\u01cf\t\6\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\bH\2\2\u01d1\u0090\3\2\2\2\n\2\u0111\u0125"+
		"\u0130\u018a\u01b9\u01c1\u01c6\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}