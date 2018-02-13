// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, INT_CONSTANT=20, REAL_CONSTANT=21, ID=22, CHAR_CONSTANT=23, 
		COMMENT=24, MULTILINE_COMMENT=25, BLANK=26;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_varDef = 2, RULE_idList = 3, 
		RULE_primitiveType = 4, RULE_type = 5, RULE_arrayDef = 6, RULE_dimSize = 7, 
		RULE_struct = 8, RULE_funcDef = 9, RULE_main = 10, RULE_statements = 11, 
		RULE_paramList = 12, RULE_param = 13, RULE_statement = 14, RULE_expression = 15, 
		RULE_assingment = 16, RULE_arithmetic = 17, RULE_unaryMinus = 18;
	public static final String[] ruleNames = {
		"program", "definitions", "varDef", "idList", "primitiveType", "type", 
		"arrayDef", "dimSize", "struct", "funcDef", "main", "statements", "paramList", 
		"param", "statement", "expression", "assingment", "arithmetic", "unaryMinus"
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

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			definitions();
			setState(39);
			main();
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

	public static class DefinitionsContext extends ParserRuleContext {
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(41);
						varDef();
						}
						break;
					case 2:
						{
						setState(42);
						funcDef();
						}
						break;
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class VarDefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			type();
			setState(49);
			idList();
			setState(50);
			match(T__0);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(53);
				match(T__1);
				setState(54);
				match(ID);
				}
				}
				setState(59);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayDefContext arrayDef() {
			return getRuleContext(ArrayDefContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				arrayDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				struct();
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

	public static class ArrayDefContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimSizeContext dimSize() {
			return getRuleContext(DimSizeContext.class,0);
		}
		public ArrayDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDef; }
	}

	public final ArrayDefContext arrayDef() throws RecognitionException {
		ArrayDefContext _localctx = new ArrayDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			primitiveType();
			setState(68);
			dimSize();
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

	public static class DimSizeContext extends ParserRuleContext {
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public DimSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimSize; }
	}

	public final DimSizeContext dimSize() throws RecognitionException {
		DimSizeContext _localctx = new DimSizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dimSize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				match(T__5);
				setState(71);
				match(INT_CONSTANT);
				setState(72);
				match(T__6);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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

	public static class StructContext extends ParserRuleContext {
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__7);
			setState(78);
			match(T__8);
			setState(79);
			match(T__9);
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

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
				{
				setState(81);
				primitiveType();
				}
				break;
			case T__10:
				{
				setState(82);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85);
			match(ID);
			setState(86);
			match(T__11);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__7))) != 0)) {
				{
				setState(87);
				paramList();
				}
			}

			setState(90);
			match(T__12);
			setState(91);
			match(T__8);
			setState(92);
			match(T__9);
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

	public static class MainContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__10);
			setState(95);
			match(T__13);
			setState(96);
			match(T__11);
			setState(97);
			match(T__12);
			setState(98);
			match(T__8);
			setState(99);
			varDef();
			setState(100);
			statements();
			setState(101);
			match(T__9);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			param();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(106);
				match(T__1);
				setState(107);
				param();
				}
				}
				setState(112);
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

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			type();
			setState(114);
			match(ID);
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
		public AssingmentContext assingment() {
			return getRuleContext(AssingmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			assingment();
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
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				unaryMinus();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(ID);
				}
				break;
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(INT_CONSTANT);
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

	public static class AssingmentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssingmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingment; }
	}

	public final AssingmentContext assingment() throws RecognitionException {
		AssingmentContext _localctx = new AssingmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assingment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expression();
			setState(124);
			match(T__14);
			setState(125);
			expression();
			setState(126);
			match(T__0);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmetic);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				expression();
				setState(129);
				match(T__15);
				setState(130);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				expression();
				setState(133);
				match(T__16);
				setState(134);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				expression();
				setState(137);
				match(T__17);
				setState(138);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				expression();
				setState(141);
				match(T__18);
				setState(142);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(INT_CONSTANT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(REAL_CONSTANT);
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

	public static class UnaryMinusContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public UnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMinus; }
	}

	public final UnaryMinusContext unaryMinus() throws RecognitionException {
		UnaryMinusContext _localctx = new UnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__18);
			setState(150);
			match(INT_CONSTANT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\6\3\6\3\7\3\7\3\7\5"+
		"\7D\n\7\3\b\3\b\3\b\3\t\3\t\3\t\6\tL\n\t\r\t\16\tM\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\5\13V\n\13\3\13\3\13\3\13\5\13[\n\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16o\n\16\f\16\16"+
		"\16r\13\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21|\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0096\n\23\3\24\3\24\3\24"+
		"\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\5\7\2"+
		"\u0098\2(\3\2\2\2\4/\3\2\2\2\6\62\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2\fC\3"+
		"\2\2\2\16E\3\2\2\2\20K\3\2\2\2\22O\3\2\2\2\24U\3\2\2\2\26`\3\2\2\2\30"+
		"i\3\2\2\2\32k\3\2\2\2\34s\3\2\2\2\36v\3\2\2\2 {\3\2\2\2\"}\3\2\2\2$\u0095"+
		"\3\2\2\2&\u0097\3\2\2\2()\5\4\3\2)*\5\26\f\2*\3\3\2\2\2+.\5\6\4\2,.\5"+
		"\24\13\2-+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3"+
		"\2\2\2\61/\3\2\2\2\62\63\5\f\7\2\63\64\5\b\5\2\64\65\7\3\2\2\65\7\3\2"+
		"\2\2\66;\7\30\2\2\678\7\4\2\28:\7\30\2\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<\t\3\2\2\2=;\3\2\2\2>?\t\2\2\2?\13\3\2\2\2@D\5\n\6\2AD\5"+
		"\16\b\2BD\5\22\n\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\r\3\2\2\2EF\5\n\6\2"+
		"FG\5\20\t\2G\17\3\2\2\2HI\7\b\2\2IJ\7\26\2\2JL\7\t\2\2KH\3\2\2\2LM\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2N\21\3\2\2\2OP\7\n\2\2PQ\7\13\2\2QR\7\f\2\2R\23"+
		"\3\2\2\2SV\5\n\6\2TV\7\r\2\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\7\30\2\2"+
		"XZ\7\16\2\2Y[\5\32\16\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\17\2\2]^\7"+
		"\13\2\2^_\7\f\2\2_\25\3\2\2\2`a\7\r\2\2ab\7\20\2\2bc\7\16\2\2cd\7\17\2"+
		"\2de\7\13\2\2ef\5\6\4\2fg\5\30\r\2gh\7\f\2\2h\27\3\2\2\2ij\3\2\2\2j\31"+
		"\3\2\2\2kp\5\34\17\2lm\7\4\2\2mo\5\34\17\2nl\3\2\2\2or\3\2\2\2pn\3\2\2"+
		"\2pq\3\2\2\2q\33\3\2\2\2rp\3\2\2\2st\5\f\7\2tu\7\30\2\2u\35\3\2\2\2vw"+
		"\5\"\22\2w\37\3\2\2\2x|\5&\24\2y|\7\30\2\2z|\7\26\2\2{x\3\2\2\2{y\3\2"+
		"\2\2{z\3\2\2\2|!\3\2\2\2}~\5 \21\2~\177\7\21\2\2\177\u0080\5 \21\2\u0080"+
		"\u0081\7\3\2\2\u0081#\3\2\2\2\u0082\u0083\5 \21\2\u0083\u0084\7\22\2\2"+
		"\u0084\u0085\5 \21\2\u0085\u0096\3\2\2\2\u0086\u0087\5 \21\2\u0087\u0088"+
		"\7\23\2\2\u0088\u0089\5 \21\2\u0089\u0096\3\2\2\2\u008a\u008b\5 \21\2"+
		"\u008b\u008c\7\24\2\2\u008c\u008d\5 \21\2\u008d\u0096\3\2\2\2\u008e\u008f"+
		"\5 \21\2\u008f\u0090\7\25\2\2\u0090\u0091\5 \21\2\u0091\u0096\3\2\2\2"+
		"\u0092\u0096\7\30\2\2\u0093\u0096\7\26\2\2\u0094\u0096\7\27\2\2\u0095"+
		"\u0082\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008e\3\2"+
		"\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"%\3\2\2\2\u0097\u0098\7\25\2\2\u0098\u0099\7\26\2\2\u0099\'\3\2\2\2\f"+
		"-/;CMUZp{\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}