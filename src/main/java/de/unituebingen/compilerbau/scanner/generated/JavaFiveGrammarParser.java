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
			} while ( _la==AccessModifier );
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
			setState(57);
			match(AccessModifier);
			setState(58);
			match(Class);
			setState(59);
			match(Identifier);
			setState(60);
			match(LCurlyBracket);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifier) {
				{
				{
				setState(61);
				clazzMember();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				method();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
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
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
		public TerminalNode Identifier() { return getToken(JavaFiveGrammarParser.Identifier, 0); }
		public TerminalNode LRoundBracket() { return getToken(JavaFiveGrammarParser.LRoundBracket, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RRoundBracket() { return getToken(JavaFiveGrammarParser.RRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(AccessModifier);
			setState(75);
			match(Identifier);
			setState(76);
			match(LRoundBracket);
			setState(77);
			parameterList();
			setState(78);
			match(RRoundBracket);
			setState(79);
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
		public TerminalNode AccessModifier() { return getToken(JavaFiveGrammarParser.AccessModifier, 0); }
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
			setState(81);
			match(AccessModifier);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(82);
				match(Static);
				}
			}

			setState(85);
			type();
			setState(86);
			match(Identifier);
			setState(87);
			match(LRoundBracket);
			setState(88);
			parameterList();
			setState(89);
			match(RRoundBracket);
			setState(90);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Primitive || _la==Identifier) {
				{
				setState(92);
				type();
				setState(93);
				match(Identifier);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(94);
					match(Comma);
					setState(95);
					type();
					setState(96);
					match(Identifier);
					}
					}
					setState(102);
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
		enterRule(_localctx, 12, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(AccessModifier);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(106);
				match(Static);
				}
			}

			setState(109);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				switchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				localVarDeclarationStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				statementExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(121);
				match(Continue);
				setState(122);
				match(Semicolon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(123);
				match(Break);
				setState(124);
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
			setState(127);
			match(If);
			setState(128);
			parExpression();
			setState(129);
			statement();
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130);
				match(Else);
				setState(131);
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
			setState(134);
			match(Switch);
			setState(135);
			parExpression();
			setState(136);
			match(LCurlyBracket);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case || _la==Default) {
				{
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==Case || _la==Default) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				match(Colon);
				setState(139);
				statement();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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
			setState(147);
			match(While);
			setState(148);
			parExpression();
			setState(149);
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
			setState(151);
			match(Do);
			setState(152);
			statement();
			setState(153);
			match(While);
			setState(154);
			parExpression();
			setState(155);
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
			setState(157);
			match(For);
			setState(158);
			match(LRoundBracket);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Primitive || _la==Identifier) {
				{
				setState(159);
				forInit();
				}
			}

			setState(162);
			match(Semicolon);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(163);
				expression(0);
				}
			}

			setState(166);
			match(Semicolon);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(167);
				forIncrement();
				}
			}

			setState(170);
			match(RRoundBracket);
			setState(171);
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
			setState(173);
			type();
			setState(174);
			match(Identifier);
			setState(175);
			match(SimpleAssignmentOp);
			setState(176);
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
			setState(178);
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
			setState(180);
			type();
			setState(181);
			match(Identifier);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SimpleAssignmentOp) {
				{
				setState(182);
				match(SimpleAssignmentOp);
				setState(183);
				expression(0);
				}
			}

			setState(186);
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
			setState(188);
			match(Return);
			setState(189);
			expression(0);
			setState(190);
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
			setState(192);
			expression(0);
			setState(193);
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
			setState(195);
			match(LCurlyBracket);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LCurlyBracket) | (1L << LRoundBracket) | (1L << Semicolon) | (1L << Primitive) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << If) | (1L << Switch) | (1L << Return) | (1L << This) | (1L << New) | (1L << Break) | (1L << Continue) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				{
				setState(196);
				statement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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
			setState(204);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(207);
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
				setState(208);
				parExpression();
				}
				break;
			case 3:
				{
				setState(209);
				methodCall();
				}
				break;
			case 4:
				{
				setState(210);
				newExp();
				}
				break;
			case 5:
				{
				setState(211);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(212);
				expression(10);
				}
				break;
			case 6:
				{
				setState(213);
				assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(217);
						match(MultOp);
						setState(218);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(220);
						match(AddOp);
						setState(221);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(223);
						match(ShiftOp);
						setState(224);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						match(RelationalOp);
						setState(227);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(229);
						match(EqualityOp);
						setState(230);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(232);
						match(BitwiseOp);
						setState(233);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(235);
						match(ConditionalOp);
						setState(236);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(238);
						match(QuestionMark);
						setState(239);
						expression(0);
						setState(240);
						match(Colon);
						setState(241);
						expression(3);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(244);
						match(Selector);
						setState(245);
						methodCall();
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(247);
						match(Selector);
						setState(248);
						match(Identifier);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(250);
						match(IncDecOp);
						}
						break;
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(256);
			match(Identifier);
			setState(257);
			match(LRoundBracket);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IncDecOp) | (1L << UnaryOp) | (1L << AddOp) | (1L << LRoundBracket) | (1L << Bool) | (1L << This) | (1L << New) | (1L << Int) | (1L << Char) | (1L << Identifier))) != 0)) {
				{
				setState(258);
				expressionList();
				}
			}

			setState(261);
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
			setState(263);
			match(New);
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
			setState(271);
			match(Identifier);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					_la = _input.LA(1);
					if ( !(_la==AdvancedAssignmentOp || _la==SimpleAssignmentOp) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(273);
					match(Identifier);
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==AdvancedAssignmentOp || _la==SimpleAssignmentOp) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(280);
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
			setState(282);
			expression(0);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(283);
				match(Comma);
				setState(284);
				expression(0);
				}
				}
				setState(289);
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
			setState(290);
			match(LRoundBracket);
			setState(291);
			expression(0);
			setState(292);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0129\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\3\3\3\3\3\3\3\3\3\7\3A\n"+
		"\3\f\3\16\3D\13\3\3\3\3\3\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\5\6V\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7e\n\7\f\7\16\7h\13\7\5\7j\n\7\3\b\3\b\5\bn\n\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0087\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008f\n"+
		"\13\f\13\16\13\u0092\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\5\16\u00a3\n\16\3\16\3\16\5\16\u00a7\n\16\3\16\3"+
		"\16\5\16\u00ab\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00bb\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\7\24\u00c8\n\24\f\24\16\24\u00cb\13\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d9\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00fe\n\26\f\26\16\26\u0101\13\26"+
		"\3\27\3\27\3\27\5\27\u0106\n\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u010e"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u0115\n\31\f\31\16\31\u0118\13\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0120\n\32\f\32\16\32\u0123\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\2\3*\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\2\7\3\2!\"\4\2\30\30++\5\2\31\31%%)+\4\2\3\4\6\6"+
		"\3\2\r\16\2\u013c\2\67\3\2\2\2\4;\3\2\2\2\6J\3\2\2\2\bL\3\2\2\2\nS\3\2"+
		"\2\2\fi\3\2\2\2\16k\3\2\2\2\20\177\3\2\2\2\22\u0081\3\2\2\2\24\u0088\3"+
		"\2\2\2\26\u0095\3\2\2\2\30\u0099\3\2\2\2\32\u009f\3\2\2\2\34\u00af\3\2"+
		"\2\2\36\u00b4\3\2\2\2 \u00b6\3\2\2\2\"\u00be\3\2\2\2$\u00c2\3\2\2\2&\u00c5"+
		"\3\2\2\2(\u00ce\3\2\2\2*\u00d8\3\2\2\2,\u0102\3\2\2\2.\u0109\3\2\2\2\60"+
		"\u0111\3\2\2\2\62\u011c\3\2\2\2\64\u0124\3\2\2\2\668\5\4\3\2\67\66\3\2"+
		"\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;<\7\27\2\2<=\7\32\2\2"+
		"=>\7+\2\2>B\7\20\2\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2"+
		"CE\3\2\2\2DB\3\2\2\2EF\7\21\2\2F\5\3\2\2\2GK\5\16\b\2HK\5\n\6\2IK\5\b"+
		"\5\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\7\27\2\2MN\7+\2\2NO\7"+
		"\22\2\2OP\5\f\7\2PQ\7\23\2\2QR\5&\24\2R\t\3\2\2\2SU\7\27\2\2TV\7\33\2"+
		"\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5(\25\2XY\7+\2\2YZ\7\22\2\2Z[\5\f\7"+
		"\2[\\\7\23\2\2\\]\5&\24\2]\13\3\2\2\2^_\5(\25\2_f\7+\2\2`a\7\24\2\2ab"+
		"\5(\25\2bc\7+\2\2ce\3\2\2\2d`\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj"+
		"\3\2\2\2hf\3\2\2\2i^\3\2\2\2ij\3\2\2\2j\r\3\2\2\2km\7\27\2\2ln\7\33\2"+
		"\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5 \21\2p\17\3\2\2\2q\u0080\7\25\2\2"+
		"r\u0080\5&\24\2s\u0080\5\22\n\2t\u0080\5\24\13\2u\u0080\5\26\f\2v\u0080"+
		"\5\30\r\2w\u0080\5\32\16\2x\u0080\5 \21\2y\u0080\5\"\22\2z\u0080\5$\23"+
		"\2{|\7(\2\2|\u0080\7\25\2\2}~\7\'\2\2~\u0080\7\25\2\2\177q\3\2\2\2\177"+
		"r\3\2\2\2\177s\3\2\2\2\177t\3\2\2\2\177u\3\2\2\2\177v\3\2\2\2\177w\3\2"+
		"\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2"+
		"\u0080\21\3\2\2\2\u0081\u0082\7\37\2\2\u0082\u0083\5\64\33\2\u0083\u0086"+
		"\5\20\t\2\u0084\u0085\7#\2\2\u0085\u0087\5\20\t\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088\u0089\7 \2\2\u0089\u008a\5"+
		"\64\33\2\u008a\u0090\7\20\2\2\u008b\u008c\t\2\2\2\u008c\u008d\7\26\2\2"+
		"\u008d\u008f\5\20\t\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\21\2\2\u0094\25\3\2\2\2\u0095\u0096\7\35\2\2\u0096\u0097\5\64"+
		"\33\2\u0097\u0098\5\20\t\2\u0098\27\3\2\2\2\u0099\u009a\7\36\2\2\u009a"+
		"\u009b\5\20\t\2\u009b\u009c\7\35\2\2\u009c\u009d\5\64\33\2\u009d\u009e"+
		"\7\25\2\2\u009e\31\3\2\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a2\7\22\2\2\u00a1"+
		"\u00a3\5\34\17\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a6\7\25\2\2\u00a5\u00a7\5*\26\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\7\25\2\2\u00a9\u00ab\5"+
		"\36\20\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\7\23\2\2\u00ad\u00ae\5\20\t\2\u00ae\33\3\2\2\2\u00af\u00b0\5(\25"+
		"\2\u00b0\u00b1\7+\2\2\u00b1\u00b2\7\16\2\2\u00b2\u00b3\5*\26\2\u00b3\35"+
		"\3\2\2\2\u00b4\u00b5\5*\26\2\u00b5\37\3\2\2\2\u00b6\u00b7\5(\25\2\u00b7"+
		"\u00ba\7+\2\2\u00b8\u00b9\7\16\2\2\u00b9\u00bb\5*\26\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd"+
		"!\3\2\2\2\u00be\u00bf\7$\2\2\u00bf\u00c0\5*\26\2\u00c0\u00c1\7\25\2\2"+
		"\u00c1#\3\2\2\2\u00c2\u00c3\5*\26\2\u00c3\u00c4\7\25\2\2\u00c4%\3\2\2"+
		"\2\u00c5\u00c9\7\20\2\2\u00c6\u00c8\5\20\t\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\21\2\2\u00cd\'\3\2\2\2\u00ce\u00cf"+
		"\t\3\2\2\u00cf)\3\2\2\2\u00d0\u00d1\b\26\1\2\u00d1\u00d9\t\4\2\2\u00d2"+
		"\u00d9\5\64\33\2\u00d3\u00d9\5,\27\2\u00d4\u00d9\5.\30\2\u00d5\u00d6\t"+
		"\5\2\2\u00d6\u00d9\5*\26\f\u00d7\u00d9\5\60\31\2\u00d8\u00d0\3\2\2\2\u00d8"+
		"\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00ff\3\2\2\2\u00da\u00db\f\13\2\2\u00db"+
		"\u00dc\7\5\2\2\u00dc\u00fe\5*\26\f\u00dd\u00de\f\n\2\2\u00de\u00df\7\6"+
		"\2\2\u00df\u00fe\5*\26\13\u00e0\u00e1\f\t\2\2\u00e1\u00e2\7\7\2\2\u00e2"+
		"\u00fe\5*\26\n\u00e3\u00e4\f\b\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00fe\5*"+
		"\26\t\u00e6\u00e7\f\7\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00fe\5*\26\b\u00e9"+
		"\u00ea\f\6\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00fe\5*\26\7\u00ec\u00ed\f\5"+
		"\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00fe\5*\26\6\u00ef\u00f0\f\4\2\2\u00f0"+
		"\u00f1\7\f\2\2\u00f1\u00f2\5*\26\2\u00f2\u00f3\7\26\2\2\u00f3\u00f4\5"+
		"*\26\5\u00f4\u00fe\3\2\2\2\u00f5\u00f6\f\20\2\2\u00f6\u00f7\7\17\2\2\u00f7"+
		"\u00fe\5,\27\2\u00f8\u00f9\f\17\2\2\u00f9\u00fa\7\17\2\2\u00fa\u00fe\7"+
		"+\2\2\u00fb\u00fc\f\r\2\2\u00fc\u00fe\7\3\2\2\u00fd\u00da\3\2\2\2\u00fd"+
		"\u00dd\3\2\2\2\u00fd\u00e0\3\2\2\2\u00fd\u00e3\3\2\2\2\u00fd\u00e6\3\2"+
		"\2\2\u00fd\u00e9\3\2\2\2\u00fd\u00ec\3\2\2\2\u00fd\u00ef\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100+\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0103\7+\2\2\u0103\u0105\7\22\2\2\u0104\u0106\5\62\32\2"+
		"\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\7\23\2\2\u0108-\3\2\2\2\u0109\u010a\7&\2\2\u010a\u010b\7+\2\2\u010b\u010d"+
		"\7\22\2\2\u010c\u010e\5\62\32\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0110\7\23\2\2\u0110/\3\2\2\2\u0111\u0116"+
		"\7+\2\2\u0112\u0113\t\6\2\2\u0113\u0115\7+\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u011a\t\6\2\2\u011a\u011b\5*\26\2\u011b"+
		"\61\3\2\2\2\u011c\u0121\5*\26\2\u011d\u011e\7\24\2\2\u011e\u0120\5*\26"+
		"\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\63\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\22\2\2\u0125"+
		"\u0126\5*\26\2\u0126\u0127\7\23\2\2\u0127\65\3\2\2\2\309BJUfim\177\u0086"+
		"\u0090\u00a2\u00a6\u00aa\u00ba\u00c9\u00d8\u00fd\u00ff\u0105\u010d\u0116"+
		"\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}