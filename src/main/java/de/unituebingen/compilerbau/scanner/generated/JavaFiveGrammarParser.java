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
		RULE_javaProgram = 0, RULE_clazz = 1, RULE_fieldOrMethod = 2, RULE_method = 3, 
		RULE_methodParameterList = 4, RULE_field = 5, RULE_statement = 6, RULE_ifStatement = 7, 
		RULE_switchStatement = 8, RULE_whileStatement = 9, RULE_doWhileStatement = 10, 
		RULE_forStatement = 11, RULE_forInit = 12, RULE_localVarDeclarationStatement = 13, 
		RULE_returnStatement = 14, RULE_statementExpression = 15, RULE_blockStatement = 16, 
		RULE_type = 17, RULE_expression = 18, RULE_methodCall = 19, RULE_newExp = 20, 
		RULE_assignment = 21, RULE_expressionList = 22, RULE_parExpression = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"javaProgram", "clazz", "fieldOrMethod", "method", "methodParameterList", 
			"field", "statement", "ifStatement", "switchStatement", "whileStatement", 
			"doWhileStatement", "forStatement", "forInit", "localVarDeclarationStatement", 
			"returnStatement", "statementExpression", "blockStatement", "type", "expression", 
			"methodCall", "newExp", "assignment", "expressionList", "parExpression"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			clazz();
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
		public List<FieldOrMethodContext> fieldOrMethod() {
			return getRuleContexts(FieldOrMethodContext.class);
		}
		public FieldOrMethodContext fieldOrMethod(int i) {
			return getRuleContext(FieldOrMethodContext.class,i);
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
			setState(50);
			match(AccessModifier);
			setState(51);
			match(Class);
			setState(52);
			match(Identifier);
			setState(53);
			match(T__0);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifier) {
				{
				{
				setState(54);
				fieldOrMethod();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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

	public static class FieldOrMethodContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public FieldOrMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOrMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterFieldOrMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitFieldOrMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitFieldOrMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOrMethodContext fieldOrMethod() throws RecognitionException {
		FieldOrMethodContext _localctx = new FieldOrMethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldOrMethod);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				method();
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public MethodParameterListContext methodParameterList() {
			return getRuleContext(MethodParameterListContext.class,0);
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
		enterRule(_localctx, 6, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(AccessModifier);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(67);
				match(Static);
				}
			}

			setState(70);
			type();
			setState(71);
			match(Identifier);
			setState(72);
			match(T__2);
			setState(73);
			methodParameterList();
			setState(74);
			match(T__3);
			setState(75);
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

	public static class MethodParameterListContext extends ParserRuleContext {
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
		public MethodParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterMethodParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitMethodParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitMethodParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterListContext methodParameterList() throws RecognitionException {
		MethodParameterListContext _localctx = new MethodParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Primitive || _la==Identifier) {
				{
				setState(77);
				type();
				setState(78);
				match(Identifier);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(79);
					match(T__4);
					setState(80);
					type();
					setState(81);
					match(Identifier);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 10, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(AccessModifier);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(91);
				match(Static);
				}
			}

			setState(94);
			localVarDeclarationStatement();
			setState(95);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public LocalVarDeclarationStatementContext localVarDeclarationStatement() {
			return getRuleContext(LocalVarDeclarationStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
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
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				switchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				localVarDeclarationStatement();
				setState(105);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				statementExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(109);
				match(Continue);
				setState(110);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(111);
				match(Break);
				setState(112);
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

	public static class IfStatementContext extends ParserRuleContext {
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(If);
			setState(116);
			parExpression();
			setState(117);
			statement();
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(118);
				match(Else);
				setState(119);
				statement();
				}
				break;
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(JavaFiveGrammarParser.Switch, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode Case() { return getToken(JavaFiveGrammarParser.Case, 0); }
		public TerminalNode Default() { return getToken(JavaFiveGrammarParser.Default, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Switch);
			setState(123);
			parExpression();
			setState(124);
			match(T__0);
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==Case || _la==Default) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(T__6);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Primitive) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << If) | (1L << Switch) | (1L << Return) | (1L << This) | (1L << New) | (1L << Break) | (1L << Continue) | (1L << Int))) != 0) || _la==Char || _la==Identifier) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(JavaFiveGrammarParser.While, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(While);
			setState(136);
			parExpression();
			setState(137);
			statement();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(JavaFiveGrammarParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(JavaFiveGrammarParser.While, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(Do);
			setState(140);
			statement();
			setState(141);
			match(While);
			setState(142);
			parExpression();
			setState(143);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(JavaFiveGrammarParser.For, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(For);
			setState(146);
			match(T__2);
			setState(147);
			forInit();
			setState(148);
			match(T__5);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
				{
				setState(149);
				expression(0);
				}
			}

			setState(152);
			match(T__5);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
				{
				setState(153);
				expressionList();
				}
			}

			setState(156);
			match(T__3);
			setState(157);
			statement();
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
		enterRule(_localctx, 24, RULE_forInit);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				localVarDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
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
		enterRule(_localctx, 26, RULE_localVarDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			type();
			setState(164);
			match(Identifier);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(165);
				match(T__7);
				setState(166);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JavaFiveGrammarParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(Return);
			setState(170);
			expression(0);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expression(0);
			setState(173);
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
		enterRule(_localctx, 32, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << Primitive) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << If) | (1L << Switch) | (1L << Return) | (1L << This) | (1L << New) | (1L << Break) | (1L << Continue) | (1L << Int))) != 0) || _la==Char || _la==Identifier) {
				{
				{
				setState(176);
				statement();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
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
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(187);
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
				setState(188);
				parExpression();
				}
				break;
			case 3:
				{
				setState(189);
				methodCall();
				}
				break;
			case 4:
				{
				setState(190);
				newExp();
				}
				break;
			case 5:
				{
				setState(191);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				expression(10);
				}
				break;
			case 6:
				{
				setState(193);
				assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218);
						match(T__31);
						setState(219);
						expression(0);
						setState(220);
						match(T__6);
						setState(221);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(224);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
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
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<TerminalNode> Identifier() { return getTokens(JavaFiveGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaFiveGrammarParser.Identifier, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 38, RULE_methodCall);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(Identifier);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(231);
					match(T__32);
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(232);
						expression(0);
						}
						break;
					case 2:
						{
						setState(233);
						match(Identifier);
						}
						break;
					}
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__2);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
					{
					setState(242);
					expressionList();
					}
				}

				setState(245);
				match(T__3);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(This);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(247);
					match(T__32);
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(248);
						expression(0);
						}
						break;
					case 2:
						{
						setState(249);
						match(Identifier);
						}
						break;
					}
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__2);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
					{
					setState(258);
					expressionList();
					}
				}

				setState(261);
				match(T__3);
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
		enterRule(_localctx, 40, RULE_newExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(New);
			setState(265);
			match(Identifier);
			setState(266);
			match(T__2);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (Bool - 3)) | (1L << (This - 3)) | (1L << (New - 3)) | (1L << (Int - 3)) | (1L << (Char - 3)) | (1L << (Identifier - 3)))) != 0)) {
				{
				setState(267);
				expressionList();
				}
			}

			setState(270);
			match(T__3);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaFiveGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaFiveGrammarParser.Identifier, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(Identifier);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(274);
					match(Identifier);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
			expression(0);
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
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			expression(0);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(284);
				match(T__4);
				setState(285);
				expression(0);
				}
				}
				setState(290);
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
		enterRule(_localctx, 46, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__2);
			setState(292);
			expression(0);
			setState(293);
			match(T__3);
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
		case 18:
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
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\5"+
		"\4C\n\4\3\5\3\5\5\5G\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\5\6[\n\6\3\7\3\7\5\7_\n\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0083\n\n"+
		"\f\n\16\n\u0086\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\r\3\r\5\r\u009d\n\r\3\r\3\r\3\r"+
		"\3\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\17\3\17\5\17\u00aa\n\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\7\22\u00b4\n\22\f\22\16\22\u00b7\13"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c5"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u00e4\n\24\f\24\16\24\u00e7\13\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00ed\n\25\7\25\u00ef\n\25\f\25\16\25\u00f2\13\25\3\25\3\25\5\25"+
		"\u00f6\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fd\n\25\7\25\u00ff\n\25\f"+
		"\25\16\25\u0102\13\25\3\25\3\25\5\25\u0106\n\25\3\25\5\25\u0109\n\25\3"+
		"\26\3\26\3\26\3\26\5\26\u010f\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u0116"+
		"\n\27\f\27\16\27\u0119\13\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0121"+
		"\n\30\f\30\16\30\u0124\13\30\3\31\3\31\3\31\3\31\3\31\2\3&\32\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\17\3\29:\4\2\60\60CC\5\2"+
		"\61\61==AC\3\2\13\20\3\2\21\23\3\2\r\16\3\2\24\26\3\2\27\32\3\2\33\34"+
		"\3\2\35\37\3\2 !\3\2\13\f\4\2\n\n$.\2\u0141\2\62\3\2\2\2\4\64\3\2\2\2"+
		"\6B\3\2\2\2\bD\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2"+
		"\22|\3\2\2\2\24\u0089\3\2\2\2\26\u008d\3\2\2\2\30\u0093\3\2\2\2\32\u00a3"+
		"\3\2\2\2\34\u00a5\3\2\2\2\36\u00ab\3\2\2\2 \u00ae\3\2\2\2\"\u00b1\3\2"+
		"\2\2$\u00ba\3\2\2\2&\u00c4\3\2\2\2(\u0108\3\2\2\2*\u010a\3\2\2\2,\u0112"+
		"\3\2\2\2.\u011d\3\2\2\2\60\u0125\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64"+
		"\65\7/\2\2\65\66\7\62\2\2\66\67\7C\2\2\67;\7\3\2\28:\5\6\4\298\3\2\2\2"+
		":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\4\2\2?\5\3\2\2"+
		"\2@C\5\f\7\2AC\5\b\5\2B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DF\7/\2\2EG\7\63"+
		"\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\5$\23\2IJ\7C\2\2JK\7\5\2\2KL\5\n"+
		"\6\2LM\7\6\2\2MN\5\"\22\2N\t\3\2\2\2OP\5$\23\2PW\7C\2\2QR\7\7\2\2RS\5"+
		"$\23\2ST\7C\2\2TV\3\2\2\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3"+
		"\2\2\2YW\3\2\2\2ZO\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\^\7/\2\2]_\7\63\2\2"+
		"^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\5\34\17\2ab\7\b\2\2b\r\3\2\2\2ct\7\b"+
		"\2\2dt\5\"\22\2et\5\20\t\2ft\5\22\n\2gt\5\24\13\2ht\5\26\f\2it\5\30\r"+
		"\2jk\5\34\17\2kl\7\b\2\2lt\3\2\2\2mt\5\36\20\2nt\5 \21\2op\7@\2\2pt\7"+
		"\b\2\2qr\7?\2\2rt\7\b\2\2sc\3\2\2\2sd\3\2\2\2se\3\2\2\2sf\3\2\2\2sg\3"+
		"\2\2\2sh\3\2\2\2si\3\2\2\2sj\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sq\3"+
		"\2\2\2t\17\3\2\2\2uv\7\67\2\2vw\5\60\31\2wz\5\16\b\2xy\7;\2\2y{\5\16\b"+
		"\2zx\3\2\2\2z{\3\2\2\2{\21\3\2\2\2|}\78\2\2}~\5\60\31\2~\177\7\3\2\2\177"+
		"\u0080\t\2\2\2\u0080\u0084\7\t\2\2\u0081\u0083\5\16\b\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\4\2\2\u0088\23\3\2\2"+
		"\2\u0089\u008a\7\65\2\2\u008a\u008b\5\60\31\2\u008b\u008c\5\16\b\2\u008c"+
		"\25\3\2\2\2\u008d\u008e\7\66\2\2\u008e\u008f\5\16\b\2\u008f\u0090\7\65"+
		"\2\2\u0090\u0091\5\60\31\2\u0091\u0092\7\b\2\2\u0092\27\3\2\2\2\u0093"+
		"\u0094\7\64\2\2\u0094\u0095\7\5\2\2\u0095\u0096\5\32\16\2\u0096\u0098"+
		"\7\b\2\2\u0097\u0099\5&\24\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\7\b\2\2\u009b\u009d\5.\30\2\u009c\u009b\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\6\2\2\u009f"+
		"\u00a0\5\16\b\2\u00a0\31\3\2\2\2\u00a1\u00a4\5\34\17\2\u00a2\u00a4\5."+
		"\30\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a6"+
		"\5$\23\2\u00a6\u00a9\7C\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00aa\5&\24\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7<\2\2"+
		"\u00ac\u00ad\5&\24\2\u00ad\37\3\2\2\2\u00ae\u00af\5&\24\2\u00af\u00b0"+
		"\7\b\2\2\u00b0!\3\2\2\2\u00b1\u00b5\7\3\2\2\u00b2\u00b4\5\16\b\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\4\2\2\u00b9"+
		"#\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb%\3\2\2\2\u00bc\u00bd\b\24\1\2\u00bd"+
		"\u00c5\t\4\2\2\u00be\u00c5\5\60\31\2\u00bf\u00c5\5(\25\2\u00c0\u00c5\5"+
		"*\26\2\u00c1\u00c2\t\5\2\2\u00c2\u00c5\5&\24\f\u00c3\u00c5\5,\27\2\u00c4"+
		"\u00bc\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2"+
		"\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00e5\3\2\2\2\u00c6"+
		"\u00c7\f\13\2\2\u00c7\u00c8\t\6\2\2\u00c8\u00e4\5&\24\f\u00c9\u00ca\f"+
		"\n\2\2\u00ca\u00cb\t\7\2\2\u00cb\u00e4\5&\24\13\u00cc\u00cd\f\t\2\2\u00cd"+
		"\u00ce\t\b\2\2\u00ce\u00e4\5&\24\n\u00cf\u00d0\f\b\2\2\u00d0\u00d1\t\t"+
		"\2\2\u00d1\u00e4\5&\24\t\u00d2\u00d3\f\7\2\2\u00d3\u00d4\t\n\2\2\u00d4"+
		"\u00e4\5&\24\b\u00d5\u00d6\f\6\2\2\u00d6\u00d7\t\13\2\2\u00d7\u00e4\5"+
		"&\24\7\u00d8\u00d9\f\5\2\2\u00d9\u00da\t\f\2\2\u00da\u00e4\5&\24\6\u00db"+
		"\u00dc\f\4\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\5&\24\2\u00de\u00df\7\t"+
		"\2\2\u00df\u00e0\5&\24\5\u00e0\u00e4\3\2\2\2\u00e1\u00e2\f\r\2\2\u00e2"+
		"\u00e4\t\r\2\2\u00e3\u00c6\3\2\2\2\u00e3\u00c9\3\2\2\2\u00e3\u00cc\3\2"+
		"\2\2\u00e3\u00cf\3\2\2\2\u00e3\u00d2\3\2\2\2\u00e3\u00d5\3\2\2\2\u00e3"+
		"\u00d8\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\'\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00f0\7C\2\2\u00e9\u00ec\7#\2\2\u00ea\u00ed\5&\24\2\u00eb"+
		"\u00ed\7C\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00e9\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7\5"+
		"\2\2\u00f4\u00f6\5.\30\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u0109\7\6\2\2\u00f8\u0100\7=\2\2\u00f9\u00fc\7#\2"+
		"\2\u00fa\u00fd\5&\24\2\u00fb\u00fd\7C\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u0105\7\5\2\2\u0104\u0106\5.\30\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\7\6\2\2\u0108\u00e8\3\2"+
		"\2\2\u0108\u00f8\3\2\2\2\u0109)\3\2\2\2\u010a\u010b\7>\2\2\u010b\u010c"+
		"\7C\2\2\u010c\u010e\7\5\2\2\u010d\u010f\5.\30\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\6\2\2\u0111+\3\2\2\2"+
		"\u0112\u0117\7C\2\2\u0113\u0114\t\16\2\2\u0114\u0116\7C\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\t\16\2\2\u011b\u011c\5"+
		"&\24\2\u011c-\3\2\2\2\u011d\u0122\5&\24\2\u011e\u011f\7\7\2\2\u011f\u0121"+
		"\5&\24\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123/\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\5\2\2"+
		"\u0126\u0127\5&\24\2\u0127\u0128\7\6\2\2\u0128\61\3\2\2\2\35;BFWZ^sz\u0084"+
		"\u0098\u009c\u00a3\u00a9\u00b5\u00c4\u00e3\u00e5\u00ec\u00f0\u00f5\u00fc"+
		"\u0100\u0105\u0108\u010e\u0117\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}