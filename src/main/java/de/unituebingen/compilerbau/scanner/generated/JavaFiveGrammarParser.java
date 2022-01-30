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
		IncDecOp=1, UnaryOp=2, MultOp=3, AddOp=4, ShiftOp=5, RelationalOp=6, EqualityOp=7, 
		BitwiseOp=8, ConditionalOp=9, QuestionMark=10, AssignmentOp=11, AdvancedAssignmentOp=12, 
		SimpleAssignmentOp=13, Selector=14, LCurlyBracket=15, RCurlyBracket=16, 
		LRoundBracket=17, RRoundBracket=18, Comma=19, Semicolon=20, Colon=21, 
		AccessModifier=22, Primitive=23, Bool=24, Class=25, Static=26, For=27, 
		While=28, Do=29, If=30, Switch=31, Case=32, Default=33, Else=34, Return=35, 
		This=36, New=37, Break=38, Continue=39, Int=40, Char=41, Identifier=42, 
		IdentifierChars=43, JavaLetterOrDigit=44, Digit=45, Hex=46, JavaLetter=47, 
		WS=48;
	public static final int
		RULE_javaProgram = 0, RULE_clazz = 1, RULE_fieldOrMethod = 2, RULE_method = 3, 
		RULE_methodParameterList = 4, RULE_field = 5, RULE_statement = 6, RULE_ifStatement = 7, 
		RULE_switchStatement = 8, RULE_whileStatement = 9, RULE_doWhileStatement = 10, 
		RULE_forStatement = 11, RULE_localVarDeclarationStatement = 12, RULE_returnStatement = 13, 
		RULE_statementExpression = 14, RULE_blockStatement = 15, RULE_type = 16, 
		RULE_expression = 17, RULE_methodCall = 18, RULE_newExp = 19, RULE_assignment = 20, 
		RULE_expressionList = 21, RULE_parExpression = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"javaProgram", "clazz", "fieldOrMethod", "method", "methodParameterList", 
			"field", "statement", "ifStatement", "switchStatement", "whileStatement", 
			"doWhileStatement", "forStatement", "localVarDeclarationStatement", "returnStatement", 
			"statementExpression", "blockStatement", "type", "expression", "methodCall", 
			"newExp", "assignment", "expressionList", "parExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'?'", null, 
			null, "'='", "'.'", "'{'", "'}'", "'('", "')'", "','", "';'", "':'", 
			null, null, null, "'class'", "'static'", "'for'", "'while'", "'do'", 
			"'if'", "'switch'", "'case'", "'default'", "'else'", "'return'", "'this'", 
			"'new'", "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IncDecOp", "UnaryOp", "MultOp", "AddOp", "ShiftOp", "RelationalOp", 
			"EqualityOp", "BitwiseOp", "ConditionalOp", "QuestionMark", "AssignmentOp", 
			"AdvancedAssignmentOp", "SimpleAssignmentOp", "Selector", "LCurlyBracket", 
			"RCurlyBracket", "LRoundBracket", "RRoundBracket", "Comma", "Semicolon", 
			"Colon", "AccessModifier", "Primitive", "Bool", "Class", "Static", "For", 
			"While", "Do", "If", "Switch", "Case", "Default", "Else", "Return", "This", 
			"New", "Break", "Continue", "Int", "Char", "Identifier", "IdentifierChars", 
			"JavaLetterOrDigit", "Digit", "Hex", "JavaLetter", "WS"
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
			setState(46);
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
		public TerminalNode LCurlyBracket() { return getToken(JavaFiveGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaFiveGrammarParser.RCurlyBracket, 0); }
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
			setState(48);
			match(AccessModifier);
			setState(49);
			match(Class);
			setState(50);
			match(Identifier);
			setState(51);
			match(LCurlyBracket);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifier) {
				{
				{
				setState(52);
				fieldOrMethod();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(RCurlyBracket);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
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
		public TerminalNode LRoundBracket() { return getToken(JavaFiveGrammarParser.LRoundBracket, 0); }
		public MethodParameterListContext methodParameterList() {
			return getRuleContext(MethodParameterListContext.class,0);
		}
		public TerminalNode RRoundBracket() { return getToken(JavaFiveGrammarParser.RRoundBracket, 0); }
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
			setState(64);
			match(AccessModifier);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(65);
				match(Static);
				}
			}

			setState(68);
			type();
			setState(69);
			match(Identifier);
			setState(70);
			match(LRoundBracket);
			setState(71);
			methodParameterList();
			setState(72);
			match(RRoundBracket);
			setState(73);
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
		public List<TerminalNode> Comma() { return getTokens(JavaFiveGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaFiveGrammarParser.Comma, i);
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
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Primitive || _la==Identifier) {
				{
				setState(75);
				type();
				setState(76);
				match(Identifier);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(77);
					match(Comma);
					setState(78);
					type();
					setState(79);
					match(Identifier);
					}
					}
					setState(85);
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
		public TerminalNode Semicolon() { return getToken(JavaFiveGrammarParser.Semicolon, 0); }
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
			setState(88);
			match(AccessModifier);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(89);
				match(Static);
				}
			}

			setState(92);
			localVarDeclarationStatement();
			setState(93);
			match(Semicolon);
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
		public TerminalNode Semicolon() { return getToken(JavaFiveGrammarParser.Semicolon, 0); }
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				switchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				localVarDeclarationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				statementExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				match(Continue);
				setState(106);
				match(Semicolon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(107);
				match(Break);
				setState(108);
				match(Semicolon);
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
			setState(111);
			match(If);
			setState(112);
			parExpression();
			setState(113);
			statement();
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(114);
				match(Else);
				setState(115);
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
		public TerminalNode LCurlyBracket() { return getToken(JavaFiveGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaFiveGrammarParser.RCurlyBracket, 0); }
		public List<TerminalNode> Colon() { return getTokens(JavaFiveGrammarParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(JavaFiveGrammarParser.Colon, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Case() { return getTokens(JavaFiveGrammarParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(JavaFiveGrammarParser.Case, i);
		}
		public List<TerminalNode> Default() { return getTokens(JavaFiveGrammarParser.Default); }
		public TerminalNode Default(int i) {
			return getToken(JavaFiveGrammarParser.Default, i);
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
			setState(118);
			match(Switch);
			setState(119);
			parExpression();
			setState(120);
			match(LCurlyBracket);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case || _la==Default) {
				{
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==Case || _la==Default) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(122);
				match(Colon);
				setState(123);
				statement();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(RCurlyBracket);
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
			setState(131);
			match(While);
			setState(132);
			parExpression();
			setState(133);
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
		public TerminalNode Semicolon() { return getToken(JavaFiveGrammarParser.Semicolon, 0); }
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
			setState(135);
			match(Do);
			setState(136);
			statement();
			setState(137);
			match(While);
			setState(138);
			parExpression();
			setState(139);
			match(Semicolon);
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
		public TerminalNode LRoundBracket() { return getToken(JavaFiveGrammarParser.LRoundBracket, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(JavaFiveGrammarParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(JavaFiveGrammarParser.Semicolon, i);
		}
		public TerminalNode RRoundBracket() { return getToken(JavaFiveGrammarParser.RRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVarDeclarationStatementContext localVarDeclarationStatement() {
			return getRuleContext(LocalVarDeclarationStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
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
			setState(141);
			match(For);
			setState(142);
			match(LRoundBracket);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Primitive || _la==Identifier) {
				{
				setState(143);
				localVarDeclarationStatement();
				}
			}

			setState(146);
			match(Semicolon);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(147);
				expression(0);
				}
			}

			setState(150);
			match(Semicolon);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(151);
				statementExpression();
				}
			}

			setState(154);
			match(RRoundBracket);
			setState(155);
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

	public static class LocalVarDeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(JavaFiveGrammarParser.Semicolon, 0); }
		public TerminalNode SimpleAssignmentOp() { return getToken(JavaFiveGrammarParser.SimpleAssignmentOp, 0); }
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
		enterRule(_localctx, 24, RULE_localVarDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			type();
			setState(158);
			match(Identifier);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SimpleAssignmentOp) {
				{
				setState(159);
				match(SimpleAssignmentOp);
				setState(160);
				expression(0);
				}
			}

			setState(163);
			match(Semicolon);
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
		public TerminalNode Semicolon() { return getToken(JavaFiveGrammarParser.Semicolon, 0); }
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
		enterRule(_localctx, 26, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(Return);
			setState(166);
			expression(0);
			setState(167);
			match(Semicolon);
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
		public TerminalNode Semicolon() { return getToken(JavaFiveGrammarParser.Semicolon, 0); }
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
		enterRule(_localctx, 28, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expression(0);
			setState(170);
			match(Semicolon);
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
		public TerminalNode LCurlyBracket() { return getToken(JavaFiveGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaFiveGrammarParser.RCurlyBracket, 0); }
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
		enterRule(_localctx, 30, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LCurlyBracket);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LCurlyBracket) | (1L << LRoundBracket) | (1L << Semicolon) | (1L << Primitive) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << If) | (1L << Switch) | (1L << Return) | (1L << This) | (1L << New) | (1L << Break) | (1L << Continue) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				{
				setState(173);
				statement();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(RCurlyBracket);
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
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		public TerminalNode IncDecOp() { return getToken(JavaFiveGrammarParser.IncDecOp, 0); }
		public TerminalNode AddOp() { return getToken(JavaFiveGrammarParser.AddOp, 0); }
		public TerminalNode UnaryOp() { return getToken(JavaFiveGrammarParser.UnaryOp, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode MultOp() { return getToken(JavaFiveGrammarParser.MultOp, 0); }
		public TerminalNode ShiftOp() { return getToken(JavaFiveGrammarParser.ShiftOp, 0); }
		public TerminalNode RelationalOp() { return getToken(JavaFiveGrammarParser.RelationalOp, 0); }
		public TerminalNode EqualityOp() { return getToken(JavaFiveGrammarParser.EqualityOp, 0); }
		public TerminalNode BitwiseOp() { return getToken(JavaFiveGrammarParser.BitwiseOp, 0); }
		public TerminalNode ConditionalOp() { return getToken(JavaFiveGrammarParser.ConditionalOp, 0); }
		public TerminalNode QuestionMark() { return getToken(JavaFiveGrammarParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(JavaFiveGrammarParser.Colon, 0); }
		public TerminalNode Selector() { return getToken(JavaFiveGrammarParser.Selector, 0); }
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << This) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) ) {
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
				setState(185);
				parExpression();
				}
				break;
			case 3:
				{
				setState(186);
				methodCall();
				}
				break;
			case 4:
				{
				setState(187);
				newExp();
				}
				break;
			case 5:
				{
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				expression(10);
				}
				break;
			case 6:
				{
				setState(190);
				assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(194);
						match(MultOp);
						setState(195);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(197);
						match(AddOp);
						setState(198);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(200);
						match(ShiftOp);
						setState(201);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(203);
						match(RelationalOp);
						setState(204);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(206);
						match(EqualityOp);
						setState(207);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(209);
						match(BitwiseOp);
						setState(210);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(212);
						match(ConditionalOp);
						setState(213);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(215);
						match(QuestionMark);
						setState(216);
						expression(0);
						setState(217);
						match(Colon);
						setState(218);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(221);
						match(Selector);
						setState(222);
						methodCall();
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(224);
						match(Selector);
						setState(225);
						match(Identifier);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(227);
						match(IncDecOp);
						}
						break;
					}
					} 
				}
				setState(232);
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
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TerminalNode LRoundBracket() { return getToken(JavaFiveGrammarParser.LRoundBracket, 0); }
		public TerminalNode RRoundBracket() { return getToken(JavaFiveGrammarParser.RRoundBracket, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Identifier);
			setState(234);
			match(LRoundBracket);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(235);
				expressionList();
				}
			}

			setState(238);
			match(RRoundBracket);
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
		public TerminalNode LRoundBracket() { return getToken(JavaFiveGrammarParser.LRoundBracket, 0); }
		public TerminalNode RRoundBracket() { return getToken(JavaFiveGrammarParser.RRoundBracket, 0); }
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
		enterRule(_localctx, 38, RULE_newExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(New);
			setState(241);
			match(Identifier);
			setState(242);
			match(LRoundBracket);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(243);
				expressionList();
				}
			}

			setState(246);
			match(RRoundBracket);
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
		public List<TerminalNode> AssignmentOp() { return getTokens(JavaFiveGrammarParser.AssignmentOp); }
		public TerminalNode AssignmentOp(int i) {
			return getToken(JavaFiveGrammarParser.AssignmentOp, i);
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
		enterRule(_localctx, 40, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(Identifier);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					match(AssignmentOp);
					setState(250);
					match(Identifier);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(256);
			match(AssignmentOp);
			setState(257);
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
		public List<TerminalNode> Comma() { return getTokens(JavaFiveGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaFiveGrammarParser.Comma, i);
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
		enterRule(_localctx, 42, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			expression(0);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(260);
				match(Comma);
				setState(261);
				expression(0);
				}
				}
				setState(266);
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
		public TerminalNode LRoundBracket() { return getToken(JavaFiveGrammarParser.LRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RRoundBracket() { return getToken(JavaFiveGrammarParser.RRoundBracket, 0); }
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
		enterRule(_localctx, 44, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LRoundBracket);
			setState(268);
			expression(0);
			setState(269);
			match(RRoundBracket);
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
		case 17:
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
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0112\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\4\3\4\5\4A\n\4\3"+
		"\5\3\5\5\5E\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6T\n\6\f\6\16\6W\13\6\5\6Y\n\6\3\7\3\7\5\7]\n\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\tw\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082\13"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r"+
		"\u0093\n\r\3\r\3\r\5\r\u0097\n\r\3\r\3\r\5\r\u009b\n\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\5\16\u00a4\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4\13\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c2\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u00e7\n\23\f\23\16\23\u00ea\13\23\3\24"+
		"\3\24\3\24\5\24\u00ef\n\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00f7\n"+
		"\25\3\25\3\25\3\26\3\26\3\26\7\26\u00fe\n\26\f\26\16\26\u0101\13\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\7\27\u0109\n\27\f\27\16\27\u010c\13\27\3"+
		"\30\3\30\3\30\3\30\3\30\2\3$\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\6\3\2\"#\4\2\31\31,,\5\2\32\32&&*,\4\2\3\4\6\6\2\u0126\2\60"+
		"\3\2\2\2\4\62\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16o"+
		"\3\2\2\2\20q\3\2\2\2\22x\3\2\2\2\24\u0085\3\2\2\2\26\u0089\3\2\2\2\30"+
		"\u008f\3\2\2\2\32\u009f\3\2\2\2\34\u00a7\3\2\2\2\36\u00ab\3\2\2\2 \u00ae"+
		"\3\2\2\2\"\u00b7\3\2\2\2$\u00c1\3\2\2\2&\u00eb\3\2\2\2(\u00f2\3\2\2\2"+
		"*\u00fa\3\2\2\2,\u0105\3\2\2\2.\u010d\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2"+
		"\2\62\63\7\30\2\2\63\64\7\33\2\2\64\65\7,\2\2\659\7\21\2\2\668\5\6\4\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7"+
		"\22\2\2=\5\3\2\2\2>A\5\f\7\2?A\5\b\5\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2"+
		"BD\7\30\2\2CE\7\34\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\5\"\22\2GH\7,\2"+
		"\2HI\7\23\2\2IJ\5\n\6\2JK\7\24\2\2KL\5 \21\2L\t\3\2\2\2MN\5\"\22\2NU\7"+
		",\2\2OP\7\25\2\2PQ\5\"\22\2QR\7,\2\2RT\3\2\2\2SO\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XM\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2Z"+
		"\\\7\30\2\2[]\7\34\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\5\32\16\2_`\7"+
		"\26\2\2`\r\3\2\2\2ap\7\26\2\2bp\5 \21\2cp\5\20\t\2dp\5\22\n\2ep\5\24\13"+
		"\2fp\5\26\f\2gp\5\30\r\2hp\5\32\16\2ip\5\34\17\2jp\5\36\20\2kl\7)\2\2"+
		"lp\7\26\2\2mn\7(\2\2np\7\26\2\2oa\3\2\2\2ob\3\2\2\2oc\3\2\2\2od\3\2\2"+
		"\2oe\3\2\2\2of\3\2\2\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2"+
		"\2om\3\2\2\2p\17\3\2\2\2qr\7 \2\2rs\5.\30\2sv\5\16\b\2tu\7$\2\2uw\5\16"+
		"\b\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2xy\7!\2\2yz\5.\30\2z\u0080\7\21\2"+
		"\2{|\t\2\2\2|}\7\27\2\2}\177\5\16\b\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7\22\2\2\u0084\23\3\2\2\2\u0085\u0086\7\36\2\2\u0086\u0087"+
		"\5.\30\2\u0087\u0088\5\16\b\2\u0088\25\3\2\2\2\u0089\u008a\7\37\2\2\u008a"+
		"\u008b\5\16\b\2\u008b\u008c\7\36\2\2\u008c\u008d\5.\30\2\u008d\u008e\7"+
		"\26\2\2\u008e\27\3\2\2\2\u008f\u0090\7\35\2\2\u0090\u0092\7\23\2\2\u0091"+
		"\u0093\5\32\16\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0096\7\26\2\2\u0095\u0097\5$\23\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\7\26\2\2\u0099\u009b\5"+
		"\36\20\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\24\2\2\u009d\u009e\5\16\b\2\u009e\31\3\2\2\2\u009f\u00a0\5\""+
		"\22\2\u00a0\u00a3\7,\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a4\5$\23\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\26"+
		"\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\7%\2\2\u00a8\u00a9\5$\23\2\u00a9\u00aa"+
		"\7\26\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\5$\23\2\u00ac\u00ad\7\26\2\2\u00ad"+
		"\37\3\2\2\2\u00ae\u00b2\7\21\2\2\u00af\u00b1\5\16\b\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\22\2\2\u00b6!\3\2\2\2"+
		"\u00b7\u00b8\t\3\2\2\u00b8#\3\2\2\2\u00b9\u00ba\b\23\1\2\u00ba\u00c2\t"+
		"\4\2\2\u00bb\u00c2\5.\30\2\u00bc\u00c2\5&\24\2\u00bd\u00c2\5(\25\2\u00be"+
		"\u00bf\t\5\2\2\u00bf\u00c2\5$\23\f\u00c0\u00c2\5*\26\2\u00c1\u00b9\3\2"+
		"\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1"+
		"\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00e8\3\2\2\2\u00c3\u00c4\f\13"+
		"\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00e7\5$\23\f\u00c6\u00c7\f\n\2\2\u00c7"+
		"\u00c8\7\6\2\2\u00c8\u00e7\5$\23\13\u00c9\u00ca\f\t\2\2\u00ca\u00cb\7"+
		"\7\2\2\u00cb\u00e7\5$\23\n\u00cc\u00cd\f\b\2\2\u00cd\u00ce\7\b\2\2\u00ce"+
		"\u00e7\5$\23\t\u00cf\u00d0\f\7\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00e7\5$"+
		"\23\b\u00d2\u00d3\f\6\2\2\u00d3\u00d4\7\n\2\2\u00d4\u00e7\5$\23\7\u00d5"+
		"\u00d6\f\5\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00e7\5$\23\6\u00d8\u00d9\f"+
		"\4\2\2\u00d9\u00da\7\f\2\2\u00da\u00db\5$\23\2\u00db\u00dc\7\27\2\2\u00dc"+
		"\u00dd\5$\23\5\u00dd\u00e7\3\2\2\2\u00de\u00df\f\20\2\2\u00df\u00e0\7"+
		"\20\2\2\u00e0\u00e7\5&\24\2\u00e1\u00e2\f\17\2\2\u00e2\u00e3\7\20\2\2"+
		"\u00e3\u00e7\7,\2\2\u00e4\u00e5\f\r\2\2\u00e5\u00e7\7\3\2\2\u00e6\u00c3"+
		"\3\2\2\2\u00e6\u00c6\3\2\2\2\u00e6\u00c9\3\2\2\2\u00e6\u00cc\3\2\2\2\u00e6"+
		"\u00cf\3\2\2\2\u00e6\u00d2\3\2\2\2\u00e6\u00d5\3\2\2\2\u00e6\u00d8\3\2"+
		"\2\2\u00e6\u00de\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9%\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7,\2\2\u00ec\u00ee\7\23\2\2\u00ed\u00ef"+
		"\5,\27\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\7\24\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3\u00f4\7,\2\2"+
		"\u00f4\u00f6\7\23\2\2\u00f5\u00f7\5,\27\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\24\2\2\u00f9)\3\2\2\2\u00fa"+
		"\u00ff\7,\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fe\7,\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\r\2\2\u0103\u0104\5$\23\2\u0104"+
		"+\3\2\2\2\u0105\u010a\5$\23\2\u0106\u0107\7\25\2\2\u0107\u0109\5$\23\2"+
		"\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b-\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\23\2\2\u010e"+
		"\u010f\5$\23\2\u010f\u0110\7\24\2\2\u0110/\3\2\2\2\279@DUX\\ov\u0080\u0092"+
		"\u0096\u009a\u00a3\u00b2\u00c1\u00e6\u00e8\u00ee\u00f6\u00ff\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}