// Generated from C:/Users/nxpan/Desktop/LenguajesProgr/Taller3/PseIntToPython/grammar\PseIntGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseIntGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_INICIOPROCESO=1, TOKEN_FINPROCESO=2, TOKEN_INICIOSUBPROCESO=3, TOKEN_FINSUBPROCESO=4, 
		TOKEN_DEFINIR=5, TOKEN_COMO=6, TOKEN_TIPO=7, TOKEN_COMANDOESPECIAL=8, 
		TOKEN_COMANDOLEER=9, TOKEN_COMANDOESCRIBIR=10, TOKEN_COMANDODIMENSION=11, 
		VERDADERO=12, FALSE=13, PARA=14, QUE=15, HASTA=16, CON=17, PASO=18, HACER=19, 
		FINPARA=20, SI=21, ENTONCES=22, SINO=23, FINSI=24, SEGUN=25, DE=26, OTRO=27, 
		CASO=28, MODO=29, FINSEGUN=30, MIENTRAS=31, FINMIENTRAS=32, REPETIR=33, 
		FUNCION=34, FINFUNCION=35, LIMPIAR=36, MOD=37, NO=38, O=39, Y=40, TOKEN_MAS=41, 
		TOKEN_MENOS=42, TOKEN_MUL=43, TOKEN_DIV=44, TOKEN_PARIZQ=45, TOKEN_PARDER=46, 
		TOKEN_CORIZQ=47, TOKEN_CORDER=48, TOKEN_MOD=49, TOKEN_IGUAL=50, TOKEN_IGUALDAD=51, 
		TOKEN_DIFERENTE=52, TOKEN_MENOR=53, TOKEN_MENORIGUAL=54, TOKEN_MAYOR=55, 
		TOKEN_MAYORIGUAL=56, TOKEN_COMA=57, TOKEN_PUNTOYCOMA=58, TOKEN_COMILLAS=59, 
		TOKEN_ASIGNACION=60, TOKEN_NEG=61, TOKEN_COMENTARIO=62, TOKEN_O=63, TOKEN_Y=64, 
		TOKEN_POT=65, INT=66, DOUBLE=67, STRING=68, ID=69, SPACE=70;
	public static final int
		RULE_programa = 0, RULE_subproceso = 1, RULE_id_subproceso = 2, RULE_arg = 3, 
		RULE_comandos = 4, RULE_definicion_variables = 5, RULE_asignacion_variable = 6, 
		RULE_asignacion = 7, RULE_expresion = 8, RULE_term = 9, RULE_factor = 10, 
		RULE_comandos_especiales = 11, RULE_comando_escribir = 12, RULE_comando_leer = 13, 
		RULE_dimensionamiento_arreglo = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "subproceso", "id_subproceso", "arg", "comandos", "definicion_variables", 
			"asignacion_variable", "asignacion", "expresion", "term", "factor", "comandos_especiales", 
			"comando_escribir", "comando_leer", "dimensionamiento_arreglo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'SubProceso'", "'FinSubProceso'", "'definir'", "'como'", 
			null, null, "'Leer'", "'Escribir'", "'Dimension'", "'verdadero'", "'falso'", 
			"'Para'", "'Que'", "'Hasta'", "'Con'", "'Paso'", "'Hacer'", "'FinPara'", 
			"'Si'", "'Entonces'", "'Sino'", "'FinSi'", "'Segun'", "'De'", "'otro'", 
			"'caso'", "'modo'", "'FinSegun'", "'Mientras'", "'FinMientras'", "'Repetir'", 
			"'Funcion'", "'FinFuncion'", "'limpiar'", "'mod'", "'no'", "'o'", "'y'", 
			"'+'", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", "'%'", "'='", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "','", "';'", "'\"'", "'<-'", 
			"'~'", "'//'", "'|'", "'&'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_INICIOPROCESO", "TOKEN_FINPROCESO", "TOKEN_INICIOSUBPROCESO", 
			"TOKEN_FINSUBPROCESO", "TOKEN_DEFINIR", "TOKEN_COMO", "TOKEN_TIPO", "TOKEN_COMANDOESPECIAL", 
			"TOKEN_COMANDOLEER", "TOKEN_COMANDOESCRIBIR", "TOKEN_COMANDODIMENSION", 
			"VERDADERO", "FALSE", "PARA", "QUE", "HASTA", "CON", "PASO", "HACER", 
			"FINPARA", "SI", "ENTONCES", "SINO", "FINSI", "SEGUN", "DE", "OTRO", 
			"CASO", "MODO", "FINSEGUN", "MIENTRAS", "FINMIENTRAS", "REPETIR", "FUNCION", 
			"FINFUNCION", "LIMPIAR", "MOD", "NO", "O", "Y", "TOKEN_MAS", "TOKEN_MENOS", 
			"TOKEN_MUL", "TOKEN_DIV", "TOKEN_PARIZQ", "TOKEN_PARDER", "TOKEN_CORIZQ", 
			"TOKEN_CORDER", "TOKEN_MOD", "TOKEN_IGUAL", "TOKEN_IGUALDAD", "TOKEN_DIFERENTE", 
			"TOKEN_MENOR", "TOKEN_MENORIGUAL", "TOKEN_MAYOR", "TOKEN_MAYORIGUAL", 
			"TOKEN_COMA", "TOKEN_PUNTOYCOMA", "TOKEN_COMILLAS", "TOKEN_ASIGNACION", 
			"TOKEN_NEG", "TOKEN_COMENTARIO", "TOKEN_O", "TOKEN_Y", "TOKEN_POT", "INT", 
			"DOUBLE", "STRING", "ID", "SPACE"
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
	public String getGrammarFileName() { return "PseIntGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseIntGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode TOKEN_INICIOPROCESO() { return getToken(PseIntGrammarParser.TOKEN_INICIOPROCESO, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode TOKEN_FINPROCESO() { return getToken(PseIntGrammarParser.TOKEN_FINPROCESO, 0); }
		public List<SubprocesoContext> subproceso() {
			return getRuleContexts(SubprocesoContext.class);
		}
		public SubprocesoContext subproceso(int i) {
			return getRuleContext(SubprocesoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitPrograma(this);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_INICIOSUBPROCESO) {
				{
				{
				setState(30);
				subproceso();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(TOKEN_INICIOPROCESO);
			setState(37);
			match(ID);
			setState(38);
			comandos();
			setState(39);
			match(TOKEN_FINPROCESO);
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

	public static class SubprocesoContext extends ParserRuleContext {
		public TerminalNode TOKEN_INICIOSUBPROCESO() { return getToken(PseIntGrammarParser.TOKEN_INICIOSUBPROCESO, 0); }
		public Id_subprocesoContext id_subproceso() {
			return getRuleContext(Id_subprocesoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode TOKEN_FINSUBPROCESO() { return getToken(PseIntGrammarParser.TOKEN_FINSUBPROCESO, 0); }
		public SubprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterSubproceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitSubproceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitSubproceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprocesoContext subproceso() throws RecognitionException {
		SubprocesoContext _localctx = new SubprocesoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subproceso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(TOKEN_INICIOSUBPROCESO);
			setState(42);
			id_subproceso();
			setState(43);
			comandos();
			setState(44);
			match(TOKEN_FINSUBPROCESO);
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

	public static class Id_subprocesoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PseIntGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseIntGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_ASIGNACION() { return getToken(PseIntGrammarParser.TOKEN_ASIGNACION, 0); }
		public TerminalNode TOKEN_PARIZQ() { return getToken(PseIntGrammarParser.TOKEN_PARIZQ, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode TOKEN_PARDER() { return getToken(PseIntGrammarParser.TOKEN_PARDER, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public Id_subprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subproceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterId_subproceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitId_subproceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitId_subproceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subprocesoContext id_subproceso() throws RecognitionException {
		Id_subprocesoContext _localctx = new Id_subprocesoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id_subproceso);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(ID);
				setState(48);
				match(TOKEN_ASIGNACION);
				setState(49);
				match(ID);
				setState(50);
				match(TOKEN_PARIZQ);
				setState(51);
				arg();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(52);
					match(TOKEN_COMA);
					setState(53);
					arg();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(TOKEN_PARDER);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PseIntGrammarParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INT - 66)) | (1L << (DOUBLE - 66)) | (1L << (ID - 66)))) != 0)) ) {
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

	public static class ComandosContext extends ParserRuleContext {
		public List<Definicion_variablesContext> definicion_variables() {
			return getRuleContexts(Definicion_variablesContext.class);
		}
		public Definicion_variablesContext definicion_variables(int i) {
			return getRuleContext(Definicion_variablesContext.class,i);
		}
		public List<Asignacion_variableContext> asignacion_variable() {
			return getRuleContexts(Asignacion_variableContext.class);
		}
		public Asignacion_variableContext asignacion_variable(int i) {
			return getRuleContext(Asignacion_variableContext.class,i);
		}
		public List<Comandos_especialesContext> comandos_especiales() {
			return getRuleContexts(Comandos_especialesContext.class);
		}
		public Comandos_especialesContext comandos_especiales(int i) {
			return getRuleContext(Comandos_especialesContext.class,i);
		}
		public List<Comando_escribirContext> comando_escribir() {
			return getRuleContexts(Comando_escribirContext.class);
		}
		public Comando_escribirContext comando_escribir(int i) {
			return getRuleContext(Comando_escribirContext.class,i);
		}
		public List<Comando_leerContext> comando_leer() {
			return getRuleContexts(Comando_leerContext.class);
		}
		public Comando_leerContext comando_leer(int i) {
			return getRuleContext(Comando_leerContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_DEFINIR) {
				{
				{
				setState(65);
				definicion_variables();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(71);
				asignacion_variable();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMANDOESPECIAL) {
				{
				{
				setState(77);
				comandos_especiales();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMANDOESCRIBIR) {
				{
				{
				setState(83);
				comando_escribir();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMANDOLEER) {
				{
				{
				setState(89);
				comando_leer();
				}
				}
				setState(94);
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

	public static class Definicion_variablesContext extends ParserRuleContext {
		public TerminalNode TOKEN_DEFINIR() { return getToken(PseIntGrammarParser.TOKEN_DEFINIR, 0); }
		public List<TerminalNode> ID() { return getTokens(PseIntGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseIntGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_COMO() { return getToken(PseIntGrammarParser.TOKEN_COMO, 0); }
		public TerminalNode TOKEN_TIPO() { return getToken(PseIntGrammarParser.TOKEN_TIPO, 0); }
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public Definicion_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterDefinicion_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitDefinicion_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitDefinicion_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_variablesContext definicion_variables() throws RecognitionException {
		Definicion_variablesContext _localctx = new Definicion_variablesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definicion_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(TOKEN_DEFINIR);
			setState(96);
			match(ID);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(97);
				match(TOKEN_COMA);
				setState(98);
				match(ID);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(TOKEN_COMO);
			setState(105);
			match(TOKEN_TIPO);
			setState(106);
			match(TOKEN_PUNTOYCOMA);
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

	public static class Asignacion_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_ASIGNACION() { return getToken(PseIntGrammarParser.TOKEN_ASIGNACION, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public Asignacion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterAsignacion_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitAsignacion_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitAsignacion_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_variableContext asignacion_variable() throws RecognitionException {
		Asignacion_variableContext _localctx = new Asignacion_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(TOKEN_ASIGNACION);
			setState(110);
			asignacion();
			setState(111);
			match(TOKEN_PUNTOYCOMA);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PseIntGrammarParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(PseIntGrammarParser.STRING, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(DOUBLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				expresion();
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

	public static class ExpresionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TOKEN_MAS() { return getTokens(PseIntGrammarParser.TOKEN_MAS); }
		public TerminalNode TOKEN_MAS(int i) {
			return getToken(PseIntGrammarParser.TOKEN_MAS, i);
		}
		public List<TerminalNode> TOKEN_MENOS() { return getTokens(PseIntGrammarParser.TOKEN_MENOS); }
		public TerminalNode TOKEN_MENOS(int i) {
			return getToken(PseIntGrammarParser.TOKEN_MENOS, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			term();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MAS || _la==TOKEN_MENOS) {
				{
				{
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				term();
				}
				}
				setState(126);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TOKEN_MUL() { return getTokens(PseIntGrammarParser.TOKEN_MUL); }
		public TerminalNode TOKEN_MUL(int i) {
			return getToken(PseIntGrammarParser.TOKEN_MUL, i);
		}
		public List<TerminalNode> TOKEN_DIV() { return getTokens(PseIntGrammarParser.TOKEN_DIV); }
		public TerminalNode TOKEN_DIV(int i) {
			return getToken(PseIntGrammarParser.TOKEN_DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			factor();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MUL || _la==TOKEN_DIV) {
				{
				{
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_MUL || _la==TOKEN_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				factor();
				}
				}
				setState(134);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PseIntGrammarParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_PARIZQ() { return getToken(PseIntGrammarParser.TOKEN_PARIZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TOKEN_PARDER() { return getToken(PseIntGrammarParser.TOKEN_PARDER, 0); }
		public TerminalNode STRING() { return getToken(PseIntGrammarParser.STRING, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(DOUBLE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(ID);
				}
				break;
			case TOKEN_PARIZQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(TOKEN_PARIZQ);
				setState(139);
				expresion();
				setState(140);
				match(TOKEN_PARDER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(STRING);
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

	public static class Comandos_especialesContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMANDOESPECIAL() { return getToken(PseIntGrammarParser.TOKEN_COMANDOESPECIAL, 0); }
		public List<TerminalNode> ID() { return getTokens(PseIntGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseIntGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public Comandos_especialesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos_especiales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComandos_especiales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComandos_especiales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComandos_especiales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comandos_especialesContext comandos_especiales() throws RecognitionException {
		Comandos_especialesContext _localctx = new Comandos_especialesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandos_especiales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(TOKEN_COMANDOESPECIAL);
			setState(146);
			match(ID);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(147);
				match(TOKEN_COMA);
				setState(148);
				match(ID);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(TOKEN_PUNTOYCOMA);
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

	public static class Comando_escribirContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMANDOESCRIBIR() { return getToken(PseIntGrammarParser.TOKEN_COMANDOESCRIBIR, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public Comando_escribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComando_escribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComando_escribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComando_escribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_escribirContext comando_escribir() throws RecognitionException {
		Comando_escribirContext _localctx = new Comando_escribirContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comando_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TOKEN_COMANDOESCRIBIR);
			setState(157);
			expresion();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(158);
				match(TOKEN_COMA);
				setState(159);
				expresion();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(TOKEN_PUNTOYCOMA);
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

	public static class Comando_leerContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMANDOLEER() { return getToken(PseIntGrammarParser.TOKEN_COMANDOLEER, 0); }
		public List<TerminalNode> ID() { return getTokens(PseIntGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseIntGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PseIntGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PseIntGrammarParser.TOKEN_COMA, i);
		}
		public Comando_leerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComando_leer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComando_leer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComando_leer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_leerContext comando_leer() throws RecognitionException {
		Comando_leerContext _localctx = new Comando_leerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando_leer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(TOKEN_COMANDOLEER);
			setState(168);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(169);
				match(TOKEN_COMA);
				setState(170);
				match(ID);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(TOKEN_PUNTOYCOMA);
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

	public static class Dimensionamiento_arregloContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMANDODIMENSION() { return getToken(PseIntGrammarParser.TOKEN_COMANDODIMENSION, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_CORIZQ() { return getToken(PseIntGrammarParser.TOKEN_CORIZQ, 0); }
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode TOKEN_CORDER() { return getToken(PseIntGrammarParser.TOKEN_CORDER, 0); }
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public Dimensionamiento_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionamiento_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterDimensionamiento_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitDimensionamiento_arreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitDimensionamiento_arreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimensionamiento_arregloContext dimensionamiento_arreglo() throws RecognitionException {
		Dimensionamiento_arregloContext _localctx = new Dimensionamiento_arregloContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dimensionamiento_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(TOKEN_COMANDODIMENSION);
			setState(179);
			match(ID);
			setState(180);
			match(TOKEN_CORIZQ);
			setState(181);
			match(INT);
			setState(182);
			match(TOKEN_CORDER);
			setState(183);
			match(TOKEN_PUNTOYCOMA);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\6\7\6E\n"+
		"\6\f\6\16\6H\13\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\7\6Q\n\6\f\6\16\6T\13"+
		"\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\7\3\7\3\7"+
		"\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\5\tx\n\t\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13\3\13"+
		"\3\13\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0092\n\f\3\r\3\r\3\r\3\r\7\r\u0098\n\r\f\r\16\r\u009b\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6\13\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\5\4\2DEGG\3\2+,\3\2-.\2\u00c1\2#\3\2\2\2\4"+
		"+\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nF\3\2\2\2\fa\3\2\2\2\16n\3\2\2\2\20w"+
		"\3\2\2\2\22y\3\2\2\2\24\u0081\3\2\2\2\26\u0091\3\2\2\2\30\u0093\3\2\2"+
		"\2\32\u009e\3\2\2\2\34\u00a9\3\2\2\2\36\u00b4\3\2\2\2 \"\5\4\3\2! \3\2"+
		"\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\3\2\2\'("+
		"\7G\2\2()\5\n\6\2)*\7\4\2\2*\3\3\2\2\2+,\7\5\2\2,-\5\6\4\2-.\5\n\6\2."+
		"/\7\6\2\2/\5\3\2\2\2\60@\7G\2\2\61\62\7G\2\2\62\63\7>\2\2\63\64\7G\2\2"+
		"\64\65\7/\2\2\65:\5\b\5\2\66\67\7;\2\2\679\5\b\5\28\66\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\60\2\2>@\3\2\2\2?\60\3"+
		"\2\2\2?\61\3\2\2\2@\7\3\2\2\2AB\t\2\2\2B\t\3\2\2\2CE\5\f\7\2DC\3\2\2\2"+
		"EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GL\3\2\2\2HF\3\2\2\2IK\5\16\b\2JI\3\2\2"+
		"\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\5\30\r\2PO\3\2"+
		"\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SX\3\2\2\2TR\3\2\2\2UW\5\32\16\2VU\3"+
		"\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5\34\17\2\\"+
		"[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\13\3\2\2\2`^\3\2\2\2ab\7\7\2"+
		"\2bg\7G\2\2cd\7;\2\2df\7G\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ig\3\2\2\2jk\7\b\2\2kl\7\t\2\2lm\7<\2\2m\r\3\2\2\2no\7G\2\2"+
		"op\7>\2\2pq\5\20\t\2qr\7<\2\2r\17\3\2\2\2sx\7D\2\2tx\7E\2\2ux\7F\2\2v"+
		"x\5\22\n\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\21\3\2\2\2y~\5\24"+
		"\13\2z{\t\3\2\2{}\5\24\13\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\23\3\2\2\2\u0080~\3\2\2\2\u0081\u0086\5\26\f\2\u0082\u0083"+
		"\t\4\2\2\u0083\u0085\5\26\f\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u0092\7D\2\2\u008a\u0092\7E\2\2\u008b\u0092\7G\2\2\u008c"+
		"\u008d\7/\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\60\2\2\u008f\u0092\3"+
		"\2\2\2\u0090\u0092\7F\2\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2\2\2\u0091"+
		"\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u0090\3\2\2\2\u0092\27\3\2\2"+
		"\2\u0093\u0094\7\n\2\2\u0094\u0099\7G\2\2\u0095\u0096\7;\2\2\u0096\u0098"+
		"\7G\2\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7<"+
		"\2\2\u009d\31\3\2\2\2\u009e\u009f\7\f\2\2\u009f\u00a4\5\22\n\2\u00a0\u00a1"+
		"\7;\2\2\u00a1\u00a3\5\22\n\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a8\7<\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00af"+
		"\7G\2\2\u00ab\u00ac\7;\2\2\u00ac\u00ae\7G\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7<\2\2\u00b3\35\3\2\2\2\u00b4\u00b5"+
		"\7\r\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\7D\2\2\u00b8"+
		"\u00b9\7\62\2\2\u00b9\u00ba\7<\2\2\u00ba\37\3\2\2\2\22#:?FLRX^gw~\u0086"+
		"\u0091\u0099\u00a4\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}