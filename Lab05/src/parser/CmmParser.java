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
		RULE_primitiveType = 4, RULE_arrayType = 5, RULE_arrayDim = 6, RULE_structType = 7, 
		RULE_recordDef = 8, RULE_idList = 9, RULE_funcDef = 10, RULE_paramList = 11, 
		RULE_param = 12, RULE_block = 13, RULE_stmnt = 14, RULE_ioStmnt = 15, 
		RULE_assignmentStmnt = 16, RULE_returnStmnt = 17, RULE_ifStmnt = 18, RULE_whileStmnt = 19, 
		RULE_exp = 20, RULE_cast = 21, RULE_functInvocation = 22, RULE_expList = 23, 
		RULE_main = 24, RULE_errorType = 25;
	public static final String[] ruleNames = {
		"program", "definitions", "varDef", "type", "primitiveType", "arrayType", 
		"arrayDim", "structType", "recordDef", "idList", "funcDef", "paramList", 
		"param", "block", "stmnt", "ioStmnt", "assignmentStmnt", "returnStmnt", 
		"ifStmnt", "whileStmnt", "exp", "cast", "functInvocation", "expList", 
		"main", "errorType"
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
			setState(52);
			((ProgramContext)_localctx).definitions = definitions();
			setState(53);
			((ProgramContext)_localctx).main = main();
				
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
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(56);
						((DefinitionsContext)_localctx).varDef = varDef();

										for(VarDefinition def: ((DefinitionsContext)_localctx).varDef.ast){
											_localctx.aux.add(def);
										}
										
						}
						break;
					case 2:
						{
						setState(59);
						((DefinitionsContext)_localctx).funcDef = funcDef();

											_localctx.aux.add(((DefinitionsContext)_localctx).funcDef.ast);
										
						}
						break;
					}
					} 
				}
				setState(66);
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
			setState(69);
			((VarDefContext)_localctx).type = type();
			setState(70);
			((VarDefContext)_localctx).idList = idList();
			setState(71);
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
		public StructTypeContext structType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((TypeContext)_localctx).primitiveType = primitiveType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((TypeContext)_localctx).arrayType = arrayType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).arrayType.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				((TypeContext)_localctx).structType = structType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).structType.ast;
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__1);
				((PrimitiveTypeContext)_localctx).ast =  IntType.getInstance();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__2);
				((PrimitiveTypeContext)_localctx).ast =  RealType.getInstance();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
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
		public PrimitiveTypeContext primitiveType;
		public ArrayDimContext arrayDim;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayDimContext arrayDim() {
			return getRuleContext(ArrayDimContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((ArrayTypeContext)_localctx).primitiveType = primitiveType();
			setState(94);
			((ArrayTypeContext)_localctx).arrayDim = arrayDim();
			((ArrayTypeContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ArrayTypeContext)_localctx).primitiveType.ast,((ArrayTypeContext)_localctx).arrayDim.ast);
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

	public static class ArrayDimContext extends ParserRuleContext {
		public List<Integer> ast = new ArrayList<>();;
		public Token INT_CONSTANT;
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public ArrayDimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDim; }
	}

	public final ArrayDimContext arrayDim() throws RecognitionException {
		ArrayDimContext _localctx = new ArrayDimContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(T__4);
				setState(98);
				((ArrayDimContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(99);
				match(T__5);
				_localctx.ast.add(Integer.parseInt(((ArrayDimContext)_localctx).INT_CONSTANT.getText()));
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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

	public static class StructTypeContext extends ParserRuleContext {
		public Type ast;
		public List<RecordDef> defs = new ArrayList<RecordDef>();
					boolean isRight = false;;
		public RecordDefContext recordDef;
		public List<RecordDefContext> recordDef() {
			return getRuleContexts(RecordDefContext.class);
		}
		public RecordDefContext recordDef(int i) {
			return getRuleContext(RecordDefContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(106);
			match(T__7);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				{
				setState(107);
				((StructTypeContext)_localctx).recordDef = recordDef();

						 	if(!_localctx.defs.contains(((StructTypeContext)_localctx).recordDef.ast)){
						 		_localctx.defs.add(((StructTypeContext)_localctx).recordDef.ast);
						 	}else{
						 		isRight = false;
						 	}
						 
						 
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__8);

					 	if(isRight){
					 		((StructTypeContext)_localctx).ast =  new StructType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,_localctx.defs);
					 	}
					 	else{
					 		((StructTypeContext)_localctx).ast =  new ErrorType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,"The struct has repeated recordDef");
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

	public static class RecordDefContext extends ParserRuleContext {
		public RecordDef ast;
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public RecordDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDef; }
	}

	public final RecordDefContext recordDef() throws RecognitionException {
		RecordDefContext _localctx = new RecordDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_recordDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((RecordDefContext)_localctx).type = type();
			setState(119);
			((RecordDefContext)_localctx).ID = match(ID);
			setState(120);
			match(T__0);
			((RecordDefContext)_localctx).ast =  new RecordDef(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((RecordDefContext)_localctx).type.ast,((RecordDefContext)_localctx).ID.getText());
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
		enterRule(_localctx, 18, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((IdListContext)_localctx).id1 = match(ID);
			 _localctx.ast.add(((IdListContext)_localctx).id1.getText()); 
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(125);
				match(T__9);
				setState(126);
				((IdListContext)_localctx).id2 = match(ID);
				 _localctx.ast.add(((IdListContext)_localctx).id2.getText()); 
				}
				}
				setState(132);
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
		enterRule(_localctx, 20, RULE_funcDef);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((FuncDefContext)_localctx).primitiveType = primitiveType();
				setState(134);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(135);
				match(T__10);
				setState(136);
				((FuncDefContext)_localctx).paramList = paramList();
				setState(137);
				match(T__11);
				setState(138);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FuncDefContext)_localctx).primitiveType.ast,(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).paramList.ast,((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__12);
				setState(142);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(143);
				match(T__10);
				setState(144);
				((FuncDefContext)_localctx).paramList = paramList();
				setState(145);
				match(T__11);
				setState(146);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,VoidType.getInstance(),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).paramList.ast,((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				((FuncDefContext)_localctx).primitiveType = primitiveType();
				setState(150);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(151);
				match(T__10);
				setState(152);
				match(T__11);
				setState(153);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FuncDefContext)_localctx).primitiveType.ast,(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),(List)new ArrayList<Statement>(),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(T__12);
				setState(157);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(158);
				match(T__10);
				setState(159);
				match(T__11);
				setState(160);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,VoidType.getInstance(),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),(List)new ArrayList<Statement>(),((FuncDefContext)_localctx).block.ast);
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
		enterRule(_localctx, 22, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((ParamListContext)_localctx).p1 = param();
			_localctx.ast.add(((ParamListContext)_localctx).p1.ast);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(167);
				match(T__9);
				setState(168);
				((ParamListContext)_localctx).p2 = param();
				_localctx.ast.add(((ParamListContext)_localctx).p2.ast);
				}
				}
				setState(175);
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
		enterRule(_localctx, 24, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((ParamContext)_localctx).primitiveType = primitiveType();
			setState(177);
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
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			int _alt;
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__7);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(181);
					((BlockContext)_localctx).varDef = varDef();

								for(Statement st: ((BlockContext)_localctx).varDef.ast){
										_localctx.ast.add(st);
								}
								
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(189);
					((BlockContext)_localctx).stmnt = stmnt();

								for(Statement st: ((BlockContext)_localctx).stmnt.ast){
										_localctx.ast.add(st);
								}
								
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
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
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						((BlockContext)_localctx).varDef = varDef();

									for(Statement st: ((BlockContext)_localctx).varDef.ast){
											_localctx.ast.add(st);
									}
									
						}
						} 
					}
					setState(205);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(206);
						((BlockContext)_localctx).stmnt = stmnt();

									for(Statement st: ((BlockContext)_localctx).stmnt.ast){
											_localctx.ast.add(st);
									}
									
						}
						} 
					}
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 28, RULE_stmnt);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				((StmntContext)_localctx).ioStmnt = ioStmnt();
				((StmntContext)_localctx).ast =  ((StmntContext)_localctx).ioStmnt.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((StmntContext)_localctx).assignmentStmnt = assignmentStmnt();
				_localctx.ast.add(((StmntContext)_localctx).assignmentStmnt.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				((StmntContext)_localctx).returnStmnt = returnStmnt();
				_localctx.ast.add(((StmntContext)_localctx).returnStmnt.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				((StmntContext)_localctx).ifStmnt = ifStmnt();
				_localctx.ast.add(((StmntContext)_localctx).ifStmnt.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				((StmntContext)_localctx).whileStmnt = whileStmnt();
				_localctx.ast.add(((StmntContext)_localctx).whileStmnt.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				((StmntContext)_localctx).functInvocation = functInvocation();
				setState(232);
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
		enterRule(_localctx, 30, RULE_ioStmnt);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__13);
				setState(238);
				((IoStmntContext)_localctx).expList = expList();
				setState(239);
				match(T__0);

								for(Expression exp: ((IoStmntContext)_localctx).expList.ast){
									_localctx.ast.add(new Write(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,exp));
								}
							
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(T__14);
				setState(243);
				((IoStmntContext)_localctx).expList = expList();
				setState(244);
				match(T__0);

								for(Expression exp: ((IoStmntContext)_localctx).expList.ast){
									_localctx.ast.add(new Write(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,exp));
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
			setState(249);
			((AssignmentStmntContext)_localctx).exp1 = exp(0);
			setState(250);
			match(T__15);
			setState(251);
			((AssignmentStmntContext)_localctx).exp2 = exp(0);
			setState(252);
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
			setState(255);
			match(T__16);
			setState(256);
			((ReturnStmntContext)_localctx).exp = exp(0);
			setState(257);
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
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__17);
				setState(261);
				match(T__10);
				setState(262);
				((IfStmntContext)_localctx).exp = exp(0);
				setState(263);
				match(T__11);
				setState(264);
				((IfStmntContext)_localctx).block = block();
				((IfStmntContext)_localctx).ast =  new IfStmnt(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((IfStmntContext)_localctx).exp.ast,((IfStmntContext)_localctx).block.ast,new ArrayList<Statement>());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__17);
				setState(268);
				match(T__10);
				setState(269);
				((IfStmntContext)_localctx).exp = exp(0);
				setState(270);
				match(T__11);
				setState(271);
				((IfStmntContext)_localctx).b1 = block();
				setState(272);
				match(T__18);
				setState(273);
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
			setState(278);
			match(T__19);
			setState(279);
			match(T__10);
			setState(280);
			((WhileStmntContext)_localctx).exp = exp(0);
			setState(281);
			match(T__11);
			setState(282);
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
		public FunctInvocationContext functInvocation;
		public Token ID;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
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
		public FunctInvocationContext functInvocation() {
			return getRuleContext(FunctInvocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
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
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(286);
				match(T__10);
				setState(287);
				((ExpContext)_localctx).exp = exp(0);
				setState(288);
				match(T__11);
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).exp.ast;
				}
				break;
			case 2:
				{
				setState(291);
				((ExpContext)_localctx).cast = cast();
				setState(292);
				((ExpContext)_localctx).exp = exp(12);
				 ((ExpContext)_localctx).ast =  new Cast(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).cast.ast, ((ExpContext)_localctx).exp.ast);
				}
				break;
			case 3:
				{
				setState(295);
				match(T__21);
				setState(296);
				((ExpContext)_localctx).exp = exp(11);
				((ExpContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp.ast);
				}
				break;
			case 4:
				{
				setState(299);
				match(T__22);
				setState(300);
				((ExpContext)_localctx).exp = exp(10);
				((ExpContext)_localctx).ast =  new UnaryNegation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp.ast);
				}
				break;
			case 5:
				{
				setState(303);
				((ExpContext)_localctx).functInvocation = functInvocation();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).functInvocation.ast;
				}
				break;
			case 6:
				{
				setState(306);
				((ExpContext)_localctx).ID = match(ID);
				 ((ExpContext)_localctx).ast =  new Variable(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,(((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null)); 
				}
				break;
			case 7:
				{
				setState(308);
				((ExpContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpContext)_localctx).INT_CONSTANT!=null?((ExpContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(310);
				((ExpContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpContext)_localctx).ast =  new RealLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpContext)_localctx).REAL_CONSTANT!=null?((ExpContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(312);
				((ExpContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpContext)_localctx).CHAR_CONSTANT!=null?((ExpContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(316);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(317);
						match(T__20);
						setState(318);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(14);
						((ExpContext)_localctx).ast =  new FieldAccessExpr(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,(((ExpContext)_localctx).exp1!=null?_input.getText(((ExpContext)_localctx).exp1.start,((ExpContext)_localctx).exp1.stop):null),((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(321);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(322);
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
						setState(323);
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
						setState(326);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(327);
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
						setState(328);
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
						setState(331);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(332);
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
						setState(333);
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
						setState(336);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(337);
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
						setState(338);
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
						setState(341);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(342);
						match(T__4);
						setState(343);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(0);
						setState(344);
						match(T__5);
						((ExpContext)_localctx).ast =  new IndexAccessExpr(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,(((ExpContext)_localctx).exp1!=null?_input.getText(((ExpContext)_localctx).exp1.start,((ExpContext)_localctx).exp1.stop):null),((ExpContext)_localctx).exp2.ast);
						}
						break;
					}
					} 
				}
				setState(351);
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
			setState(352);
			match(T__10);
			setState(353);
			((CastContext)_localctx).primitiveType = primitiveType();
			setState(354);
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
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((FunctInvocationContext)_localctx).ID = match(ID);
				setState(358);
				match(T__10);
				setState(359);
				((FunctInvocationContext)_localctx).expList = expList();
				setState(360);
				match(T__11);
				((FunctInvocationContext)_localctx).ast =  new FunctionInvocation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((FunctInvocationContext)_localctx).ID.getLine(),((FunctInvocationContext)_localctx).ID.getCharPositionInLine()+1,((FunctInvocationContext)_localctx).ID.getText()),((FunctInvocationContext)_localctx).expList.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				((FunctInvocationContext)_localctx).ID = match(ID);
				setState(364);
				match(T__10);
				setState(365);
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
			setState(369);
			((ExpListContext)_localctx).exp1 = exp(0);
			_localctx.ast.add(((ExpListContext)_localctx).exp1.ast);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(371);
				match(T__9);
				setState(372);
				((ExpListContext)_localctx).exp2 = exp(0);
				_localctx.ast.add(((ExpListContext)_localctx).exp2.ast);
				}
				}
				setState(379);
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
			setState(380);
			((MainContext)_localctx).void1 = match(T__12);
			setState(381);
			((MainContext)_localctx).main1 = match(T__35);
			setState(382);
			match(T__10);
			setState(383);
			match(T__11);
			setState(384);
			((MainContext)_localctx).block = block();

					((MainContext)_localctx).ast =  new FuncDefinition(((MainContext)_localctx).main1.getLine(),((MainContext)_localctx).main1.getCharPositionInLine()+1,(Type)VoidType.getInstance(),(((MainContext)_localctx).main1!=null?((MainContext)_localctx).main1.getText():null),(List) new ArrayList<>(),((MainContext)_localctx).block.ast);
				
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

	public static class ErrorTypeContext extends ParserRuleContext {
		public ErrorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorType; }
	}

	public final ErrorTypeContext errorType() throws RecognitionException {
		ErrorTypeContext _localctx = new ErrorTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_errorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			ErrorHandler.getInstance().addError(new ErrorType("ERROR ON BUILD"));
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
		case 20:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3A\n\3"+
		"\f\3\16\3D\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\6\bh\n\b\r\b\16\bi\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16"+
		"\tt\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0083\n\13\f\13\16\13\u0086\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ae\n\r\f\r"+
		"\16\r\u00b1\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00bb\n"+
		"\17\f\17\16\17\u00be\13\17\3\17\3\17\3\17\7\17\u00c3\n\17\f\17\16\17\u00c6"+
		"\13\17\3\17\3\17\3\17\3\17\7\17\u00cc\n\17\f\17\16\17\u00cf\13\17\3\17"+
		"\3\17\3\17\7\17\u00d4\n\17\f\17\16\17\u00d7\13\17\5\17\u00d9\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ee\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00fa\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0117\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u013d\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015e\n\26\f\26\16\26\u0161"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0172\n\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u017a\n"+
		"\31\f\31\16\31\u017d\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\2\3*\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\2\6\3\2\32\34\4\2\30\30\35\35\3\2\36#\3\2$%\2\u0196\2\66\3\2\2\2\4B\3"+
		"\2\2\2\6G\3\2\2\2\bU\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16g\3\2\2\2\20k\3\2"+
		"\2\2\22x\3\2\2\2\24}\3\2\2\2\26\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\u00b2"+
		"\3\2\2\2\34\u00d8\3\2\2\2\36\u00ed\3\2\2\2 \u00f9\3\2\2\2\"\u00fb\3\2"+
		"\2\2$\u0101\3\2\2\2&\u0116\3\2\2\2(\u0118\3\2\2\2*\u013c\3\2\2\2,\u0162"+
		"\3\2\2\2.\u0171\3\2\2\2\60\u0173\3\2\2\2\62\u017e\3\2\2\2\64\u0185\3\2"+
		"\2\2\66\67\5\4\3\2\678\5\62\32\289\b\2\1\29\3\3\2\2\2:;\5\6\4\2;<\b\3"+
		"\1\2<A\3\2\2\2=>\5\26\f\2>?\b\3\1\2?A\3\2\2\2@:\3\2\2\2@=\3\2\2\2AD\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\b\3\1\2F\5\3\2\2\2GH"+
		"\5\b\5\2HI\5\24\13\2IJ\7\3\2\2JK\b\4\1\2K\7\3\2\2\2LM\5\n\6\2MN\b\5\1"+
		"\2NV\3\2\2\2OP\5\f\7\2PQ\b\5\1\2QV\3\2\2\2RS\5\20\t\2ST\b\5\1\2TV\3\2"+
		"\2\2UL\3\2\2\2UO\3\2\2\2UR\3\2\2\2V\t\3\2\2\2WX\7\4\2\2X^\b\6\1\2YZ\7"+
		"\5\2\2Z^\b\6\1\2[\\\7\6\2\2\\^\b\6\1\2]W\3\2\2\2]Y\3\2\2\2][\3\2\2\2^"+
		"\13\3\2\2\2_`\5\n\6\2`a\5\16\b\2ab\b\7\1\2b\r\3\2\2\2cd\7\7\2\2de\7\'"+
		"\2\2ef\7\b\2\2fh\b\b\1\2gc\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3"+
		"\2\2\2kl\7\t\2\2lr\7\n\2\2mn\5\22\n\2no\b\t\1\2oq\3\2\2\2pm\3\2\2\2qt"+
		"\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\13\2\2vw\b\t\1\2"+
		"w\21\3\2\2\2xy\5\b\5\2yz\7)\2\2z{\7\3\2\2{|\b\n\1\2|\23\3\2\2\2}~\7)\2"+
		"\2~\u0084\b\13\1\2\177\u0080\7\f\2\2\u0080\u0081\7)\2\2\u0081\u0083\b"+
		"\13\1\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\25\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5\n\6"+
		"\2\u0088\u0089\7)\2\2\u0089\u008a\7\r\2\2\u008a\u008b\5\30\r\2\u008b\u008c"+
		"\7\16\2\2\u008c\u008d\5\34\17\2\u008d\u008e\b\f\1\2\u008e\u00a6\3\2\2"+
		"\2\u008f\u0090\7\17\2\2\u0090\u0091\7)\2\2\u0091\u0092\7\r\2\2\u0092\u0093"+
		"\5\30\r\2\u0093\u0094\7\16\2\2\u0094\u0095\5\34\17\2\u0095\u0096\b\f\1"+
		"\2\u0096\u00a6\3\2\2\2\u0097\u0098\5\n\6\2\u0098\u0099\7)\2\2\u0099\u009a"+
		"\7\r\2\2\u009a\u009b\7\16\2\2\u009b\u009c\5\34\17\2\u009c\u009d\b\f\1"+
		"\2\u009d\u00a6\3\2\2\2\u009e\u009f\7\17\2\2\u009f\u00a0\7)\2\2\u00a0\u00a1"+
		"\7\r\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\b\f\1"+
		"\2\u00a4\u00a6\3\2\2\2\u00a5\u0087\3\2\2\2\u00a5\u008f\3\2\2\2\u00a5\u0097"+
		"\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\5\32\16\2\u00a8"+
		"\u00af\b\r\1\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00ac\b"+
		"\r\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00af\3\2\2"+
		"\2\u00b2\u00b3\5\n\6\2\u00b3\u00b4\7)\2\2\u00b4\u00b5\b\16\1\2\u00b5\33"+
		"\3\2\2\2\u00b6\u00bc\7\n\2\2\u00b7\u00b8\5\6\4\2\u00b8\u00b9\b\17\1\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c4\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\5\36\20\2\u00c0\u00c1\b\17\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00bf"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00d9\7\13\2\2\u00c8\u00c9\5"+
		"\6\4\2\u00c9\u00ca\b\17\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d5\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\b\17\1\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00b6\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00db\5 \21"+
		"\2\u00db\u00dc\b\20\1\2\u00dc\u00ee\3\2\2\2\u00dd\u00de\5\"\22\2\u00de"+
		"\u00df\b\20\1\2\u00df\u00ee\3\2\2\2\u00e0\u00e1\5$\23\2\u00e1\u00e2\b"+
		"\20\1\2\u00e2\u00ee\3\2\2\2\u00e3\u00e4\5&\24\2\u00e4\u00e5\b\20\1\2\u00e5"+
		"\u00ee\3\2\2\2\u00e6\u00e7\5(\25\2\u00e7\u00e8\b\20\1\2\u00e8\u00ee\3"+
		"\2\2\2\u00e9\u00ea\5.\30\2\u00ea\u00eb\7\3\2\2\u00eb\u00ec\b\20\1\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00da\3\2\2\2\u00ed\u00dd\3\2\2\2\u00ed\u00e0\3\2"+
		"\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee"+
		"\37\3\2\2\2\u00ef\u00f0\7\20\2\2\u00f0\u00f1\5\60\31\2\u00f1\u00f2\7\3"+
		"\2\2\u00f2\u00f3\b\21\1\2\u00f3\u00fa\3\2\2\2\u00f4\u00f5\7\21\2\2\u00f5"+
		"\u00f6\5\60\31\2\u00f6\u00f7\7\3\2\2\u00f7\u00f8\b\21\1\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00ef\3\2\2\2\u00f9\u00f4\3\2\2\2\u00fa!\3\2\2\2\u00fb"+
		"\u00fc\5*\26\2\u00fc\u00fd\7\22\2\2\u00fd\u00fe\5*\26\2\u00fe\u00ff\7"+
		"\3\2\2\u00ff\u0100\b\22\1\2\u0100#\3\2\2\2\u0101\u0102\7\23\2\2\u0102"+
		"\u0103\5*\26\2\u0103\u0104\7\3\2\2\u0104\u0105\b\23\1\2\u0105%\3\2\2\2"+
		"\u0106\u0107\7\24\2\2\u0107\u0108\7\r\2\2\u0108\u0109\5*\26\2\u0109\u010a"+
		"\7\16\2\2\u010a\u010b\5\34\17\2\u010b\u010c\b\24\1\2\u010c\u0117\3\2\2"+
		"\2\u010d\u010e\7\24\2\2\u010e\u010f\7\r\2\2\u010f\u0110\5*\26\2\u0110"+
		"\u0111\7\16\2\2\u0111\u0112\5\34\17\2\u0112\u0113\7\25\2\2\u0113\u0114"+
		"\5\34\17\2\u0114\u0115\b\24\1\2\u0115\u0117\3\2\2\2\u0116\u0106\3\2\2"+
		"\2\u0116\u010d\3\2\2\2\u0117\'\3\2\2\2\u0118\u0119\7\26\2\2\u0119\u011a"+
		"\7\r\2\2\u011a\u011b\5*\26\2\u011b\u011c\7\16\2\2\u011c\u011d\5\34\17"+
		"\2\u011d\u011e\b\25\1\2\u011e)\3\2\2\2\u011f\u0120\b\26\1\2\u0120\u0121"+
		"\7\r\2\2\u0121\u0122\5*\26\2\u0122\u0123\7\16\2\2\u0123\u0124\b\26\1\2"+
		"\u0124\u013d\3\2\2\2\u0125\u0126\5,\27\2\u0126\u0127\5*\26\16\u0127\u0128"+
		"\b\26\1\2\u0128\u013d\3\2\2\2\u0129\u012a\7\30\2\2\u012a\u012b\5*\26\r"+
		"\u012b\u012c\b\26\1\2\u012c\u013d\3\2\2\2\u012d\u012e\7\31\2\2\u012e\u012f"+
		"\5*\26\f\u012f\u0130\b\26\1\2\u0130\u013d\3\2\2\2\u0131\u0132\5.\30\2"+
		"\u0132\u0133\b\26\1\2\u0133\u013d\3\2\2\2\u0134\u0135\7)\2\2\u0135\u013d"+
		"\b\26\1\2\u0136\u0137\7\'\2\2\u0137\u013d\b\26\1\2\u0138\u0139\7(\2\2"+
		"\u0139\u013d\b\26\1\2\u013a\u013b\7*\2\2\u013b\u013d\b\26\1\2\u013c\u011f"+
		"\3\2\2\2\u013c\u0125\3\2\2\2\u013c\u0129\3\2\2\2\u013c\u012d\3\2\2\2\u013c"+
		"\u0131\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0138\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u015f\3\2\2\2\u013e\u013f\f\17\2\2\u013f"+
		"\u0140\7\27\2\2\u0140\u0141\5*\26\20\u0141\u0142\b\26\1\2\u0142\u015e"+
		"\3\2\2\2\u0143\u0144\f\13\2\2\u0144\u0145\t\2\2\2\u0145\u0146\5*\26\f"+
		"\u0146\u0147\b\26\1\2\u0147\u015e\3\2\2\2\u0148\u0149\f\n\2\2\u0149\u014a"+
		"\t\3\2\2\u014a\u014b\5*\26\13\u014b\u014c\b\26\1\2\u014c\u015e\3\2\2\2"+
		"\u014d\u014e\f\t\2\2\u014e\u014f\t\4\2\2\u014f\u0150\5*\26\n\u0150\u0151"+
		"\b\26\1\2\u0151\u015e\3\2\2\2\u0152\u0153\f\b\2\2\u0153\u0154\t\5\2\2"+
		"\u0154\u0155\5*\26\t\u0155\u0156\b\26\1\2\u0156\u015e\3\2\2\2\u0157\u0158"+
		"\f\21\2\2\u0158\u0159\7\7\2\2\u0159\u015a\5*\26\2\u015a\u015b\7\b\2\2"+
		"\u015b\u015c\b\26\1\2\u015c\u015e\3\2\2\2\u015d\u013e\3\2\2\2\u015d\u0143"+
		"\3\2\2\2\u015d\u0148\3\2\2\2\u015d\u014d\3\2\2\2\u015d\u0152\3\2\2\2\u015d"+
		"\u0157\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160+\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\r\2\2\u0163\u0164"+
		"\5\n\6\2\u0164\u0165\7\16\2\2\u0165\u0166\b\27\1\2\u0166-\3\2\2\2\u0167"+
		"\u0168\7)\2\2\u0168\u0169\7\r\2\2\u0169\u016a\5\60\31\2\u016a\u016b\7"+
		"\16\2\2\u016b\u016c\b\30\1\2\u016c\u0172\3\2\2\2\u016d\u016e\7)\2\2\u016e"+
		"\u016f\7\r\2\2\u016f\u0170\7\16\2\2\u0170\u0172\b\30\1\2\u0171\u0167\3"+
		"\2\2\2\u0171\u016d\3\2\2\2\u0172/\3\2\2\2\u0173\u0174\5*\26\2\u0174\u017b"+
		"\b\31\1\2\u0175\u0176\7\f\2\2\u0176\u0177\5*\26\2\u0177\u0178\b\31\1\2"+
		"\u0178\u017a\3\2\2\2\u0179\u0175\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\61\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u017f\7\17\2\2\u017f\u0180\7&\2\2\u0180\u0181\7\r\2\2\u0181\u0182\7\16"+
		"\2\2\u0182\u0183\5\34\17\2\u0183\u0184\b\32\1\2\u0184\63\3\2\2\2\u0185"+
		"\u0186\b\33\1\2\u0186\65\3\2\2\2\30@BU]ir\u0084\u00a5\u00af\u00bc\u00c4"+
		"\u00cd\u00d5\u00d8\u00ed\u00f9\u0116\u013c\u015d\u015f\u0171\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}