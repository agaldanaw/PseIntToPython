// Generated from C:/Users/nxpan/Desktop/LenguajesProgr/Taller3/PseIntToPython/grammar\PseIntGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseIntGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TOKEN_INICIOPROCESO", "TOKEN_FINPROCESO", "TOKEN_INICIOSUBPROCESO", 
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


	public PseIntGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PseIntGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u028b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\u00a6\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00be\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0117\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0147\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\38\38\38\39\39\3:\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\5E\u025a\nE\3E"+
		"\6E\u025d\nE\rE\16E\u025e\3F\6F\u0262\nF\rF\16F\u0263\3F\3F\6F\u0268\n"+
		"F\rF\16F\u0269\3G\3G\7G\u026e\nG\fG\16G\u0271\13G\3G\3G\3H\3H\7H\u0277"+
		"\nH\fH\16H\u027a\13H\3I\6I\u027d\nI\rI\16I\u027e\3I\3I\3J\3J\7J\u0285"+
		"\nJ\fJ\16J\u0288\13J\3J\3J\3\u0286\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\3\2\7\3\2\62"+
		";\7\2\"\"\62;C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u029d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u00a5\3\2\2\2\5\u00bd"+
		"\3\2\2\2\7\u00bf\3\2\2\2\t\u00ca\3\2\2\2\13\u00d8\3\2\2\2\r\u00e0\3\2"+
		"\2\2\17\u0116\3\2\2\2\21\u0146\3\2\2\2\23\u0148\3\2\2\2\25\u014d\3\2\2"+
		"\2\27\u0156\3\2\2\2\31\u0160\3\2\2\2\33\u016d\3\2\2\2\35\u0177\3\2\2\2"+
		"\37\u017d\3\2\2\2!\u0182\3\2\2\2#\u0186\3\2\2\2%\u018c\3\2\2\2\'\u0190"+
		"\3\2\2\2)\u0195\3\2\2\2+\u019b\3\2\2\2-\u01a3\3\2\2\2/\u01a6\3\2\2\2\61"+
		"\u01af\3\2\2\2\63\u01b4\3\2\2\2\65\u01ba\3\2\2\2\67\u01c0\3\2\2\29\u01c3"+
		"\3\2\2\2;\u01c8\3\2\2\2=\u01cd\3\2\2\2?\u01d2\3\2\2\2A\u01db\3\2\2\2C"+
		"\u01e4\3\2\2\2E\u01f0\3\2\2\2G\u01f8\3\2\2\2I\u0200\3\2\2\2K\u020b\3\2"+
		"\2\2M\u0213\3\2\2\2O\u0217\3\2\2\2Q\u021a\3\2\2\2S\u021c\3\2\2\2U\u021e"+
		"\3\2\2\2W\u0220\3\2\2\2Y\u0222\3\2\2\2[\u0224\3\2\2\2]\u0226\3\2\2\2_"+
		"\u0228\3\2\2\2a\u022a\3\2\2\2c\u022c\3\2\2\2e\u022e\3\2\2\2g\u0230\3\2"+
		"\2\2i\u0232\3\2\2\2k\u0235\3\2\2\2m\u0238\3\2\2\2o\u023a\3\2\2\2q\u023d"+
		"\3\2\2\2s\u023f\3\2\2\2u\u0242\3\2\2\2w\u0244\3\2\2\2y\u0246\3\2\2\2{"+
		"\u0248\3\2\2\2}\u024a\3\2\2\2\177\u024d\3\2\2\2\u0081\u024f\3\2\2\2\u0083"+
		"\u0252\3\2\2\2\u0085\u0254\3\2\2\2\u0087\u0256\3\2\2\2\u0089\u0259\3\2"+
		"\2\2\u008b\u0261\3\2\2\2\u008d\u026b\3\2\2\2\u008f\u0274\3\2\2\2\u0091"+
		"\u027c\3\2\2\2\u0093\u0282\3\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7t\2"+
		"\2\u0097\u0098\7q\2\2\u0098\u0099\7e\2\2\u0099\u009a\7g\2\2\u009a\u009b"+
		"\7u\2\2\u009b\u00a6\7q\2\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2\u009e"+
		"\u009f\7i\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7k\2\2"+
		"\u00a2\u00a3\7v\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a6\7q\2\2\u00a5\u0095"+
		"\3\2\2\2\u00a5\u009c\3\2\2\2\u00a6\4\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8"+
		"\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7t\2\2"+
		"\u00ac\u00ad\7q\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00be\7q\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7i\2\2"+
		"\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7o\2\2\u00bc\u00be\7q\2\2\u00bd\u00a7\3\2\2\2\u00bd"+
		"\u00b1\3\2\2\2\u00be\6\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7w\2\2\u00c1"+
		"\u00c2\7d\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7q\2\2"+
		"\u00c5\u00c6\7e\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9"+
		"\7q\2\2\u00c9\b\3\2\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7d\2\2\u00d0"+
		"\u00d1\7r\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7e\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7q\2\2\u00d7\n\3\2"+
		"\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7h\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7t\2\2\u00df"+
		"\f\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7o\2\2\u00e3"+
		"\u00e4\7q\2\2\u00e4\16\3\2\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u0117\7n\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7g\2\2"+
		"\u00eb\u00ec\7z\2\2\u00ec\u00ed\7v\2\2\u00ed\u0117\7q\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7e\2\2\u00f5\u0117\7q\2\2"+
		"\u00f6\u00f7\7g\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7t\2\2\u00fb\u0117\7q\2\2\u00fc\u00fd\7p\2\2\u00fd"+
		"\u00fe\7w\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7t\2\2"+
		"\u0101\u0117\7q\2\2\u0102\u0103\7n\2\2\u0103\u0104\7q\2\2\u0104\u0105"+
		"\7i\2\2\u0105\u0106\7k\2\2\u0106\u0107\7e\2\2\u0107\u0117\7q\2\2\u0108"+
		"\u0109\7e\2\2\u0109\u010a\7c\2\2\u010a\u010b\7t\2\2\u010b\u010c\7c\2\2"+
		"\u010c\u010d\7e\2\2\u010d\u010e\7v\2\2\u010e\u010f\7g\2\2\u010f\u0117"+
		"\7t\2\2\u0110\u0111\7e\2\2\u0111\u0112\7c\2\2\u0112\u0113\7f\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115\u0117\7c\2\2\u0116\u00e5\3\2\2"+
		"\2\u0116\u00e9\3\2\2\2\u0116\u00ee\3\2\2\2\u0116\u00f6\3\2\2\2\u0116\u00fc"+
		"\3\2\2\2\u0116\u0102\3\2\2\2\u0116\u0108\3\2\2\2\u0116\u0110\3\2\2\2\u0117"+
		"\20\3\2\2\2\u0118\u0119\7d\2\2\u0119\u011a\7q\2\2\u011a\u011b\7t\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7c\2\2\u011d\u011e\7t\2\2\u011e\u011f\7\"\2"+
		"\2\u011f\u0120\7r\2\2\u0120\u0121\7c\2\2\u0121\u0122\7p\2\2\u0122\u0123"+
		"\7v\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2\u0125\u0126\7n\2\2\u0126"+
		"\u0147\7c\2\2\u0127\u0128\7g\2\2\u0128\u0129\7u\2\2\u0129\u012a\7r\2\2"+
		"\u012a\u012b\7g\2\2\u012b\u012c\7t\2\2\u012c\u012d\7c\2\2\u012d\u012e"+
		"\7t\2\2\u012e\u012f\7\"\2\2\u012f\u0130\7z\2\2\u0130\u0131\7\"\2\2\u0131"+
		"\u0132\7u\2\2\u0132\u0133\7g\2\2\u0133\u0134\7i\2\2\u0134\u0135\7w\2\2"+
		"\u0135\u0136\7p\2\2\u0136\u0137\7f\2\2\u0137\u0138\7q\2\2\u0138\u0147"+
		"\7u\2\2\u0139\u013a\7g\2\2\u013a\u013b\7u\2\2\u013b\u013c\7r\2\2\u013c"+
		"\u013d\7g\2\2\u013d\u013e\7t\2\2\u013e\u013f\7c\2\2\u013f\u0140\7t\2\2"+
		"\u0140\u0141\7\"\2\2\u0141\u0142\7v\2\2\u0142\u0143\7g\2\2\u0143\u0144"+
		"\7e\2\2\u0144\u0145\7n\2\2\u0145\u0147\7c\2\2\u0146\u0118\3\2\2\2\u0146"+
		"\u0127\3\2\2\2\u0146\u0139\3\2\2\2\u0147\22\3\2\2\2\u0148\u0149\7n\2\2"+
		"\u0149\u014a\7g\2\2\u014a\u014b\7g\2\2\u014b\u014c\7t\2\2\u014c\24\3\2"+
		"\2\2\u014d\u014e\7g\2\2\u014e\u014f\7u\2\2\u014f\u0150\7e\2\2\u0150\u0151"+
		"\7t\2\2\u0151\u0152\7k\2\2\u0152\u0153\7d\2\2\u0153\u0154\7k\2\2\u0154"+
		"\u0155\7t\2\2\u0155\26\3\2\2\2\u0156\u0157\7f\2\2\u0157\u0158\7k\2\2\u0158"+
		"\u0159\7o\2\2\u0159\u015a\7g\2\2\u015a\u015b\7p\2\2\u015b\u015c\7u\2\2"+
		"\u015c\u015d\7k\2\2\u015d\u015e\7q\2\2\u015e\u015f\7p\2\2\u015f\30\3\2"+
		"\2\2\u0160\u0161\7f\2\2\u0161\u0162\7g\2\2\u0162\u0163\7\"\2\2\u0163\u0164"+
		"\7q\2\2\u0164\u0165\7v\2\2\u0165\u0166\7t\2\2\u0166\u0167\7q\2\2\u0167"+
		"\u0168\7\"\2\2\u0168\u0169\7o\2\2\u0169\u016a\7q\2\2\u016a\u016b\7f\2"+
		"\2\u016b\u016c\7q\2\2\u016c\32\3\2\2\2\u016d\u016e\7x\2\2\u016e\u016f"+
		"\7g\2\2\u016f\u0170\7t\2\2\u0170\u0171\7f\2\2\u0171\u0172\7c\2\2\u0172"+
		"\u0173\7f\2\2\u0173\u0174\7g\2\2\u0174\u0175\7t\2\2\u0175\u0176\7q\2\2"+
		"\u0176\34\3\2\2\2\u0177\u0178\7h\2\2\u0178\u0179\7c\2\2\u0179\u017a\7"+
		"n\2\2\u017a\u017b\7u\2\2\u017b\u017c\7q\2\2\u017c\36\3\2\2\2\u017d\u017e"+
		"\7r\2\2\u017e\u017f\7c\2\2\u017f\u0180\7t\2\2\u0180\u0181\7c\2\2\u0181"+
		" \3\2\2\2\u0182\u0183\7s\2\2\u0183\u0184\7w\2\2\u0184\u0185\7g\2\2\u0185"+
		"\"\3\2\2\2\u0186\u0187\7j\2\2\u0187\u0188\7c\2\2\u0188\u0189\7u\2\2\u0189"+
		"\u018a\7v\2\2\u018a\u018b\7c\2\2\u018b$\3\2\2\2\u018c\u018d\7e\2\2\u018d"+
		"\u018e\7q\2\2\u018e\u018f\7p\2\2\u018f&\3\2\2\2\u0190\u0191\7r\2\2\u0191"+
		"\u0192\7c\2\2\u0192\u0193\7u\2\2\u0193\u0194\7q\2\2\u0194(\3\2\2\2\u0195"+
		"\u0196\7j\2\2\u0196\u0197\7c\2\2\u0197\u0198\7e\2\2\u0198\u0199\7g\2\2"+
		"\u0199\u019a\7t\2\2\u019a*\3\2\2\2\u019b\u019c\7h\2\2\u019c\u019d\7k\2"+
		"\2\u019d\u019e\7p\2\2\u019e\u019f\7r\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1"+
		"\7t\2\2\u01a1\u01a2\7c\2\2\u01a2,\3\2\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5"+
		"\7k\2\2\u01a5.\3\2\2\2\u01a6\u01a7\7g\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9"+
		"\7v\2\2\u01a9\u01aa\7q\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7e\2\2\u01ac"+
		"\u01ad\7g\2\2\u01ad\u01ae\7u\2\2\u01ae\60\3\2\2\2\u01af\u01b0\7u\2\2\u01b0"+
		"\u01b1\7k\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7q\2\2\u01b3\62\3\2\2\2\u01b4"+
		"\u01b5\7h\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7u\2\2"+
		"\u01b8\u01b9\7k\2\2\u01b9\64\3\2\2\2\u01ba\u01bb\7u\2\2\u01bb\u01bc\7"+
		"g\2\2\u01bc\u01bd\7i\2\2\u01bd\u01be\7w\2\2\u01be\u01bf\7p\2\2\u01bf\66"+
		"\3\2\2\2\u01c0\u01c1\7f\2\2\u01c1\u01c2\7g\2\2\u01c28\3\2\2\2\u01c3\u01c4"+
		"\7q\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7q\2\2\u01c7"+
		":\3\2\2\2\u01c8\u01c9\7e\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7u\2\2\u01cb"+
		"\u01cc\7q\2\2\u01cc<\3\2\2\2\u01cd\u01ce\7o\2\2\u01ce\u01cf\7q\2\2\u01cf"+
		"\u01d0\7f\2\2\u01d0\u01d1\7q\2\2\u01d1>\3\2\2\2\u01d2\u01d3\7h\2\2\u01d3"+
		"\u01d4\7k\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7u\2\2\u01d6\u01d7\7g\2\2"+
		"\u01d7\u01d8\7i\2\2\u01d8\u01d9\7w\2\2\u01d9\u01da\7p\2\2\u01da@\3\2\2"+
		"\2\u01db\u01dc\7o\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7g\2\2\u01de\u01df"+
		"\7p\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7t\2\2\u01e1\u01e2\7c\2\2\u01e2"+
		"\u01e3\7u\2\2\u01e3B\3\2\2\2\u01e4\u01e5\7h\2\2\u01e5\u01e6\7k\2\2\u01e6"+
		"\u01e7\7p\2\2\u01e7\u01e8\7o\2\2\u01e8\u01e9\7k\2\2\u01e9\u01ea\7g\2\2"+
		"\u01ea\u01eb\7p\2\2\u01eb\u01ec\7v\2\2\u01ec\u01ed\7t\2\2\u01ed\u01ee"+
		"\7c\2\2\u01ee\u01ef\7u\2\2\u01efD\3\2\2\2\u01f0\u01f1\7t\2\2\u01f1\u01f2"+
		"\7g\2\2\u01f2\u01f3\7r\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7v\2\2\u01f5"+
		"\u01f6\7k\2\2\u01f6\u01f7\7t\2\2\u01f7F\3\2\2\2\u01f8\u01f9\7h\2\2\u01f9"+
		"\u01fa\7w\2\2\u01fa\u01fb\7p\2\2\u01fb\u01fc\7e\2\2\u01fc\u01fd\7k\2\2"+
		"\u01fd\u01fe\7q\2\2\u01fe\u01ff\7p\2\2\u01ffH\3\2\2\2\u0200\u0201\7h\2"+
		"\2\u0201\u0202\7k\2\2\u0202\u0203\7p\2\2\u0203\u0204\7h\2\2\u0204\u0205"+
		"\7w\2\2\u0205\u0206\7p\2\2\u0206\u0207\7e\2\2\u0207\u0208\7k\2\2\u0208"+
		"\u0209\7q\2\2\u0209\u020a\7p\2\2\u020aJ\3\2\2\2\u020b\u020c\7n\2\2\u020c"+
		"\u020d\7k\2\2\u020d\u020e\7o\2\2\u020e\u020f\7r\2\2\u020f\u0210\7k\2\2"+
		"\u0210\u0211\7c\2\2\u0211\u0212\7t\2\2\u0212L\3\2\2\2\u0213\u0214\7o\2"+
		"\2\u0214\u0215\7q\2\2\u0215\u0216\7f\2\2\u0216N\3\2\2\2\u0217\u0218\7"+
		"p\2\2\u0218\u0219\7q\2\2\u0219P\3\2\2\2\u021a\u021b\7q\2\2\u021bR\3\2"+
		"\2\2\u021c\u021d\7{\2\2\u021dT\3\2\2\2\u021e\u021f\7-\2\2\u021fV\3\2\2"+
		"\2\u0220\u0221\7/\2\2\u0221X\3\2\2\2\u0222\u0223\7,\2\2\u0223Z\3\2\2\2"+
		"\u0224\u0225\7\61\2\2\u0225\\\3\2\2\2\u0226\u0227\7*\2\2\u0227^\3\2\2"+
		"\2\u0228\u0229\7+\2\2\u0229`\3\2\2\2\u022a\u022b\7]\2\2\u022bb\3\2\2\2"+
		"\u022c\u022d\7_\2\2\u022dd\3\2\2\2\u022e\u022f\7\'\2\2\u022ff\3\2\2\2"+
		"\u0230\u0231\7?\2\2\u0231h\3\2\2\2\u0232\u0233\7?\2\2\u0233\u0234\7?\2"+
		"\2\u0234j\3\2\2\2\u0235\u0236\7>\2\2\u0236\u0237\7@\2\2\u0237l\3\2\2\2"+
		"\u0238\u0239\7>\2\2\u0239n\3\2\2\2\u023a\u023b\7>\2\2\u023b\u023c\7?\2"+
		"\2\u023cp\3\2\2\2\u023d\u023e\7@\2\2\u023er\3\2\2\2\u023f\u0240\7@\2\2"+
		"\u0240\u0241\7?\2\2\u0241t\3\2\2\2\u0242\u0243\7.\2\2\u0243v\3\2\2\2\u0244"+
		"\u0245\7<\2\2\u0245x\3\2\2\2\u0246\u0247\7=\2\2\u0247z\3\2\2\2\u0248\u0249"+
		"\7$\2\2\u0249|\3\2\2\2\u024a\u024b\7>\2\2\u024b\u024c\7/\2\2\u024c~\3"+
		"\2\2\2\u024d\u024e\7\u0080\2\2\u024e\u0080\3\2\2\2\u024f\u0250\7\61\2"+
		"\2\u0250\u0251\7\61\2\2\u0251\u0082\3\2\2\2\u0252\u0253\7~\2\2\u0253\u0084"+
		"\3\2\2\2\u0254\u0255\7(\2\2\u0255\u0086\3\2\2\2\u0256\u0257\7`\2\2\u0257"+
		"\u0088\3\2\2\2\u0258\u025a\5W,\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2"+
		"\2\u025a\u025c\3\2\2\2\u025b\u025d\t\2\2\2\u025c\u025b\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u008a\3\2\2\2\u0260"+
		"\u0262\t\2\2\2\u0261\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0261\3\2"+
		"\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\7\60\2\2\u0266"+
		"\u0268\t\2\2\2\u0267\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0267\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026a\u008c\3\2\2\2\u026b\u026f\5{>\2\u026c\u026e"+
		"\t\3\2\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\5{"+
		">\2\u0273\u008e\3\2\2\2\u0274\u0278\t\4\2\2\u0275\u0277\t\5\2\2\u0276"+
		"\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u0090\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027d\t\6\2\2\u027c"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280\u0281\bI\2\2\u0281\u0092\3\2\2\2\u0282"+
		"\u0286\5\u0081A\2\u0283\u0285\13\2\2\2\u0284\u0283\3\2\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0289\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u028a\7\f\2\2\u028a\u0094\3\2\2\2\17\2\u00a5\u00bd"+
		"\u0116\u0146\u0259\u025e\u0263\u0269\u026f\u0278\u027e\u0286\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}