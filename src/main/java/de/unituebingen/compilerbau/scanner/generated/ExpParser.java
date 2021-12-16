// Generated from Exp.g4 by ANTLR 4.3
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
public class ExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, Number=7, WS=8;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'('", "')'", "'*'", "'+'", "'-'", "Number", "WS"
	};
	public static final int
		RULE_eval = 0, RULE_additionExp = 1, RULE_multiplyExp = 2, RULE_atomExp = 3;
	public static final String[] ruleNames = {
		"eval", "additionExp", "multiplyExp", "atomExp"
	};

	@Override
	public String getGrammarFileName() { return "Exp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); additionExp();
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

	public static class AdditionExpContext extends ParserRuleContext {
		public List<MultiplyExpContext> multiplyExp() {
			return getRuleContexts(MultiplyExpContext.class);
		}
		public MultiplyExpContext multiplyExp(int i) {
			return getRuleContext(MultiplyExpContext.class,i);
		}
		public AdditionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterAdditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitAdditionExp(this);
		}
	}

	public final AdditionExpContext additionExp() throws RecognitionException {
		AdditionExpContext _localctx = new AdditionExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_additionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); multiplyExp();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__0) {
				{
				setState(15);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(11); match(T__1);
					setState(12); multiplyExp();
					}
					break;
				case T__0:
					{
					setState(13); match(T__0);
					setState(14); multiplyExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(19);
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

	public static class MultiplyExpContext extends ParserRuleContext {
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public MultiplyExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterMultiplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitMultiplyExp(this);
		}
	}

	public final MultiplyExpContext multiplyExp() throws RecognitionException {
		MultiplyExpContext _localctx = new MultiplyExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); atomExp();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__2) {
				{
				setState(25);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(21); match(T__2);
					setState(22); atomExp();
					}
					break;
				case T__5:
					{
					setState(23); match(T__5);
					setState(24); atomExp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29);
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

	public static class AtomExpContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ExpParser.Number, 0); }
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitAtomExp(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atomExp);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); match(Number);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); match(T__4);
				setState(32); additionExp();
				setState(33); match(T__3);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\7\4\34\n\4\f\4\16\4\37\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\5\5&\n\5\3\5\2\2\6\2\4\6\b\2\2(\2\n\3\2\2\2\4\f\3\2\2\2\6\26\3\2"+
		"\2\2\b%\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\23\5\6\4\2\r\16\7\7\2\2\16"+
		"\22\5\6\4\2\17\20\7\b\2\2\20\22\5\6\4\2\21\r\3\2\2\2\21\17\3\2\2\2\22"+
		"\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\23\3\2\2\2\26"+
		"\35\5\b\5\2\27\30\7\6\2\2\30\34\5\b\5\2\31\32\7\3\2\2\32\34\5\b\5\2\33"+
		"\27\3\2\2\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\7\3\2\2\2\37\35\3\2\2\2 &\7\t\2\2!\"\7\4\2\2\"#\5\4\3\2#$\7\5\2\2$&\3"+
		"\2\2\2% \3\2\2\2%!\3\2\2\2&\t\3\2\2\2\7\21\23\33\35%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}