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
		RULE_field = 8, RULE_idList = 9, RULE_funcDef = 10, RULE_paramList = 11, 
		RULE_param = 12, RULE_block = 13, RULE_stmnt = 14, RULE_ioStmnt = 15, 
		RULE_assignmentStmnt = 16, RULE_returnStmnt = 17, RULE_ifStmnt = 18, RULE_whileStmnt = 19, 
		RULE_exp = 20, RULE_cast = 21, RULE_functInvocation = 22, RULE_expList = 23, 
		RULE_main = 24;
	public static final String[] ruleNames = {
		"program", "definitions", "varDef", "type", "primitiveType", "arrayType", 
		"arrayDim", "structType", "field", "idList", "funcDef", "paramList", "param", 
		"block", "stmnt", "ioStmnt", "assignmentStmnt", "returnStmnt", "ifStmnt", 
		"whileStmnt", "exp", "cast", "functInvocation", "expList", "main"
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
			setState(50);
			((ProgramContext)_localctx).definitions = definitions();
			setState(51);
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
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(54);
						((DefinitionsContext)_localctx).varDef = varDef();

										for(VarDefinition def: ((DefinitionsContext)_localctx).varDef.ast){
											_localctx.aux.add(def);
										}
										
						}
						break;
					case 2:
						{
						setState(57);
						((DefinitionsContext)_localctx).funcDef = funcDef();

											_localctx.aux.add(((DefinitionsContext)_localctx).funcDef.ast);
										
						}
						break;
					}
					} 
				}
				setState(64);
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
			setState(67);
			((VarDefContext)_localctx).type = type();
			setState(68);
			((VarDefContext)_localctx).idList = idList();
			setState(69);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				((TypeContext)_localctx).primitiveType = primitiveType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((TypeContext)_localctx).arrayType = arrayType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).arrayType.ast;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__1);
				((PrimitiveTypeContext)_localctx).ast =  IntType.getInstance();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__2);
				((PrimitiveTypeContext)_localctx).ast =  RealType.getInstance();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
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
			setState(91);
			((ArrayTypeContext)_localctx).primitiveType = primitiveType();
			setState(92);
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
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				match(T__4);
				setState(96);
				((ArrayDimContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(97);
				match(T__5);
				_localctx.ast.add(Integer.parseInt(((ArrayDimContext)_localctx).INT_CONSTANT.getText()));
				}
				}
				setState(101); 
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
		public StructType ast;
		public List<Field> fields = new ArrayList<Field>();;
		public FieldContext field;
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
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
			setState(103);
			match(T__6);
			setState(104);
			match(T__7);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				{
				setState(105);
				((StructTypeContext)_localctx).field = field();
				_localctx.fields.add(((StructTypeContext)_localctx).field.ast);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__8);
			((StructTypeContext)_localctx).ast =  new StructType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,_localctx.fields);
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
		enterRule(_localctx, 16, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((FieldContext)_localctx).type = type();
			setState(117);
			((FieldContext)_localctx).ID = match(ID);
			setState(118);
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
		enterRule(_localctx, 18, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((IdListContext)_localctx).id1 = match(ID);
			 _localctx.ast.add(((IdListContext)_localctx).id1.getText()); 
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(123);
				match(T__9);
				setState(124);
				((IdListContext)_localctx).id2 = match(ID);
				 _localctx.ast.add(((IdListContext)_localctx).id2.getText()); 
				}
				}
				setState(130);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((FuncDefContext)_localctx).primitiveType = primitiveType();
				setState(132);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(133);
				match(T__10);
				setState(134);
				((FuncDefContext)_localctx).paramList = paramList();
				setState(135);
				match(T__11);
				setState(136);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FuncDefContext)_localctx).primitiveType.ast,((FuncDefContext)_localctx).paramList.ast),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__12);
				setState(140);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(141);
				match(T__10);
				setState(142);
				((FuncDefContext)_localctx).paramList = paramList();
				setState(143);
				match(T__11);
				setState(144);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,VoidType.getInstance(),((FuncDefContext)_localctx).paramList.ast),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				((FuncDefContext)_localctx).primitiveType = primitiveType();
				setState(148);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(149);
				match(T__10);
				setState(150);
				match(T__11);
				setState(151);
				((FuncDefContext)_localctx).block = block();
				((FuncDefContext)_localctx).ast =  new FuncDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new FuncType(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((FuncDefContext)_localctx).primitiveType.ast,(List)new ArrayList<Statement>()),(((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),((FuncDefContext)_localctx).block.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(T__12);
				setState(155);
				((FuncDefContext)_localctx).ID = match(ID);
				setState(156);
				match(T__10);
				setState(157);
				match(T__11);
				setState(158);
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
		enterRule(_localctx, 22, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((ParamListContext)_localctx).p1 = param();
			_localctx.ast.add(((ParamListContext)_localctx).p1.ast);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(165);
				match(T__9);
				setState(166);
				((ParamListContext)_localctx).p2 = param();
				_localctx.ast.add(((ParamListContext)_localctx).p2.ast);
				}
				}
				setState(173);
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
			setState(174);
			((ParamContext)_localctx).primitiveType = primitiveType();
			setState(175);
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
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__7);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
					{
					{
					setState(179);
					((BlockContext)_localctx).varDef = varDef();

								for(Statement st: ((BlockContext)_localctx).varDef.ast){
										_localctx.ast.add(st);
								}
								
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(187);
					((BlockContext)_localctx).stmnt = stmnt();

								for(Statement st: ((BlockContext)_localctx).stmnt.ast){
										_localctx.ast.add(st);
								}
								
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
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
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(196);
						((BlockContext)_localctx).varDef = varDef();

									for(Statement st: ((BlockContext)_localctx).varDef.ast){
											_localctx.ast.add(st);
									}
									
						}
						} 
					}
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(204);
						((BlockContext)_localctx).stmnt = stmnt();

									for(Statement st: ((BlockContext)_localctx).stmnt.ast){
											_localctx.ast.add(st);
									}
									
						}
						} 
					}
					setState(211);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((StmntContext)_localctx).ioStmnt = ioStmnt();
				((StmntContext)_localctx).ast =  ((StmntContext)_localctx).ioStmnt.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((StmntContext)_localctx).assignmentStmnt = assignmentStmnt();
				_localctx.ast.add(((StmntContext)_localctx).assignmentStmnt.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				((StmntContext)_localctx).returnStmnt = returnStmnt();
				_localctx.ast.add(((StmntContext)_localctx).returnStmnt.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				((StmntContext)_localctx).ifStmnt = ifStmnt();
				_localctx.ast.add(((StmntContext)_localctx).ifStmnt.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				((StmntContext)_localctx).whileStmnt = whileStmnt();
				_localctx.ast.add(((StmntContext)_localctx).whileStmnt.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				((StmntContext)_localctx).functInvocation = functInvocation();
				setState(230);
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
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__13);
				setState(236);
				((IoStmntContext)_localctx).expList = expList();
				setState(237);
				match(T__0);

								for(Expression exp: ((IoStmntContext)_localctx).expList.ast){
									_localctx.ast.add(new Write(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,exp));
								}
							
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__14);
				setState(241);
				((IoStmntContext)_localctx).expList = expList();
				setState(242);
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
			setState(247);
			((AssignmentStmntContext)_localctx).exp1 = exp(0);
			setState(248);
			match(T__15);
			setState(249);
			((AssignmentStmntContext)_localctx).exp2 = exp(0);
			setState(250);
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
			setState(253);
			match(T__16);
			setState(254);
			((ReturnStmntContext)_localctx).exp = exp(0);
			setState(255);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__17);
				setState(259);
				match(T__10);
				setState(260);
				((IfStmntContext)_localctx).exp = exp(0);
				setState(261);
				match(T__11);
				setState(262);
				((IfStmntContext)_localctx).block = block();
				((IfStmntContext)_localctx).ast =  new IfStmnt(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((IfStmntContext)_localctx).exp.ast,((IfStmntContext)_localctx).block.ast,new ArrayList<Statement>());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(T__17);
				setState(266);
				match(T__10);
				setState(267);
				((IfStmntContext)_localctx).exp = exp(0);
				setState(268);
				match(T__11);
				setState(269);
				((IfStmntContext)_localctx).b1 = block();
				setState(270);
				match(T__18);
				setState(271);
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
			setState(276);
			match(T__19);
			setState(277);
			match(T__10);
			setState(278);
			((WhileStmntContext)_localctx).exp = exp(0);
			setState(279);
			match(T__11);
			setState(280);
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(284);
				match(T__10);
				setState(285);
				((ExpContext)_localctx).exp = exp(0);
				setState(286);
				match(T__11);
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).exp.ast;
				}
				break;
			case 2:
				{
				setState(289);
				((ExpContext)_localctx).cast = cast();
				setState(290);
				((ExpContext)_localctx).exp = exp(12);
				 ((ExpContext)_localctx).ast =  new Cast(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).cast.ast, ((ExpContext)_localctx).exp.ast);
				}
				break;
			case 3:
				{
				setState(293);
				match(T__21);
				setState(294);
				((ExpContext)_localctx).exp = exp(11);
				((ExpContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp.ast);
				}
				break;
			case 4:
				{
				setState(297);
				match(T__22);
				setState(298);
				((ExpContext)_localctx).exp = exp(10);
				((ExpContext)_localctx).ast =  new UnaryNegation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp.ast);
				}
				break;
			case 5:
				{
				setState(301);
				((ExpContext)_localctx).functInvocation = functInvocation();
				((ExpContext)_localctx).ast =  ((ExpContext)_localctx).functInvocation.ast;
				}
				break;
			case 6:
				{
				setState(304);
				((ExpContext)_localctx).ID = match(ID);
				 ((ExpContext)_localctx).ast =  new Variable(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,(((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null)); 
				}
				break;
			case 7:
				{
				setState(306);
				((ExpContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpContext)_localctx).INT_CONSTANT!=null?((ExpContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(308);
				((ExpContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpContext)_localctx).ast =  new RealLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpContext)_localctx).REAL_CONSTANT!=null?((ExpContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(310);
				((ExpContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpContext)_localctx).CHAR_CONSTANT!=null?((ExpContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(314);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(315);
						match(T__20);
						setState(316);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(14);
						((ExpContext)_localctx).ast =  new FieldAccessExpr(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,((ExpContext)_localctx).exp1.ast,((ExpContext)_localctx).exp2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(319);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(320);
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
						setState(321);
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
						setState(324);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(325);
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
						setState(326);
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
						setState(329);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(330);
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
						setState(331);
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
						setState(334);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(335);
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
						setState(336);
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
						setState(339);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(340);
						match(T__4);
						setState(341);
						((ExpContext)_localctx).exp2 = ((ExpContext)_localctx).exp = exp(0);
						setState(342);
						match(T__5);
						((ExpContext)_localctx).ast =  new IndexAccessExpr(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,(((ExpContext)_localctx).exp1!=null?_input.getText(((ExpContext)_localctx).exp1.start,((ExpContext)_localctx).exp1.stop):null),((ExpContext)_localctx).exp2.ast);
						}
						break;
					}
					} 
				}
				setState(349);
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
			setState(350);
			match(T__10);
			setState(351);
			((CastContext)_localctx).primitiveType = primitiveType();
			setState(352);
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
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((FunctInvocationContext)_localctx).ID = match(ID);
				setState(356);
				match(T__10);
				setState(357);
				((FunctInvocationContext)_localctx).expList = expList();
				setState(358);
				match(T__11);
				((FunctInvocationContext)_localctx).ast =  new FunctionInvocation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,new Variable(((FunctInvocationContext)_localctx).ID.getLine(),((FunctInvocationContext)_localctx).ID.getCharPositionInLine()+1,((FunctInvocationContext)_localctx).ID.getText()),((FunctInvocationContext)_localctx).expList.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				((FunctInvocationContext)_localctx).ID = match(ID);
				setState(362);
				match(T__10);
				setState(363);
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
			setState(367);
			((ExpListContext)_localctx).exp1 = exp(0);
			_localctx.ast.add(((ExpListContext)_localctx).exp1.ast);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(369);
				match(T__9);
				setState(370);
				((ExpListContext)_localctx).exp2 = exp(0);
				_localctx.ast.add(((ExpListContext)_localctx).exp2.ast);
				}
				}
				setState(377);
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
			setState(378);
			((MainContext)_localctx).void1 = match(T__12);
			setState(379);
			((MainContext)_localctx).main1 = match(T__35);
			setState(380);
			match(T__10);
			setState(381);
			match(T__11);
			setState(382);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5T\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\6\bf\n\b\r\b\16\bg\3\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n"+
		"\13\f\13\16\13\u0084\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00a4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af"+
		"\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00b9\n\17\f\17\16"+
		"\17\u00bc\13\17\3\17\3\17\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00ca\n\17\f\17\16\17\u00cd\13\17\3\17\3\17"+
		"\3\17\7\17\u00d2\n\17\f\17\16\17\u00d5\13\17\5\17\u00d7\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00ec\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00f8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0115\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u013b\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015c\n\26\f\26\16\26\u015f\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0170\n\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0178\n\31"+
		"\f\31\16\31\u017b\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\2\3*\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\32\34\4"+
		"\2\30\30\35\35\3\2\36#\3\2$%\2\u0193\2\64\3\2\2\2\4@\3\2\2\2\6E\3\2\2"+
		"\2\bS\3\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16e\3\2\2\2\20i\3\2\2\2\22v\3\2\2"+
		"\2\24{\3\2\2\2\26\u00a3\3\2\2\2\30\u00a5\3\2\2\2\32\u00b0\3\2\2\2\34\u00d6"+
		"\3\2\2\2\36\u00eb\3\2\2\2 \u00f7\3\2\2\2\"\u00f9\3\2\2\2$\u00ff\3\2\2"+
		"\2&\u0114\3\2\2\2(\u0116\3\2\2\2*\u013a\3\2\2\2,\u0160\3\2\2\2.\u016f"+
		"\3\2\2\2\60\u0171\3\2\2\2\62\u017c\3\2\2\2\64\65\5\4\3\2\65\66\5\62\32"+
		"\2\66\67\b\2\1\2\67\3\3\2\2\289\5\6\4\29:\b\3\1\2:?\3\2\2\2;<\5\26\f\2"+
		"<=\b\3\1\2=?\3\2\2\2>8\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"AC\3\2\2\2B@\3\2\2\2CD\b\3\1\2D\5\3\2\2\2EF\5\b\5\2FG\5\24\13\2GH\7\3"+
		"\2\2HI\b\4\1\2I\7\3\2\2\2JK\5\n\6\2KL\b\5\1\2LT\3\2\2\2MN\5\f\7\2NO\b"+
		"\5\1\2OT\3\2\2\2PQ\5\20\t\2QR\b\5\1\2RT\3\2\2\2SJ\3\2\2\2SM\3\2\2\2SP"+
		"\3\2\2\2T\t\3\2\2\2UV\7\4\2\2V\\\b\6\1\2WX\7\5\2\2X\\\b\6\1\2YZ\7\6\2"+
		"\2Z\\\b\6\1\2[U\3\2\2\2[W\3\2\2\2[Y\3\2\2\2\\\13\3\2\2\2]^\5\n\6\2^_\5"+
		"\16\b\2_`\b\7\1\2`\r\3\2\2\2ab\7\7\2\2bc\7\'\2\2cd\7\b\2\2df\b\b\1\2e"+
		"a\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\17\3\2\2\2ij\7\t\2\2jp\7\n\2"+
		"\2kl\5\22\n\2lm\b\t\1\2mo\3\2\2\2nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2"+
		"\2\2qs\3\2\2\2rp\3\2\2\2st\7\13\2\2tu\b\t\1\2u\21\3\2\2\2vw\5\b\5\2wx"+
		"\7)\2\2xy\7\3\2\2yz\b\n\1\2z\23\3\2\2\2{|\7)\2\2|\u0082\b\13\1\2}~\7\f"+
		"\2\2~\177\7)\2\2\177\u0081\b\13\1\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7)\2\2\u0087\u0088\7\r\2\2\u0088"+
		"\u0089\5\30\r\2\u0089\u008a\7\16\2\2\u008a\u008b\5\34\17\2\u008b\u008c"+
		"\b\f\1\2\u008c\u00a4\3\2\2\2\u008d\u008e\7\17\2\2\u008e\u008f\7)\2\2\u008f"+
		"\u0090\7\r\2\2\u0090\u0091\5\30\r\2\u0091\u0092\7\16\2\2\u0092\u0093\5"+
		"\34\17\2\u0093\u0094\b\f\1\2\u0094\u00a4\3\2\2\2\u0095\u0096\5\n\6\2\u0096"+
		"\u0097\7)\2\2\u0097\u0098\7\r\2\2\u0098\u0099\7\16\2\2\u0099\u009a\5\34"+
		"\17\2\u009a\u009b\b\f\1\2\u009b\u00a4\3\2\2\2\u009c\u009d\7\17\2\2\u009d"+
		"\u009e\7)\2\2\u009e\u009f\7\r\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5\34"+
		"\17\2\u00a1\u00a2\b\f\1\2\u00a2\u00a4\3\2\2\2\u00a3\u0085\3\2\2\2\u00a3"+
		"\u008d\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3\u009c\3\2\2\2\u00a4\27\3\2\2"+
		"\2\u00a5\u00a6\5\32\16\2\u00a6\u00ad\b\r\1\2\u00a7\u00a8\7\f\2\2\u00a8"+
		"\u00a9\5\32\16\2\u00a9\u00aa\b\r\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3"+
		"\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\31\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\7)\2\2"+
		"\u00b2\u00b3\b\16\1\2\u00b3\33\3\2\2\2\u00b4\u00ba\7\n\2\2\u00b5\u00b6"+
		"\5\6\4\2\u00b6\u00b7\b\17\1\2\u00b7\u00b9\3\2\2\2\u00b8\u00b5\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c2"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf\b\17\1"+
		"\2\u00bf\u00c1\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00d7\7\13\2\2\u00c6\u00c7\5\6\4\2\u00c7\u00c8\b\17\1\2\u00c8\u00ca\3"+
		"\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\36"+
		"\20\2\u00cf\u00d0\b\17\1\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00b4\3\2\2\2\u00d6\u00cb\3\2\2\2\u00d7"+
		"\35\3\2\2\2\u00d8\u00d9\5 \21\2\u00d9\u00da\b\20\1\2\u00da\u00ec\3\2\2"+
		"\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\b\20\1\2\u00dd\u00ec\3\2\2\2\u00de"+
		"\u00df\5$\23\2\u00df\u00e0\b\20\1\2\u00e0\u00ec\3\2\2\2\u00e1\u00e2\5"+
		"&\24\2\u00e2\u00e3\b\20\1\2\u00e3\u00ec\3\2\2\2\u00e4\u00e5\5(\25\2\u00e5"+
		"\u00e6\b\20\1\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\5.\30\2\u00e8\u00e9\7"+
		"\3\2\2\u00e9\u00ea\b\20\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00d8\3\2\2\2\u00eb"+
		"\u00db\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e4\3\2"+
		"\2\2\u00eb\u00e7\3\2\2\2\u00ec\37\3\2\2\2\u00ed\u00ee\7\20\2\2\u00ee\u00ef"+
		"\5\60\31\2\u00ef\u00f0\7\3\2\2\u00f0\u00f1\b\21\1\2\u00f1\u00f8\3\2\2"+
		"\2\u00f2\u00f3\7\21\2\2\u00f3\u00f4\5\60\31\2\u00f4\u00f5\7\3\2\2\u00f5"+
		"\u00f6\b\21\1\2\u00f6\u00f8\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00f2\3"+
		"\2\2\2\u00f8!\3\2\2\2\u00f9\u00fa\5*\26\2\u00fa\u00fb\7\22\2\2\u00fb\u00fc"+
		"\5*\26\2\u00fc\u00fd\7\3\2\2\u00fd\u00fe\b\22\1\2\u00fe#\3\2\2\2\u00ff"+
		"\u0100\7\23\2\2\u0100\u0101\5*\26\2\u0101\u0102\7\3\2\2\u0102\u0103\b"+
		"\23\1\2\u0103%\3\2\2\2\u0104\u0105\7\24\2\2\u0105\u0106\7\r\2\2\u0106"+
		"\u0107\5*\26\2\u0107\u0108\7\16\2\2\u0108\u0109\5\34\17\2\u0109\u010a"+
		"\b\24\1\2\u010a\u0115\3\2\2\2\u010b\u010c\7\24\2\2\u010c\u010d\7\r\2\2"+
		"\u010d\u010e\5*\26\2\u010e\u010f\7\16\2\2\u010f\u0110\5\34\17\2\u0110"+
		"\u0111\7\25\2\2\u0111\u0112\5\34\17\2\u0112\u0113\b\24\1\2\u0113\u0115"+
		"\3\2\2\2\u0114\u0104\3\2\2\2\u0114\u010b\3\2\2\2\u0115\'\3\2\2\2\u0116"+
		"\u0117\7\26\2\2\u0117\u0118\7\r\2\2\u0118\u0119\5*\26\2\u0119\u011a\7"+
		"\16\2\2\u011a\u011b\5\34\17\2\u011b\u011c\b\25\1\2\u011c)\3\2\2\2\u011d"+
		"\u011e\b\26\1\2\u011e\u011f\7\r\2\2\u011f\u0120\5*\26\2\u0120\u0121\7"+
		"\16\2\2\u0121\u0122\b\26\1\2\u0122\u013b\3\2\2\2\u0123\u0124\5,\27\2\u0124"+
		"\u0125\5*\26\16\u0125\u0126\b\26\1\2\u0126\u013b\3\2\2\2\u0127\u0128\7"+
		"\30\2\2\u0128\u0129\5*\26\r\u0129\u012a\b\26\1\2\u012a\u013b\3\2\2\2\u012b"+
		"\u012c\7\31\2\2\u012c\u012d\5*\26\f\u012d\u012e\b\26\1\2\u012e\u013b\3"+
		"\2\2\2\u012f\u0130\5.\30\2\u0130\u0131\b\26\1\2\u0131\u013b\3\2\2\2\u0132"+
		"\u0133\7)\2\2\u0133\u013b\b\26\1\2\u0134\u0135\7\'\2\2\u0135\u013b\b\26"+
		"\1\2\u0136\u0137\7(\2\2\u0137\u013b\b\26\1\2\u0138\u0139\7*\2\2\u0139"+
		"\u013b\b\26\1\2\u013a\u011d\3\2\2\2\u013a\u0123\3\2\2\2\u013a\u0127\3"+
		"\2\2\2\u013a\u012b\3\2\2\2\u013a\u012f\3\2\2\2\u013a\u0132\3\2\2\2\u013a"+
		"\u0134\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u015d\3\2"+
		"\2\2\u013c\u013d\f\17\2\2\u013d\u013e\7\27\2\2\u013e\u013f\5*\26\20\u013f"+
		"\u0140\b\26\1\2\u0140\u015c\3\2\2\2\u0141\u0142\f\13\2\2\u0142\u0143\t"+
		"\2\2\2\u0143\u0144\5*\26\f\u0144\u0145\b\26\1\2\u0145\u015c\3\2\2\2\u0146"+
		"\u0147\f\n\2\2\u0147\u0148\t\3\2\2\u0148\u0149\5*\26\13\u0149\u014a\b"+
		"\26\1\2\u014a\u015c\3\2\2\2\u014b\u014c\f\t\2\2\u014c\u014d\t\4\2\2\u014d"+
		"\u014e\5*\26\n\u014e\u014f\b\26\1\2\u014f\u015c\3\2\2\2\u0150\u0151\f"+
		"\b\2\2\u0151\u0152\t\5\2\2\u0152\u0153\5*\26\t\u0153\u0154\b\26\1\2\u0154"+
		"\u015c\3\2\2\2\u0155\u0156\f\21\2\2\u0156\u0157\7\7\2\2\u0157\u0158\5"+
		"*\26\2\u0158\u0159\7\b\2\2\u0159\u015a\b\26\1\2\u015a\u015c\3\2\2\2\u015b"+
		"\u013c\3\2\2\2\u015b\u0141\3\2\2\2\u015b\u0146\3\2\2\2\u015b\u014b\3\2"+
		"\2\2\u015b\u0150\3\2\2\2\u015b\u0155\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e+\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u0160\u0161\7\r\2\2\u0161\u0162\5\n\6\2\u0162\u0163\7\16\2\2\u0163\u0164"+
		"\b\27\1\2\u0164-\3\2\2\2\u0165\u0166\7)\2\2\u0166\u0167\7\r\2\2\u0167"+
		"\u0168\5\60\31\2\u0168\u0169\7\16\2\2\u0169\u016a\b\30\1\2\u016a\u0170"+
		"\3\2\2\2\u016b\u016c\7)\2\2\u016c\u016d\7\r\2\2\u016d\u016e\7\16\2\2\u016e"+
		"\u0170\b\30\1\2\u016f\u0165\3\2\2\2\u016f\u016b\3\2\2\2\u0170/\3\2\2\2"+
		"\u0171\u0172\5*\26\2\u0172\u0179\b\31\1\2\u0173\u0174\7\f\2\2\u0174\u0175"+
		"\5*\26\2\u0175\u0176\b\31\1\2\u0176\u0178\3\2\2\2\u0177\u0173\3\2\2\2"+
		"\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\61"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7\17\2\2\u017d\u017e\7&\2\2\u017e"+
		"\u017f\7\r\2\2\u017f\u0180\7\16\2\2\u0180\u0181\5\34\17\2\u0181\u0182"+
		"\b\32\1\2\u0182\63\3\2\2\2\30>@S[gp\u0082\u00a3\u00ad\u00ba\u00c2\u00cb"+
		"\u00d3\u00d6\u00eb\u00f7\u0114\u013a\u015b\u015d\u016f\u0179";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}