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
	import errorHandler.ErrorHandler;
	import util.ArrayTypeSorter;

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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, REAL_CONSTANT=38, 
		ID=39, CHAR_CONSTANT=40, COMMENT=41, MULTILINE_COMMENT=42, BLANK=43;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_varDef = 2, RULE_type = 3, 
		RULE_primitiveType = 4, RULE_arrayType = 5, RULE_recordType = 6, RULE_field = 7, 
		RULE_idList = 8, RULE_funcDef = 9, RULE_paramList = 10, RULE_param = 11, 
		RULE_block = 12, RULE_stmnt = 13, RULE_ioStmnt = 14, RULE_assignmentStmnt = 15, 
		RULE_returnStmnt = 16, RULE_ifStmnt = 17, RULE_whileStmnt = 18, RULE_exp = 19, 
		RULE_cast = 20, RULE_functInvocation = 21, RULE_expList = 22, RULE_main = 23;
	public static final String[] ruleNames = {
		"program", "definitions", "varDef", "type", "primitiveType", "arrayType", 
		"recordType", "field", "idList", "funcDef", "paramList", "param", "block", 
		"stmnt", "ioStmnt", "assignmentStmnt", "returnStmnt", "ifStmnt", "whileStmnt", 
		"exp", "cast", "functInvocation", "expList", "main"
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
		public Program ast;
		public DefinitionsContext definitions;
		public MainContext main;
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
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
			setState(48);
			((ProgramContext)_localctx).definitions = definitions();
			setState(49);
			((ProgramContext)_localctx).main = main();
			setState(50);
			match(EOF);
				
						List<Definition> defs = ((ProgramContext)_localctx).definitions.ast;
						defs.add(((ProgramContext)_localctx).main.ast);
						((ProgramContext)_localctx).ast =  new Program(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,defs);
					
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
		public List<Definition> ast = new ArrayList<>();;
		public List<Definition> aux = new ArrayList<>();;
		public VarDefContext varDef;
		public FuncDefContext funcDef;
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
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(53);
						((DefinitionsContext)_localctx).varDef = varDef();

										for(VarDefinition def: ((DefinitionsContext)_localctx).varDef.ast){
											_localctx.aux.add(def);
										}
										
						}
						break;
					case 2:
						{
						setState(56);
						((DefinitionsContext)_localctx).funcDef = funcDef();

											_localctx.aux.add(((DefinitionsContext)_localctx).funcDef.ast);
										
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			((DefinitionsContext)_localctx).ast =  _localctx.aux;
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
		public List<VarDefinition> ast = new ArrayList<>();
		public TypeContext type;
		public IdListContext idList;
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
			setState(66);
			((VarDefContext)_localctx).type = type();
			setState(67);
			((VarDefContext)_localctx).idList = idList();
			setState(68);
			match(T__0);

					for(String str: ((VarDefContext)_localctx).idList.ast){
							_localctx.ast.add(new VarDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((VarDefContext)_localctx).type.ast,str));		
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
		public Type ast;
		public PrimitiveTypeContext primitiveType;
		public ArrayTypeContext arrayType;
		public RecordTypeContext recordType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((TypeContext)_localctx).primitiveType = primitiveType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((TypeContext)_localctx).arrayType = arrayType(0);
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).arrayType.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((TypeContext)_localctx).recordType = recordType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).recordType.ast;
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveType);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__1);
				((PrimitiveTypeContext)_localctx).ast =  IntType.getInstance();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__2);
				((PrimitiveTypeContext)_localctx).ast =  RealType.getInstance();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(T__3);
				((PrimitiveTypeContext)_localctx).ast =  CharType.getInstance();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayType ast;
		public ArrayTypeContext t;
		public RecordTypeContext r;
		public Token dim;
		public PrimitiveTypeContext p;
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		return arrayType(0);
	}

	private ArrayTypeContext arrayType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, _parentState);
		ArrayTypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_arrayType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(91);
				((ArrayTypeContext)_localctx).r = recordType();
				setState(92);
				match(T__4);
				setState(93);
				((ArrayTypeContext)_localctx).dim = match(INT_CONSTANT);
				setState(94);
				match(T__5);
				((ArrayTypeContext)_localctx).ast =  ArrayType.insertArrayType((((ArrayTypeContext)_localctx).r!=null?(((ArrayTypeContext)_localctx).r.start):null).getLine(), (((ArrayTypeContext)_localctx).r!=null?(((ArrayTypeContext)_localctx).r.start):null).getCharPositionInLine() + 1, ((ArrayTypeContext)_localctx).r.ast,Integer.parseInt((((ArrayTypeContext)_localctx).dim!=null?((ArrayTypeContext)_localctx).dim.getText():null)));
				}
				break;
			case T__1:
			case T__2:
			case T__3:
				{
				setState(97);
				((ArrayTypeContext)_localctx).p = primitiveType();
				setState(98);
				match(T__4);
				setState(99);
				((ArrayTypeContext)_localctx).dim = match(INT_CONSTANT);
				setState(100);
				match(T__5);
				((ArrayTypeContext)_localctx).ast =  ArrayType.insertArrayType((((ArrayTypeContext)_localctx).p!=null?(((ArrayTypeContext)_localctx).p.start):null).getLine(), (((ArrayTypeContext)_localctx).p!=null?(((ArrayTypeContext)_localctx).p.start):null).getCharPositionInLine() + 1, ((ArrayTypeContext)_localctx).p.ast,Integer.parseInt((((ArrayTypeContext)_localctx).dim!=null?((ArrayTypeContext)_localctx).dim.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(_parentctx, _parentState);
					_localctx.t = _prevctx;
					_localctx.t = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_arrayType);
					setState(105);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(106);
					match(T__4);
					setState(107);
					((ArrayTypeContext)_localctx).dim = match(INT_CONSTANT);
					setState(108);
					match(T__5);
					((ArrayTypeContext)_localctx).ast =  ArrayType.insertArrayType((((ArrayTypeContext)_localctx).t!=null?(((ArrayTypeContext)_localctx).t.start):null).getLine(), (((ArrayTypeContext)_localctx).t!=null?(((ArrayTypeContext)_localctx).t.start):null).getCharPositionInLine() + 1, ((ArrayTypeContext)_localctx).t.ast,Integer.parseInt((((ArrayTypeContext)_localctx).dim!=null?((ArrayTypeContext)_localctx).dim.getText():null)));
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RecordTypeContext extends ParserRuleContext {
		public Type ast;
		public List<Field> fields = new ArrayList<Field>();
		public boolean areRepeated = false;;
		public FieldContext field;
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__6);
			setState(116);
			match(T__7);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				{
				setState(117);
				((RecordTypeContext)_localctx).field = field();

						 	if(_localctx.fields.contains(((RecordTypeContext)_localctx).field.ast)){
						 		((RecordTypeContext)_localctx).areRepeated =  true;
						 	}
						 	else{
						 		_localctx.fields.add(((RecordTypeContext)_localctx).field.ast);
						 	}
						 
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__8);

					 	if(_localctx.areRepeated){
					 		new ErrorType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,"The struct has repeated recordDef");
					 	}		 		
					 	((RecordTypeContext)_localctx).ast =  new RecordType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,_localctx.fields);
					 
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

	public static class FieldContext extends ParserRuleContext {
		public Field ast;
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((FieldContext)_localctx).type = type();
			setState(129);
			((FieldContext)_localctx).ID = match(ID);
			setState(130);
			match(T__0);
			((FieldContext)_localctx).ast =  new Field(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FieldContext)_localctx).type.ast,((FieldContext)_localctx).ID.getText());
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
		public List<String> ast = new ArrayList<String>();
		public Token id1;
		public Token id2;
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
		enterRule(_localctx, 16, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((IdListContext)_localctx).id1 = match(ID);
			 _localctx.ast.add(((IdListContext)_localctx).id1.getText()); 
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(135);
				match(T__9);
				setState(136);
				((IdListContext)_localctx).id2 = match(ID);
				 _localctx.ast.add(((IdListContext)_localctx).id2.getText()); 
				}
				}
				setState(142);
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

	public static class FuncDefContext extends ParserRuleContext {
		public FuncDefinition ast;
		public PrimitiveTypeContext primitiveType;
		public Token ID;
		public ParamListContext paramList;
		public BlockContext block;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDef);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				((FuncDefContext)_localctx).primitiveType = primitiveType();
				setState(144);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(145);
				match(T__10);
				setState(146);
				((FuncDefContext)_localctx).paramList = paramList();
				setState(147);
				match(T__11);
				setState(148);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FuncDefContext)_localctx).primitiveType.ast,((FuncDefContext)_localctx).paramList.ast),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__12);
				setState(152);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(153);
				match(T__10);
				setState(154);
				((FuncDefContext)_localctx).paramList = paramList();
				setState(155);
				match(T__11);
				setState(156);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,VoidType.getInstance(),((FuncDefContext)_localctx).paramList.ast),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				((FuncDefContext)_localctx).primitiveType = primitiveType();
				setState(160);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(161);
				match(T__10);
				setState(162);
				match(T__11);
				setState(163);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FuncDefContext)_localctx).primitiveType.ast,(List)new ArrayList<Statement>()),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(T__12);
				setState(167);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(168);
				match(T__10);
				setState(169);
				match(T__11);
				setState(170);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,VoidType.getInstance(),(List)new ArrayList<Statement>()),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();;
		public ParamContext p1;
		public ParamContext p2;
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
		enterRule(_localctx, 20, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((ParamListContext)_localctx).p1 = param();
			_localctx.ast.add(((ParamListContext)_localctx).p1.ast);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(177);
				match(T__9);
				setState(178);
				((ParamListContext)_localctx).p2 = param();
				_localctx.ast.add(((ParamListContext)_localctx).p2.ast);
				}
				}
				setState(185);
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
		public VarDefinition ast;
		public PrimitiveTypeContext primitiveType;
		public Token ID;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((ParamContext)_localctx).primitiveType = primitiveType();
			setState(187);
			((ParamContext)_localctx).ID = match(ID);
			((ParamContext)_localctx).ast =  new VarDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ParamContext)_localctx).primitiveType.ast,((ParamContext)_localctx).ID.getText());
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

	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();;
		public VarDefContext varDef;
		public StmntContext stmnt;
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			int _alt;
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__7);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(191);
					((BlockContext)_localctx).varDef = varDef();

								for(Statement st: ((BlockContext)_localctx).varDef.ast){
										_localctx.ast.add(st);
								}
								
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(199);
					((BlockContext)_localctx).stmnt = stmnt();

								for(Statement st: ((BlockContext)_localctx).stmnt.ast){
										_localctx.ast.add(st);
								}
								
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__8);
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__3:
			case T__6:
			case T__8:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case ID:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(208);
						((BlockContext)_localctx).varDef = varDef();

									for(Statement st: ((BlockContext)_localctx).varDef.ast){
											_localctx.ast.add(st);
									}
									
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216);
						((BlockContext)_localctx).stmnt = stmnt();

									for(Statement st: ((BlockContext)_localctx).stmnt.ast){
											_localctx.ast.add(st);
									}
									
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
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

	public static class StmntContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();;
		public IoStmntContext ioStmnt;
		public AssignmentStmntContext assignmentStmnt;
		public ReturnStmntContext returnStmnt;
		public IfStmntContext ifStmnt;
		public WhileStmntContext whileStmnt;
		public FunctInvocationContext functInvocation;
		public IoStmntContext ioStmnt() {
			return getRuleContext(IoStmntContext.class,0);
		}
		public AssignmentStmntContext assignmentStmnt() {
			return getRuleContext(AssignmentStmntContext.class,0);
		}
		public ReturnStmntContext returnStmnt() {
			return getRuleContext(ReturnStmntContext.class,0);
		}
		public IfStmntContext ifStmnt() {
			return getRuleContext(IfStmntContext.class,0);
		}
		public WhileStmntContext whileStmnt() {
			return getRuleContext(WhileStmntContext.class,0);
		}
		public FunctInvocationContext functInvocation() {
			return getRuleContext(FunctInvocationContext.class,0);
		}
		public StmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmnt; }
	}

	public final StmntContext stmnt() throws RecognitionException {
		StmntContext _localctx = new StmntContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmnt);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((StmntContext)_localctx).ioStmnt = ioStmnt();
				((StmntContext)_localctx).ast =  ((StmntContext)_localctx).ioStmnt.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((StmntContext)_localctx).assignmentStmnt = assignmentStmnt();
				_localctx.ast.add(((StmntContext)_localctx).assignmentStmnt.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				((StmntContext)_localctx).returnStmnt = returnStmnt();
				_localctx.ast.add(((StmntContext)_localctx).returnStmnt.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				((StmntContext)_localctx).ifStmnt = ifStmnt();
				_localctx.ast.add(((StmntContext)_localctx).ifStmnt.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				((StmntContext)_localctx).whileStmnt = whileStmnt();
				_localctx.ast.add(((StmntContext)_localctx).whileStmnt.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				((StmntContext)_localctx).functInvocation = functInvocation();
				setState(242);
				match(T__0);
				_localctx.ast.add(((StmntContext)_localctx).functInvocation.ast);
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

	public static class IoStmntContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public ExpListContext expList;
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public IoStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStmnt; }
	}

	public final IoStmntContext ioStmnt() throws RecognitionException {
		IoStmntContext _localctx = new IoStmntContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ioStmnt);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__13);
				setState(248);
				((IoStmntContext)_localctx).expList = expList();
				setState(249);
				match(T__0);

								for(Expression exp: ((IoStmntContext)_localctx).expList.ast){
									_localctx.ast.add(new Write(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,exp));
								}
							
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__14);
				setState(253);
				((IoStmntContext)_localctx).expList = expList();
				setState(254);
				match(T__0);

								for(Expression exp: ((IoStmntContext)_localctx).expList.ast){
									_localctx.ast.add(new Read(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,exp));
								}
							
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

	public static class AssignmentStmntContext extends ParserRuleContext {
		public Assignment ast;
		public ExpContext exp1;
		public ExpContext exp2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AssignmentStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmnt; }
	}

	public final AssignmentStmntContext assignmentStmnt() throws RecognitionException {
		AssignmentStmntContext _localctx = new AssignmentStmntContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((AssignmentStmntContext)_localctx).exp1 = exp(0);
			setState(260);
			match(T__15);
			setState(261);
			((AssignmentStmntContext)_localctx).exp2 = exp(0);
			setState(262);
			match(T__0);
			((AssignmentStmntContext)_localctx).ast =  new Assignment(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((AssignmentStmntContext)_localctx).exp1.ast,((AssignmentStmntContext)_localctx).exp2.ast);
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

	public static class ReturnStmntContext extends ParserRuleContext {
		public ReturnStmnt ast;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmnt; }
	}

	public final ReturnStmntContext returnStmnt() throws RecognitionException {
		ReturnStmntContext _localctx = new ReturnStmntContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__16);
			setState(266);
			((ReturnStmntContext)_localctx).exp = exp(0);
			setState(267);
			match(T__0);
			((ReturnStmntContext)_localctx).ast =  new ReturnStmnt(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ReturnStmntContext)_localctx).exp.ast);
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

	public static class IfStmntContext extends ParserRuleContext {
		public IfStmnt ast;
		public ExpContext exp;
		public BlockContext block;
		public BlockContext b1;
		public BlockContext b2;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmnt; }
	}

	public final IfStmntContext ifStmnt() throws RecognitionException {
		IfStmntContext _localctx = new IfStmntContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStmnt);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__17);
				setState(271);
				match(T__10);
				setState(272);
				((IfStmntContext)_localctx).exp = exp(0);
				setState(273);
				match(T__11);
				setState(274);
				((IfStmntContext)_localctx).block = block();
				((IfStmntContext)_localctx).ast =  new IfStmnt(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((IfStmntContext)_localctx).exp.ast,((IfStmntContext)_localctx).block.ast,new ArrayList<Statement>());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__17);
				setState(278);
				match(T__10);
				setState(279);
				((IfStmntContext)_localctx).exp = exp(0);
				setState(280);
				match(T__11);
				setState(281);
				((IfStmntContext)_localctx).b1 = block();
				setState(282);
				match(T__18);
				setState(283);
				((IfStmntContext)_localctx).b2 = block();
				((IfStmntContext)_localctx).ast =  new IfStmnt(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((IfStmntContext)_localctx).exp.ast,((IfStmntContext)_localctx).b1.ast,((IfStmntContext)_localctx).b2.ast);
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

	public static class WhileStmntContext extends ParserRuleContext {
		public WhileStmnt ast;
		public ExpContext exp;
		public BlockContext block;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmnt; }
	}

	public final WhileStmntContext whileStmnt() throws RecognitionException {
		WhileStmntContext _localctx = new WhileStmntContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__19);
			setState(289);
			match(T__10);
			setState(290);
			((WhileStmntContext)_localctx).exp = exp(0);
			setState(291);
			match(T__11);
			setState(292);
			((WhileStmntContext)_localctx).block = block();
			((WhileStmntContext)_localctx).ast =  new WhileStmnt(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((WhileStmntContext)_localctx).exp.ast,((WhileStmntContext)_localctx).block.ast);
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

	public static class ExpContext extends ParserRuleContext {
		public Expression ast;
		public ExpContext exp1;
		public ExpContext exp;
		public CastContext cast;
		public Token REAL_CONSTANT;
		public Token INT_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public FunctInvocationContext functInvocation;
		public ExpContext exp2;
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FunctInvocationContext functInvocation() {
			return getRuleContext(FunctInvocationContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(296);
				match(T__10);
				setState(297);
				((ExpContext)_localctx).exp = exp(0);
				setState(298);
				match(T__11);
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).exp.ast;
				}
				break;
			case 2:
				{
				setState(301);
				((ExpContext)_localctx).cast = cast();
				setState(302);
				((ExpContext)_localctx).exp = exp(12);
				 ((ExpContext)_localctx).ast =  new Cast(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).cast.ast, ((ExpContext)_localctx).exp.ast);
				}
				break;
			case 3:
				{
				setState(305);
				match(T__21);
				setState(306);
				((ExpContext)_localctx).exp = exp(11);
				((ExpContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp.ast);
				}
				break;
			case 4:
				{
				setState(309);
				match(T__22);
				setState(310);
				((ExpContext)_localctx).exp = exp(10);
				((ExpContext)_localctx).ast =  new UnaryNegation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp.ast);
				}
				break;
			case 5:
				{
				setState(313);
				((ExpContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpContext)_localctx).ast =  new RealLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpContext)_localctx).REAL_CONSTANT!=null?((ExpContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(315);
				((ExpContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpContext)_localctx).INT_CONSTANT!=null?((ExpContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(317);
				((ExpContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpContext)_localctx).CHAR_CONSTANT!=null?((ExpContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(319);
				((ExpContext)_localctx).ID = match(ID);
				 ((ExpContext)_localctx).ast =  new Variable(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,(((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null)); 
				}
				break;
			case 9:
				{
				setState(321);
				((ExpContext)_localctx).functInvocation = functInvocation();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).functInvocation.ast;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(326);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(327);
						match(T__20);
						setState(328);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(14);
						((ExpContext)_localctx).ast =  new FieldAccessExpr(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,(((ExpContext)_localctx).exp2!=null?_input.getText(((ExpContext)_localctx).exp2.start,((ExpContext)_localctx).exp2.stop):null));
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(331);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(332);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(10);
						((ExpContext)_localctx).ast =  new Arithmetic(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).op.getText(),((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(336);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(337);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__26) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(338);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(9);
						((ExpContext)_localctx).ast =  new Arithmetic(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).op.getText(),((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(341);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(342);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(8);
						((ExpContext)_localctx).ast =  new Comparison(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).op.getText(),((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(346);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(347);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(348);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(7);
						((ExpContext)_localctx).ast =  new Logical(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).op.getText(),((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(351);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(352);
						match(T__4);
						setState(353);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(0);
						setState(354);
						match(T__5);
						((ExpContext)_localctx).ast =  new Indexing(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).exp2.ast);
						}
						break;
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext primitiveType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__10);
			setState(363);
			((CastContext)_localctx).primitiveType = primitiveType();
			setState(364);
			match(T__11);
			((CastContext)_localctx).ast =  ((CastContext)_localctx).primitiveType.ast;
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

	public static class FunctInvocationContext extends ParserRuleContext {
		public FunctionInvocation ast;
		public Token ID;
		public ExpListContext expList;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public FunctInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functInvocation; }
	}

	public final FunctInvocationContext functInvocation() throws RecognitionException {
		FunctInvocationContext _localctx = new FunctInvocationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functInvocation);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				((FunctInvocationContext)_localctx).ID = match(ID);
				setState(368);
				match(T__10);
				setState(369);
				((FunctInvocationContext)_localctx).expList = expList();
				setState(370);
				match(T__11);
				((FunctInvocationContext)_localctx).ast =  new FunctionInvocation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((FunctInvocationContext)_localctx).ID.getLine(),((FunctInvocationContext)_localctx).ID.getCharPositionInLine()+1,((FunctInvocationContext)_localctx).ID.getText()),((FunctInvocationContext)_localctx).expList.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((FunctInvocationContext)_localctx).ID = match(ID);
				setState(374);
				match(T__10);
				setState(375);
				match(T__11);
				((FunctInvocationContext)_localctx).ast =  new FunctionInvocation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((FunctInvocationContext)_localctx).ID.getLine(),((FunctInvocationContext)_localctx).ID.getCharPositionInLine()+1,((FunctInvocationContext)_localctx).ID.getText()),new ArrayList<Expression>());
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

	public static class ExpListContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpContext exp1;
		public ExpContext exp2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			((ExpListContext)_localctx).exp1 = exp(0);
			_localctx.ast.add(((ExpListContext)_localctx).exp1.ast);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(381);
				match(T__9);
				setState(382);
				((ExpListContext)_localctx).exp2 = exp(0);
				_localctx.ast.add(((ExpListContext)_localctx).exp2.ast);
				}
				}
				setState(389);
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

	public static class MainContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token void1;
		public Token main1;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((MainContext)_localctx).void1 = match(T__12);
			setState(391);
			((MainContext)_localctx).main1 = match(T__35);
			setState(392);
			match(T__10);
			setState(393);
			match(T__11);
			setState(394);
			((MainContext)_localctx).block = block();

					((MainContext)_localctx).ast =  new FuncDefinition(((MainContext)_localctx).main1.getLine(),((MainContext)_localctx).main1.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,VoidType.getInstance(),(List)new ArrayList<Statement>()),(((MainContext)_localctx).main1!=null?((MainContext)_localctx).main1.getText():null),((MainContext)_localctx).block.ast);
				
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return arrayType_sempred((ArrayTypeContext)_localctx, predIndex);
		case 19:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arrayType_sempred(ArrayTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00b0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b8\n\f\f\f\16\f\u00bb"+
		"\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00c5\n\16\f\16\16\16\u00c8"+
		"\13\16\3\16\3\16\3\16\7\16\u00cd\n\16\f\16\16\16\u00d0\13\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00d6\n\16\f\16\16\16\u00d9\13\16\3\16\3\16\3\16\7\16"+
		"\u00de\n\16\f\16\16\16\u00e1\13\16\5\16\u00e3\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00f8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0104\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0121\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0147\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0168\n\25\f\25\16\25\u016b\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u017c\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0184\n\30\f\30\16"+
		"\30\u0187\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\2\4\f(\32\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\32\34\4\2\30\30"+
		"\35\35\3\2\36#\3\2$%\2\u01a1\2\62\3\2\2\2\4?\3\2\2\2\6D\3\2\2\2\bR\3\2"+
		"\2\2\nZ\3\2\2\2\fi\3\2\2\2\16u\3\2\2\2\20\u0082\3\2\2\2\22\u0087\3\2\2"+
		"\2\24\u00af\3\2\2\2\26\u00b1\3\2\2\2\30\u00bc\3\2\2\2\32\u00e2\3\2\2\2"+
		"\34\u00f7\3\2\2\2\36\u0103\3\2\2\2 \u0105\3\2\2\2\"\u010b\3\2\2\2$\u0120"+
		"\3\2\2\2&\u0122\3\2\2\2(\u0146\3\2\2\2*\u016c\3\2\2\2,\u017b\3\2\2\2."+
		"\u017d\3\2\2\2\60\u0188\3\2\2\2\62\63\5\4\3\2\63\64\5\60\31\2\64\65\7"+
		"\2\2\3\65\66\b\2\1\2\66\3\3\2\2\2\678\5\6\4\289\b\3\1\29>\3\2\2\2:;\5"+
		"\24\13\2;<\b\3\1\2<>\3\2\2\2=\67\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\b\3\1\2C\5\3\2\2\2DE\5\b\5\2EF\5\22\n"+
		"\2FG\7\3\2\2GH\b\4\1\2H\7\3\2\2\2IJ\5\n\6\2JK\b\5\1\2KS\3\2\2\2LM\5\f"+
		"\7\2MN\b\5\1\2NS\3\2\2\2OP\5\16\b\2PQ\b\5\1\2QS\3\2\2\2RI\3\2\2\2RL\3"+
		"\2\2\2RO\3\2\2\2S\t\3\2\2\2TU\7\4\2\2U[\b\6\1\2VW\7\5\2\2W[\b\6\1\2XY"+
		"\7\6\2\2Y[\b\6\1\2ZT\3\2\2\2ZV\3\2\2\2ZX\3\2\2\2[\13\3\2\2\2\\]\b\7\1"+
		"\2]^\5\16\b\2^_\7\7\2\2_`\7\'\2\2`a\7\b\2\2ab\b\7\1\2bj\3\2\2\2cd\5\n"+
		"\6\2de\7\7\2\2ef\7\'\2\2fg\7\b\2\2gh\b\7\1\2hj\3\2\2\2i\\\3\2\2\2ic\3"+
		"\2\2\2jr\3\2\2\2kl\f\5\2\2lm\7\7\2\2mn\7\'\2\2no\7\b\2\2oq\b\7\1\2pk\3"+
		"\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tr\3\2\2\2uv\7\t\2\2v|"+
		"\7\n\2\2wx\5\20\t\2xy\b\b\1\2y{\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\b\b\1"+
		"\2\u0081\17\3\2\2\2\u0082\u0083\5\b\5\2\u0083\u0084\7)\2\2\u0084\u0085"+
		"\7\3\2\2\u0085\u0086\b\t\1\2\u0086\21\3\2\2\2\u0087\u0088\7)\2\2\u0088"+
		"\u008e\b\n\1\2\u0089\u008a\7\f\2\2\u008a\u008b\7)\2\2\u008b\u008d\b\n"+
		"\1\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5\n\6"+
		"\2\u0092\u0093\7)\2\2\u0093\u0094\7\r\2\2\u0094\u0095\5\26\f\2\u0095\u0096"+
		"\7\16\2\2\u0096\u0097\5\32\16\2\u0097\u0098\b\13\1\2\u0098\u00b0\3\2\2"+
		"\2\u0099\u009a\7\17\2\2\u009a\u009b\7)\2\2\u009b\u009c\7\r\2\2\u009c\u009d"+
		"\5\26\f\2\u009d\u009e\7\16\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\b\13"+
		"\1\2\u00a0\u00b0\3\2\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00a3\7)\2\2\u00a3"+
		"\u00a4\7\r\2\2\u00a4\u00a5\7\16\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7"+
		"\b\13\1\2\u00a7\u00b0\3\2\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\7)\2\2"+
		"\u00aa\u00ab\7\r\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad\5\32\16\2\u00ad"+
		"\u00ae\b\13\1\2\u00ae\u00b0\3\2\2\2\u00af\u0091\3\2\2\2\u00af\u0099\3"+
		"\2\2\2\u00af\u00a1\3\2\2\2\u00af\u00a8\3\2\2\2\u00b0\25\3\2\2\2\u00b1"+
		"\u00b2\5\30\r\2\u00b2\u00b9\b\f\1\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\5"+
		"\30\r\2\u00b5\u00b6\b\f\1\2\u00b6\u00b8\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\27\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7)\2\2\u00be\u00bf"+
		"\b\r\1\2\u00bf\31\3\2\2\2\u00c0\u00c6\7\n\2\2\u00c1\u00c2\5\6\4\2\u00c2"+
		"\u00c3\b\16\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ce\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\b\16\1\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00e3\7\13"+
		"\2\2\u00d2\u00d3\5\6\4\2\u00d3\u00d4\b\16\1\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00df\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\5\34\17\2\u00db"+
		"\u00dc\b\16\1\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00c0\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e3\33\3\2\2"+
		"\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\b\17\1\2\u00e6\u00f8\3\2\2\2\u00e7"+
		"\u00e8\5 \21\2\u00e8\u00e9\b\17\1\2\u00e9\u00f8\3\2\2\2\u00ea\u00eb\5"+
		"\"\22\2\u00eb\u00ec\b\17\1\2\u00ec\u00f8\3\2\2\2\u00ed\u00ee\5$\23\2\u00ee"+
		"\u00ef\b\17\1\2\u00ef\u00f8\3\2\2\2\u00f0\u00f1\5&\24\2\u00f1\u00f2\b"+
		"\17\1\2\u00f2\u00f8\3\2\2\2\u00f3\u00f4\5,\27\2\u00f4\u00f5\7\3\2\2\u00f5"+
		"\u00f6\b\17\1\2\u00f6\u00f8\3\2\2\2\u00f7\u00e4\3\2\2\2\u00f7\u00e7\3"+
		"\2\2\2\u00f7\u00ea\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7"+
		"\u00f3\3\2\2\2\u00f8\35\3\2\2\2\u00f9\u00fa\7\20\2\2\u00fa\u00fb\5.\30"+
		"\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\b\20\1\2\u00fd\u0104\3\2\2\2\u00fe"+
		"\u00ff\7\21\2\2\u00ff\u0100\5.\30\2\u0100\u0101\7\3\2\2\u0101\u0102\b"+
		"\20\1\2\u0102\u0104\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00fe\3\2\2\2\u0104"+
		"\37\3\2\2\2\u0105\u0106\5(\25\2\u0106\u0107\7\22\2\2\u0107\u0108\5(\25"+
		"\2\u0108\u0109\7\3\2\2\u0109\u010a\b\21\1\2\u010a!\3\2\2\2\u010b\u010c"+
		"\7\23\2\2\u010c\u010d\5(\25\2\u010d\u010e\7\3\2\2\u010e\u010f\b\22\1\2"+
		"\u010f#\3\2\2\2\u0110\u0111\7\24\2\2\u0111\u0112\7\r\2\2\u0112\u0113\5"+
		"(\25\2\u0113\u0114\7\16\2\2\u0114\u0115\5\32\16\2\u0115\u0116\b\23\1\2"+
		"\u0116\u0121\3\2\2\2\u0117\u0118\7\24\2\2\u0118\u0119\7\r\2\2\u0119\u011a"+
		"\5(\25\2\u011a\u011b\7\16\2\2\u011b\u011c\5\32\16\2\u011c\u011d\7\25\2"+
		"\2\u011d\u011e\5\32\16\2\u011e\u011f\b\23\1\2\u011f\u0121\3\2\2\2\u0120"+
		"\u0110\3\2\2\2\u0120\u0117\3\2\2\2\u0121%\3\2\2\2\u0122\u0123\7\26\2\2"+
		"\u0123\u0124\7\r\2\2\u0124\u0125\5(\25\2\u0125\u0126\7\16\2\2\u0126\u0127"+
		"\5\32\16\2\u0127\u0128\b\24\1\2\u0128\'\3\2\2\2\u0129\u012a\b\25\1\2\u012a"+
		"\u012b\7\r\2\2\u012b\u012c\5(\25\2\u012c\u012d\7\16\2\2\u012d\u012e\b"+
		"\25\1\2\u012e\u0147\3\2\2\2\u012f\u0130\5*\26\2\u0130\u0131\5(\25\16\u0131"+
		"\u0132\b\25\1\2\u0132\u0147\3\2\2\2\u0133\u0134\7\30\2\2\u0134\u0135\5"+
		"(\25\r\u0135\u0136\b\25\1\2\u0136\u0147\3\2\2\2\u0137\u0138\7\31\2\2\u0138"+
		"\u0139\5(\25\f\u0139\u013a\b\25\1\2\u013a\u0147\3\2\2\2\u013b\u013c\7"+
		"(\2\2\u013c\u0147\b\25\1\2\u013d\u013e\7\'\2\2\u013e\u0147\b\25\1\2\u013f"+
		"\u0140\7*\2\2\u0140\u0147\b\25\1\2\u0141\u0142\7)\2\2\u0142\u0147\b\25"+
		"\1\2\u0143\u0144\5,\27\2\u0144\u0145\b\25\1\2\u0145\u0147\3\2\2\2\u0146"+
		"\u0129\3\2\2\2\u0146\u012f\3\2\2\2\u0146\u0133\3\2\2\2\u0146\u0137\3\2"+
		"\2\2\u0146\u013b\3\2\2\2\u0146\u013d\3\2\2\2\u0146\u013f\3\2\2\2\u0146"+
		"\u0141\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u0169\3\2\2\2\u0148\u0149\f\17"+
		"\2\2\u0149\u014a\7\27\2\2\u014a\u014b\5(\25\20\u014b\u014c\b\25\1\2\u014c"+
		"\u0168\3\2\2\2\u014d\u014e\f\13\2\2\u014e\u014f\t\2\2\2\u014f\u0150\5"+
		"(\25\f\u0150\u0151\b\25\1\2\u0151\u0168\3\2\2\2\u0152\u0153\f\n\2\2\u0153"+
		"\u0154\t\3\2\2\u0154\u0155\5(\25\13\u0155\u0156\b\25\1\2\u0156\u0168\3"+
		"\2\2\2\u0157\u0158\f\t\2\2\u0158\u0159\t\4\2\2\u0159\u015a\5(\25\n\u015a"+
		"\u015b\b\25\1\2\u015b\u0168\3\2\2\2\u015c\u015d\f\b\2\2\u015d\u015e\t"+
		"\5\2\2\u015e\u015f\5(\25\t\u015f\u0160\b\25\1\2\u0160\u0168\3\2\2\2\u0161"+
		"\u0162\f\20\2\2\u0162\u0163\7\7\2\2\u0163\u0164\5(\25\2\u0164\u0165\7"+
		"\b\2\2\u0165\u0166\b\25\1\2\u0166\u0168\3\2\2\2\u0167\u0148\3\2\2\2\u0167"+
		"\u014d\3\2\2\2\u0167\u0152\3\2\2\2\u0167\u0157\3\2\2\2\u0167\u015c\3\2"+
		"\2\2\u0167\u0161\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a)\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7\r\2\2"+
		"\u016d\u016e\5\n\6\2\u016e\u016f\7\16\2\2\u016f\u0170\b\26\1\2\u0170+"+
		"\3\2\2\2\u0171\u0172\7)\2\2\u0172\u0173\7\r\2\2\u0173\u0174\5.\30\2\u0174"+
		"\u0175\7\16\2\2\u0175\u0176\b\27\1\2\u0176\u017c\3\2\2\2\u0177\u0178\7"+
		")\2\2\u0178\u0179\7\r\2\2\u0179\u017a\7\16\2\2\u017a\u017c\b\27\1\2\u017b"+
		"\u0171\3\2\2\2\u017b\u0177\3\2\2\2\u017c-\3\2\2\2\u017d\u017e\5(\25\2"+
		"\u017e\u0185\b\30\1\2\u017f\u0180\7\f\2\2\u0180\u0181\5(\25\2\u0181\u0182"+
		"\b\30\1\2\u0182\u0184\3\2\2\2\u0183\u017f\3\2\2\2\u0184\u0187\3\2\2\2"+
		"\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186/\3\2\2\2\u0187\u0185\3"+
		"\2\2\2\u0188\u0189\7\17\2\2\u0189\u018a\7&\2\2\u018a\u018b\7\r\2\2\u018b"+
		"\u018c\7\16\2\2\u018c\u018d\5\32\16\2\u018d\u018e\b\31\1\2\u018e\61\3"+
		"\2\2\2\31=?RZir|\u008e\u00af\u00b9\u00c6\u00ce\u00d7\u00df\u00e2\u00f7"+
		"\u0103\u0120\u0146\u0167\u0169\u017b\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}