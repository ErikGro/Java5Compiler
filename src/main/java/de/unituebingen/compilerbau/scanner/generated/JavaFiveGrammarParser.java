// Generated from C:/Users/matth/IdeaProjects/compilerbau_ws2021/src/main/java/de/unituebingen/compilerbau/scanner\JavaFiveGrammar.g4 by ANTLR 4.9.2
package de.unituebingen.compilerbau.scanner.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaFiveGrammarParser extends Parser {
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
	public static final int
		RULE_javaProgram = 0, RULE_clazz = 1, RULE_method = 2, RULE_field = 3, 
		RULE_statement = 4, RULE_forControl = 5, RULE_forInit = 6, RULE_localVarDeclarationStatement = 7, 
		RULE_blockStatement = 8, RULE_type = 9, RULE_expression = 10, RULE_methodCall = 11, 
		RULE_newExp = 12, RULE_expressionList = 13, RULE_parExpression = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"javaProgram", "clazz", "method", "field", "statement", "forControl", 
			"forInit", "localVarDeclarationStatement", "blockStatement", "type", 
			"expression", "methodCall", "newExp", "expressionList", "parExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "','", "')'", "';'", "':'", "'='", "'.'", 
			"'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'<<'", 
			"'>>'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", "'/='", 
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

	@Override
	public String getGrammarFileName() { return "JavaFiveGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaFiveGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JavaProgramContext extends ParserRuleContext {
		public ClazzContext clazz() {
			return getRuleContext(ClazzContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JavaProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterJavaProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitJavaProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitJavaProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaProgramContext javaProgram() throws RecognitionException {
		JavaProgramContext _localctx = new JavaProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_javaProgram);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				clazz();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				method();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				field();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClazzContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
		public TerminalNode Class() { return getToken(JavaFiveGrammarParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClazzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterClazz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitClazz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitClazz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClazzContext clazz() throws RecognitionException {
		ClazzContext _localctx = new ClazzContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clazz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(AccessModifier);
			setState(38);
			match(Class);
			setState(39);
			match(Identifier);
			setState(40);
			match(T__0);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifier) {
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(41);
					field();
					}
					break;
				case 2:
					{
					setState(42);
					method();
					}
					break;
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaFiveGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaFiveGrammarParser.Identifier, i);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Static() { return getToken(JavaFiveGrammarParser.Static, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(AccessModifier);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(51);
				match(Static);
				}
			}

			setState(54);
			type();
			setState(55);
			match(Identifier);
			setState(56);
			match(T__2);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Primitive || _la==Identifier) {
				{
				setState(57);
				type();
				setState(58);
				match(Identifier);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(59);
					match(T__3);
					setState(60);
					type();
					setState(61);
					match(Identifier);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(T__4);
			setState(71);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
		public LocalVarDeclarationStatementContext localVarDeclarationStatement() {
			return getRuleContext(LocalVarDeclarationStatementContext.class,0);
		}
		public TerminalNode Static() { return getToken(JavaFiveGrammarParser.Static, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(AccessModifier);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(74);
				match(Static);
				}
			}

			setState(77);
			localVarDeclarationStatement();
			setState(78);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode If() { return getToken(JavaFiveGrammarParser.If, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(JavaFiveGrammarParser.Else, 0); }
		public TerminalNode Switch() { return getToken(JavaFiveGrammarParser.Switch, 0); }
		public TerminalNode Case() { return getToken(JavaFiveGrammarParser.Case, 0); }
		public TerminalNode Default() { return getToken(JavaFiveGrammarParser.Default, 0); }
		public TerminalNode While() { return getToken(JavaFiveGrammarParser.While, 0); }
		public TerminalNode Do() { return getToken(JavaFiveGrammarParser.Do, 0); }
		public TerminalNode For() { return getToken(JavaFiveGrammarParser.For, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public LocalVarDeclarationStatementContext localVarDeclarationStatement() {
			return getRuleContext(LocalVarDeclarationStatementContext.class,0);
		}
		public TerminalNode Return() { return getToken(JavaFiveGrammarParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Continue() { return getToken(JavaFiveGrammarParser.Continue, 0); }
		public TerminalNode Break() { return getToken(JavaFiveGrammarParser.Break, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(If);
				setState(83);
				parExpression();
				setState(84);
				statement();
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(85);
					match(Else);
					setState(86);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(Switch);
				setState(90);
				parExpression();
				setState(91);
				match(T__0);
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==Case || _la==Default) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				match(T__6);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Primitive) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << If) | (1L << Switch) | (1L << Return) | (1L << This) | (1L << New) | (1L << Break) | (1L << Continue) | (1L << Int))) != 0) || _la==Char || _la==Identifier) {
					{
					{
					setState(94);
					statement();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(While);
				setState(103);
				parExpression();
				setState(104);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(Do);
				setState(107);
				statement();
				setState(108);
				match(While);
				setState(109);
				parExpression();
				setState(110);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				match(For);
				setState(113);
				match(T__2);
				setState(114);
				forControl();
				setState(115);
				match(T__4);
				setState(116);
				statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				localVarDeclarationStatement();
				setState(119);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
				match(Return);
				setState(122);
				statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				expression(0);
				setState(124);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				match(Continue);
				setState(127);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(128);
				match(Break);
				setState(129);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (Primitive - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
				{
				setState(132);
				forInit();
				}
			}

			setState(135);
			match(T__5);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
				{
				setState(136);
				expression(0);
				}
			}

			setState(139);
			match(T__5);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
				{
				setState(140);
				expressionList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVarDeclarationStatementContext localVarDeclarationStatement() {
			return getRuleContext(LocalVarDeclarationStatementContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forInit);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				localVarDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVarDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalVarDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterLocalVarDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitLocalVarDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitLocalVarDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclarationStatementContext localVarDeclarationStatement() throws RecognitionException {
		LocalVarDeclarationStatementContext _localctx = new LocalVarDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localVarDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			type();
			setState(148);
			match(Identifier);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(149);
				match(T__7);
				setState(150);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__0);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << Primitive) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << If) | (1L << Switch) | (1L << Return) | (1L << This) | (1L << New) | (1L << Break) | (1L << Continue) | (1L << Int))) != 0) || _la==Char || _la==Identifier) {
				{
				{
				setState(154);
				statement();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Primitive() { return getToken(JavaFiveGrammarParser.Primitive, 0); }
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==Primitive || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(JavaFiveGrammarParser.Int, 0); }
		public TerminalNode Char() { return getToken(JavaFiveGrammarParser.Char, 0); }
		public TerminalNode Bool() { return getToken(JavaFiveGrammarParser.Bool, 0); }
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TerminalNode This() { return getToken(JavaFiveGrammarParser.This, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public NewExpContext newExp() {
			return getRuleContext(NewExpContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (Bool - 47)) | (1L << (This - 47)) | (1L << (Int - 47)) | (1L << (Char - 47)) | (1L << (Identifier - 47)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(166);
				parExpression();
				}
				break;
			case 3:
				{
				setState(167);
				methodCall();
				}
				break;
			case 4:
				{
				setState(168);
				newExp();
				}
				break;
			case 5:
				{
				setState(169);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				expression(10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(174);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(177);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(180);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(183);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(186);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(189);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(192);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(195);
						match(T__32);
						setState(196);
						expression(0);
						setState(197);
						match(T__6);
						setState(198);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(201);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						expression(2);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(204);
						match(T__8);
						setState(207);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(205);
							methodCall();
							}
							break;
						case 2:
							{
							setState(206);
							match(Identifier);
							}
							break;
						}
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(210);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode This() { return getToken(JavaFiveGrammarParser.This, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodCall);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(Identifier);
				setState(217);
				match(T__2);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
					{
					setState(218);
					expressionList();
					}
				}

				setState(221);
				match(T__4);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(This);
				setState(223);
				match(T__2);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
					{
					setState(224);
					expressionList();
					}
				}

				setState(227);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(JavaFiveGrammarParser.New, 0); }
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NewExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpContext newExp() throws RecognitionException {
		NewExpContext _localctx = new NewExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_newExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(New);
			setState(231);
			match(Identifier);
			setState(232);
			match(T__2);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
				{
				setState(233);
				expressionList();
				}
			}

			setState(236);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			expression(0);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(239);
				match(T__3);
				setState(240);
				expression(0);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__2);
			setState(247);
			expression(0);
			setState(248);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\5\2&\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3"+
		"\4\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16"+
		"\4E\13\4\5\4G\n\4\3\4\3\4\3\4\3\5\3\5\5\5N\n\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6b\n\6\f\6\16\6e\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0085\n\6\3\7"+
		"\5\7\u0088\n\7\3\7\3\7\5\7\u008c\n\7\3\7\3\7\5\7\u0090\n\7\3\b\3\b\5\b"+
		"\u0094\n\b\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3\n\7\n\u009e\n\n\f\n\16"+
		"\n\u00a1\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ae"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00d2\n\f\3\f\3\f\7\f\u00d6\n\f\f\f\16\f\u00d9\13\f\3\r\3\r\3\r\5"+
		"\r\u00de\n\r\3\r\3\r\3\r\3\r\5\r\u00e4\n\r\3\r\5\r\u00e7\n\r\3\16\3\16"+
		"\3\16\3\16\5\16\u00ed\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u00f4\n\17\f"+
		"\17\16\17\u00f7\13\17\3\20\3\20\3\20\3\20\3\20\2\3\26\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\17\3\29:\4\2\60\60CC\5\2\61\61==AC\3\2\f\21"+
		"\3\2\22\24\3\2\16\17\3\2\25\27\3\2\30\33\3\2\34\35\3\2\36 \3\2!\"\4\2"+
		"\n\n$.\3\2\f\r\2\u011f\2%\3\2\2\2\4\'\3\2\2\2\6\64\3\2\2\2\bK\3\2\2\2"+
		"\n\u0084\3\2\2\2\f\u0087\3\2\2\2\16\u0093\3\2\2\2\20\u0095\3\2\2\2\22"+
		"\u009b\3\2\2\2\24\u00a4\3\2\2\2\26\u00ad\3\2\2\2\30\u00e6\3\2\2\2\32\u00e8"+
		"\3\2\2\2\34\u00f0\3\2\2\2\36\u00f8\3\2\2\2 &\5\4\3\2!&\5\6\4\2\"&\5\b"+
		"\5\2#&\5\n\6\2$&\5\26\f\2% \3\2\2\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3"+
		"\2\2\2&\3\3\2\2\2\'(\7/\2\2()\7\62\2\2)*\7C\2\2*/\7\3\2\2+.\5\b\5\2,."+
		"\5\6\4\2-+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3"+
		"\2\2\2\61/\3\2\2\2\62\63\7\4\2\2\63\5\3\2\2\2\64\66\7/\2\2\65\67\7\63"+
		"\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\5\24\13\29:\7C\2\2:F\7"+
		"\5\2\2;<\5\24\13\2<C\7C\2\2=>\7\6\2\2>?\5\24\13\2?@\7C\2\2@B\3\2\2\2A"+
		"=\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F;\3\2\2\2"+
		"FG\3\2\2\2GH\3\2\2\2HI\7\7\2\2IJ\5\22\n\2J\7\3\2\2\2KM\7/\2\2LN\7\63\2"+
		"\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\5\20\t\2PQ\7\b\2\2Q\t\3\2\2\2R\u0085"+
		"\7\b\2\2S\u0085\5\22\n\2TU\7\67\2\2UV\5\36\20\2VY\5\n\6\2WX\7;\2\2XZ\5"+
		"\n\6\2YW\3\2\2\2YZ\3\2\2\2Z\u0085\3\2\2\2[\\\78\2\2\\]\5\36\20\2]^\7\3"+
		"\2\2^_\t\2\2\2_c\7\t\2\2`b\5\n\6\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2df\3\2\2\2ec\3\2\2\2fg\7\4\2\2g\u0085\3\2\2\2hi\7\65\2\2ij\5\36\20"+
		"\2jk\5\n\6\2k\u0085\3\2\2\2lm\7\66\2\2mn\5\n\6\2no\7\65\2\2op\5\36\20"+
		"\2pq\7\b\2\2q\u0085\3\2\2\2rs\7\64\2\2st\7\5\2\2tu\5\f\7\2uv\7\7\2\2v"+
		"w\5\n\6\2w\u0085\3\2\2\2xy\5\20\t\2yz\7\b\2\2z\u0085\3\2\2\2{|\7<\2\2"+
		"|\u0085\5\n\6\2}~\5\26\f\2~\177\7\b\2\2\177\u0085\3\2\2\2\u0080\u0081"+
		"\7@\2\2\u0081\u0085\7\b\2\2\u0082\u0083\7?\2\2\u0083\u0085\7\b\2\2\u0084"+
		"R\3\2\2\2\u0084S\3\2\2\2\u0084T\3\2\2\2\u0084[\3\2\2\2\u0084h\3\2\2\2"+
		"\u0084l\3\2\2\2\u0084r\3\2\2\2\u0084x\3\2\2\2\u0084{\3\2\2\2\u0084}\3"+
		"\2\2\2\u0084\u0080\3\2\2\2\u0084\u0082\3\2\2\2\u0085\13\3\2\2\2\u0086"+
		"\u0088\5\16\b\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008b\7\b\2\2\u008a\u008c\5\26\f\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\b\2\2\u008e\u0090\5\34"+
		"\17\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\r\3\2\2\2\u0091\u0094"+
		"\5\20\t\2\u0092\u0094\5\34\17\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2"+
		"\2\u0094\17\3\2\2\2\u0095\u0096\5\24\13\2\u0096\u0099\7C\2\2\u0097\u0098"+
		"\7\n\2\2\u0098\u009a\5\26\f\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\21\3\2\2\2\u009b\u009f\7\3\2\2\u009c\u009e\5\n\6\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\4\2\2\u00a3\23\3\2\2"+
		"\2\u00a4\u00a5\t\3\2\2\u00a5\25\3\2\2\2\u00a6\u00a7\b\f\1\2\u00a7\u00ae"+
		"\t\4\2\2\u00a8\u00ae\5\36\20\2\u00a9\u00ae\5\30\r\2\u00aa\u00ae\5\32\16"+
		"\2\u00ab\u00ac\t\5\2\2\u00ac\u00ae\5\26\f\f\u00ad\u00a6\3\2\2\2\u00ad"+
		"\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00d7\3\2\2\2\u00af\u00b0\f\13\2\2\u00b0\u00b1\t\6\2\2\u00b1"+
		"\u00d6\5\26\f\f\u00b2\u00b3\f\n\2\2\u00b3\u00b4\t\7\2\2\u00b4\u00d6\5"+
		"\26\f\13\u00b5\u00b6\f\t\2\2\u00b6\u00b7\t\b\2\2\u00b7\u00d6\5\26\f\n"+
		"\u00b8\u00b9\f\b\2\2\u00b9\u00ba\t\t\2\2\u00ba\u00d6\5\26\f\t\u00bb\u00bc"+
		"\f\7\2\2\u00bc\u00bd\t\n\2\2\u00bd\u00d6\5\26\f\b\u00be\u00bf\f\6\2\2"+
		"\u00bf\u00c0\t\13\2\2\u00c0\u00d6\5\26\f\7\u00c1\u00c2\f\5\2\2\u00c2\u00c3"+
		"\t\f\2\2\u00c3\u00d6\5\26\f\6\u00c4\u00c5\f\4\2\2\u00c5\u00c6\7#\2\2\u00c6"+
		"\u00c7\5\26\f\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\5\26\f\5\u00c9\u00d6\3"+
		"\2\2\2\u00ca\u00cb\f\3\2\2\u00cb\u00cc\t\r\2\2\u00cc\u00d6\5\26\f\4\u00cd"+
		"\u00ce\f\20\2\2\u00ce\u00d1\7\13\2\2\u00cf\u00d2\5\30\r\2\u00d0\u00d2"+
		"\7C\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3"+
		"\u00d4\f\r\2\2\u00d4\u00d6\t\16\2\2\u00d5\u00af\3\2\2\2\u00d5\u00b2\3"+
		"\2\2\2\u00d5\u00b5\3\2\2\2\u00d5\u00b8\3\2\2\2\u00d5\u00bb\3\2\2\2\u00d5"+
		"\u00be\3\2\2\2\u00d5\u00c1\3\2\2\2\u00d5\u00c4\3\2\2\2\u00d5\u00ca\3\2"+
		"\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\27\3\2\2\2\u00d9\u00d7\3\2\2"+
		"\2\u00da\u00db\7C\2\2\u00db\u00dd\7\5\2\2\u00dc\u00de\5\34\17\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e7\7\7"+
		"\2\2\u00e0\u00e1\7=\2\2\u00e1\u00e3\7\5\2\2\u00e2\u00e4\5\34\17\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7\7"+
		"\2\2\u00e6\u00da\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7\31\3\2\2\2\u00e8\u00e9"+
		"\7>\2\2\u00e9\u00ea\7C\2\2\u00ea\u00ec\7\5\2\2\u00eb\u00ed\5\34\17\2\u00ec"+
		"\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\7"+
		"\2\2\u00ef\33\3\2\2\2\u00f0\u00f5\5\26\f\2\u00f1\u00f2\7\6\2\2\u00f2\u00f4"+
		"\5\26\f\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\35\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9"+
		"\7\5\2\2\u00f9\u00fa\5\26\f\2\u00fa\u00fb\7\7\2\2\u00fb\37\3\2\2\2\33"+
		"%-/\66CFMYc\u0084\u0087\u008b\u008f\u0093\u0099\u009f\u00ad\u00d1\u00d5"+
		"\u00d7\u00dd\u00e3\u00e6\u00ec\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}