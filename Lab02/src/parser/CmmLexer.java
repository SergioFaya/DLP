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
		INT_CONSTANT=1, REAL_CONSTANT=2, ID=3, CHAR_CONSTANT=4, COMMENT=5, MULTILINE_COMMENT=6, 
		BLANK=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "LETTER", "FIXED_POINT", "SPECIAL_CHAR", "ASCII", "INT_CONSTANT", 
		"REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT", "MULTILINE_COMMENT", 
		"BLANK"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT", 
		"MULTILINE_COMMENT", "BLANK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u00a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\7\4!\n\4\f\4\16\4$\13\4\3\4"+
		"\3\4\6\4(\n\4\r\4\16\4)\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\7\4\63\n\4\f\4"+
		"\16\4\66\13\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\6\6C\n\6\r"+
		"\6\16\6D\3\7\3\7\3\7\6\7J\n\7\r\7\16\7K\5\7N\n\7\3\b\3\b\3\b\5\bS\n\b"+
		"\3\b\6\bV\n\b\r\b\16\bW\5\bZ\n\b\3\b\3\b\3\b\6\b_\n\b\r\b\16\b`\5\bc\n"+
		"\b\3\t\3\t\6\tg\n\t\r\t\16\th\3\t\7\tl\n\t\f\t\16\to\13\t\6\tq\n\t\r\t"+
		"\16\tr\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0085\n\n\3\13\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\6\r\u00a1\n\r\r\r\16\r\u00a2\3\r\3\r\3\u0097\2\16\3"+
		"\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\3\2\n\3\2\62;\4"+
		"\2C\\c|\4\2/\60\u0080\u0080\3\2\63;\4\2GGgg\4\2//aa\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\2\u00b9\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2"+
		"\7\67\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rM\3\2\2\2\17b\3\2\2\2\21p\3\2\2"+
		"\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0091\3\2\2\2\31\u00a0\3\2\2\2"+
		"\33\34\t\2\2\2\34\4\3\2\2\2\35\36\t\3\2\2\36\6\3\2\2\2\37!\5\3\2\2 \37"+
		"\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%\'\7\60"+
		"\2\2&(\5\3\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*8\3\2\2\2+-\5"+
		"\3\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\64\7\60"+
		"\2\2\61\63\5\3\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\67\"\3\2\2\2\67,\3\2\2\28\b\3\2\2\29:\7"+
		"^\2\2:?\7p\2\2;<\7^\2\2<?\7v\2\2=?\t\4\2\2>9\3\2\2\2>;\3\2\2\2>=\3\2\2"+
		"\2?\n\3\2\2\2@B\7^\2\2AC\5\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2"+
		"\2E\f\3\2\2\2FN\7\62\2\2GI\t\5\2\2HJ\5\3\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2LN\3\2\2\2MF\3\2\2\2MG\3\2\2\2N\16\3\2\2\2OY\5\7\4\2PR\t"+
		"\6\2\2QS\7/\2\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\5\3\2\2UT\3\2\2\2VW\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YP\3\2\2\2YZ\3\2\2\2Zc\3\2\2\2[\\"+
		"\5\3\2\2\\^\t\6\2\2]_\5\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"ac\3\2\2\2bO\3\2\2\2b[\3\2\2\2c\20\3\2\2\2dg\5\5\3\2eg\t\7\2\2fd\3\2\2"+
		"\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2im\3\2\2\2jl\t\2\2\2kj\3\2\2"+
		"\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pf\3\2\2\2qr\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2s\22\3\2\2\2tu\7)\2\2uv\5\5\3\2vw\7)\2\2w\u0085"+
		"\3\2\2\2xy\7)\2\2yz\5\3\2\2z{\7)\2\2{\u0085\3\2\2\2|}\7)\2\2}~\5\t\5\2"+
		"~\177\7)\2\2\177\u0085\3\2\2\2\u0080\u0081\7)\2\2\u0081\u0082\5\13\6\2"+
		"\u0082\u0083\7)\2\2\u0083\u0085\3\2\2\2\u0084t\3\2\2\2\u0084x\3\2\2\2"+
		"\u0084|\3\2\2\2\u0084\u0080\3\2\2\2\u0085\24\3\2\2\2\u0086\u0087\7\61"+
		"\2\2\u0087\u0088\7\61\2\2\u0088\u008c\3\2\2\2\u0089\u008b\n\b\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\13\2\2\u0090"+
		"\26\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2"+
		"\2\u0094\u0096\13\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\7,\2\2\u009b\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\b\f\2\2\u009e\30\3\2\2\2\u009f\u00a1\t\t\2\2\u00a0\u009f\3\2\2"+
		"\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\b\r\2\2\u00a5\32\3\2\2\2\31\2\").\64\67>DKMRWY`b"+
		"fhmr\u0084\u008c\u0097\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}