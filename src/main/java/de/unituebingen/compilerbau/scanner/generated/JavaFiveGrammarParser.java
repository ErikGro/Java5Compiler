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
		BitwiseOp=8, ConditionalOp=9, QuestionMark=10, AdvancedAssignmentOp=11, 
		SimpleAssignmentOp=12, Selector=13, LCurlyBracket=14, RCurlyBracket=15, 
		LRoundBracket=16, RRoundBracket=17, Comma=18, Semicolon=19, Colon=20, 
		AccessModifier=21, Primitive=22, Bool=23, Class=24, Static=25, For=26, 
		While=27, Do=28, If=29, Switch=30, Case=31, Default=32, Else=33, Return=34, 
		This=35, New=36, Break=37, Continue=38, Int=39, Char=40, Identifier=41, 
		IdentifierChars=42, JavaLetterOrDigit=43, Digit=44, Hex=45, JavaLetter=46, 
		WS=47;
	public static final int
		RULE_javaProgram = 0, RULE_clazz = 1, RULE_clazzMember = 2, RULE_constructor = 3, 
		RULE_method = 4, RULE_parameterList = 5, RULE_field = 6, RULE_statement = 7, 
		RULE_ifStatement = 8, RULE_switchStatement = 9, RULE_whileStatement = 10, 
		RULE_doWhileStatement = 11, RULE_forStatement = 12, RULE_forInit = 13, 
		RULE_forIncrement = 14, RULE_localVarDeclarationStatement = 15, RULE_returnStatement = 16, 
		RULE_statementExpression = 17, RULE_blockStatement = 18, RULE_type = 19, 
		RULE_expression = 20, RULE_methodCall = 21, RULE_newExp = 22, RULE_assignment = 23, 
		RULE_expressionList = 24, RULE_parExpression = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"javaProgram", "clazz", "clazzMember", "constructor", "method", "parameterList", 
			"field", "statement", "ifStatement", "switchStatement", "whileStatement", 
			"doWhileStatement", "forStatement", "forInit", "forIncrement", "localVarDeclarationStatement", 
			"returnStatement", "statementExpression", "blockStatement", "type", "expression", 
			"methodCall", "newExp", "assignment", "expressionList", "parExpression"
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
		public List<ClazzContext> clazz() {
			return getRuleContexts(ClazzContext.class);
		}
		public ClazzContext clazz(int i) {
			return getRuleContext(ClazzContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				clazz();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AccessModifier || _la==Class );
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
		public TerminalNode Class() { return getToken(JavaFiveGrammarParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TerminalNode LCurlyBracket() { return getToken(JavaFiveGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaFiveGrammarParser.RCurlyBracket, 0); }
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
		public List<ClazzMemberContext> clazzMember() {
			return getRuleContexts(ClazzMemberContext.class);
		}
		public ClazzMemberContext clazzMember(int i) {
			return getRuleContext(ClazzMemberContext.class,i);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(57);
				match(AccessModifier);
				}
			}

			setState(60);
			match(Class);
			setState(61);
			match(Identifier);
			setState(62);
			match(LCurlyBracket);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AccessModifier) | (1L << Primitive) | (1L << Static) | (1L << Identifier))) != 0)) {
				{
				{
				setState(63);
				clazzMember();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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

	public static class ClazzMemberContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ClazzMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazzMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterClazzMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitClazzMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitClazzMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClazzMemberContext clazzMember() throws RecognitionException {
		ClazzMemberContext _localctx = new ClazzMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clazzMember);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				method();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				constructor();
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TerminalNode LRoundBracket() { return getToken(JavaFiveGrammarParser.LRoundBracket, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RRoundBracket() { return getToken(JavaFiveGrammarParser.RRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(76);
				match(AccessModifier);
				}
			}

			setState(79);
			match(Identifier);
			setState(80);
			match(LRoundBracket);
			setState(81);
			parameterList();
			setState(82);
			match(RRoundBracket);
			setState(83);
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

	public static class MethodContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TerminalNode LRoundBracket() { return getToken(JavaFiveGrammarParser.LRoundBracket, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RRoundBracket() { return getToken(JavaFiveGrammarParser.RRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
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
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(85);
				match(AccessModifier);
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(88);
				match(Static);
				}
			}

			setState(91);
			type();
			setState(92);
			match(Identifier);
			setState(93);
			match(LRoundBracket);
			setState(94);
			parameterList();
			setState(95);
			match(RRoundBracket);
			setState(96);
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

	public static class ParameterListContext extends ParserRuleContext {
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
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Primitive || _la==Identifier) {
				{
				setState(98);
				type();
				setState(99);
				match(Identifier);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(100);
					match(Comma);
					setState(101);
					type();
					setState(102);
					match(Identifier);
					}
					}
					setState(108);
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
		public LocalVarDeclarationStatementContext localVarDeclarationStatement() {
			return getRuleContext(LocalVarDeclarationStatementContext.class,0);
		}
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
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
		enterRule(_localctx, 12, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(111);
				match(AccessModifier);
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(114);
				match(Static);
				}
			}

			setState(117);
			localVarDeclarationStatement();
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				switchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				localVarDeclarationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				statementExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(129);
				match(Continue);
				setState(130);
				match(Semicolon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(131);
				match(Break);
				setState(132);
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
		enterRule(_localctx, 16, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(If);
			setState(136);
			parExpression();
			setState(137);
			statement();
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(138);
				match(Else);
				setState(139);
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
		enterRule(_localctx, 18, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Switch);
			setState(143);
			parExpression();
			setState(144);
			match(LCurlyBracket);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case || _la==Default) {
				{
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==Case || _la==Default) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				match(Colon);
				setState(147);
				statement();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(While);
			setState(156);
			parExpression();
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
		enterRule(_localctx, 22, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Do);
			setState(160);
			statement();
			setState(161);
			match(While);
			setState(162);
			parExpression();
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
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForIncrementContext forIncrement() {
			return getRuleContext(ForIncrementContext.class,0);
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
		enterRule(_localctx, 24, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(For);
			setState(166);
			match(LRoundBracket);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Primitive || _la==Identifier) {
				{
				setState(167);
				forInit();
				}
			}

			setState(170);
			match(Semicolon);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(171);
				expression(0);
				}
			}

			setState(174);
			match(Semicolon);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(175);
				forIncrement();
				}
			}

			setState(178);
			match(RRoundBracket);
			setState(179);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TerminalNode SimpleAssignmentOp() { return getToken(JavaFiveGrammarParser.SimpleAssignmentOp, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 26, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			type();
			setState(182);
			match(Identifier);
			setState(183);
			match(SimpleAssignmentOp);
			setState(184);
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

	public static class ForIncrementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).enterForIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFiveGrammarListener ) ((JavaFiveGrammarListener)listener).exitForIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaFiveGrammarVisitor ) return ((JavaFiveGrammarVisitor<? extends T>)visitor).visitForIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIncrementContext forIncrement() throws RecognitionException {
		ForIncrementContext _localctx = new ForIncrementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		enterRule(_localctx, 30, RULE_localVarDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			type();
			setState(189);
			match(Identifier);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SimpleAssignmentOp) {
				{
				setState(190);
				match(SimpleAssignmentOp);
				setState(191);
				expression(0);
				}
			}

			setState(194);
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
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(Return);
			setState(197);
			expression(0);
			setState(198);
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
		enterRule(_localctx, 34, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			expression(0);
			setState(201);
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
		enterRule(_localctx, 36, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(LCurlyBracket);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LCurlyBracket) | (1L << LRoundBracket) | (1L << Semicolon) | (1L << Primitive) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << If) | (1L << Switch) | (1L << Return) | (1L << This) | (1L << New) | (1L << Break) | (1L << Continue) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				{
				setState(204);
				statement();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(215);
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
				setState(216);
				parExpression();
				}
				break;
			case 3:
				{
				setState(217);
				methodCall();
				}
				break;
			case 4:
				{
				setState(218);
				newExp();
				}
				break;
			case 5:
				{
				setState(219);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				expression(10);
				}
				break;
			case 6:
				{
				setState(221);
				assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(225);
						match(MultOp);
						setState(226);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(228);
						match(AddOp);
						setState(229);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(231);
						match(ShiftOp);
						setState(232);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(234);
						match(RelationalOp);
						setState(235);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(237);
						match(EqualityOp);
						setState(238);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(240);
						match(BitwiseOp);
						setState(241);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(243);
						match(ConditionalOp);
						setState(244);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246);
						match(QuestionMark);
						setState(247);
						expression(0);
						setState(248);
						match(Colon);
						setState(249);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(252);
						match(Selector);
						setState(253);
						methodCall();
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(255);
						match(Selector);
						setState(256);
						match(Identifier);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(258);
						match(IncDecOp);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 42, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(Identifier);
			setState(265);
			match(LRoundBracket);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(266);
				expressionList();
				}
			}

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
		enterRule(_localctx, 44, RULE_newExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(New);
			setState(272);
			match(Identifier);
			setState(273);
			match(LRoundBracket);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(274);
				expressionList();
				}
			}

			setState(277);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SimpleAssignmentOp() { return getTokens(JavaFiveGrammarParser.SimpleAssignmentOp); }
		public TerminalNode SimpleAssignmentOp(int i) {
			return getToken(JavaFiveGrammarParser.SimpleAssignmentOp, i);
		}
		public List<TerminalNode> AdvancedAssignmentOp() { return getTokens(JavaFiveGrammarParser.AdvancedAssignmentOp); }
		public TerminalNode AdvancedAssignmentOp(int i) {
			return getToken(JavaFiveGrammarParser.AdvancedAssignmentOp, i);
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
		enterRule(_localctx, 46, RULE_assignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(Identifier);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					_la = _input.LA(1);
					if ( !(_la==AdvancedAssignmentOp || _la==SimpleAssignmentOp) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(281);
					match(Identifier);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==AdvancedAssignmentOp || _la==SimpleAssignmentOp) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(288);
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
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			expression(0);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(291);
				match(Comma);
				setState(292);
				expression(0);
				}
				}
				setState(297);
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
		enterRule(_localctx, 50, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LRoundBracket);
			setState(299);
			expression(0);
			setState(300);
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
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0131\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\3\5\3=\n\3\3\3\3\3\3\3\3"+
		"\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\4\3\4\3\4\5\4M\n\4\3\5\5\5P\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\5\6Y\n\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\5\7p\n\7\3\b"+
		"\5\bs\n\b\3\b\5\bv\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u0097\n\13\f\13\16\13\u009a\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00ab"+
		"\n\16\3\16\3\16\5\16\u00af\n\16\3\16\3\16\5\16\u00b3\n\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00c3"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\7\24\u00d0"+
		"\n\24\f\24\16\24\u00d3\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00e1\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0106\n\26\f\26\16\26\u0109\13\26\3\27\3\27\3\27\5\27\u010e\n\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0116\n\30\3\30\3\30\3\31\3\31\3\31"+
		"\7\31\u011d\n\31\f\31\16\31\u0120\13\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\7\32\u0128\n\32\f\32\16\32\u012b\13\32\3\33\3\33\3\33\3\33\3\33\2\3*"+
		"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7\3\2!"+
		"\"\4\2\30\30++\5\2\31\31%%)+\4\2\3\4\6\6\3\2\r\16\2\u0148\2\67\3\2\2\2"+
		"\4<\3\2\2\2\6L\3\2\2\2\bO\3\2\2\2\nX\3\2\2\2\fo\3\2\2\2\16r\3\2\2\2\20"+
		"\u0087\3\2\2\2\22\u0089\3\2\2\2\24\u0090\3\2\2\2\26\u009d\3\2\2\2\30\u00a1"+
		"\3\2\2\2\32\u00a7\3\2\2\2\34\u00b7\3\2\2\2\36\u00bc\3\2\2\2 \u00be\3\2"+
		"\2\2\"\u00c6\3\2\2\2$\u00ca\3\2\2\2&\u00cd\3\2\2\2(\u00d6\3\2\2\2*\u00e0"+
		"\3\2\2\2,\u010a\3\2\2\2.\u0111\3\2\2\2\60\u0119\3\2\2\2\62\u0124\3\2\2"+
		"\2\64\u012c\3\2\2\2\668\5\4\3\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:"+
		"\3\2\2\2:\3\3\2\2\2;=\7\27\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\32\2"+
		"\2?@\7+\2\2@D\7\20\2\2AC\5\6\4\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2"+
		"\2EG\3\2\2\2FD\3\2\2\2GH\7\21\2\2H\5\3\2\2\2IM\5\16\b\2JM\5\n\6\2KM\5"+
		"\b\5\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NP\7\27\2\2ON\3\2\2\2O"+
		"P\3\2\2\2PQ\3\2\2\2QR\7+\2\2RS\7\22\2\2ST\5\f\7\2TU\7\23\2\2UV\5&\24\2"+
		"V\t\3\2\2\2WY\7\27\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\7\33\2\2[Z\3\2"+
		"\2\2[\\\3\2\2\2\\]\3\2\2\2]^\5(\25\2^_\7+\2\2_`\7\22\2\2`a\5\f\7\2ab\7"+
		"\23\2\2bc\5&\24\2c\13\3\2\2\2de\5(\25\2el\7+\2\2fg\7\24\2\2gh\5(\25\2"+
		"hi\7+\2\2ik\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2"+
		"nl\3\2\2\2od\3\2\2\2op\3\2\2\2p\r\3\2\2\2qs\7\27\2\2rq\3\2\2\2rs\3\2\2"+
		"\2su\3\2\2\2tv\7\33\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5 \21\2x\17\3"+
		"\2\2\2y\u0088\7\25\2\2z\u0088\5&\24\2{\u0088\5\22\n\2|\u0088\5\24\13\2"+
		"}\u0088\5\26\f\2~\u0088\5\30\r\2\177\u0088\5\32\16\2\u0080\u0088\5 \21"+
		"\2\u0081\u0088\5\"\22\2\u0082\u0088\5$\23\2\u0083\u0084\7(\2\2\u0084\u0088"+
		"\7\25\2\2\u0085\u0086\7\'\2\2\u0086\u0088\7\25\2\2\u0087y\3\2\2\2\u0087"+
		"z\3\2\2\2\u0087{\3\2\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0087~\3\2\2\2"+
		"\u0087\177\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0082"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\21\3\2\2\2\u0089"+
		"\u008a\7\37\2\2\u008a\u008b\5\64\33\2\u008b\u008e\5\20\t\2\u008c\u008d"+
		"\7#\2\2\u008d\u008f\5\20\t\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\23\3\2\2\2\u0090\u0091\7 \2\2\u0091\u0092\5\64\33\2\u0092\u0098\7\20"+
		"\2\2\u0093\u0094\t\2\2\2\u0094\u0095\7\26\2\2\u0095\u0097\5\20\t\2\u0096"+
		"\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\21\2\2\u009c"+
		"\25\3\2\2\2\u009d\u009e\7\35\2\2\u009e\u009f\5\64\33\2\u009f\u00a0\5\20"+
		"\t\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\36\2\2\u00a2\u00a3\5\20\t\2\u00a3"+
		"\u00a4\7\35\2\2\u00a4\u00a5\5\64\33\2\u00a5\u00a6\7\25\2\2\u00a6\31\3"+
		"\2\2\2\u00a7\u00a8\7\34\2\2\u00a8\u00aa\7\22\2\2\u00a9\u00ab\5\34\17\2"+
		"\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\7\25\2\2\u00ad\u00af\5*\26\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00b2\7\25\2\2\u00b1\u00b3\5\36\20\2\u00b2"+
		"\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\23"+
		"\2\2\u00b5\u00b6\5\20\t\2\u00b6\33\3\2\2\2\u00b7\u00b8\5(\25\2\u00b8\u00b9"+
		"\7+\2\2\u00b9\u00ba\7\16\2\2\u00ba\u00bb\5*\26\2\u00bb\35\3\2\2\2\u00bc"+
		"\u00bd\5*\26\2\u00bd\37\3\2\2\2\u00be\u00bf\5(\25\2\u00bf\u00c2\7+\2\2"+
		"\u00c0\u00c1\7\16\2\2\u00c1\u00c3\5*\26\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\25\2\2\u00c5!\3\2\2\2\u00c6"+
		"\u00c7\7$\2\2\u00c7\u00c8\5*\26\2\u00c8\u00c9\7\25\2\2\u00c9#\3\2\2\2"+
		"\u00ca\u00cb\5*\26\2\u00cb\u00cc\7\25\2\2\u00cc%\3\2\2\2\u00cd\u00d1\7"+
		"\20\2\2\u00ce\u00d0\5\20\t\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d5\7\21\2\2\u00d5\'\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7)\3"+
		"\2\2\2\u00d8\u00d9\b\26\1\2\u00d9\u00e1\t\4\2\2\u00da\u00e1\5\64\33\2"+
		"\u00db\u00e1\5,\27\2\u00dc\u00e1\5.\30\2\u00dd\u00de\t\5\2\2\u00de\u00e1"+
		"\5*\26\f\u00df\u00e1\5\60\31\2\u00e0\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2"+
		"\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u0107\3\2\2\2\u00e2\u00e3\f\13\2\2\u00e3\u00e4\7\5\2\2"+
		"\u00e4\u0106\5*\26\f\u00e5\u00e6\f\n\2\2\u00e6\u00e7\7\6\2\2\u00e7\u0106"+
		"\5*\26\13\u00e8\u00e9\f\t\2\2\u00e9\u00ea\7\7\2\2\u00ea\u0106\5*\26\n"+
		"\u00eb\u00ec\f\b\2\2\u00ec\u00ed\7\b\2\2\u00ed\u0106\5*\26\t\u00ee\u00ef"+
		"\f\7\2\2\u00ef\u00f0\7\t\2\2\u00f0\u0106\5*\26\b\u00f1\u00f2\f\6\2\2\u00f2"+
		"\u00f3\7\n\2\2\u00f3\u0106\5*\26\7\u00f4\u00f5\f\5\2\2\u00f5\u00f6\7\13"+
		"\2\2\u00f6\u0106\5*\26\6\u00f7\u00f8\f\4\2\2\u00f8\u00f9\7\f\2\2\u00f9"+
		"\u00fa\5*\26\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\5*\26\5\u00fc\u0106\3"+
		"\2\2\2\u00fd\u00fe\f\20\2\2\u00fe\u00ff\7\17\2\2\u00ff\u0106\5,\27\2\u0100"+
		"\u0101\f\17\2\2\u0101\u0102\7\17\2\2\u0102\u0106\7+\2\2\u0103\u0104\f"+
		"\r\2\2\u0104\u0106\7\3\2\2\u0105\u00e2\3\2\2\2\u0105\u00e5\3\2\2\2\u0105"+
		"\u00e8\3\2\2\2\u0105\u00eb\3\2\2\2\u0105\u00ee\3\2\2\2\u0105\u00f1\3\2"+
		"\2\2\u0105\u00f4\3\2\2\2\u0105\u00f7\3\2\2\2\u0105\u00fd\3\2\2\2\u0105"+
		"\u0100\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108+\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b"+
		"\7+\2\2\u010b\u010d\7\22\2\2\u010c\u010e\5\62\32\2\u010d\u010c\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\23\2\2\u0110-\3"+
		"\2\2\2\u0111\u0112\7&\2\2\u0112\u0113\7+\2\2\u0113\u0115\7\22\2\2\u0114"+
		"\u0116\5\62\32\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3"+
		"\2\2\2\u0117\u0118\7\23\2\2\u0118/\3\2\2\2\u0119\u011e\7+\2\2\u011a\u011b"+
		"\t\6\2\2\u011b\u011d\7+\2\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\t\6\2\2\u0122\u0123\5*\26\2\u0123\61\3\2\2\2\u0124\u0129"+
		"\5*\26\2\u0125\u0126\7\24\2\2\u0126\u0128\5*\26\2\u0127\u0125\3\2\2\2"+
		"\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\63"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\22\2\2\u012d\u012e\5*\26\2"+
		"\u012e\u012f\7\23\2\2\u012f\65\3\2\2\2\349<DLOX[loru\u0087\u008e\u0098"+
		"\u00aa\u00ae\u00b2\u00c2\u00d1\u00e0\u0105\u0107\u010d\u0115\u011e\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}