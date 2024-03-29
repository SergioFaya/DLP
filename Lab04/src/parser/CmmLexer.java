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
	import java.util.*;
	import parser.LexerHelper;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, REAL_CONSTANT=38, 
		ID=39, CHAR_CONSTANT=40, COMMENT=41, MULTILINE_COMMENT=42, BLANK=43;
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
		"T__33", "T__34", "T__35", "DIGIT", "LETTER", "FIXED_POINT", "SPECIAL_CHAR", 
		"ASCII", "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT", 
		"MULTILINE_COMMENT", "BLANK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'int'", "'double'", "'char'", "'['", "']'", "'struct'", 
		"'{'", "'}'", "','", "'('", "')'", "'void'", "'write'", "'read'", "'='", 
		"'return'", "'if'", "'else'", "'while'", "'.'", "'-'", "'!'", "'*'", "'/'", 
		"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
		"'main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u015d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3&\3&\3\'\3\'\3(\7(\u00e0\n(\f(\16(\u00e3\13(\3(\3(\6(\u00e7\n(\r"+
		"(\16(\u00e8\3(\6(\u00ec\n(\r(\16(\u00ed\3(\3(\7(\u00f2\n(\f(\16(\u00f5"+
		"\13(\5(\u00f7\n(\3)\3)\3)\3)\3)\5)\u00fe\n)\3*\3*\6*\u0102\n*\r*\16*\u0103"+
		"\3+\3+\3+\7+\u0109\n+\f+\16+\u010c\13+\5+\u010e\n+\3,\3,\3,\5,\u0113\n"+
		",\3,\6,\u0116\n,\r,\16,\u0117\5,\u011a\n,\3,\3,\3,\6,\u011f\n,\r,\16,"+
		"\u0120\5,\u0123\n,\3-\3-\6-\u0127\n-\r-\16-\u0128\3-\7-\u012c\n-\f-\16"+
		"-\u012f\13-\6-\u0131\n-\r-\16-\u0132\3.\3.\3.\3.\3.\5.\u013a\n.\3.\3."+
		"\3/\3/\3/\3/\7/\u0142\n/\f/\16/\u0145\13/\3/\3/\3\60\3\60\3\60\3\60\7"+
		"\60\u014d\n\60\f\60\16\60\u0150\13\60\3\60\3\60\3\60\3\60\3\60\3\61\6"+
		"\61\u0158\n\61\r\61\16\61\u0159\3\61\3\61\3\u014e\2\62\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\2M\2O\2Q\2S\2U\'W(Y)[*]+_,a-\3\2\n\3\2\62;\4\2C\\c|\4\2/\60\u0080\u0080"+
		"\3\2\63;\4\2GGgg\4\2//aa\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0170\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7i\3\2\2\2\tp\3\2\2\2\13u\3\2"+
		"\2\2\rw\3\2\2\2\17y\3\2\2\2\21\u0080\3\2\2\2\23\u0082\3\2\2\2\25\u0084"+
		"\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008a\3\2\2\2\35\u008f\3"+
		"\2\2\2\37\u0095\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u00a3\3\2\2\2\'"+
		"\u00a6\3\2\2\2)\u00ab\3\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2"+
		"\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2"+
		"\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c4\3\2\2\2?\u00c6\3\2\2\2A\u00c9"+
		"\3\2\2\2C\u00cc\3\2\2\2E\u00cf\3\2\2\2G\u00d2\3\2\2\2I\u00d5\3\2\2\2K"+
		"\u00da\3\2\2\2M\u00dc\3\2\2\2O\u00f6\3\2\2\2Q\u00fd\3\2\2\2S\u00ff\3\2"+
		"\2\2U\u010d\3\2\2\2W\u0122\3\2\2\2Y\u0130\3\2\2\2[\u0134\3\2\2\2]\u013d"+
		"\3\2\2\2_\u0148\3\2\2\2a\u0157\3\2\2\2cd\7=\2\2d\4\3\2\2\2ef\7k\2\2fg"+
		"\7p\2\2gh\7v\2\2h\6\3\2\2\2ij\7f\2\2jk\7q\2\2kl\7w\2\2lm\7d\2\2mn\7n\2"+
		"\2no\7g\2\2o\b\3\2\2\2pq\7e\2\2qr\7j\2\2rs\7c\2\2st\7t\2\2t\n\3\2\2\2"+
		"uv\7]\2\2v\f\3\2\2\2wx\7_\2\2x\16\3\2\2\2yz\7u\2\2z{\7v\2\2{|\7t\2\2|"+
		"}\7w\2\2}~\7e\2\2~\177\7v\2\2\177\20\3\2\2\2\u0080\u0081\7}\2\2\u0081"+
		"\22\3\2\2\2\u0082\u0083\7\177\2\2\u0083\24\3\2\2\2\u0084\u0085\7.\2\2"+
		"\u0085\26\3\2\2\2\u0086\u0087\7*\2\2\u0087\30\3\2\2\2\u0088\u0089\7+\2"+
		"\2\u0089\32\3\2\2\2\u008a\u008b\7x\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7f\2\2\u008e\34\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7k\2\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094"+
		"\36\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7f\2\2\u0099 \3\2\2\2\u009a\u009b\7?\2\2\u009b\"\3\2\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7w\2\2"+
		"\u00a0\u00a1\7t\2\2\u00a1\u00a2\7p\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7k\2"+
		"\2\u00a4\u00a5\7h\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7"+
		"n\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2\u00aa(\3\2\2\2\u00ab\u00ac"+
		"\7y\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7\60\2\2\u00b2,\3\2\2\2\u00b3"+
		"\u00b4\7/\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\60\3\2\2\2\u00b7"+
		"\u00b8\7,\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\64\3\2\2\2\u00bb"+
		"\u00bc\7\'\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7-\2\2\u00be8\3\2\2\2\u00bf"+
		"\u00c0\7@\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c3\7?\2\2\u00c3"+
		"<\3\2\2\2\u00c4\u00c5\7>\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8"+
		"\7?\2\2\u00c8@\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb\7?\2\2\u00cbB\3"+
		"\2\2\2\u00cc\u00cd\7?\2\2\u00cd\u00ce\7?\2\2\u00ceD\3\2\2\2\u00cf\u00d0"+
		"\7(\2\2\u00d0\u00d1\7(\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7~\2\2\u00d3\u00d4"+
		"\7~\2\2\u00d4H\3\2\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7p\2\2\u00d9J\3\2\2\2\u00da\u00db\t\2\2\2\u00dbL\3"+
		"\2\2\2\u00dc\u00dd\t\3\2\2\u00ddN\3\2\2\2\u00de\u00e0\5K&\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\7\60\2\2\u00e5\u00e7\5"+
		"K&\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00f7\3\2\2\2\u00ea\u00ec\5K&\2\u00eb\u00ea\3\2\2"+
		"\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f3\7\60\2\2\u00f0\u00f2\5K&\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00e1\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f7"+
		"P\3\2\2\2\u00f8\u00f9\7^\2\2\u00f9\u00fe\7p\2\2\u00fa\u00fb\7^\2\2\u00fb"+
		"\u00fe\7v\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fa\3\2"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00feR\3\2\2\2\u00ff\u0101\7^\2\2\u0100\u0102"+
		"\5K&\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104T\3\2\2\2\u0105\u010e\7\62\2\2\u0106\u010a\t\5\2\2"+
		"\u0107\u0109\5K&\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0105\3\2\2\2\u010d\u0106\3\2\2\2\u010eV\3\2\2\2\u010f\u0119\5O(\2\u0110"+
		"\u0112\t\6\2\2\u0111\u0113\7/\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5K&\2\u0115\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0110\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0123\3\2\2\2\u011b\u011c\5K"+
		"&\2\u011c\u011e\t\6\2\2\u011d\u011f\5K&\2\u011e\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u010f\3\2\2\2\u0122\u011b\3\2\2\2\u0123X\3\2\2\2\u0124\u0127\5M\'\2\u0125"+
		"\u0127\t\7\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\3\2\2\2\u012a"+
		"\u012c\t\2\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0126\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133Z\3\2\2\2\u0134\u0139\7)\2\2\u0135\u013a\5M\'\2\u0136\u013a"+
		"\5K&\2\u0137\u013a\5Q)\2\u0138\u013a\5S*\2\u0139\u0135\3\2\2\2\u0139\u0136"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\7)\2\2\u013c\\\3\2\2\2\u013d\u013e\7\61\2\2\u013e\u013f\7\61\2"+
		"\2\u013f\u0143\3\2\2\2\u0140\u0142\n\b\2\2\u0141\u0140\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\b/\2\2\u0147^\3\2\2\2\u0148\u0149\7\61\2\2"+
		"\u0149\u014a\7,\2\2\u014a\u014e\3\2\2\2\u014b\u014d\13\2\2\2\u014c\u014b"+
		"\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7,\2\2\u0152\u0153\7\61"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\60\2\2\u0155`\3\2\2\2\u0156\u0158"+
		"\t\t\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\61\2\2\u015cb\3\2\2\2"+
		"\31\2\u00e1\u00e8\u00ed\u00f3\u00f6\u00fd\u0103\u010a\u010d\u0112\u0117"+
		"\u0119\u0120\u0122\u0126\u0128\u012d\u0132\u0139\u0143\u014e\u0159\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}