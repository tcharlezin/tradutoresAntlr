// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, COMANDO=5, NOVO_CAMPO=6, OPCIONAL=7, NOME=8, 
		TIPO=9, TIPO_CAMPO=10, REQUERIDO=11, DEFAULT=12, NAO_LISTA=13, VALOR=14, 
		WHITESPACE=15, COMANDOS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'CRIAR CRUD ['", "']'", "'['", "';'", "COMANDO", "NOVO_CAMPO", 
		"OPCIONAL", "NOME", "TIPO", "TIPO_CAMPO", "REQUERIDO", "DEFAULT", "NAO_LISTA", 
		"VALOR", "WHITESPACE", "COMANDOS"
	};
	public static final int
		RULE_prog = 0, RULE_def_app = 1, RULE_def_nam = 2, RULE_definicao_app = 3, 
		RULE_definicao_nam = 4, RULE_crud = 5, RULE_comandos = 6;
	public static final String[] ruleNames = {
		"prog", "def_app", "def_nam", "definicao_app", "definicao_nam", "crud", 
		"comandos"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Def_appContext def_app() {
			return getRuleContext(Def_appContext.class,0);
		}
		public CrudContext crud() {
			return getRuleContext(CrudContext.class,0);
		}
		public Def_namContext def_nam() {
			return getRuleContext(Def_namContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); def_app();
			setState(15); match(T__0);
			setState(16); def_nam();
			setState(17); match(T__0);
			setState(18); crud();
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

	public static class Def_appContext extends ParserRuleContext {
		public Definicao_appContext definicao_app() {
			return getRuleContext(Definicao_appContext.class,0);
		}
		public Def_appContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDef_app(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDef_app(this);
		}
	}

	public final Def_appContext def_app() throws RecognitionException {
		Def_appContext _localctx = new Def_appContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); definicao_app();
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

	public static class Def_namContext extends ParserRuleContext {
		public Definicao_namContext definicao_nam() {
			return getRuleContext(Definicao_namContext.class,0);
		}
		public Def_namContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_nam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDef_nam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDef_nam(this);
		}
	}

	public final Def_namContext def_nam() throws RecognitionException {
		Def_namContext _localctx = new Def_namContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def_nam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); definicao_nam();
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

	public static class Definicao_appContext extends ParserRuleContext {
		public TerminalNode VALOR() { return getToken(HelloParser.VALOR, 0); }
		public Definicao_appContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDefinicao_app(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDefinicao_app(this);
		}
	}

	public final Definicao_appContext definicao_app() throws RecognitionException {
		Definicao_appContext _localctx = new Definicao_appContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definicao_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(VALOR);
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

	public static class Definicao_namContext extends ParserRuleContext {
		public TerminalNode VALOR() { return getToken(HelloParser.VALOR, 0); }
		public Definicao_namContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao_nam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDefinicao_nam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDefinicao_nam(this);
		}
	}

	public final Definicao_namContext definicao_nam() throws RecognitionException {
		Definicao_namContext _localctx = new Definicao_namContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definicao_nam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(VALOR);
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

	public static class CrudContext extends ParserRuleContext {
		public TerminalNode COMANDOS() { return getToken(HelloParser.COMANDOS, 0); }
		public TerminalNode VALOR() { return getToken(HelloParser.VALOR, 0); }
		public CrudContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crud; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCrud(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCrud(this);
		}
	}

	public final CrudContext crud() throws RecognitionException {
		CrudContext _localctx = new CrudContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_crud);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(T__3);
			setState(29); match(VALOR);
			setState(30); match(T__2);
			setState(31); match(T__1);
			setState(32); match(COMANDOS);
			setState(33); match(T__2);
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

	public static class ComandosContext extends ParserRuleContext {
		public TerminalNode COMANDOS() { return getToken(HelloParser.COMANDOS, 0); }
		public TerminalNode COMANDO() { return getToken(HelloParser.COMANDO, 0); }
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !(_la==COMANDO || _la==COMANDOS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\3\4\2\7\7\22\22 \2\20\3\2\2\2\4\26\3\2\2\2\6\30"+
		"\3\2\2\2\b\32\3\2\2\2\n\34\3\2\2\2\f\36\3\2\2\2\16%\3\2\2\2\20\21\5\4"+
		"\3\2\21\22\7\6\2\2\22\23\5\6\4\2\23\24\7\6\2\2\24\25\5\f\7\2\25\3\3\2"+
		"\2\2\26\27\5\b\5\2\27\5\3\2\2\2\30\31\5\n\6\2\31\7\3\2\2\2\32\33\7\20"+
		"\2\2\33\t\3\2\2\2\34\35\7\20\2\2\35\13\3\2\2\2\36\37\7\3\2\2\37 \7\20"+
		"\2\2 !\7\4\2\2!\"\7\5\2\2\"#\7\22\2\2#$\7\4\2\2$\r\3\2\2\2%&\t\2\2\2&"+
		"\17\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}