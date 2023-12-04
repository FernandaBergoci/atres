// Generated from C:/Users/nandi/Desktop/aula03CGRV/atres/src/main/java/org/code/Atres.g4 by ANTLR 4.13.1
package org.code;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AtresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, INICIO=2, TIPO=3, ESCREVA=4, ENTRADA=5, DECLARAR=6, SE=7, 
		SENAO=8, WHILE=9, FOR=10, FIM=11, STRING_DEF=12, INTEIRO_DEF=13, RACIONAL_DEF=14, 
		BOOLEAN_DEF=15, OP_ATRIB=16, OP_SOMA=17, OP_SUB=18, OP_MULT=19, OP_DIV=20, 
		BOOL_E=21, BOOL_OU=22, OP_RELAC=23, AB_PAR=24, FC_PAR=25, AB_CHAVE=26, 
		FC_CHAVE=27, PV=28, COMENTARIO=29, ID=30, NUM_INT=31, NUM_REAL=32, WS=33;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_var_decl = 2, RULE_var_atrib = 3, 
		RULE_comando = 4, RULE_cmdEntrada = 5, RULE_cmdSaida = 6, RULE_cmdCondicao = 7, 
		RULE_comparacao = 8, RULE_variavel = 9, RULE_string = 10, RULE_cmdRept = 11, 
		RULE_while = 12, RULE_for = 13, RULE_exprMat = 14, RULE_number = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "var_decl", "var_atrib", "comando", "cmdEntrada", 
			"cmdSaida", "cmdCondicao", "comparacao", "variavel", "string", "cmdRept", 
			"while", "for", "exprMat", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", null, "'escreva'", "'entrada'", "'declaracao'", 
			"'se'", "'senao'", "'while'", "'for'", "'fim'", null, null, null, null, 
			"'='", "'+'", "'-'", "'*'", "'/'", "'e'", "'ou'", null, "'('", "')'", 
			"'{'", "'}'", "';'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "INICIO", "TIPO", "ESCREVA", "ENTRADA", "DECLARAR", 
			"SE", "SENAO", "WHILE", "FOR", "FIM", "STRING_DEF", "INTEIRO_DEF", "RACIONAL_DEF", 
			"BOOLEAN_DEF", "OP_ATRIB", "OP_SOMA", "OP_SUB", "OP_MULT", "OP_DIV", 
			"BOOL_E", "BOOL_OU", "OP_RELAC", "AB_PAR", "FC_PAR", "AB_CHAVE", "FC_CHAVE", 
			"PV", "COMENTARIO", "ID", "NUM_INT", "NUM_REAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Atres.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AtresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(AtresParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public TerminalNode AB_CHAVE() { return getToken(AtresParser.AB_CHAVE, 0); }
		public TerminalNode FC_CHAVE() { return getToken(AtresParser.FC_CHAVE, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(PROGRAMA);
			setState(33);
			match(ID);
			setState(34);
			match(AB_CHAVE);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					declaracao();
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090938520L) != 0)) {
				{
				{
				setState(41);
				comando();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(FC_CHAVE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_atribContext var_atrib() {
			return getRuleContext(Var_atribContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				var_atrib();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(AtresParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(TIPO);
			setState(54);
			match(ID);
			setState(55);
			match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_atribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public TerminalNode OP_ATRIB() { return getToken(AtresParser.OP_ATRIB, 0); }
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ExprMatContext exprMat() {
			return getRuleContext(ExprMatContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(AtresParser.TIPO, 0); }
		public Var_atribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterVar_atrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitVar_atrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitVar_atrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_atribContext var_atrib() throws RecognitionException {
		Var_atribContext _localctx = new Var_atribContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(57);
				match(TIPO);
				}
			}

			setState(60);
			match(ID);
			setState(61);
			match(OP_ATRIB);
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(62);
				variavel();
				}
				break;
			case 2:
				{
				setState(63);
				exprMat(0);
				}
				break;
			}
			setState(66);
			match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public CmdEntradaContext cmdEntrada() {
			return getRuleContext(CmdEntradaContext.class,0);
		}
		public CmdSaidaContext cmdSaida() {
			return getRuleContext(CmdSaidaContext.class,0);
		}
		public CmdCondicaoContext cmdCondicao() {
			return getRuleContext(CmdCondicaoContext.class,0);
		}
		public CmdReptContext cmdRept() {
			return getRuleContext(CmdReptContext.class,0);
		}
		public Var_atribContext var_atrib() {
			return getRuleContext(Var_atribContext.class,0);
		}
		public ExprMatContext exprMat() {
			return getRuleContext(ExprMatContext.class,0);
		}
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				cmdEntrada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				cmdSaida();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				cmdCondicao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				cmdRept();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				var_atrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				exprMat(0);
				setState(74);
				match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEntradaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public TerminalNode OP_ATRIB() { return getToken(AtresParser.OP_ATRIB, 0); }
		public TerminalNode ENTRADA() { return getToken(AtresParser.ENTRADA, 0); }
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public CmdEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterCmdEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitCmdEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitCmdEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEntradaContext cmdEntrada() throws RecognitionException {
		CmdEntradaContext _localctx = new CmdEntradaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(OP_ATRIB);
			setState(80);
			match(ENTRADA);
			setState(81);
			match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSaidaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(AtresParser.ESCREVA, 0); }
		public TerminalNode AB_PAR() { return getToken(AtresParser.AB_PAR, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode FC_PAR() { return getToken(AtresParser.FC_PAR, 0); }
		public TerminalNode PV() { return getToken(AtresParser.PV, 0); }
		public CmdSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterCmdSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitCmdSaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitCmdSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSaidaContext cmdSaida() throws RecognitionException {
		CmdSaidaContext _localctx = new CmdSaidaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdSaida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ESCREVA);
			setState(84);
			match(AB_PAR);
			setState(85);
			string();
			setState(86);
			match(FC_PAR);
			setState(87);
			match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdCondicaoContext extends ParserRuleContext {
		public List<TerminalNode> SE() { return getTokens(AtresParser.SE); }
		public TerminalNode SE(int i) {
			return getToken(AtresParser.SE, i);
		}
		public List<TerminalNode> AB_PAR() { return getTokens(AtresParser.AB_PAR); }
		public TerminalNode AB_PAR(int i) {
			return getToken(AtresParser.AB_PAR, i);
		}
		public List<ComparacaoContext> comparacao() {
			return getRuleContexts(ComparacaoContext.class);
		}
		public ComparacaoContext comparacao(int i) {
			return getRuleContext(ComparacaoContext.class,i);
		}
		public List<TerminalNode> FC_PAR() { return getTokens(AtresParser.FC_PAR); }
		public TerminalNode FC_PAR(int i) {
			return getToken(AtresParser.FC_PAR, i);
		}
		public List<TerminalNode> AB_CHAVE() { return getTokens(AtresParser.AB_CHAVE); }
		public TerminalNode AB_CHAVE(int i) {
			return getToken(AtresParser.AB_CHAVE, i);
		}
		public List<TerminalNode> FC_CHAVE() { return getTokens(AtresParser.FC_CHAVE); }
		public TerminalNode FC_CHAVE(int i) {
			return getToken(AtresParser.FC_CHAVE, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> SENAO() { return getTokens(AtresParser.SENAO); }
		public TerminalNode SENAO(int i) {
			return getToken(AtresParser.SENAO, i);
		}
		public CmdCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterCmdCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitCmdCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitCmdCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCondicaoContext cmdCondicao() throws RecognitionException {
		CmdCondicaoContext _localctx = new CmdCondicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdCondicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SE);
			setState(90);
			match(AB_PAR);
			setState(91);
			comparacao();
			setState(92);
			match(FC_PAR);
			setState(93);
			match(AB_CHAVE);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090938520L) != 0)) {
				{
				{
				setState(94);
				comando();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(FC_CHAVE);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(101);
				match(SENAO);
				setState(102);
				match(SE);
				setState(103);
				match(AB_PAR);
				setState(104);
				comparacao();
				setState(105);
				match(FC_PAR);
				setState(106);
				match(AB_CHAVE);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090938520L) != 0)) {
					{
					{
					setState(107);
					comando();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(FC_CHAVE);
				}
				break;
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(117);
				match(SENAO);
				setState(118);
				match(AB_CHAVE);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090938520L) != 0)) {
					{
					{
					setState(119);
					comando();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(FC_CHAVE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacaoContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public TerminalNode OP_RELAC() { return getToken(AtresParser.OP_RELAC, 0); }
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitComparacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitComparacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			variavel();
			setState(129);
			match(OP_RELAC);
			setState(130);
			variavel();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public TerminalNode INTEIRO_DEF() { return getToken(AtresParser.INTEIRO_DEF, 0); }
		public TerminalNode RACIONAL_DEF() { return getToken(AtresParser.RACIONAL_DEF, 0); }
		public TerminalNode BOOLEAN_DEF() { return getToken(AtresParser.BOOLEAN_DEF, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variavel);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ID);
				}
				break;
			case INTEIRO_DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(INTEIRO_DEF);
				}
				break;
			case RACIONAL_DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(RACIONAL_DEF);
				}
				break;
			case BOOLEAN_DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(BOOLEAN_DEF);
				}
				break;
			case STRING_DEF:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				string();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> STRING_DEF() { return getTokens(AtresParser.STRING_DEF); }
		public TerminalNode STRING_DEF(int i) {
			return getToken(AtresParser.STRING_DEF, i);
		}
		public List<TerminalNode> OP_SOMA() { return getTokens(AtresParser.OP_SOMA); }
		public TerminalNode OP_SOMA(int i) {
			return getToken(AtresParser.OP_SOMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(AtresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtresParser.ID, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(STRING_DEF);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SOMA) {
				{
				{
				setState(140);
				match(OP_SOMA);
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==STRING_DEF || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(146);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdReptContext extends ParserRuleContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public CmdReptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterCmdRept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitCmdRept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitCmdRept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdReptContext cmdRept() throws RecognitionException {
		CmdReptContext _localctx = new CmdReptContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdRept);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				for_();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				while_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AtresParser.WHILE, 0); }
		public TerminalNode AB_PAR() { return getToken(AtresParser.AB_PAR, 0); }
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public TerminalNode FC_PAR() { return getToken(AtresParser.FC_PAR, 0); }
		public TerminalNode AB_CHAVE() { return getToken(AtresParser.AB_CHAVE, 0); }
		public TerminalNode FC_CHAVE() { return getToken(AtresParser.FC_CHAVE, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(WHILE);
			setState(152);
			match(AB_PAR);
			setState(153);
			comparacao();
			setState(154);
			match(FC_PAR);
			setState(155);
			match(AB_CHAVE);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090938520L) != 0)) {
				{
				{
				setState(156);
				comando();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(FC_CHAVE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AtresParser.FOR, 0); }
		public TerminalNode AB_PAR() { return getToken(AtresParser.AB_PAR, 0); }
		public List<TerminalNode> PV() { return getTokens(AtresParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(AtresParser.PV, i);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtresParser.ID, i);
		}
		public List<TerminalNode> OP_ATRIB() { return getTokens(AtresParser.OP_ATRIB); }
		public TerminalNode OP_ATRIB(int i) {
			return getToken(AtresParser.OP_ATRIB, i);
		}
		public ExprMatContext exprMat() {
			return getRuleContext(ExprMatContext.class,0);
		}
		public TerminalNode FC_PAR() { return getToken(AtresParser.FC_PAR, 0); }
		public TerminalNode AB_CHAVE() { return getToken(AtresParser.AB_CHAVE, 0); }
		public TerminalNode FC_CHAVE() { return getToken(AtresParser.FC_CHAVE, 0); }
		public TerminalNode TIPO() { return getToken(AtresParser.TIPO, 0); }
		public TerminalNode INTEIRO_DEF() { return getToken(AtresParser.INTEIRO_DEF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(FOR);
			setState(165);
			match(AB_PAR);
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(166);
				match(TIPO);
				setState(167);
				match(ID);
				setState(168);
				match(OP_ATRIB);
				setState(169);
				match(INTEIRO_DEF);
				}
				break;
			case ID:
				{
				setState(170);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
			match(PV);
			setState(174);
			comparacao();
			setState(175);
			match(PV);
			setState(176);
			match(ID);
			setState(177);
			match(OP_ATRIB);
			setState(178);
			exprMat(0);
			setState(179);
			match(FC_PAR);
			setState(180);
			match(AB_CHAVE);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090938520L) != 0)) {
				{
				{
				setState(181);
				comando();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(FC_CHAVE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMatContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> OP_SOMA() { return getTokens(AtresParser.OP_SOMA); }
		public TerminalNode OP_SOMA(int i) {
			return getToken(AtresParser.OP_SOMA, i);
		}
		public List<TerminalNode> OP_SUB() { return getTokens(AtresParser.OP_SUB); }
		public TerminalNode OP_SUB(int i) {
			return getToken(AtresParser.OP_SUB, i);
		}
		public List<ExprMatContext> exprMat() {
			return getRuleContexts(ExprMatContext.class);
		}
		public ExprMatContext exprMat(int i) {
			return getRuleContext(ExprMatContext.class,i);
		}
		public TerminalNode OP_MULT() { return getToken(AtresParser.OP_MULT, 0); }
		public TerminalNode OP_DIV() { return getToken(AtresParser.OP_DIV, 0); }
		public ExprMatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterExprMat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitExprMat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitExprMat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMatContext exprMat() throws RecognitionException {
		return exprMat(0);
	}

	private ExprMatContext exprMat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprMatContext _localctx = new ExprMatContext(_ctx, _parentState);
		ExprMatContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exprMat, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==OP_SOMA || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				number();
				}
				break;
			case 2:
				{
				setState(192);
				number();
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_SOMA:
					{
					setState(193);
					match(OP_SOMA);
					setState(194);
					match(OP_SOMA);
					}
					break;
				case OP_SUB:
					{
					setState(195);
					match(OP_SUB);
					setState(196);
					match(OP_SUB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(199);
				number();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprMatContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprMat);
					setState(202);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(203);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(204);
					exprMat(4);
					}
					} 
				}
				setState(209);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AtresParser.ID, 0); }
		public TerminalNode INTEIRO_DEF() { return getToken(AtresParser.INTEIRO_DEF, 0); }
		public TerminalNode RACIONAL_DEF() { return getToken(AtresParser.RACIONAL_DEF, 0); }
		public TerminalNode AB_PAR() { return getToken(AtresParser.AB_PAR, 0); }
		public ExprMatContext exprMat() {
			return getRuleContext(ExprMatContext.class,0);
		}
		public TerminalNode FC_PAR() { return getToken(AtresParser.FC_PAR, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtresListener ) ((AtresListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtresVisitor ) return ((AtresVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(ID);
				}
				break;
			case INTEIRO_DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(INTEIRO_DEF);
				}
				break;
			case RACIONAL_DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(RACIONAL_DEF);
				}
				break;
			case AB_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(AB_PAR);
				setState(214);
				exprMat(0);
				setState(215);
				match(FC_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return exprMat_sempred((ExprMatContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprMat_sempred(ExprMatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0005\u0000+\b\u0000\n\u0000\f\u0000"+
		".\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"4\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0003\u0003;\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003A\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004M\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007`\b\u0007\n\u0007\f\u0007c\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007m\b\u0007\n\u0007\f\u0007p\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007t\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007y\b\u0007\n\u0007\f\u0007|\t\u0007\u0001\u0007\u0003\u0007"+
		"\u007f\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u008a\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u008f"+
		"\b\n\n\n\f\n\u0092\t\n\u0001\u000b\u0001\u000b\u0003\u000b\u0096\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u009e\b\f\n\f"+
		"\f\f\u00a1\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00ac\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b7\b\r\n\r\f\r\u00ba\t\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c6\b\u000e\u0001"+
		"\u000e\u0003\u000e\u00c9\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00ce\b\u000e\n\u000e\f\u000e\u00d1\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00da\b\u000f\u0001\u000f\u0000\u0001\u001c\u0010\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0003"+
		"\u0002\u0000\f\f\u001e\u001e\u0001\u0000\u0011\u0012\u0001\u0000\u0011"+
		"\u0014\u00ea\u0000 \u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000"+
		"\u00045\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000"+
		"\u000eY\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012"+
		"\u0089\u0001\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000\u0000\u0016"+
		"\u0095\u0001\u0000\u0000\u0000\u0018\u0097\u0001\u0000\u0000\u0000\u001a"+
		"\u00a4\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000\u0000\u0000\u001e"+
		"\u00d9\u0001\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0005\u001e"+
		"\u0000\u0000\"&\u0005\u001a\u0000\u0000#%\u0003\u0002\u0001\u0000$#\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\',\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u001b\u0000\u00000\u0001"+
		"\u0001\u0000\u0000\u000014\u0003\u0004\u0002\u000024\u0003\u0006\u0003"+
		"\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u00004\u0003\u0001"+
		"\u0000\u0000\u000056\u0005\u0003\u0000\u000067\u0005\u001e\u0000\u0000"+
		"78\u0005\u001c\u0000\u00008\u0005\u0001\u0000\u0000\u00009;\u0005\u0003"+
		"\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0005\u001e\u0000\u0000=@\u0005\u0010\u0000\u0000"+
		">A\u0003\u0012\t\u0000?A\u0003\u001c\u000e\u0000@>\u0001\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0005\u001c\u0000"+
		"\u0000C\u0007\u0001\u0000\u0000\u0000DM\u0003\n\u0005\u0000EM\u0003\f"+
		"\u0006\u0000FM\u0003\u000e\u0007\u0000GM\u0003\u0016\u000b\u0000HM\u0003"+
		"\u0006\u0003\u0000IJ\u0003\u001c\u000e\u0000JK\u0005\u001c\u0000\u0000"+
		"KM\u0001\u0000\u0000\u0000LD\u0001\u0000\u0000\u0000LE\u0001\u0000\u0000"+
		"\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000LH\u0001\u0000"+
		"\u0000\u0000LI\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0005"+
		"\u001e\u0000\u0000OP\u0005\u0010\u0000\u0000PQ\u0005\u0005\u0000\u0000"+
		"QR\u0005\u001c\u0000\u0000R\u000b\u0001\u0000\u0000\u0000ST\u0005\u0004"+
		"\u0000\u0000TU\u0005\u0018\u0000\u0000UV\u0003\u0014\n\u0000VW\u0005\u0019"+
		"\u0000\u0000WX\u0005\u001c\u0000\u0000X\r\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0007\u0000\u0000Z[\u0005\u0018\u0000\u0000[\\\u0003\u0010\b\u0000\\"+
		"]\u0005\u0019\u0000\u0000]a\u0005\u001a\u0000\u0000^`\u0003\b\u0004\u0000"+
		"_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000ds\u0005\u001b\u0000\u0000ef\u0005\b\u0000\u0000fg\u0005\u0007"+
		"\u0000\u0000gh\u0005\u0018\u0000\u0000hi\u0003\u0010\b\u0000ij\u0005\u0019"+
		"\u0000\u0000jn\u0005\u001a\u0000\u0000km\u0003\b\u0004\u0000lk\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0005\u001b\u0000\u0000rt\u0001\u0000\u0000\u0000se\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t~\u0001\u0000\u0000\u0000uv\u0005\b\u0000"+
		"\u0000vz\u0005\u001a\u0000\u0000wy\u0003\b\u0004\u0000xw\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f"+
		"\u0005\u001b\u0000\u0000~u\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u0012"+
		"\t\u0000\u0081\u0082\u0005\u0017\u0000\u0000\u0082\u0083\u0003\u0012\t"+
		"\u0000\u0083\u0011\u0001\u0000\u0000\u0000\u0084\u008a\u0005\u001e\u0000"+
		"\u0000\u0085\u008a\u0005\r\u0000\u0000\u0086\u008a\u0005\u000e\u0000\u0000"+
		"\u0087\u008a\u0005\u000f\u0000\u0000\u0088\u008a\u0003\u0014\n\u0000\u0089"+
		"\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u0089"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b"+
		"\u0090\u0005\f\u0000\u0000\u008c\u008d\u0005\u0011\u0000\u0000\u008d\u008f"+
		"\u0007\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0003\u001a\r\u0000\u0094\u0096\u0003"+
		"\u0018\f\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0017\u0001\u0000\u0000\u0000\u0097\u0098\u0005\t\u0000"+
		"\u0000\u0098\u0099\u0005\u0018\u0000\u0000\u0099\u009a\u0003\u0010\b\u0000"+
		"\u009a\u009b\u0005\u0019\u0000\u0000\u009b\u009f\u0005\u001a\u0000\u0000"+
		"\u009c\u009e\u0003\b\u0004\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u001b\u0000\u0000\u00a3"+
		"\u0019\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\n\u0000\u0000\u00a5\u00ab"+
		"\u0005\u0018\u0000\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00a8"+
		"\u0005\u001e\u0000\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9\u00ac"+
		"\u0005\r\u0000\u0000\u00aa\u00ac\u0005\u001e\u0000\u0000\u00ab\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005\u001c\u0000\u0000\u00ae\u00af\u0003"+
		"\u0010\b\u0000\u00af\u00b0\u0005\u001c\u0000\u0000\u00b0\u00b1\u0005\u001e"+
		"\u0000\u0000\u00b1\u00b2\u0005\u0010\u0000\u0000\u00b2\u00b3\u0003\u001c"+
		"\u000e\u0000\u00b3\u00b4\u0005\u0019\u0000\u0000\u00b4\u00b8\u0005\u001a"+
		"\u0000\u0000\u00b5\u00b7\u0003\b\u0004\u0000\u00b6\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001b\u0000"+
		"\u0000\u00bc\u001b\u0001\u0000\u0000\u0000\u00bd\u00be\u0006\u000e\uffff"+
		"\uffff\u0000\u00be\u00bf\u0007\u0001\u0000\u0000\u00bf\u00c9\u0003\u001e"+
		"\u000f\u0000\u00c0\u00c5\u0003\u001e\u000f\u0000\u00c1\u00c2\u0005\u0011"+
		"\u0000\u0000\u00c2\u00c6\u0005\u0011\u0000\u0000\u00c3\u00c4\u0005\u0012"+
		"\u0000\u0000\u00c4\u00c6\u0005\u0012\u0000\u0000\u00c5\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0003\u001e\u000f\u0000\u00c8\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cf\u0001\u0000\u0000\u0000\u00ca\u00cb\n\u0003\u0000"+
		"\u0000\u00cb\u00cc\u0007\u0002\u0000\u0000\u00cc\u00ce\u0003\u001c\u000e"+
		"\u0004\u00cd\u00ca\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u001d\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d2\u00da\u0005\u001e\u0000\u0000\u00d3\u00da\u0005\r\u0000\u0000"+
		"\u00d4\u00da\u0005\u000e\u0000\u0000\u00d5\u00d6\u0005\u0018\u0000\u0000"+
		"\u00d6\u00d7\u0003\u001c\u000e\u0000\u00d7\u00d8\u0005\u0019\u0000\u0000"+
		"\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d5\u0001\u0000\u0000\u0000\u00da\u001f\u0001\u0000\u0000\u0000"+
		"\u0015&,3:@Lansz~\u0089\u0090\u0095\u009f\u00ab\u00b8\u00c5\u00c8\u00cf"+
		"\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}