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
		TOKEN_OTROMODO=12, VERDADERO=13, FALSE=14, PARA=15, QUE=16, HASTA=17, 
		CON=18, PASO=19, HACER=20, FINPARA=21, SI=22, ENTONCES=23, SINO=24, FINSI=25, 
		SEGUN=26, DE=27, OTRO=28, CASO=29, MODO=30, FINSEGUN=31, MIENTRAS=32, 
		FINMIENTRAS=33, REPETIR=34, FUNCION=35, FINFUNCION=36, LIMPIAR=37, MOD=38, 
		NO=39, O=40, Y=41, TOKEN_MAS=42, TOKEN_MENOS=43, TOKEN_MUL=44, TOKEN_DIV=45, 
		TOKEN_PARIZQ=46, TOKEN_PARDER=47, TOKEN_CORIZQ=48, TOKEN_CORDER=49, TOKEN_MOD=50, 
		TOKEN_IGUAL=51, TOKEN_IGUALDAD=52, TOKEN_DIFERENTE=53, TOKEN_MENOR=54, 
		TOKEN_MENORIGUAL=55, TOKEN_MAYOR=56, TOKEN_MAYORIGUAL=57, TOKEN_COMA=58, 
		TOKEN_DOSPUNTOS=59, TOKEN_PUNTOYCOMA=60, TOKEN_COMILLAS=61, TOKEN_ASIGNACION=62, 
		TOKEN_NEG=63, TOKEN_COMENTARIO=64, TOKEN_O=65, TOKEN_Y=66, TOKEN_POT=67, 
		INT=68, DOUBLE=69, STRING=70, ID=71, SPACE=72, COMMENT=73;
	public static final int
		RULE_programa = 0, RULE_proceso = 1, RULE_subproceso = 2, RULE_id_subproceso = 3, 
		RULE_arg = 4, RULE_comandos = 5, RULE_comando = 6, RULE_comentario = 7, 
		RULE_definicion_variables = 8, RULE_asignacion_variable = 9, RULE_asignacion = 10, 
		RULE_expresion = 11, RULE_term = 12, RULE_factor = 13, RULE_funcion = 14, 
		RULE_comandos_especiales = 15, RULE_comando_escribir = 16, RULE_comando_leer = 17, 
		RULE_dimensionamiento_arreglo = 18, RULE_coma = 19, RULE_expresion_escribir = 20, 
		RULE_condicional_si = 21, RULE_condicion = 22, RULE_comparacion = 23, 
		RULE_condicion_sino = 24, RULE_ciclo_para = 25, RULE_ciclo_mientras = 26, 
		RULE_ciclo_repetirhasta = 27, RULE_paso = 28, RULE_asignacion_para = 29, 
		RULE_comando_segunhacer = 30, RULE_caso = 31, RULE_de_otro_modo = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "proceso", "subproceso", "id_subproceso", "arg", "comandos", 
			"comando", "comentario", "definicion_variables", "asignacion_variable", 
			"asignacion", "expresion", "term", "factor", "funcion", "comandos_especiales", 
			"comando_escribir", "comando_leer", "dimensionamiento_arreglo", "coma", 
			"expresion_escribir", "condicional_si", "condicion", "comparacion", "condicion_sino", 
			"ciclo_para", "ciclo_mientras", "ciclo_repetirhasta", "paso", "asignacion_para", 
			"comando_segunhacer", "caso", "de_otro_modo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'subproceso'", "'finsubproceso'", "'definir'", "'como'", 
			null, null, "'leer'", "'escribir'", "'dimension'", "'de otro modo'", 
			"'verdadero'", "'falso'", "'para'", "'que'", "'hasta'", "'con'", "'paso'", 
			"'hacer'", "'finpara'", "'si'", "'entonces'", "'sino'", "'finsi'", "'segun'", 
			"'de'", "'otro'", "'caso'", "'modo'", "'finsegun'", "'mientras'", "'finmientras'", 
			"'repetir'", "'funcion'", "'finfuncion'", "'limpiar'", "'mod'", "'no'", 
			"'o'", "'y'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", 
			"'%'", "'='", "'=='", "'<>'", "'<'", "'<='", "'>'", "'>='", "','", "':'", 
			"';'", "'\"'", "'<-'", "'~'", "'//'", "'|'", "'&'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_INICIOPROCESO", "TOKEN_FINPROCESO", "TOKEN_INICIOSUBPROCESO", 
			"TOKEN_FINSUBPROCESO", "TOKEN_DEFINIR", "TOKEN_COMO", "TOKEN_TIPO", "TOKEN_COMANDOESPECIAL", 
			"TOKEN_COMANDOLEER", "TOKEN_COMANDOESCRIBIR", "TOKEN_COMANDODIMENSION", 
			"TOKEN_OTROMODO", "VERDADERO", "FALSE", "PARA", "QUE", "HASTA", "CON", 
			"PASO", "HACER", "FINPARA", "SI", "ENTONCES", "SINO", "FINSI", "SEGUN", 
			"DE", "OTRO", "CASO", "MODO", "FINSEGUN", "MIENTRAS", "FINMIENTRAS", 
			"REPETIR", "FUNCION", "FINFUNCION", "LIMPIAR", "MOD", "NO", "O", "Y", 
			"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_DIV", "TOKEN_PARIZQ", 
			"TOKEN_PARDER", "TOKEN_CORIZQ", "TOKEN_CORDER", "TOKEN_MOD", "TOKEN_IGUAL", 
			"TOKEN_IGUALDAD", "TOKEN_DIFERENTE", "TOKEN_MENOR", "TOKEN_MENORIGUAL", 
			"TOKEN_MAYOR", "TOKEN_MAYORIGUAL", "TOKEN_COMA", "TOKEN_DOSPUNTOS", "TOKEN_PUNTOYCOMA", 
			"TOKEN_COMILLAS", "TOKEN_ASIGNACION", "TOKEN_NEG", "TOKEN_COMENTARIO", 
			"TOKEN_O", "TOKEN_Y", "TOKEN_POT", "INT", "DOUBLE", "STRING", "ID", "SPACE", 
			"COMMENT"
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
		public ProcesoContext proceso() {
			return getRuleContext(ProcesoContext.class,0);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(66);
				comentario();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_INICIOSUBPROCESO) {
				{
				{
				setState(72);
				subproceso();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(78);
			proceso();
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

	public static class ProcesoContext extends ParserRuleContext {
		public TerminalNode TOKEN_INICIOPROCESO() { return getToken(PseIntGrammarParser.TOKEN_INICIOPROCESO, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_FINPROCESO() { return getToken(PseIntGrammarParser.TOKEN_FINPROCESO, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public ProcesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterProceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitProceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitProceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcesoContext proceso() throws RecognitionException {
		ProcesoContext _localctx = new ProcesoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(TOKEN_INICIOPROCESO);
			setState(81);
			match(ID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_DEFINIR) | (1L << TOKEN_COMANDOESPECIAL) | (1L << TOKEN_COMANDOLEER) | (1L << TOKEN_COMANDOESCRIBIR) | (1L << TOKEN_COMANDODIMENSION) | (1L << PARA) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR))) != 0) || _la==ID || _la==COMMENT) {
				{
				{
				setState(82);
				comandos();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
		enterRule(_localctx, 4, RULE_subproceso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(TOKEN_INICIOSUBPROCESO);
			setState(91);
			id_subproceso();
			setState(92);
			comandos();
			setState(93);
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
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_ASIGNACION() { return getToken(PseIntGrammarParser.TOKEN_ASIGNACION, 0); }
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
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
		enterRule(_localctx, 6, RULE_id_subproceso);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(ID);
				setState(97);
				match(TOKEN_ASIGNACION);
				setState(98);
				funcion();
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
		enterRule(_localctx, 8, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INT - 68)) | (1L << (DOUBLE - 68)) | (1L << (ID - 68)))) != 0)) ) {
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
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
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
		enterRule(_localctx, 10, RULE_comandos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			comando();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					comando();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ComandoContext extends ParserRuleContext {
		public Definicion_variablesContext definicion_variables() {
			return getRuleContext(Definicion_variablesContext.class,0);
		}
		public Asignacion_variableContext asignacion_variable() {
			return getRuleContext(Asignacion_variableContext.class,0);
		}
		public Comandos_especialesContext comandos_especiales() {
			return getRuleContext(Comandos_especialesContext.class,0);
		}
		public Comando_escribirContext comando_escribir() {
			return getRuleContext(Comando_escribirContext.class,0);
		}
		public Comando_leerContext comando_leer() {
			return getRuleContext(Comando_leerContext.class,0);
		}
		public Dimensionamiento_arregloContext dimensionamiento_arreglo() {
			return getRuleContext(Dimensionamiento_arregloContext.class,0);
		}
		public Condicional_siContext condicional_si() {
			return getRuleContext(Condicional_siContext.class,0);
		}
		public Ciclo_paraContext ciclo_para() {
			return getRuleContext(Ciclo_paraContext.class,0);
		}
		public Ciclo_mientrasContext ciclo_mientras() {
			return getRuleContext(Ciclo_mientrasContext.class,0);
		}
		public Ciclo_repetirhastaContext ciclo_repetirhasta() {
			return getRuleContext(Ciclo_repetirhastaContext.class,0);
		}
		public Comando_segunhacerContext comando_segunhacer() {
			return getRuleContext(Comando_segunhacerContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				definicion_variables();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				asignacion_variable();
				}
				break;
			case TOKEN_COMANDOESPECIAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				comandos_especiales();
				}
				break;
			case TOKEN_COMANDOESCRIBIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				comando_escribir();
				}
				break;
			case TOKEN_COMANDOLEER:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				comando_leer();
				}
				break;
			case TOKEN_COMANDODIMENSION:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				dimensionamiento_arreglo();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				condicional_si();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				ciclo_para();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				ciclo_mientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				ciclo_repetirhasta();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				comando_segunhacer();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 12);
				{
				setState(121);
				comentario();
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(PseIntGrammarParser.COMMENT, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(COMMENT);
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
		enterRule(_localctx, 16, RULE_definicion_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(TOKEN_DEFINIR);
			setState(127);
			match(ID);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(128);
				match(TOKEN_COMA);
				setState(129);
				match(ID);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(TOKEN_COMO);
			setState(136);
			match(TOKEN_TIPO);
			setState(137);
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
		enterRule(_localctx, 18, RULE_asignacion_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(140);
			match(TOKEN_ASIGNACION);
			setState(141);
			asignacion();
			setState(142);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PseIntGrammarParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(PseIntGrammarParser.STRING, 0); }
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				funcion();
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
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			term();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MAS || _la==TOKEN_MENOS) {
				{
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				term();
				}
				}
				setState(158);
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
		enterRule(_localctx, 24, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			factor();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MUL || _la==TOKEN_DIV) {
				{
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_MUL || _la==TOKEN_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				factor();
				}
				}
				setState(166);
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
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(DOUBLE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(ID);
				}
				break;
			case TOKEN_PARIZQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(TOKEN_PARIZQ);
				setState(171);
				expresion();
				setState(172);
				match(TOKEN_PARDER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
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
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(TOKEN_PARIZQ);
			setState(179);
			arg();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(180);
				match(TOKEN_COMA);
				setState(181);
				arg();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(TOKEN_PARDER);
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
		enterRule(_localctx, 30, RULE_comandos_especiales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(TOKEN_COMANDOESPECIAL);
			setState(190);
			match(ID);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(191);
				match(TOKEN_COMA);
				setState(192);
				match(ID);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
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
		public List<Expresion_escribirContext> expresion_escribir() {
			return getRuleContexts(Expresion_escribirContext.class);
		}
		public Expresion_escribirContext expresion_escribir(int i) {
			return getRuleContext(Expresion_escribirContext.class,i);
		}
		public TerminalNode TOKEN_PUNTOYCOMA() { return getToken(PseIntGrammarParser.TOKEN_PUNTOYCOMA, 0); }
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
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
		enterRule(_localctx, 32, RULE_comando_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(TOKEN_COMANDOESCRIBIR);
			setState(201);
			expresion_escribir();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(202);
				coma();
				setState(203);
				expresion_escribir();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
		enterRule(_localctx, 34, RULE_comando_leer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(TOKEN_COMANDOLEER);
			setState(213);
			match(ID);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(214);
				match(TOKEN_COMA);
				setState(215);
				match(ID);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
		enterRule(_localctx, 36, RULE_dimensionamiento_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(TOKEN_COMANDODIMENSION);
			setState(224);
			match(ID);
			setState(225);
			match(TOKEN_CORIZQ);
			setState(226);
			match(INT);
			setState(227);
			match(TOKEN_CORDER);
			setState(228);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PseIntGrammarParser.TOKEN_COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(TOKEN_COMA);
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

	public static class Expresion_escribirContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Expresion_escribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterExpresion_escribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitExpresion_escribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitExpresion_escribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_escribirContext expresion_escribir() throws RecognitionException {
		Expresion_escribirContext _localctx = new Expresion_escribirContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expresion();
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

	public static class Condicional_siContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PseIntGrammarParser.SI, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(PseIntGrammarParser.ENTONCES, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Condicion_sinoContext condicion_sino() {
			return getRuleContext(Condicion_sinoContext.class,0);
		}
		public TerminalNode FINSI() { return getToken(PseIntGrammarParser.FINSI, 0); }
		public TerminalNode TOKEN_PARIZQ() { return getToken(PseIntGrammarParser.TOKEN_PARIZQ, 0); }
		public TerminalNode TOKEN_PARDER() { return getToken(PseIntGrammarParser.TOKEN_PARDER, 0); }
		public Condicional_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCondicional_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCondicional_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCondicional_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicional_siContext condicional_si() throws RecognitionException {
		Condicional_siContext _localctx = new Condicional_siContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicional_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(SI);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_PARIZQ) {
				{
				setState(235);
				match(TOKEN_PARIZQ);
				}
			}

			setState(238);
			condicion();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_PARDER) {
				{
				setState(239);
				match(TOKEN_PARDER);
				}
			}

			setState(242);
			match(ENTONCES);
			setState(243);
			comandos();
			setState(244);
			condicion_sino();
			setState(245);
			match(FINSI);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PseIntGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseIntGrammarParser.ID, i);
		}
		public List<ComparacionContext> comparacion() {
			return getRuleContexts(ComparacionContext.class);
		}
		public ComparacionContext comparacion(int i) {
			return getRuleContext(ComparacionContext.class,i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<TerminalNode> Y() { return getTokens(PseIntGrammarParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(PseIntGrammarParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(PseIntGrammarParser.O); }
		public TerminalNode O(int i) {
			return getToken(PseIntGrammarParser.O, i);
		}
		public List<TerminalNode> TOKEN_O() { return getTokens(PseIntGrammarParser.TOKEN_O); }
		public TerminalNode TOKEN_O(int i) {
			return getToken(PseIntGrammarParser.TOKEN_O, i);
		}
		public List<TerminalNode> TOKEN_Y() { return getTokens(PseIntGrammarParser.TOKEN_Y); }
		public TerminalNode TOKEN_Y(int i) {
			return getToken(PseIntGrammarParser.TOKEN_Y, i);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(248);
			comparacion();
			setState(249);
			expresion();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (O - 40)) | (1L << (Y - 40)) | (1L << (TOKEN_O - 40)) | (1L << (TOKEN_Y - 40)))) != 0)) {
				{
				{
				setState(250);
				_la = _input.LA(1);
				if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (O - 40)) | (1L << (Y - 40)) | (1L << (TOKEN_O - 40)) | (1L << (TOKEN_Y - 40)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(251);
				match(ID);
				setState(252);
				comparacion();
				setState(253);
				match(ID);
				}
				}
				setState(259);
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode TOKEN_IGUAL() { return getToken(PseIntGrammarParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIFERENTE() { return getToken(PseIntGrammarParser.TOKEN_DIFERENTE, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(PseIntGrammarParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MENORIGUAL() { return getToken(PseIntGrammarParser.TOKEN_MENORIGUAL, 0); }
		public TerminalNode TOKEN_MAYOR() { return getToken(PseIntGrammarParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MAYORIGUAL() { return getToken(PseIntGrammarParser.TOKEN_MAYORIGUAL, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_IGUAL) | (1L << TOKEN_DIFERENTE) | (1L << TOKEN_MENOR) | (1L << TOKEN_MENORIGUAL) | (1L << TOKEN_MAYOR) | (1L << TOKEN_MAYORIGUAL))) != 0)) ) {
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

	public static class Condicion_sinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(PseIntGrammarParser.SINO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Condicion_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCondicion_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCondicion_sino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCondicion_sino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicion_sinoContext condicion_sino() throws RecognitionException {
		Condicion_sinoContext _localctx = new Condicion_sinoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condicion_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(262);
				match(SINO);
				setState(263);
				comandos();
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

	public static class Ciclo_paraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PseIntGrammarParser.PARA, 0); }
		public Asignacion_paraContext asignacion_para() {
			return getRuleContext(Asignacion_paraContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PseIntGrammarParser.HACER, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FINPARA() { return getToken(PseIntGrammarParser.FINPARA, 0); }
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public Ciclo_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCiclo_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCiclo_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCiclo_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_paraContext ciclo_para() throws RecognitionException {
		Ciclo_paraContext _localctx = new Ciclo_paraContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ciclo_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(PARA);
			setState(267);
			asignacion_para();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(268);
				paso();
				}
			}

			setState(271);
			match(HACER);
			setState(272);
			comandos();
			setState(273);
			match(FINPARA);
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

	public static class Ciclo_mientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PseIntGrammarParser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PseIntGrammarParser.HACER, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FINMIENTRAS() { return getToken(PseIntGrammarParser.FINMIENTRAS, 0); }
		public Ciclo_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCiclo_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCiclo_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCiclo_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_mientrasContext ciclo_mientras() throws RecognitionException {
		Ciclo_mientrasContext _localctx = new Ciclo_mientrasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ciclo_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(MIENTRAS);
			setState(276);
			condicion();
			setState(277);
			match(HACER);
			setState(278);
			comandos();
			setState(279);
			match(FINMIENTRAS);
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

	public static class Ciclo_repetirhastaContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(PseIntGrammarParser.REPETIR, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PseIntGrammarParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(PseIntGrammarParser.QUE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public Ciclo_repetirhastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_repetirhasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCiclo_repetirhasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCiclo_repetirhasta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCiclo_repetirhasta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_repetirhastaContext ciclo_repetirhasta() throws RecognitionException {
		Ciclo_repetirhastaContext _localctx = new Ciclo_repetirhastaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ciclo_repetirhasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(REPETIR);
			setState(282);
			comandos();
			setState(283);
			match(HASTA);
			setState(284);
			match(QUE);
			setState(285);
			condicion();
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

	public static class PasoContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(PseIntGrammarParser.CON, 0); }
		public TerminalNode PASO() { return getToken(PseIntGrammarParser.PASO, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_MAS() { return getToken(PseIntGrammarParser.TOKEN_MAS, 0); }
		public TerminalNode INT() { return getToken(PseIntGrammarParser.INT, 0); }
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_paso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			match(CON);
			setState(288);
			match(PASO);
			setState(289);
			match(ID);
			setState(290);
			match(TOKEN_MAS);
			setState(291);
			match(INT);
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

	public static class Asignacion_paraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode TOKEN_ASIGNACION() { return getToken(PseIntGrammarParser.TOKEN_ASIGNACION, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PseIntGrammarParser.HASTA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Asignacion_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterAsignacion_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitAsignacion_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitAsignacion_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_paraContext asignacion_para() throws RecognitionException {
		Asignacion_paraContext _localctx = new Asignacion_paraContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_asignacion_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ID);
			setState(294);
			match(TOKEN_ASIGNACION);
			setState(295);
			asignacion();
			setState(296);
			match(HASTA);
			setState(297);
			expresion();
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

	public static class Comando_segunhacerContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(PseIntGrammarParser.SEGUN, 0); }
		public TerminalNode ID() { return getToken(PseIntGrammarParser.ID, 0); }
		public TerminalNode HACER() { return getToken(PseIntGrammarParser.HACER, 0); }
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public TerminalNode FINSEGUN() { return getToken(PseIntGrammarParser.FINSEGUN, 0); }
		public De_otro_modoContext de_otro_modo() {
			return getRuleContext(De_otro_modoContext.class,0);
		}
		public Comando_segunhacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_segunhacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterComando_segunhacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitComando_segunhacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitComando_segunhacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_segunhacerContext comando_segunhacer() throws RecognitionException {
		Comando_segunhacerContext _localctx = new Comando_segunhacerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comando_segunhacer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(SEGUN);
			setState(300);
			match(ID);
			setState(301);
			match(HACER);
			setState(302);
			caso();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(303);
				caso();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKEN_OTROMODO) {
				{
				setState(309);
				de_otro_modo();
				}
			}

			setState(312);
			match(FINSEGUN);
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

	public static class CasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PseIntGrammarParser.CASO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode TOKEN_DOSPUNTOS() { return getToken(PseIntGrammarParser.TOKEN_DOSPUNTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314);
			match(CASO);
			setState(315);
			expresion();
			setState(316);
			match(TOKEN_DOSPUNTOS);
			setState(317);
			comandos();
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

	public static class De_otro_modoContext extends ParserRuleContext {
		public TerminalNode TOKEN_OTROMODO() { return getToken(PseIntGrammarParser.TOKEN_OTROMODO, 0); }
		public TerminalNode TOKEN_DOSPUNTOS() { return getToken(PseIntGrammarParser.TOKEN_DOSPUNTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public De_otro_modoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_de_otro_modo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).enterDe_otro_modo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseIntGrammarListener ) ((PseIntGrammarListener)listener).exitDe_otro_modo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseIntGrammarVisitor ) return ((PseIntGrammarVisitor<? extends T>)visitor).visitDe_otro_modo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final De_otro_modoContext de_otro_modo() throws RecognitionException {
		De_otro_modoContext _localctx = new De_otro_modoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_de_otro_modo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			match(TOKEN_OTROMODO);
			setState(320);
			match(TOKEN_DOSPUNTOS);
			setState(321);
			comandos();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5f\n\5\3\6\3\6\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\7\n\u0085\n\n\f\n\16\n\u0088\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\7\r\u009d"+
		"\n\r\f\r\16\r\u00a0\13\r\3\16\3\16\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\7\21\u00c4\n\21\f\21\16\21\u00c7\13\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00d0\n\22\f\22\16\22\u00d3\13\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\7\23\u00db\n\23\f\23\16\23\u00de\13\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\5"+
		"\27\u00ef\n\27\3\27\3\27\5\27\u00f3\n\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0102\n\30\f\30\16\30\u0105\13"+
		"\30\3\31\3\31\3\32\3\32\5\32\u010b\n\32\3\33\3\33\3\33\5\33\u0110\n\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \7 \u0133\n \f \16 \u0136\13 \3 \5 \u0139\n \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@B\2\7\4\2FGII\3\2,-\3\2./\4\2*+CD\4\2\65"+
		"\65\67;\2\u014a\2G\3\2\2\2\4R\3\2\2\2\6\\\3\2\2\2\be\3\2\2\2\ng\3\2\2"+
		"\2\fi\3\2\2\2\16|\3\2\2\2\20~\3\2\2\2\22\u0080\3\2\2\2\24\u008d\3\2\2"+
		"\2\26\u0097\3\2\2\2\30\u0099\3\2\2\2\32\u00a1\3\2\2\2\34\u00b1\3\2\2\2"+
		"\36\u00b3\3\2\2\2 \u00bf\3\2\2\2\"\u00ca\3\2\2\2$\u00d6\3\2\2\2&\u00e1"+
		"\3\2\2\2(\u00e8\3\2\2\2*\u00ea\3\2\2\2,\u00ec\3\2\2\2.\u00f9\3\2\2\2\60"+
		"\u0106\3\2\2\2\62\u010a\3\2\2\2\64\u010c\3\2\2\2\66\u0115\3\2\2\28\u011b"+
		"\3\2\2\2:\u0121\3\2\2\2<\u0127\3\2\2\2>\u012d\3\2\2\2@\u013c\3\2\2\2B"+
		"\u0141\3\2\2\2DF\5\20\t\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3"+
		"\2\2\2IG\3\2\2\2JL\5\6\4\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3"+
		"\2\2\2OM\3\2\2\2PQ\5\4\3\2Q\3\3\2\2\2RS\7\3\2\2SW\7I\2\2TV\5\f\7\2UT\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\4\2\2[\5"+
		"\3\2\2\2\\]\7\5\2\2]^\5\b\5\2^_\5\f\7\2_`\7\6\2\2`\7\3\2\2\2af\7I\2\2"+
		"bc\7I\2\2cd\7@\2\2df\5\36\20\2ea\3\2\2\2eb\3\2\2\2f\t\3\2\2\2gh\t\2\2"+
		"\2h\13\3\2\2\2im\5\16\b\2jl\5\16\b\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2n\r\3\2\2\2om\3\2\2\2p}\5\22\n\2q}\5\24\13\2r}\5 \21\2s}\5\"\22"+
		"\2t}\5$\23\2u}\5&\24\2v}\5,\27\2w}\5\64\33\2x}\5\66\34\2y}\58\35\2z}\5"+
		"> \2{}\5\20\t\2|p\3\2\2\2|q\3\2\2\2|r\3\2\2\2|s\3\2\2\2|t\3\2\2\2|u\3"+
		"\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\17"+
		"\3\2\2\2~\177\7K\2\2\177\21\3\2\2\2\u0080\u0081\7\7\2\2\u0081\u0086\7"+
		"I\2\2\u0082\u0083\7<\2\2\u0083\u0085\7I\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\b\2\2\u008a\u008b\7\t\2\2\u008b"+
		"\u008c\7>\2\2\u008c\23\3\2\2\2\u008d\u008e\7I\2\2\u008e\u008f\7@\2\2\u008f"+
		"\u0090\5\26\f\2\u0090\u0091\7>\2\2\u0091\25\3\2\2\2\u0092\u0098\5\30\r"+
		"\2\u0093\u0098\7F\2\2\u0094\u0098\7G\2\2\u0095\u0098\7H\2\2\u0096\u0098"+
		"\5\36\20\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\27\3\2\2\2\u0099\u009e"+
		"\5\32\16\2\u009a\u009b\t\3\2\2\u009b\u009d\5\32\16\2\u009c\u009a\3\2\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\31"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a6\5\34\17\2\u00a2\u00a3\t\4\2\2"+
		"\u00a3\u00a5\5\34\17\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00b2\7F\2\2\u00aa\u00b2\7G\2\2\u00ab\u00b2\7I\2\2\u00ac\u00ad\7\60\2"+
		"\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\7\61\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00b2\7H\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\35\3\2\2\2\u00b3\u00b4"+
		"\7I\2\2\u00b4\u00b5\7\60\2\2\u00b5\u00ba\5\n\6\2\u00b6\u00b7\7<\2\2\u00b7"+
		"\u00b9\5\n\6\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\7\61\2\2\u00be\37\3\2\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00c5\7I\2"+
		"\2\u00c1\u00c2\7<\2\2\u00c2\u00c4\7I\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9!\3\2\2\2\u00ca\u00cb\7\f\2\2\u00cb"+
		"\u00d1\5*\26\2\u00cc\u00cd\5(\25\2\u00cd\u00ce\5*\26\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7>"+
		"\2\2\u00d5#\3\2\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00dc\7I\2\2\u00d8\u00d9"+
		"\7<\2\2\u00d9\u00db\7I\2\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00e0\7>\2\2\u00e0%\3\2\2\2\u00e1\u00e2\7\r\2\2\u00e2\u00e3"+
		"\7I\2\2\u00e3\u00e4\7\62\2\2\u00e4\u00e5\7F\2\2\u00e5\u00e6\7\63\2\2\u00e6"+
		"\u00e7\7>\2\2\u00e7\'\3\2\2\2\u00e8\u00e9\7<\2\2\u00e9)\3\2\2\2\u00ea"+
		"\u00eb\5\30\r\2\u00eb+\3\2\2\2\u00ec\u00ee\7\30\2\2\u00ed\u00ef\7\60\2"+
		"\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2"+
		"\5.\30\2\u00f1\u00f3\7\61\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\31\2\2\u00f5\u00f6\5\f\7\2\u00f6\u00f7"+
		"\5\62\32\2\u00f7\u00f8\7\33\2\2\u00f8-\3\2\2\2\u00f9\u00fa\7I\2\2\u00fa"+
		"\u00fb\5\60\31\2\u00fb\u0103\5\30\r\2\u00fc\u00fd\t\5\2\2\u00fd\u00fe"+
		"\7I\2\2\u00fe\u00ff\5\60\31\2\u00ff\u0100\7I\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00fc\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104/\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\t\6\2\2\u0107\61\3"+
		"\2\2\2\u0108\u0109\7\32\2\2\u0109\u010b\5\f\7\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\63\3\2\2\2\u010c\u010d\7\21\2\2\u010d\u010f\5<\37"+
		"\2\u010e\u0110\5:\36\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\7\26\2\2\u0112\u0113\5\f\7\2\u0113\u0114\7\27\2\2"+
		"\u0114\65\3\2\2\2\u0115\u0116\7\"\2\2\u0116\u0117\5.\30\2\u0117\u0118"+
		"\7\26\2\2\u0118\u0119\5\f\7\2\u0119\u011a\7#\2\2\u011a\67\3\2\2\2\u011b"+
		"\u011c\7$\2\2\u011c\u011d\5\f\7\2\u011d\u011e\7\23\2\2\u011e\u011f\7\22"+
		"\2\2\u011f\u0120\5.\30\2\u01209\3\2\2\2\u0121\u0122\7\24\2\2\u0122\u0123"+
		"\7\25\2\2\u0123\u0124\7I\2\2\u0124\u0125\7,\2\2\u0125\u0126\7F\2\2\u0126"+
		";\3\2\2\2\u0127\u0128\7I\2\2\u0128\u0129\7@\2\2\u0129\u012a\5\26\f\2\u012a"+
		"\u012b\7\23\2\2\u012b\u012c\5\30\r\2\u012c=\3\2\2\2\u012d\u012e\7\34\2"+
		"\2\u012e\u012f\7I\2\2\u012f\u0130\7\26\2\2\u0130\u0134\5@!\2\u0131\u0133"+
		"\5@!\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\5B"+
		"\"\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\7!\2\2\u013b?\3\2\2\2\u013c\u013d\7\37\2\2\u013d\u013e\5\30\r\2"+
		"\u013e\u013f\7=\2\2\u013f\u0140\5\f\7\2\u0140A\3\2\2\2\u0141\u0142\7\16"+
		"\2\2\u0142\u0143\7=\2\2\u0143\u0144\5\f\7\2\u0144C\3\2\2\2\30GMWem|\u0086"+
		"\u0097\u009e\u00a6\u00b1\u00ba\u00c5\u00d1\u00dc\u00ee\u00f2\u0103\u010a"+
		"\u010f\u0134\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}