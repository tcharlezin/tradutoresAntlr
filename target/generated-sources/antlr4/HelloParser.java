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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, VALOR=19, WHITESPACE=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'+ NAO_LISTA'", "'PASTA_APLICACAO = ''", "'data'", "'texto'", 
		"'+TIPO_CAMPO[''", "'decimal'", "';'", "'NOME_CAMPO[''", "'''", "'CRIAR CRUD [''", 
		"'{'", "'string'", "'inteiro'", "'+ REQUERIDO'", "'}'", "'boolean'", "'']'", 
		"'+ DEFAULT[''", "VALOR", "WHITESPACE"
	};
	public static final int
		RULE_prog = 0, RULE_def_app = 1, RULE_definicao_app = 2, RULE_crud = 3, 
		RULE_nome_entidade = 4, RULE_comandos = 5, RULE_comando = 6, RULE_novo_campo = 7, 
		RULE_def_nome_campo = 8, RULE_nome_campo = 9, RULE_tipo = 10, RULE_tipo_campo = 11, 
		RULE_campo_requerido = 12, RULE_nao_lista = 13, RULE_padrao = 14, RULE_valor_default = 15;
	public static final String[] ruleNames = {
		"prog", "def_app", "definicao_app", "crud", "nome_entidade", "comandos", 
		"comando", "novo_campo", "def_nome_campo", "nome_campo", "tipo", "tipo_campo", 
		"campo_requerido", "nao_lista", "padrao", "valor_default"
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
			setState(32); def_app();
			setState(33); match(T__11);
			setState(34); crud();
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
			setState(36); definicao_app();
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
		enterRule(_localctx, 4, RULE_definicao_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(T__16);
			setState(39); match(VALOR);
			setState(40); match(T__9);
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
		public Nome_entidadeContext nome_entidade() {
			return getRuleContext(Nome_entidadeContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_crud);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(T__8);
			setState(43); nome_entidade();
			setState(44); match(T__1);
			setState(45); match(T__7);
			setState(46); comandos();
			setState(47); match(T__3);
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

	public static class Nome_entidadeContext extends ParserRuleContext {
		public TerminalNode VALOR() { return getToken(HelloParser.VALOR, 0); }
		public Nome_entidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_entidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNome_entidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNome_entidade(this);
		}
	}

	public final Nome_entidadeContext nome_entidade() throws RecognitionException {
		Nome_entidadeContext _localctx = new Nome_entidadeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nome_entidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(VALOR);
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
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_comandos);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); comando();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Novo_campoContext novo_campo() {
			return getRuleContext(Novo_campoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); novo_campo();
			setState(56); match(T__11);
			setState(57); comandos();
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

	public static class Novo_campoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Nao_listaContext nao_lista() {
			return getRuleContext(Nao_listaContext.class,0);
		}
		public Campo_requeridoContext campo_requerido() {
			return getRuleContext(Campo_requeridoContext.class,0);
		}
		public Def_nome_campoContext def_nome_campo() {
			return getRuleContext(Def_nome_campoContext.class,0);
		}
		public PadraoContext padrao() {
			return getRuleContext(PadraoContext.class,0);
		}
		public Novo_campoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novo_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNovo_campo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNovo_campo(this);
		}
	}

	public final Novo_campoContext novo_campo() throws RecognitionException {
		Novo_campoContext _localctx = new Novo_campoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_novo_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); def_nome_campo();
			setState(60); tipo();
			setState(61); campo_requerido();
			setState(62); nao_lista();
			setState(63); padrao();
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

	public static class Def_nome_campoContext extends ParserRuleContext {
		public Nome_campoContext nome_campo() {
			return getRuleContext(Nome_campoContext.class,0);
		}
		public Def_nome_campoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_nome_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDef_nome_campo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDef_nome_campo(this);
		}
	}

	public final Def_nome_campoContext def_nome_campo() throws RecognitionException {
		Def_nome_campoContext _localctx = new Def_nome_campoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_def_nome_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(T__10);
			setState(66); nome_campo();
			setState(67); match(T__1);
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

	public static class Nome_campoContext extends ParserRuleContext {
		public TerminalNode VALOR() { return getToken(HelloParser.VALOR, 0); }
		public Nome_campoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNome_campo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNome_campo(this);
		}
	}

	public final Nome_campoContext nome_campo() throws RecognitionException {
		Nome_campoContext _localctx = new Nome_campoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nome_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(VALOR);
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

	public static class TipoContext extends ParserRuleContext {
		public Tipo_campoContext tipo_campo() {
			return getRuleContext(Tipo_campoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(T__13);
			setState(72); tipo_campo();
			setState(73); match(T__1);
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

	public static class Tipo_campoContext extends ParserRuleContext {
		public Tipo_campoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTipo_campo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTipo_campo(this);
		}
	}

	public final Tipo_campoContext tipo_campo() throws RecognitionException {
		Tipo_campoContext _localctx = new Tipo_campoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_campo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << T__6) | (1L << T__5) | (1L << T__2))) != 0)) ) {
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

	public static class Campo_requeridoContext extends ParserRuleContext {
		public Campo_requeridoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_requerido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCampo_requerido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCampo_requerido(this);
		}
	}

	public final Campo_requeridoContext campo_requerido() throws RecognitionException {
		Campo_requeridoContext _localctx = new Campo_requeridoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_campo_requerido);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); match(T__4);
				}
				break;
			case T__17:
			case T__11:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Nao_listaContext extends ParserRuleContext {
		public Nao_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nao_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNao_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNao_lista(this);
		}
	}

	public final Nao_listaContext nao_lista() throws RecognitionException {
		Nao_listaContext _localctx = new Nao_listaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nao_lista);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(T__17);
				}
				break;
			case T__11:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class PadraoContext extends ParserRuleContext {
		public Valor_defaultContext valor_default() {
			return getRuleContext(Valor_defaultContext.class,0);
		}
		public PadraoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padrao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPadrao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPadrao(this);
		}
	}

	public final PadraoContext padrao() throws RecognitionException {
		PadraoContext _localctx = new PadraoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_padrao);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); match(T__0);
				setState(86); valor_default();
				setState(87); match(T__1);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Valor_defaultContext extends ParserRuleContext {
		public TerminalNode VALOR() { return getToken(HelloParser.VALOR, 0); }
		public Valor_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterValor_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitValor_default(this);
		}
	}

	public final Valor_defaultContext valor_default() throws RecognitionException {
		Valor_defaultContext _localctx = new Valor_defaultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valor_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(VALOR);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\5"+
		"\78\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16R\n\16\3\17\3\17\5\17V\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20]\n\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\3\6\2\5\6\b\b\16\17\22\22T\2\"\3\2\2\2"+
		"\4&\3\2\2\2\6(\3\2\2\2\b,\3\2\2\2\n\63\3\2\2\2\f\67\3\2\2\2\169\3\2\2"+
		"\2\20=\3\2\2\2\22C\3\2\2\2\24G\3\2\2\2\26I\3\2\2\2\30M\3\2\2\2\32Q\3\2"+
		"\2\2\34U\3\2\2\2\36\\\3\2\2\2 ^\3\2\2\2\"#\5\4\3\2#$\7\t\2\2$%\5\b\5\2"+
		"%\3\3\2\2\2&\'\5\6\4\2\'\5\3\2\2\2()\7\4\2\2)*\7\25\2\2*+\7\13\2\2+\7"+
		"\3\2\2\2,-\7\f\2\2-.\5\n\6\2./\7\23\2\2/\60\7\r\2\2\60\61\5\f\7\2\61\62"+
		"\7\21\2\2\62\t\3\2\2\2\63\64\7\25\2\2\64\13\3\2\2\2\658\5\16\b\2\668\3"+
		"\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\r\3\2\2\29:\5\20\t\2:;\7\t\2\2;<\5"+
		"\f\7\2<\17\3\2\2\2=>\5\22\n\2>?\5\26\f\2?@\5\32\16\2@A\5\34\17\2AB\5\36"+
		"\20\2B\21\3\2\2\2CD\7\n\2\2DE\5\24\13\2EF\7\23\2\2F\23\3\2\2\2GH\7\25"+
		"\2\2H\25\3\2\2\2IJ\7\7\2\2JK\5\30\r\2KL\7\23\2\2L\27\3\2\2\2MN\t\2\2\2"+
		"N\31\3\2\2\2OR\7\20\2\2PR\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\33\3\2\2\2SV\7"+
		"\3\2\2TV\3\2\2\2US\3\2\2\2UT\3\2\2\2V\35\3\2\2\2WX\7\24\2\2XY\5 \21\2"+
		"YZ\7\23\2\2Z]\3\2\2\2[]\3\2\2\2\\W\3\2\2\2\\[\3\2\2\2]\37\3\2\2\2^_\7"+
		"\25\2\2_!\3\2\2\2\6\67QU\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}