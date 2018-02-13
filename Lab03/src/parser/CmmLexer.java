// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT_CONSTANT=20, REAL_CONSTANT=21, ID=22, CHAR_CONSTANT=23, 
		COMMENT=24, MULTILINE_COMMENT=25, BLANK=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "DIGIT", "LETTER", "FIXED_POINT", "SPECIAL_CHAR", "ASCII", 
		"INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT", "MULTILINE_COMMENT", 
		"BLANK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'int'", "'char'", "'double'", "'['", "']'", "'struct'", 
		"'{'", "'}'", "'void'", "'('", "')'", "'main'", "'='", "'*'", "'/'", "'+'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", 
		"ID", "CHAR_CONSTANT", "COMMENT", "MULTILINE_COMMENT", "BLANK"
	};
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0107\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\7\27\u0082\n\27\f\27\16\27\u0085\13\27\3\27\3\27\6\27\u0089\n\27\r"+
		"\27\16\27\u008a\3\27\6\27\u008e\n\27\r\27\16\27\u008f\3\27\3\27\7\27\u0094"+
		"\n\27\f\27\16\27\u0097\13\27\5\27\u0099\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00a0\n\30\3\31\3\31\6\31\u00a4\n\31\r\31\16\31\u00a5\3\32\3\32"+
		"\3\32\6\32\u00ab\n\32\r\32\16\32\u00ac\5\32\u00af\n\32\3\33\3\33\3\33"+
		"\5\33\u00b4\n\33\3\33\6\33\u00b7\n\33\r\33\16\33\u00b8\5\33\u00bb\n\33"+
		"\3\33\3\33\3\33\6\33\u00c0\n\33\r\33\16\33\u00c1\5\33\u00c4\n\33\3\34"+
		"\3\34\6\34\u00c8\n\34\r\34\16\34\u00c9\3\34\7\34\u00cd\n\34\f\34\16\34"+
		"\u00d0\13\34\6\34\u00d2\n\34\r\34\16\34\u00d3\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00e6\n\35"+
		"\3\36\3\36\3\36\3\36\7\36\u00ec\n\36\f\36\16\36\u00ef\13\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\7\37\u00f7\n\37\f\37\16\37\u00fa\13\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \6 \u0102\n \r \16 \u0103\3 \3 \3\u00f8\2!\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\2+\2-\2/\2\61\2\63\26\65\27\67\309\31;\32=\33?\34\3\2\n"+
		"\3\2\62;\4\2C\\c|\4\2/\60\u0080\u0080\3\2\63;\4\2GGgg\4\2//aa\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u011a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tI\3\2\2\2\13N\3\2\2\2\rU\3\2\2"+
		"\2\17W\3\2\2\2\21Y\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31i\3\2"+
		"\2\2\33k\3\2\2\2\35m\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2"+
		"\'z\3\2\2\2)|\3\2\2\2+~\3\2\2\2-\u0098\3\2\2\2/\u009f\3\2\2\2\61\u00a1"+
		"\3\2\2\2\63\u00ae\3\2\2\2\65\u00c3\3\2\2\2\67\u00d1\3\2\2\29\u00e5\3\2"+
		"\2\2;\u00e7\3\2\2\2=\u00f2\3\2\2\2?\u0101\3\2\2\2AB\7=\2\2B\4\3\2\2\2"+
		"CD\7.\2\2D\6\3\2\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2H\b\3\2\2\2IJ\7e\2\2JK"+
		"\7j\2\2KL\7c\2\2LM\7t\2\2M\n\3\2\2\2NO\7f\2\2OP\7q\2\2PQ\7w\2\2QR\7d\2"+
		"\2RS\7n\2\2ST\7g\2\2T\f\3\2\2\2UV\7]\2\2V\16\3\2\2\2WX\7_\2\2X\20\3\2"+
		"\2\2YZ\7u\2\2Z[\7v\2\2[\\\7t\2\2\\]\7w\2\2]^\7e\2\2^_\7v\2\2_\22\3\2\2"+
		"\2`a\7}\2\2a\24\3\2\2\2bc\7\177\2\2c\26\3\2\2\2de\7x\2\2ef\7q\2\2fg\7"+
		"k\2\2gh\7f\2\2h\30\3\2\2\2ij\7*\2\2j\32\3\2\2\2kl\7+\2\2l\34\3\2\2\2m"+
		"n\7o\2\2no\7c\2\2op\7k\2\2pq\7p\2\2q\36\3\2\2\2rs\7?\2\2s \3\2\2\2tu\7"+
		",\2\2u\"\3\2\2\2vw\7\61\2\2w$\3\2\2\2xy\7-\2\2y&\3\2\2\2z{\7/\2\2{(\3"+
		"\2\2\2|}\t\2\2\2}*\3\2\2\2~\177\t\3\2\2\177,\3\2\2\2\u0080\u0082\5)\25"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\60\2\2"+
		"\u0087\u0089\5)\25\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0099\3\2\2\2\u008c\u008e\5)\25\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0095\7\60\2\2\u0092\u0094\5)\25\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0083\3\2\2\2\u0098"+
		"\u008d\3\2\2\2\u0099.\3\2\2\2\u009a\u009b\7^\2\2\u009b\u00a0\7p\2\2\u009c"+
		"\u009d\7^\2\2\u009d\u00a0\7v\2\2\u009e\u00a0\t\4\2\2\u009f\u009a\3\2\2"+
		"\2\u009f\u009c\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\60\3\2\2\2\u00a1\u00a3"+
		"\7^\2\2\u00a2\u00a4\5)\25\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\62\3\2\2\2\u00a7\u00af\7\62\2"+
		"\2\u00a8\u00aa\t\5\2\2\u00a9\u00ab\5)\25\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00a7\3\2\2\2\u00ae\u00a8\3\2\2\2\u00af\64\3\2\2\2\u00b0\u00ba\5-\27"+
		"\2\u00b1\u00b3\t\6\2\2\u00b2\u00b4\7/\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5)\25\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c4\3\2\2\2\u00bc"+
		"\u00bd\5)\25\2\u00bd\u00bf\t\6\2\2\u00be\u00c0\5)\25\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00b0\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c4\66\3\2\2"+
		"\2\u00c5\u00c8\5+\26\2\u00c6\u00c8\t\7\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00ce\3\2\2\2\u00cb\u00cd\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d48\3\2\2\2\u00d5\u00d6\7)\2\2\u00d6\u00d7"+
		"\5+\26\2\u00d7\u00d8\7)\2\2\u00d8\u00e6\3\2\2\2\u00d9\u00da\7)\2\2\u00da"+
		"\u00db\5)\25\2\u00db\u00dc\7)\2\2\u00dc\u00e6\3\2\2\2\u00dd\u00de\7)\2"+
		"\2\u00de\u00df\5/\30\2\u00df\u00e0\7)\2\2\u00e0\u00e6\3\2\2\2\u00e1\u00e2"+
		"\7)\2\2\u00e2\u00e3\5\61\31\2\u00e3\u00e4\7)\2\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00d5\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e1\3\2"+
		"\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ed"+
		"\3\2\2\2\u00ea\u00ec\n\b\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\b\36\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4"+
		"\7,\2\2\u00f4\u00f8\3\2\2\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7,\2\2\u00fc\u00fd\7\61\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\b\37\2\2\u00ff>\3\2\2\2\u0100\u0102\t\t\2\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b \2\2\u0106@\3\2\2\2\31\2\u0083"+
		"\u008a\u008f\u0095\u0098\u009f\u00a5\u00ac\u00ae\u00b3\u00b8\u00ba\u00c1"+
		"\u00c3\u00c7\u00c9\u00ce\u00d3\u00e5\u00ed\u00f8\u0103\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}