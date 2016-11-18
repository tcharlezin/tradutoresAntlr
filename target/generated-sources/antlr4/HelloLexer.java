// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, VALOR=16, WHITESPACE=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "VALOR", "WHITESPACE"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21\u00a1\n\21\r\21\16\21\u00a2"+
		"\3\22\6\22\u00a6\n\22\r\22\16\22\u00a7\3\22\3\22\2\2\23\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\3\5\2\13\f\16\17\"\"\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\62\3\2\2\2\7=\3\2\2\2"+
		"\t?\3\2\2\2\13K\3\2\2\2\rP\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23f\3\2\2\2"+
		"\25n\3\2\2\2\27p\3\2\2\2\31w\3\2\2\2\33\u0083\3\2\2\2\35\u008b\3\2\2\2"+
		"\37\u0097\3\2\2\2!\u00a0\3\2\2\2#\u00a5\3\2\2\2%&\7E\2\2&\'\7T\2\2\'("+
		"\7K\2\2()\7C\2\2)*\7T\2\2*+\7\"\2\2+,\7E\2\2,-\7T\2\2-.\7W\2\2./\7F\2"+
		"\2/\60\7\"\2\2\60\61\7]\2\2\61\4\3\2\2\2\62\63\7-\2\2\63\64\7\"\2\2\64"+
		"\65\7F\2\2\65\66\7G\2\2\66\67\7H\2\2\678\7C\2\289\7W\2\29:\7N\2\2:;\7"+
		"V\2\2;<\7]\2\2<\6\3\2\2\2=>\7_\2\2>\b\3\2\2\2?@\7-\2\2@A\7\"\2\2AB\7P"+
		"\2\2BC\7C\2\2CD\7Q\2\2DE\7a\2\2EF\7N\2\2FG\7K\2\2GH\7U\2\2HI\7V\2\2IJ"+
		"\7C\2\2J\n\3\2\2\2KL\7f\2\2LM\7c\2\2MN\7v\2\2NO\7c\2\2O\f\3\2\2\2PQ\7"+
		"v\2\2QR\7g\2\2RS\7z\2\2ST\7v\2\2TU\7q\2\2U\16\3\2\2\2VW\7]\2\2W\20\3\2"+
		"\2\2XY\7-\2\2YZ\7\"\2\2Z[\7V\2\2[\\\7K\2\2\\]\7R\2\2]^\7Q\2\2^_\7a\2\2"+
		"_`\7E\2\2`a\7C\2\2ab\7O\2\2bc\7R\2\2cd\7Q\2\2de\7]\2\2e\22\3\2\2\2fg\7"+
		"f\2\2gh\7g\2\2hi\7e\2\2ij\7k\2\2jk\7o\2\2kl\7c\2\2lm\7n\2\2m\24\3\2\2"+
		"\2no\7=\2\2o\26\3\2\2\2pq\7u\2\2qr\7v\2\2rs\7t\2\2st\7k\2\2tu\7p\2\2u"+
		"v\7i\2\2v\30\3\2\2\2wx\7-\2\2xy\7\"\2\2yz\7T\2\2z{\7G\2\2{|\7S\2\2|}\7"+
		"W\2\2}~\7G\2\2~\177\7T\2\2\177\u0080\7K\2\2\u0080\u0081\7F\2\2\u0081\u0082"+
		"\7Q\2\2\u0082\32\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7g\2\2\u0087\u0088\7k\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7q\2\2\u008a\34\3\2\2\2\u008b\u008c\7P\2\2\u008c\u008d\7Q\2\2\u008d"+
		"\u008e\7O\2\2\u008e\u008f\7G\2\2\u008f\u0090\7a\2\2\u0090\u0091\7E\2\2"+
		"\u0091\u0092\7C\2\2\u0092\u0093\7O\2\2\u0093\u0094\7R\2\2\u0094\u0095"+
		"\7Q\2\2\u0095\u0096\7]\2\2\u0096\36\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7q\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7c\2\2\u009d\u009e\7p\2\2\u009e \3\2\2\2\u009f\u00a1\4c|\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\"\3\2\2\2\u00a4\u00a6\t\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\b\22\2\2\u00aa$\3\2\2\2\5\2\u00a2\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}