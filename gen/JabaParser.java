// Generated from /home/andre/IdeaProjects/Jaba/src/Jaba.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JabaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INT=5, REAL=6, BOOL=7, IF=8, ELSE=9, WHILE=10, 
		LEIA=11, ESCREVA=12, NUMERO=13, BOOL_LITERAL=14, ID=15, SEMI=16, ASSIGN=17, 
		LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, WS=22, LINE_COMMENT=23, BLOCK_COMMENT=24;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_comando = 2, RULE_tipo = 3, 
		RULE_atribuicao = 4, RULE_condicional = 5, RULE_repeticao = 6, RULE_bloco = 7, 
		RULE_entrada = 8, RULE_saida = 9, RULE_expressao = 10, RULE_termo = 11, 
		RULE_fator = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "comando", "tipo", "atribuicao", "condicional", 
			"repeticao", "bloco", "entrada", "saida", "expressao", "termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'inteiro'", "'real'", "'booleano'", 
			"'se'", "'senao'", "'enquanto'", "'leia'", "'escreva'", null, null, null, 
			"';'", "'='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "INT", "REAL", "BOOL", "IF", "ELSE", "WHILE", 
			"LEIA", "ESCREVA", "NUMERO", "BOOL_LITERAL", "ID", "SEMI", "ASSIGN", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "Jaba.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JabaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JabaParser.EOF, 0); }
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
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 40416L) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case REAL:
				case BOOL:
					{
					setState(26);
					declaracao();
					}
					break;
				case IF:
				case WHILE:
				case LEIA:
				case ESCREVA:
				case ID:
					{
					setState(27);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(EOF);
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
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoComInicializacaoContext extends DeclaracaoContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(JabaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(JabaParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JabaParser.SEMI, 0); }
		public DeclaracaoComInicializacaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterDeclaracaoComInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitDeclaracaoComInicializacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitDeclaracaoComInicializacao(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoSimplesContext extends DeclaracaoContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(JabaParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(JabaParser.SEMI, 0); }
		public DeclaracaoSimplesContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterDeclaracaoSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitDeclaracaoSimples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitDeclaracaoSimples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclaracaoSimplesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				tipo();
				setState(36);
				match(ID);
				setState(37);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclaracaoComInicializacaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				tipo();
				setState(40);
				match(ID);
				setState(41);
				match(ASSIGN);
				setState(42);
				expressao(0);
				setState(43);
				match(SEMI);
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
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				atribuicao();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				condicional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				repeticao();
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				entrada();
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				saida();
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JabaParser.INT, 0); }
		public TerminalNode REAL() { return getToken(JabaParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(JabaParser.BOOL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JabaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(JabaParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JabaParser.SEMI, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			setState(57);
			match(ASSIGN);
			setState(58);
			expressao(0);
			setState(59);
			match(SEMI);
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JabaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(JabaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JabaParser.RPAREN, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JabaParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IF);
			setState(62);
			match(LPAREN);
			setState(63);
			expressao(0);
			setState(64);
			match(RPAREN);
			setState(65);
			bloco();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(66);
				match(ELSE);
				setState(67);
				bloco();
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
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JabaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(JabaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JabaParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(WHILE);
			setState(71);
			match(LPAREN);
			setState(72);
			expressao(0);
			setState(73);
			match(RPAREN);
			setState(74);
			bloco();
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
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JabaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JabaParser.RBRACE, 0); }
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
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LBRACE);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 40416L) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case REAL:
				case BOOL:
					{
					setState(77);
					declaracao();
					}
					break;
				case IF:
				case WHILE:
				case LEIA:
				case ESCREVA:
				case ID:
					{
					setState(78);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(RBRACE);
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
	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(JabaParser.LEIA, 0); }
		public TerminalNode LPAREN() { return getToken(JabaParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(JabaParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(JabaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JabaParser.SEMI, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LEIA);
			setState(87);
			match(LPAREN);
			setState(88);
			match(ID);
			setState(89);
			match(RPAREN);
			setState(90);
			match(SEMI);
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
	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(JabaParser.ESCREVA, 0); }
		public TerminalNode LPAREN() { return getToken(JabaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JabaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JabaParser.SEMI, 0); }
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitSaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ESCREVA);
			setState(93);
			match(LPAREN);
			setState(94);
			expressao(0);
			setState(95);
			match(RPAREN);
			setState(96);
			match(SEMI);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			termo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(101);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(102);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(103);
					termo(0);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		return termo(0);
	}

	private TermoContext termo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoContext _localctx = new TermoContext(_ctx, _parentState);
		TermoContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_termo, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termo);
					setState(112);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(113);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(114);
					fator();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JabaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JabaParser.RPAREN, 0); }
		public TerminalNode NUMERO() { return getToken(JabaParser.NUMERO, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JabaParser.BOOL_LITERAL, 0); }
		public TerminalNode ID() { return getToken(JabaParser.ID, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JabaListener ) ((JabaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JabaVisitor ) return ((JabaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fator);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(LPAREN);
				setState(121);
				expressao(0);
				setState(122);
				match(RPAREN);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(NUMERO);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(BOOL_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(ID);
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
		case 10:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 11:
			return termo_sempred((TermoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termo_sempred(TermoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0082\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000\n\u0000"+
		"\f\u0000 \t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005E\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007P\b\u0007\n\u0007\f\u0007S\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\ni\b\n\n\n\f\nl\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000bt\b\u000b\n\u000b\f\u000bw\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0080\b\f\u0001"+
		"\f\u0000\u0002\u0014\u0016\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0003\u0001\u0000\u0005\u0007\u0001\u0000"+
		"\u0001\u0002\u0001\u0000\u0003\u0004\u0083\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0002-\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006"+
		"6\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000"+
		"\u0000\fF\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010"+
		"V\u0001\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014b\u0001"+
		"\u0000\u0000\u0000\u0016m\u0001\u0000\u0000\u0000\u0018\u007f\u0001\u0000"+
		"\u0000\u0000\u001a\u001d\u0003\u0002\u0001\u0000\u001b\u001d\u0003\u0004"+
		"\u0002\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000"+
		"\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001"+
		"\u0000\u0000\u0000#$\u0003\u0006\u0003\u0000$%\u0005\u000f\u0000\u0000"+
		"%&\u0005\u0010\u0000\u0000&.\u0001\u0000\u0000\u0000\'(\u0003\u0006\u0003"+
		"\u0000()\u0005\u000f\u0000\u0000)*\u0005\u0011\u0000\u0000*+\u0003\u0014"+
		"\n\u0000+,\u0005\u0010\u0000\u0000,.\u0001\u0000\u0000\u0000-#\u0001\u0000"+
		"\u0000\u0000-\'\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000\u0000"+
		"/5\u0003\b\u0004\u000005\u0003\n\u0005\u000015\u0003\f\u0006\u000025\u0003"+
		"\u0010\b\u000035\u0003\u0012\t\u00004/\u0001\u0000\u0000\u000040\u0001"+
		"\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"43\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000067\u0007\u0000"+
		"\u0000\u00007\u0007\u0001\u0000\u0000\u000089\u0005\u000f\u0000\u0000"+
		"9:\u0005\u0011\u0000\u0000:;\u0003\u0014\n\u0000;<\u0005\u0010\u0000\u0000"+
		"<\t\u0001\u0000\u0000\u0000=>\u0005\b\u0000\u0000>?\u0005\u0012\u0000"+
		"\u0000?@\u0003\u0014\n\u0000@A\u0005\u0013\u0000\u0000AD\u0003\u000e\u0007"+
		"\u0000BC\u0005\t\u0000\u0000CE\u0003\u000e\u0007\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0005"+
		"\n\u0000\u0000GH\u0005\u0012\u0000\u0000HI\u0003\u0014\n\u0000IJ\u0005"+
		"\u0013\u0000\u0000JK\u0003\u000e\u0007\u0000K\r\u0001\u0000\u0000\u0000"+
		"LQ\u0005\u0014\u0000\u0000MP\u0003\u0002\u0001\u0000NP\u0003\u0004\u0002"+
		"\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u0015\u0000\u0000"+
		"U\u000f\u0001\u0000\u0000\u0000VW\u0005\u000b\u0000\u0000WX\u0005\u0012"+
		"\u0000\u0000XY\u0005\u000f\u0000\u0000YZ\u0005\u0013\u0000\u0000Z[\u0005"+
		"\u0010\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\]\u0005\f\u0000\u0000"+
		"]^\u0005\u0012\u0000\u0000^_\u0003\u0014\n\u0000_`\u0005\u0013\u0000\u0000"+
		"`a\u0005\u0010\u0000\u0000a\u0013\u0001\u0000\u0000\u0000bc\u0006\n\uffff"+
		"\uffff\u0000cd\u0003\u0016\u000b\u0000dj\u0001\u0000\u0000\u0000ef\n\u0002"+
		"\u0000\u0000fg\u0007\u0001\u0000\u0000gi\u0003\u0016\u000b\u0000he\u0001"+
		"\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000k\u0015\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mn\u0006\u000b\uffff\uffff\u0000no\u0003\u0018\f\u0000ou\u0001"+
		"\u0000\u0000\u0000pq\n\u0002\u0000\u0000qr\u0007\u0002\u0000\u0000rt\u0003"+
		"\u0018\f\u0000sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0017\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0012\u0000\u0000yz\u0003\u0014"+
		"\n\u0000z{\u0005\u0013\u0000\u0000{\u0080\u0001\u0000\u0000\u0000|\u0080"+
		"\u0005\r\u0000\u0000}\u0080\u0005\u000e\u0000\u0000~\u0080\u0005\u000f"+
		"\u0000\u0000\u007fx\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0019"+
		"\u0001\u0000\u0000\u0000\n\u001c\u001e-4DOQju\u007f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}