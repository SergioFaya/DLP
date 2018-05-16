// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;

	import ast.*;
	import ast.program.*;
	import ast.program.expressions.*;
	import ast.program.expressions.unary.*;
	import ast.program.expressions.operands.*;
	import ast.program.expressions.literal.*;
	import ast.program.statements.*;
	import ast.program.expstmnt.*;
	import ast.program.types.*;
	import ast.program.types.primitive.*;
	import ast.program.definitions.*;
	import parser.LexerHelper;
	import errorHandler.ErrorHandler;
	import util.ArrayTypeSorter;

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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_CONSTANT=39, REAL_CONSTANT=40, ID=41, CHAR_CONSTANT=42, COMMENT=43, 
		MULTILINE_COMMENT=44, BLANK=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "DIGIT", "LETTER", "FIXED_POINT", 
		"SPECIAL_CHAR", "ASCII", "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", 
		"COMMENT", "MULTILINE_COMMENT", "BLANK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'int'", "'double'", "'char'", "'['", "']'", "'struct'", 
		"'{'", "'}'", "','", "'('", "')'", "'void'", "'++'", "'--'", "'write'", 
		"'read'", "'='", "'return'", "'if'", "'else'", "'while'", "'.'", "'-'", 
		"'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", 
		"'=='", "'&&'", "'||'", "'main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", 
		"COMMENT", "MULTILINE_COMMENT", "BLANK"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0166\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\7*\u00ea"+
		"\n*\f*\16*\u00ed\13*\3*\3*\6*\u00f1\n*\r*\16*\u00f2\3*\6*\u00f6\n*\r*"+
		"\16*\u00f7\3*\3*\7*\u00fc\n*\f*\16*\u00ff\13*\5*\u0101\n*\3+\3+\3+\3+"+
		"\3+\5+\u0108\n+\3,\3,\6,\u010c\n,\r,\16,\u010d\3-\3-\3-\7-\u0113\n-\f"+
		"-\16-\u0116\13-\5-\u0118\n-\3.\3.\3.\3.\5.\u011e\n.\3.\6.\u0121\n.\r."+
		"\16.\u0122\3.\3.\3.\6.\u0128\n.\r.\16.\u0129\5.\u012c\n.\3/\3/\6/\u0130"+
		"\n/\r/\16/\u0131\3/\7/\u0135\n/\f/\16/\u0138\13/\6/\u013a\n/\r/\16/\u013b"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u0143\n\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\7\61\u014b\n\61\f\61\16\61\u014e\13\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\7\62\u0156\n\62\f\62\16\62\u0159\13\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\6\63\u0161\n\63\r\63\16\63\u0162\3\63\3\63\3\u0157\2\64\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O\2Q\2S\2U\2W\2Y)[*]+_,a-c.e/\3\2\b\3\2\62;\4\2C\\c|\3\2\63;\4"+
		"\2GGgg\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0179\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7m\3\2\2\2\tt\3\2\2\2\13y\3"+
		"\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\u0084\3\2\2\2\23\u0086\3\2\2\2\25\u0088"+
		"\3\2\2\2\27\u008a\3\2\2\2\31\u008c\3\2\2\2\33\u008e\3\2\2\2\35\u0093\3"+
		"\2\2\2\37\u0096\3\2\2\2!\u0099\3\2\2\2#\u009f\3\2\2\2%\u00a4\3\2\2\2\'"+
		"\u00a6\3\2\2\2)\u00ad\3\2\2\2+\u00b0\3\2\2\2-\u00b5\3\2\2\2/\u00bb\3\2"+
		"\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c1\3\2\2\2\67\u00c3\3\2\2"+
		"\29\u00c5\3\2\2\2;\u00c7\3\2\2\2=\u00c9\3\2\2\2?\u00cb\3\2\2\2A\u00ce"+
		"\3\2\2\2C\u00d0\3\2\2\2E\u00d3\3\2\2\2G\u00d6\3\2\2\2I\u00d9\3\2\2\2K"+
		"\u00dc\3\2\2\2M\u00df\3\2\2\2O\u00e4\3\2\2\2Q\u00e6\3\2\2\2S\u0100\3\2"+
		"\2\2U\u0107\3\2\2\2W\u0109\3\2\2\2Y\u0117\3\2\2\2[\u012b\3\2\2\2]\u0139"+
		"\3\2\2\2_\u013d\3\2\2\2a\u0146\3\2\2\2c\u0151\3\2\2\2e\u0160\3\2\2\2g"+
		"h\7=\2\2h\4\3\2\2\2ij\7k\2\2jk\7p\2\2kl\7v\2\2l\6\3\2\2\2mn\7f\2\2no\7"+
		"q\2\2op\7w\2\2pq\7d\2\2qr\7n\2\2rs\7g\2\2s\b\3\2\2\2tu\7e\2\2uv\7j\2\2"+
		"vw\7c\2\2wx\7t\2\2x\n\3\2\2\2yz\7]\2\2z\f\3\2\2\2{|\7_\2\2|\16\3\2\2\2"+
		"}~\7u\2\2~\177\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7w\2\2\u0081\u0082"+
		"\7e\2\2\u0082\u0083\7v\2\2\u0083\20\3\2\2\2\u0084\u0085\7}\2\2\u0085\22"+
		"\3\2\2\2\u0086\u0087\7\177\2\2\u0087\24\3\2\2\2\u0088\u0089\7.\2\2\u0089"+
		"\26\3\2\2\2\u008a\u008b\7*\2\2\u008b\30\3\2\2\2\u008c\u008d\7+\2\2\u008d"+
		"\32\3\2\2\2\u008e\u008f\7x\2\2\u008f\u0090\7q\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7f\2\2\u0092\34\3\2\2\2\u0093\u0094\7-\2\2\u0094\u0095\7-\2\2\u0095"+
		"\36\3\2\2\2\u0096\u0097\7/\2\2\u0097\u0098\7/\2\2\u0098 \3\2\2\2\u0099"+
		"\u009a\7y\2\2\u009a\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7g\2\2\u009e\"\3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g"+
		"\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7f\2\2\u00a3$\3\2\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"(\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7h\2\2\u00af*\3\2\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		",\3\2\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc"+
		"\60\3\2\2\2\u00bd\u00be\7/\2\2\u00be\62\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0"+
		"\64\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4"+
		"8\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8"+
		"<\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7>\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7"+
		">\2\2\u00d1\u00d2\7?\2\2\u00d2D\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5F\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8\7?\2\2\u00d8H\3"+
		"\2\2\2\u00d9\u00da\7(\2\2\u00da\u00db\7(\2\2\u00dbJ\3\2\2\2\u00dc\u00dd"+
		"\7~\2\2\u00dd\u00de\7~\2\2\u00deL\3\2\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3N\3\2\2\2\u00e4\u00e5"+
		"\t\2\2\2\u00e5P\3\2\2\2\u00e6\u00e7\t\3\2\2\u00e7R\3\2\2\2\u00e8\u00ea"+
		"\5O(\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\7\60"+
		"\2\2\u00ef\u00f1\5O(\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u0101\3\2\2\2\u00f4\u00f6\5O(\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\7\60\2\2\u00fa\u00fc\5O(\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00eb\3\2\2\2\u0100"+
		"\u00f5\3\2\2\2\u0101T\3\2\2\2\u0102\u0103\7^\2\2\u0103\u0108\7p\2\2\u0104"+
		"\u0105\7^\2\2\u0105\u0108\7v\2\2\u0106\u0108\13\2\2\2\u0107\u0102\3\2"+
		"\2\2\u0107\u0104\3\2\2\2\u0107\u0106\3\2\2\2\u0108V\3\2\2\2\u0109\u010b"+
		"\7^\2\2\u010a\u010c\5O(\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010eX\3\2\2\2\u010f\u0118\7\62\2\2"+
		"\u0110\u0114\t\4\2\2\u0111\u0113\5O(\2\u0112\u0111\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0110\3\2\2\2\u0118Z\3\2\2\2"+
		"\u0119\u012c\5S*\2\u011a\u011b\5S*\2\u011b\u011d\t\5\2\2\u011c\u011e\7"+
		"/\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u0121\5O(\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2"+
		"\2\u0122\u0123\3\2\2\2\u0123\u012c\3\2\2\2\u0124\u0125\5O(\2\u0125\u0127"+
		"\t\5\2\2\u0126\u0128\5O(\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0119\3\2"+
		"\2\2\u012b\u011a\3\2\2\2\u012b\u0124\3\2\2\2\u012c\\\3\2\2\2\u012d\u0130"+
		"\5Q)\2\u012e\u0130\7a\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0136\3\2"+
		"\2\2\u0133\u0135\t\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u012f\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c^\3\2\2\2\u013d\u0142\7)\2\2\u013e\u0143\5Q)\2\u013f"+
		"\u0143\5O(\2\u0140\u0143\5U+\2\u0141\u0143\5W,\2\u0142\u013e\3\2\2\2\u0142"+
		"\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\7)\2\2\u0145`\3\2\2\2\u0146\u0147\7\61\2\2\u0147\u0148"+
		"\7\61\2\2\u0148\u014c\3\2\2\2\u0149\u014b\n\6\2\2\u014a\u0149\3\2\2\2"+
		"\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\b\61\2\2\u0150b\3\2\2\2\u0151"+
		"\u0152\7\61\2\2\u0152\u0153\7,\2\2\u0153\u0157\3\2\2\2\u0154\u0156\13"+
		"\2\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7,"+
		"\2\2\u015b\u015c\7\61\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b\62\2\2\u015e"+
		"d\3\2\2\2\u015f\u0161\t\7\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2"+
		"\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165"+
		"\b\63\2\2\u0165f\3\2\2\2\30\2\u00eb\u00f2\u00f7\u00fd\u0100\u0107\u010d"+
		"\u0114\u0117\u011d\u0122\u0129\u012b\u012f\u0131\u0136\u013b\u0142\u014c"+
		"\u0157\u0162\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}