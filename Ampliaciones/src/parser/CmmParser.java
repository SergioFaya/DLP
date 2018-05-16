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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_CONSTANT=39, REAL_CONSTANT=40, ID=41, CHAR_CONSTANT=42, COMMENT=43, 
		MULTILINE_COMMENT=44, BLANK=45;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_varDef = 2, RULE_type = 3, 
		RULE_primitiveType = 4, RULE_arrayType = 5, RULE_recordType = 6, RULE_field = 7, 
		RULE_idList = 8, RULE_funcDef = 9, RULE_paramList = 10, RULE_param = 11, 
		RULE_block = 12, RULE_stmnt = 13, RULE_unaryIncDec = 14, RULE_ioStmnt = 15, 
		RULE_assignmentStmnt = 16, RULE_returnStmnt = 17, RULE_ifStmnt = 18, RULE_whileStmnt = 19, 
		RULE_exp = 20, RULE_cast = 21, RULE_functInvocation = 22, RULE_expList = 23, 
		RULE_main = 24;
	public static final String[] ruleNames = {
		"program", "definitions", "varDef", "type", "primitiveType", "arrayType", 
		"recordType", "field", "idList", "funcDef", "paramList", "param", "block", 
		"stmnt", "unaryIncDec", "ioStmnt", "assignmentStmnt", "returnStmnt", "ifStmnt", 
		"whileStmnt", "exp", "cast", "functInvocation", "expList", "main"
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
			setState(50);
			((ProgramContext)_localctx).definitions = definitions();
			setState(51);
			((ProgramContext)_localctx).main = main();
			setState(52);
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
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(55);
						((DefinitionsContext)_localctx).varDef = varDef();

										for(VarDefinition def: ((DefinitionsContext)_localctx).varDef.ast){
											_localctx.aux.add(def);
										}
										
						}
						break;
					case 2:
						{
						setState(58);
						((DefinitionsContext)_localctx).funcDef = funcDef();

											_localctx.aux.add(((DefinitionsContext)_localctx).funcDef.ast);
										
						}
						break;
					}
					} 
				}
				setState(65);
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
			setState(68);
			((VarDefContext)_localctx).type = type();
			setState(69);
			((VarDefContext)_localctx).idList = idList();
			setState(70);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((TypeContext)_localctx).primitiveType = primitiveType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((TypeContext)_localctx).arrayType = arrayType(0);
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).arrayType.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__1);
				((PrimitiveTypeContext)_localctx).ast =  IntType.getInstance();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__2);
				((PrimitiveTypeContext)_localctx).ast =  RealType.getInstance();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(93);
				((ArrayTypeContext)_localctx).r = recordType();
				setState(94);
				match(T__4);
				setState(95);
				((ArrayTypeContext)_localctx).dim = match(INT_CONSTANT);
				setState(96);
				match(T__5);
				((ArrayTypeContext)_localctx).ast =  ArrayType.insertArrayType((((ArrayTypeContext)_localctx).r!=null?(((ArrayTypeContext)_localctx).r.start):null).getLine(), (((ArrayTypeContext)_localctx).r!=null?(((ArrayTypeContext)_localctx).r.start):null).getCharPositionInLine() + 1, ((ArrayTypeContext)_localctx).r.ast,Integer.parseInt((((ArrayTypeContext)_localctx).dim!=null?((ArrayTypeContext)_localctx).dim.getText():null)));
				}
				break;
			case T__1:
			case T__2:
			case T__3:
				{
				setState(99);
				((ArrayTypeContext)_localctx).p = primitiveType();
				setState(100);
				match(T__4);
				setState(101);
				((ArrayTypeContext)_localctx).dim = match(INT_CONSTANT);
				setState(102);
				match(T__5);
				((ArrayTypeContext)_localctx).ast =  ArrayType.insertArrayType((((ArrayTypeContext)_localctx).p!=null?(((ArrayTypeContext)_localctx).p.start):null).getLine(), (((ArrayTypeContext)_localctx).p!=null?(((ArrayTypeContext)_localctx).p.start):null).getCharPositionInLine() + 1, ((ArrayTypeContext)_localctx).p.ast,Integer.parseInt((((ArrayTypeContext)_localctx).dim!=null?((ArrayTypeContext)_localctx).dim.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
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
					setState(107);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(108);
					match(T__4);
					setState(109);
					((ArrayTypeContext)_localctx).dim = match(INT_CONSTANT);
					setState(110);
					match(T__5);
					((ArrayTypeContext)_localctx).ast =  ArrayType.insertArrayType((((ArrayTypeContext)_localctx).t!=null?(((ArrayTypeContext)_localctx).t.start):null).getLine(), (((ArrayTypeContext)_localctx).t!=null?(((ArrayTypeContext)_localctx).t.start):null).getCharPositionInLine() + 1, ((ArrayTypeContext)_localctx).t.ast,Integer.parseInt((((ArrayTypeContext)_localctx).dim!=null?((ArrayTypeContext)_localctx).dim.getText():null)));
					}
					} 
				}
				setState(116);
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
			setState(117);
			match(T__6);
			setState(118);
			match(T__7);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				{
				setState(119);
				((RecordTypeContext)_localctx).field = field();

						 	if(_localctx.fields.contains(((RecordTypeContext)_localctx).field.ast)){
						 		((RecordTypeContext)_localctx).areRepeated =  true;
						 	}
						 	else{
						 		_localctx.fields.add(((RecordTypeContext)_localctx).field.ast);
						 	}
						 
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
			setState(130);
			((FieldContext)_localctx).type = type();
			setState(131);
			((FieldContext)_localctx).ID = match(ID);
			setState(132);
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
			setState(135);
			((IdListContext)_localctx).id1 = match(ID);
			 _localctx.ast.add(((IdListContext)_localctx).id1.getText()); 
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(137);
				match(T__9);
				setState(138);
				((IdListContext)_localctx).id2 = match(ID);
				 _localctx.ast.add(((IdListContext)_localctx).id2.getText()); 
				}
				}
				setState(144);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((FuncDefContext)_localctx).primitiveType = primitiveType();
				setState(146);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(147);
				match(T__10);
				setState(148);
				((FuncDefContext)_localctx).paramList = paramList();
				setState(149);
				match(T__11);
				setState(150);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FuncDefContext)_localctx).primitiveType.ast,((FuncDefContext)_localctx).paramList.ast),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__12);
				setState(154);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(155);
				match(T__10);
				setState(156);
				((FuncDefContext)_localctx).paramList = paramList();
				setState(157);
				match(T__11);
				setState(158);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,VoidType.getInstance(),((FuncDefContext)_localctx).paramList.ast),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				((FuncDefContext)_localctx).primitiveType = primitiveType();
				setState(162);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(163);
				match(T__10);
				setState(164);
				match(T__11);
				setState(165);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FuncDefContext)_localctx).primitiveType.ast,(List)new ArrayList<Statement>()),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__12);
				setState(169);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(170);
				match(T__10);
				setState(171);
				match(T__11);
				setState(172);
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
			setState(177);
			((ParamListContext)_localctx).p1 = param();
			_localctx.ast.add(((ParamListContext)_localctx).p1.ast);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(179);
				match(T__9);
				setState(180);
				((ParamListContext)_localctx).p2 = param();
				_localctx.ast.add(((ParamListContext)_localctx).p2.ast);
				}
				}
				setState(187);
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
			setState(188);
			((ParamContext)_localctx).primitiveType = primitiveType();
			setState(189);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__7);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(193);
					((BlockContext)_localctx).varDef = varDef();
					_localctx.ast.addAll(((BlockContext)_localctx).varDef.ast);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(201);
					((BlockContext)_localctx).stmnt = stmnt();
					_localctx.ast.addAll(((BlockContext)_localctx).stmnt.ast);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(T__8);
				}
				break;
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__18:
			case T__19:
			case T__21:
			case T__23:
			case T__24:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case ID:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(210);
				((BlockContext)_localctx).stmnt = stmnt();
				_localctx.ast.addAll(((BlockContext)_localctx).stmnt.ast);
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
		public UnaryIncDecContext unaryIncDec;
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
		public UnaryIncDecContext unaryIncDec() {
			return getRuleContext(UnaryIncDecContext.class,0);
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
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((StmntContext)_localctx).ioStmnt = ioStmnt();
				((StmntContext)_localctx).ast =  ((StmntContext)_localctx).ioStmnt.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				((StmntContext)_localctx).assignmentStmnt = assignmentStmnt();
				_localctx.ast.add(((StmntContext)_localctx).assignmentStmnt.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				((StmntContext)_localctx).returnStmnt = returnStmnt();
				_localctx.ast.add(((StmntContext)_localctx).returnStmnt.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				((StmntContext)_localctx).ifStmnt = ifStmnt();
				_localctx.ast.add(((StmntContext)_localctx).ifStmnt.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				((StmntContext)_localctx).whileStmnt = whileStmnt();
				_localctx.ast.add(((StmntContext)_localctx).whileStmnt.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				((StmntContext)_localctx).functInvocation = functInvocation();
				setState(231);
				match(T__0);
				_localctx.ast.add(((StmntContext)_localctx).functInvocation.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				((StmntContext)_localctx).unaryIncDec = unaryIncDec();
				setState(235);
				match(T__0);
				_localctx.ast.add(((StmntContext)_localctx).unaryIncDec.ast);
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

	public static class UnaryIncDecContext extends ParserRuleContext {
		public UnaryIncrementDecrement ast;
		public Token ID;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public UnaryIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryIncDec; }
	}

	public final UnaryIncDecContext unaryIncDec() throws RecognitionException {
		UnaryIncDecContext _localctx = new UnaryIncDecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryIncDec);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((UnaryIncDecContext)_localctx).ID = match(ID);
				setState(241);
				match(T__13);
				((UnaryIncDecContext)_localctx).ast =  new UnaryIncrementDecrement(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((UnaryIncDecContext)_localctx).ID.getLine(),((UnaryIncDecContext)_localctx).ID.getCharPositionInLine()+1,((UnaryIncDecContext)_localctx).ID.getText()),"++",false);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				((UnaryIncDecContext)_localctx).ID = match(ID);
				setState(244);
				match(T__14);
				((UnaryIncDecContext)_localctx).ast =  new UnaryIncrementDecrement(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((UnaryIncDecContext)_localctx).ID.getLine(),((UnaryIncDecContext)_localctx).ID.getCharPositionInLine()+1,((UnaryIncDecContext)_localctx).ID.getText()),"--",false);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(T__13);
				setState(247);
				((UnaryIncDecContext)_localctx).ID = match(ID);
				((UnaryIncDecContext)_localctx).ast =  new UnaryIncrementDecrement(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((UnaryIncDecContext)_localctx).ID.getLine(),((UnaryIncDecContext)_localctx).ID.getCharPositionInLine()+1,((UnaryIncDecContext)_localctx).ID.getText()),"++",true);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(T__14);
				setState(250);
				((UnaryIncDecContext)_localctx).ID = match(ID);
				((UnaryIncDecContext)_localctx).ast =  new UnaryIncrementDecrement(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((UnaryIncDecContext)_localctx).ID.getLine(),((UnaryIncDecContext)_localctx).ID.getCharPositionInLine()+1,((UnaryIncDecContext)_localctx).ID.getText()),"--",true);
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
		enterRule(_localctx, 30, RULE_ioStmnt);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__15);
				setState(255);
				((IoStmntContext)_localctx).expList = expList();
				setState(256);
				match(T__0);

								for(Expression exp: ((IoStmntContext)_localctx).expList.ast){
									_localctx.ast.add(new Write(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,exp));
								}
							
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__16);
				setState(260);
				((IoStmntContext)_localctx).expList = expList();
				setState(261);
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
		enterRule(_localctx, 32, RULE_assignmentStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			((AssignmentStmntContext)_localctx).exp1 = exp(0);
			setState(267);
			match(T__17);
			setState(268);
			((AssignmentStmntContext)_localctx).exp2 = exp(0);
			setState(269);
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
		enterRule(_localctx, 34, RULE_returnStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__18);
			setState(273);
			((ReturnStmntContext)_localctx).exp = exp(0);
			setState(274);
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
		enterRule(_localctx, 36, RULE_ifStmnt);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__19);
				setState(278);
				match(T__10);
				setState(279);
				((IfStmntContext)_localctx).exp = exp(0);
				setState(280);
				match(T__11);
				setState(281);
				((IfStmntContext)_localctx).block = block();
				((IfStmntContext)_localctx).ast =  new IfStmnt(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((IfStmntContext)_localctx).exp.ast,((IfStmntContext)_localctx).block.ast,new ArrayList<Statement>());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__19);
				setState(285);
				match(T__10);
				setState(286);
				((IfStmntContext)_localctx).exp = exp(0);
				setState(287);
				match(T__11);
				setState(288);
				((IfStmntContext)_localctx).b1 = block();
				setState(289);
				match(T__20);
				setState(290);
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
		enterRule(_localctx, 38, RULE_whileStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__21);
			setState(296);
			match(T__10);
			setState(297);
			((WhileStmntContext)_localctx).exp = exp(0);
			setState(298);
			match(T__11);
			setState(299);
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
		public UnaryIncDecContext unaryIncDec;
		public Token op;
		public ExpContext exp2;
		public Token id;
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
		public UnaryIncDecContext unaryIncDec() {
			return getRuleContext(UnaryIncDecContext.class,0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(303);
				match(T__10);
				setState(304);
				((ExpContext)_localctx).exp = exp(0);
				setState(305);
				match(T__11);
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).exp.ast;
				}
				break;
			case 2:
				{
				setState(308);
				((ExpContext)_localctx).cast = cast();
				setState(309);
				((ExpContext)_localctx).exp = exp(13);
				 ((ExpContext)_localctx).ast =  new Cast(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).cast.ast, ((ExpContext)_localctx).exp.ast);
				}
				break;
			case 3:
				{
				setState(312);
				match(T__23);
				setState(313);
				((ExpContext)_localctx).exp = exp(12);
				((ExpContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp.ast);
				}
				break;
			case 4:
				{
				setState(316);
				match(T__24);
				setState(317);
				((ExpContext)_localctx).exp = exp(11);
				((ExpContext)_localctx).ast =  new UnaryNegation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp.ast);
				}
				break;
			case 5:
				{
				setState(320);
				((ExpContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpContext)_localctx).ast =  new RealLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpContext)_localctx).REAL_CONSTANT!=null?((ExpContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(322);
				((ExpContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpContext)_localctx).INT_CONSTANT!=null?((ExpContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(324);
				((ExpContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpContext)_localctx).CHAR_CONSTANT!=null?((ExpContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(326);
				((ExpContext)_localctx).ID = match(ID);
				 ((ExpContext)_localctx).ast =  new Variable(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,(((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null)); 
				}
				break;
			case 9:
				{
				setState(328);
				((ExpContext)_localctx).functInvocation = functInvocation();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).functInvocation.ast;
				}
				break;
			case 10:
				{
				setState(331);
				((ExpContext)_localctx).unaryIncDec = unaryIncDec();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).unaryIncDec.ast;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(336);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(337);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(338);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(11);
						((ExpContext)_localctx).ast =  new Arithmetic(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).op.getText(),((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(341);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(342);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
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
						setState(346);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(347);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(348);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(9);
						((ExpContext)_localctx).ast =  new Comparison(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).op.getText(),((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(351);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(352);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(353);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(8);
						((ExpContext)_localctx).ast =  new Logical(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).op.getText(),((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(356);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(357);
						match(T__4);
						setState(358);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(0);
						setState(359);
						match(T__5);
						((ExpContext)_localctx).ast =  new Indexing(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(362);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(363);
						match(T__22);
						setState(364);
						((ExpContext)_localctx).id = match(ID);
						((ExpContext)_localctx).ast =  new FieldAccessExpr(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,(((ExpContext)_localctx).id!=null?((ExpContext)_localctx).id.getText():null));
						}
						break;
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 42, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__10);
			setState(372);
			((CastContext)_localctx).primitiveType = primitiveType();
			setState(373);
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
		enterRule(_localctx, 44, RULE_functInvocation);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				((FunctInvocationContext)_localctx).ID = match(ID);
				setState(377);
				match(T__10);
				setState(378);
				((FunctInvocationContext)_localctx).expList = expList();
				setState(379);
				match(T__11);
				((FunctInvocationContext)_localctx).ast =  new FunctionInvocation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((FunctInvocationContext)_localctx).ID.getLine(),((FunctInvocationContext)_localctx).ID.getCharPositionInLine()+1,((FunctInvocationContext)_localctx).ID.getText()),((FunctInvocationContext)_localctx).expList.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				((FunctInvocationContext)_localctx).ID = match(ID);
				setState(383);
				match(T__10);
				setState(384);
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
		enterRule(_localctx, 46, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((ExpListContext)_localctx).exp1 = exp(0);
			_localctx.ast.add(((ExpListContext)_localctx).exp1.ast);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(390);
				match(T__9);
				setState(391);
				((ExpListContext)_localctx).exp2 = exp(0);
				_localctx.ast.add(((ExpListContext)_localctx).exp2.ast);
				}
				}
				setState(398);
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
		enterRule(_localctx, 48, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			((MainContext)_localctx).void1 = match(T__12);
			setState(400);
			((MainContext)_localctx).main1 = match(T__37);
			setState(401);
			match(T__10);
			setState(402);
			match(T__11);
			setState(403);
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
		case 20:
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
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0199\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16"+
		"\3C\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f\7\16"+
		"\7v\13\7\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u008f\n\n\f\n\16\n\u0092"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ba\n\f"+
		"\f\f\16\f\u00bd\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00c7\n"+
		"\16\f\16\16\16\u00ca\13\16\3\16\3\16\3\16\7\16\u00cf\n\16\f\16\16\16\u00d2"+
		"\13\16\3\16\3\16\3\16\3\16\5\16\u00d8\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00f1\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00ff\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u010b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0128\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0151\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0171\n\26"+
		"\f\26\16\26\u0174\13\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\5\30\u0185\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u018d\n\31\f\31\16\31\u0190\13\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\2\4\f*\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\2\6\3\2\34\36\4\2\32\32\37\37\3\2 %\3\2&\'\2\u01ac\2\64\3\2"+
		"\2\2\4A\3\2\2\2\6F\3\2\2\2\bT\3\2\2\2\n\\\3\2\2\2\fk\3\2\2\2\16w\3\2\2"+
		"\2\20\u0084\3\2\2\2\22\u0089\3\2\2\2\24\u00b1\3\2\2\2\26\u00b3\3\2\2\2"+
		"\30\u00be\3\2\2\2\32\u00d7\3\2\2\2\34\u00f0\3\2\2\2\36\u00fe\3\2\2\2 "+
		"\u010a\3\2\2\2\"\u010c\3\2\2\2$\u0112\3\2\2\2&\u0127\3\2\2\2(\u0129\3"+
		"\2\2\2*\u0150\3\2\2\2,\u0175\3\2\2\2.\u0184\3\2\2\2\60\u0186\3\2\2\2\62"+
		"\u0191\3\2\2\2\64\65\5\4\3\2\65\66\5\62\32\2\66\67\7\2\2\3\678\b\2\1\2"+
		"8\3\3\2\2\29:\5\6\4\2:;\b\3\1\2;@\3\2\2\2<=\5\24\13\2=>\b\3\1\2>@\3\2"+
		"\2\2?9\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2"+
		"\2\2DE\b\3\1\2E\5\3\2\2\2FG\5\b\5\2GH\5\22\n\2HI\7\3\2\2IJ\b\4\1\2J\7"+
		"\3\2\2\2KL\5\n\6\2LM\b\5\1\2MU\3\2\2\2NO\5\f\7\2OP\b\5\1\2PU\3\2\2\2Q"+
		"R\5\16\b\2RS\b\5\1\2SU\3\2\2\2TK\3\2\2\2TN\3\2\2\2TQ\3\2\2\2U\t\3\2\2"+
		"\2VW\7\4\2\2W]\b\6\1\2XY\7\5\2\2Y]\b\6\1\2Z[\7\6\2\2[]\b\6\1\2\\V\3\2"+
		"\2\2\\X\3\2\2\2\\Z\3\2\2\2]\13\3\2\2\2^_\b\7\1\2_`\5\16\b\2`a\7\7\2\2"+
		"ab\7)\2\2bc\7\b\2\2cd\b\7\1\2dl\3\2\2\2ef\5\n\6\2fg\7\7\2\2gh\7)\2\2h"+
		"i\7\b\2\2ij\b\7\1\2jl\3\2\2\2k^\3\2\2\2ke\3\2\2\2lt\3\2\2\2mn\f\5\2\2"+
		"no\7\7\2\2op\7)\2\2pq\7\b\2\2qs\b\7\1\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2u\r\3\2\2\2vt\3\2\2\2wx\7\t\2\2x~\7\n\2\2yz\5\20\t\2z{\b\b\1"+
		"\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083\b\b\1\2\u0083"+
		"\17\3\2\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7+\2\2\u0086\u0087\7\3\2\2"+
		"\u0087\u0088\b\t\1\2\u0088\21\3\2\2\2\u0089\u008a\7+\2\2\u008a\u0090\b"+
		"\n\1\2\u008b\u008c\7\f\2\2\u008c\u008d\7+\2\2\u008d\u008f\b\n\1\2\u008e"+
		"\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\23\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5\n\6\2\u0094\u0095"+
		"\7+\2\2\u0095\u0096\7\r\2\2\u0096\u0097\5\26\f\2\u0097\u0098\7\16\2\2"+
		"\u0098\u0099\5\32\16\2\u0099\u009a\b\13\1\2\u009a\u00b2\3\2\2\2\u009b"+
		"\u009c\7\17\2\2\u009c\u009d\7+\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5\26"+
		"\f\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\b\13\1\2\u00a2"+
		"\u00b2\3\2\2\2\u00a3\u00a4\5\n\6\2\u00a4\u00a5\7+\2\2\u00a5\u00a6\7\r"+
		"\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\b\13\1\2\u00a9"+
		"\u00b2\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ac\7+\2\2\u00ac\u00ad\7\r"+
		"\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0\b\13\1\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u0093\3\2\2\2\u00b1\u009b\3\2\2\2\u00b1\u00a3\3\2"+
		"\2\2\u00b1\u00aa\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00bb"+
		"\b\f\1\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\b\f\1\2"+
		"\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\5\n\6\2\u00bf\u00c0\7+\2\2\u00c0\u00c1\b\r\1\2\u00c1\31\3\2\2\2"+
		"\u00c2\u00c8\7\n\2\2\u00c3\u00c4\5\6\4\2\u00c4\u00c5\b\16\1\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00d0\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\34"+
		"\17\2\u00cc\u00cd\b\16\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d8\7\13\2\2\u00d4\u00d5\5\34\17\2\u00d5"+
		"\u00d6\b\16\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00c2\3\2\2\2\u00d7\u00d4\3"+
		"\2\2\2\u00d8\33\3\2\2\2\u00d9\u00da\5 \21\2\u00da\u00db\b\17\1\2\u00db"+
		"\u00f1\3\2\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\b\17\1\2\u00de\u00f1\3"+
		"\2\2\2\u00df\u00e0\5$\23\2\u00e0\u00e1\b\17\1\2\u00e1\u00f1\3\2\2\2\u00e2"+
		"\u00e3\5&\24\2\u00e3\u00e4\b\17\1\2\u00e4\u00f1\3\2\2\2\u00e5\u00e6\5"+
		"(\25\2\u00e6\u00e7\b\17\1\2\u00e7\u00f1\3\2\2\2\u00e8\u00e9\5.\30\2\u00e9"+
		"\u00ea\7\3\2\2\u00ea\u00eb\b\17\1\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\5"+
		"\36\20\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef\b\17\1\2\u00ef\u00f1\3\2\2\2"+
		"\u00f0\u00d9\3\2\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00df\3\2\2\2\u00f0\u00e2"+
		"\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1"+
		"\35\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3\u00f4\7\20\2\2\u00f4\u00ff\b\20\1"+
		"\2\u00f5\u00f6\7+\2\2\u00f6\u00f7\7\21\2\2\u00f7\u00ff\b\20\1\2\u00f8"+
		"\u00f9\7\20\2\2\u00f9\u00fa\7+\2\2\u00fa\u00ff\b\20\1\2\u00fb\u00fc\7"+
		"\21\2\2\u00fc\u00fd\7+\2\2\u00fd\u00ff\b\20\1\2\u00fe\u00f2\3\2\2\2\u00fe"+
		"\u00f5\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\37\3\2\2"+
		"\2\u0100\u0101\7\22\2\2\u0101\u0102\5\60\31\2\u0102\u0103\7\3\2\2\u0103"+
		"\u0104\b\21\1\2\u0104\u010b\3\2\2\2\u0105\u0106\7\23\2\2\u0106\u0107\5"+
		"\60\31\2\u0107\u0108\7\3\2\2\u0108\u0109\b\21\1\2\u0109\u010b\3\2\2\2"+
		"\u010a\u0100\3\2\2\2\u010a\u0105\3\2\2\2\u010b!\3\2\2\2\u010c\u010d\5"+
		"*\26\2\u010d\u010e\7\24\2\2\u010e\u010f\5*\26\2\u010f\u0110\7\3\2\2\u0110"+
		"\u0111\b\22\1\2\u0111#\3\2\2\2\u0112\u0113\7\25\2\2\u0113\u0114\5*\26"+
		"\2\u0114\u0115\7\3\2\2\u0115\u0116\b\23\1\2\u0116%\3\2\2\2\u0117\u0118"+
		"\7\26\2\2\u0118\u0119\7\r\2\2\u0119\u011a\5*\26\2\u011a\u011b\7\16\2\2"+
		"\u011b\u011c\5\32\16\2\u011c\u011d\b\24\1\2\u011d\u0128\3\2\2\2\u011e"+
		"\u011f\7\26\2\2\u011f\u0120\7\r\2\2\u0120\u0121\5*\26\2\u0121\u0122\7"+
		"\16\2\2\u0122\u0123\5\32\16\2\u0123\u0124\7\27\2\2\u0124\u0125\5\32\16"+
		"\2\u0125\u0126\b\24\1\2\u0126\u0128\3\2\2\2\u0127\u0117\3\2\2\2\u0127"+
		"\u011e\3\2\2\2\u0128\'\3\2\2\2\u0129\u012a\7\30\2\2\u012a\u012b\7\r\2"+
		"\2\u012b\u012c\5*\26\2\u012c\u012d\7\16\2\2\u012d\u012e\5\32\16\2\u012e"+
		"\u012f\b\25\1\2\u012f)\3\2\2\2\u0130\u0131\b\26\1\2\u0131\u0132\7\r\2"+
		"\2\u0132\u0133\5*\26\2\u0133\u0134\7\16\2\2\u0134\u0135\b\26\1\2\u0135"+
		"\u0151\3\2\2\2\u0136\u0137\5,\27\2\u0137\u0138\5*\26\17\u0138\u0139\b"+
		"\26\1\2\u0139\u0151\3\2\2\2\u013a\u013b\7\32\2\2\u013b\u013c\5*\26\16"+
		"\u013c\u013d\b\26\1\2\u013d\u0151\3\2\2\2\u013e\u013f\7\33\2\2\u013f\u0140"+
		"\5*\26\r\u0140\u0141\b\26\1\2\u0141\u0151\3\2\2\2\u0142\u0143\7*\2\2\u0143"+
		"\u0151\b\26\1\2\u0144\u0145\7)\2\2\u0145\u0151\b\26\1\2\u0146\u0147\7"+
		",\2\2\u0147\u0151\b\26\1\2\u0148\u0149\7+\2\2\u0149\u0151\b\26\1\2\u014a"+
		"\u014b\5.\30\2\u014b\u014c\b\26\1\2\u014c\u0151\3\2\2\2\u014d\u014e\5"+
		"\36\20\2\u014e\u014f\b\26\1\2\u014f\u0151\3\2\2\2\u0150\u0130\3\2\2\2"+
		"\u0150\u0136\3\2\2\2\u0150\u013a\3\2\2\2\u0150\u013e\3\2\2\2\u0150\u0142"+
		"\3\2\2\2\u0150\u0144\3\2\2\2\u0150\u0146\3\2\2\2\u0150\u0148\3\2\2\2\u0150"+
		"\u014a\3\2\2\2\u0150\u014d\3\2\2\2\u0151\u0172\3\2\2\2\u0152\u0153\f\f"+
		"\2\2\u0153\u0154\t\2\2\2\u0154\u0155\5*\26\r\u0155\u0156\b\26\1\2\u0156"+
		"\u0171\3\2\2\2\u0157\u0158\f\13\2\2\u0158\u0159\t\3\2\2\u0159\u015a\5"+
		"*\26\f\u015a\u015b\b\26\1\2\u015b\u0171\3\2\2\2\u015c\u015d\f\n\2\2\u015d"+
		"\u015e\t\4\2\2\u015e\u015f\5*\26\13\u015f\u0160\b\26\1\2\u0160\u0171\3"+
		"\2\2\2\u0161\u0162\f\t\2\2\u0162\u0163\t\5\2\2\u0163\u0164\5*\26\n\u0164"+
		"\u0165\b\26\1\2\u0165\u0171\3\2\2\2\u0166\u0167\f\21\2\2\u0167\u0168\7"+
		"\7\2\2\u0168\u0169\5*\26\2\u0169\u016a\7\b\2\2\u016a\u016b\b\26\1\2\u016b"+
		"\u0171\3\2\2\2\u016c\u016d\f\20\2\2\u016d\u016e\7\31\2\2\u016e\u016f\7"+
		"+\2\2\u016f\u0171\b\26\1\2\u0170\u0152\3\2\2\2\u0170\u0157\3\2\2\2\u0170"+
		"\u015c\3\2\2\2\u0170\u0161\3\2\2\2\u0170\u0166\3\2\2\2\u0170\u016c\3\2"+
		"\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"+\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7\r\2\2\u0176\u0177\5\n\6\2"+
		"\u0177\u0178\7\16\2\2\u0178\u0179\b\27\1\2\u0179-\3\2\2\2\u017a\u017b"+
		"\7+\2\2\u017b\u017c\7\r\2\2\u017c\u017d\5\60\31\2\u017d\u017e\7\16\2\2"+
		"\u017e\u017f\b\30\1\2\u017f\u0185\3\2\2\2\u0180\u0181\7+\2\2\u0181\u0182"+
		"\7\r\2\2\u0182\u0183\7\16\2\2\u0183\u0185\b\30\1\2\u0184\u017a\3\2\2\2"+
		"\u0184\u0180\3\2\2\2\u0185/\3\2\2\2\u0186\u0187\5*\26\2\u0187\u018e\b"+
		"\31\1\2\u0188\u0189\7\f\2\2\u0189\u018a\5*\26\2\u018a\u018b\b\31\1\2\u018b"+
		"\u018d\3\2\2\2\u018c\u0188\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\61\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192"+
		"\7\17\2\2\u0192\u0193\7(\2\2\u0193\u0194\7\r\2\2\u0194\u0195\7\16\2\2"+
		"\u0195\u0196\5\32\16\2\u0196\u0197\b\32\1\2\u0197\63\3\2\2\2\30?AT\\k"+
		"t~\u0090\u00b1\u00bb\u00c8\u00d0\u00d7\u00f0\u00fe\u010a\u0127\u0150\u0170"+
		"\u0172\u0184\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}