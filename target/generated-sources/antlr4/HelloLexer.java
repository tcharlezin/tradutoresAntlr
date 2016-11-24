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
		T__17=1, T__16=2, T__15=3, T__14=4, T__13=5, T__12=6, T__11=7, T__10=8, 
		T__9=9, T__8=10, T__7=11, T__6=12, T__5=13, T__4=14, T__3=15, T__2=16, 
		T__1=17, T__0=18, VALOR=19, WHITESPACE=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "VALOR", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\6\24\u00c3\n\24\r\24\16\24\u00c4\3\25\6\25\u00c8\n\25\r\25\16\25\u00c9"+
		"\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\4\6\2\62<C\\^^c|\5\2\13"+
		"\f\16\17\"\"\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\67"+
		"\3\2\2\2\7K\3\2\2\2\tP\3\2\2\2\13V\3\2\2\2\rd\3\2\2\2\17l\3\2\2\2\21n"+
		"\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3\2\2\2\33"+
		"\u0094\3\2\2\2\35\u009c\3\2\2\2\37\u00a8\3\2\2\2!\u00aa\3\2\2\2#\u00b2"+
		"\3\2\2\2%\u00b5\3\2\2\2\'\u00c2\3\2\2\2)\u00c7\3\2\2\2+,\7-\2\2,-\7\""+
		"\2\2-.\7P\2\2./\7C\2\2/\60\7Q\2\2\60\61\7a\2\2\61\62\7N\2\2\62\63\7K\2"+
		"\2\63\64\7U\2\2\64\65\7V\2\2\65\66\7C\2\2\66\4\3\2\2\2\678\7R\2\289\7"+
		"C\2\29:\7U\2\2:;\7V\2\2;<\7C\2\2<=\7a\2\2=>\7C\2\2>?\7R\2\2?@\7N\2\2@"+
		"A\7K\2\2AB\7E\2\2BC\7C\2\2CD\7E\2\2DE\7C\2\2EF\7Q\2\2FG\7\"\2\2GH\7?\2"+
		"\2HI\7\"\2\2IJ\7)\2\2J\6\3\2\2\2KL\7f\2\2LM\7c\2\2MN\7v\2\2NO\7c\2\2O"+
		"\b\3\2\2\2PQ\7v\2\2QR\7g\2\2RS\7z\2\2ST\7v\2\2TU\7q\2\2U\n\3\2\2\2VW\7"+
		"-\2\2WX\7V\2\2XY\7K\2\2YZ\7R\2\2Z[\7Q\2\2[\\\7a\2\2\\]\7E\2\2]^\7C\2\2"+
		"^_\7O\2\2_`\7R\2\2`a\7Q\2\2ab\7]\2\2bc\7)\2\2c\f\3\2\2\2de\7f\2\2ef\7"+
		"g\2\2fg\7e\2\2gh\7k\2\2hi\7o\2\2ij\7c\2\2jk\7n\2\2k\16\3\2\2\2lm\7=\2"+
		"\2m\20\3\2\2\2no\7P\2\2op\7Q\2\2pq\7O\2\2qr\7G\2\2rs\7a\2\2st\7E\2\2t"+
		"u\7C\2\2uv\7O\2\2vw\7R\2\2wx\7Q\2\2xy\7]\2\2yz\7)\2\2z\22\3\2\2\2{|\7"+
		")\2\2|\24\3\2\2\2}~\7E\2\2~\177\7T\2\2\177\u0080\7K\2\2\u0080\u0081\7"+
		"C\2\2\u0081\u0082\7T\2\2\u0082\u0083\7\"\2\2\u0083\u0084\7E\2\2\u0084"+
		"\u0085\7T\2\2\u0085\u0086\7W\2\2\u0086\u0087\7F\2\2\u0087\u0088\7\"\2"+
		"\2\u0088\u0089\7]\2\2\u0089\u008a\7)\2\2\u008a\26\3\2\2\2\u008b\u008c"+
		"\7}\2\2\u008c\30\3\2\2\2\u008d\u008e\7u\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7i\2\2\u0093"+
		"\32\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7k\2\2\u0099\u009a\7t\2\2\u009a\u009b\7q\2\2"+
		"\u009b\34\3\2\2\2\u009c\u009d\7-\2\2\u009d\u009e\7\"\2\2\u009e\u009f\7"+
		"T\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7S\2\2\u00a1\u00a2\7W\2\2\u00a2\u00a3"+
		"\7G\2\2\u00a3\u00a4\7T\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7F\2\2\u00a6"+
		"\u00a7\7Q\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7\177\2\2\u00a9 \3\2\2\2\u00aa"+
		"\u00ab\7d\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7n\2\2"+
		"\u00ae\u00af\7g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7p\2\2\u00b1\"\3\2"+
		"\2\2\u00b2\u00b3\7)\2\2\u00b3\u00b4\7_\2\2\u00b4$\3\2\2\2\u00b5\u00b6"+
		"\7-\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7F\2\2\u00b8\u00b9\7G\2\2\u00b9"+
		"\u00ba\7H\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7W\2\2\u00bc\u00bd\7N\2\2"+
		"\u00bd\u00be\7V\2\2\u00be\u00bf\7]\2\2\u00bf\u00c0\7)\2\2\u00c0&\3\2\2"+
		"\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5(\3\2\2\2\u00c6\u00c8\t\3\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\25\2\2\u00cc*\3\2\2\2\5\2\u00c4"+
		"\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}