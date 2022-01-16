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
		T__0=1, TOKEN_INICIOPROCESO=2, TOKEN_FINPROCESO=3, TOKEN_INICIOSUBPROCESO=4, 
		TOKEN_FINSUBPROCESO=5, TOKEN_DEFINIR=6, TOKEN_COMO=7, TOKEN_TIPO=8, TOKEN_COMANDOESPECIAL=9, 
		TOKEN_COMANDOLEER=10, TOKEN_COMANDOESCRIBIR=11, TOKEN_COMANDODIMENSION=12, 
		VERDADERO=13, FALSE=14, PARA=15, QUE=16, HASTA=17, CON=18, PASO=19, HACER=20, 
		FINPARA=21, SI=22, ENTONCES=23, SINO=24, FINSI=25, SEGUN=26, DE=27, OTRO=28, 
		CASO=29, MODO=30, FINSEGUN=31, MIENTRAS=32, FINMIENTRAS=33, REPETIR=34, 
		FUNCION=35, FINFUNCION=36, LIMPIAR=37, MOD=38, NO=39, O=40, Y=41, TOKEN_MAS=42, 
		TOKEN_MENOS=43, TOKEN_MUL=44, TOKEN_DIV=45, TOKEN_PARIZQ=46, TOKEN_PARDER=47, 
		TOKEN_CORIZQ=48, TOKEN_CORDER=49, TOKEN_MOD=50, TOKEN_IGUAL=51, TOKEN_IGUALDAD=52, 
		TOKEN_DIFERENTE=53, TOKEN_MENOR=54, TOKEN_MENORIGUAL=55, TOKEN_MAYOR=56, 
		TOKEN_MAYORIGUAL=57, TOKEN_COMA=58, TOKEN_DOSPUNTOS=59, TOKEN_PUNTOYCOMA=60, 
		TOKEN_COMILLAS=61, TOKEN_ASIGNACION=62, TOKEN_NEG=63, TOKEN_COMENTARIO=64, 
		TOKEN_O=65, TOKEN_Y=66, TOKEN_POT=67, INT=68, DOUBLE=69, STRING=70, ID=71, 
		SPACE=72, COMMENT=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TOKEN_INICIOPROCESO", "TOKEN_FINPROCESO", "TOKEN_INICIOSUBPROCESO", 
			"TOKEN_FINSUBPROCESO", "TOKEN_DEFINIR", "TOKEN_COMO", "TOKEN_TIPO", "TOKEN_COMANDOESPECIAL", 
			"TOKEN_COMANDOLEER", "TOKEN_COMANDOESCRIBIR", "TOKEN_COMANDODIMENSION", 
			"VERDADERO", "FALSE", "PARA", "QUE", "HASTA", "CON", "PASO", "HACER", 
			"FINPARA", "SI", "ENTONCES", "SINO", "FINSI", "SEGUN", "DE", "OTRO", 
			"CASO", "MODO", "FINSEGUN", "MIENTRAS", "FINMIENTRAS", "REPETIR", "FUNCION", 
			"FINFUNCION", "LIMPIAR", "MOD", "NO", "O", "Y", "TOKEN_MAS", "TOKEN_MENOS", 
			"TOKEN_MUL", "TOKEN_DIV", "TOKEN_PARIZQ", "TOKEN_PARDER", "TOKEN_CORIZQ", 
			"TOKEN_CORDER", "TOKEN_MOD", "TOKEN_IGUAL", "TOKEN_IGUALDAD", "TOKEN_DIFERENTE", 
			"TOKEN_MENOR", "TOKEN_MENORIGUAL", "TOKEN_MAYOR", "TOKEN_MAYORIGUAL", 
			"TOKEN_COMA", "TOKEN_DOSPUNTOS", "TOKEN_PUNTOYCOMA", "TOKEN_COMILLAS", 
			"TOKEN_ASIGNACION", "TOKEN_NEG", "TOKEN_COMENTARIO", "TOKEN_O", "TOKEN_Y", 
			"TOKEN_POT", "INT", "DOUBLE", "STRING", "ID", "SPACE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'p+'", null, null, "'SubProceso'", "'FinSubProceso'", "'definir'", 
			"'como'", null, null, "'Leer'", "'Escribir'", "'Dimension'", "'verdadero'", 
			"'falso'", "'Para'", "'Que'", "'Hasta'", "'Con'", "'Paso'", "'Hacer'", 
			"'FinPara'", "'Si'", "'Entonces'", "'Sino'", "'FinSi'", "'Segun'", "'De'", 
			"'otro'", "'caso'", "'modo'", "'FinSegun'", "'Mientras'", "'FinMientras'", 
			"'Repetir'", "'Funcion'", "'FinFuncion'", "'limpiar'", "'mod'", "'no'", 
			"'o'", "'y'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", 
			"'%'", "'='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "','", "':'", 
			"';'", "'\"'", "'<-'", "'~'", "'//'", "'|'", "'&'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TOKEN_INICIOPROCESO", "TOKEN_FINPROCESO", "TOKEN_INICIOSUBPROCESO", 
			"TOKEN_FINSUBPROCESO", "TOKEN_DEFINIR", "TOKEN_COMO", "TOKEN_TIPO", "TOKEN_COMANDOESPECIAL", 
			"TOKEN_COMANDOLEER", "TOKEN_COMANDOESCRIBIR", "TOKEN_COMANDODIMENSION", 
			"VERDADERO", "FALSE", "PARA", "QUE", "HASTA", "CON", "PASO", "HACER", 
			"FINPARA", "SI", "ENTONCES", "SINO", "FINSI", "SEGUN", "DE", "OTRO", 
			"CASO", "MODO", "FINSEGUN", "MIENTRAS", "FINMIENTRAS", "REPETIR", "FUNCION", 
			"FINFUNCION", "LIMPIAR", "MOD", "NO", "O", "Y", "TOKEN_MAS", "TOKEN_MENOS", 
			"TOKEN_MUL", "TOKEN_DIV", "TOKEN_PARIZQ", "TOKEN_PARDER", "TOKEN_CORIZQ", 
			"TOKEN_CORDER", "TOKEN_MOD", "TOKEN_IGUAL", "TOKEN_IGUALDAD", "TOKEN_DIFERENTE", 
			"TOKEN_MENOR", "TOKEN_MENORIGUAL", "TOKEN_MAYOR", "TOKEN_MAYORIGUAL", 
			"TOKEN_COMA", "TOKEN_DOSPUNTOS", "TOKEN_PUNTOYCOMA", "TOKEN_COMILLAS", 
			"TOKEN_ASIGNACION", "TOKEN_NEG", "TOKEN_COMENTARIO", "TOKEN_O", "TOKEN_Y", 
			"TOKEN_POT", "INT", "DOUBLE", "STRING", "ID", "SPACE", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u0280\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\u00a9\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c1\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u011a"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u014a\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\38\3"+
		"9\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3"+
		"C\3C\3D\3D\3E\6E\u0250\nE\rE\16E\u0251\3F\6F\u0255\nF\rF\16F\u0256\3F"+
		"\3F\6F\u025b\nF\rF\16F\u025c\3G\3G\7G\u0261\nG\fG\16G\u0264\13G\3G\3G"+
		"\3H\3H\7H\u026a\nH\fH\16H\u026d\13H\3I\6I\u0270\nI\rI\16I\u0271\3I\3I"+
		"\3J\3J\7J\u0278\nJ\fJ\16J\u027b\13J\3J\3J\3J\3J\3\u0279\2K\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\3\2\7\3\2\62;\7\2\"\"\62;C\\aac|\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\2\u0291\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\3\u0095\3\2\2\2\5\u00a8\3\2\2\2\7\u00c0\3\2\2\2\t\u00c2\3\2\2"+
		"\2\13\u00cd\3\2\2\2\r\u00db\3\2\2\2\17\u00e3\3\2\2\2\21\u0119\3\2\2\2"+
		"\23\u0149\3\2\2\2\25\u014b\3\2\2\2\27\u0150\3\2\2\2\31\u0159\3\2\2\2\33"+
		"\u0163\3\2\2\2\35\u016d\3\2\2\2\37\u0173\3\2\2\2!\u0178\3\2\2\2#\u017c"+
		"\3\2\2\2%\u0182\3\2\2\2\'\u0186\3\2\2\2)\u018b\3\2\2\2+\u0191\3\2\2\2"+
		"-\u0199\3\2\2\2/\u019c\3\2\2\2\61\u01a5\3\2\2\2\63\u01aa\3\2\2\2\65\u01b0"+
		"\3\2\2\2\67\u01b6\3\2\2\29\u01b9\3\2\2\2;\u01be\3\2\2\2=\u01c3\3\2\2\2"+
		"?\u01c8\3\2\2\2A\u01d1\3\2\2\2C\u01da\3\2\2\2E\u01e6\3\2\2\2G\u01ee\3"+
		"\2\2\2I\u01f6\3\2\2\2K\u0201\3\2\2\2M\u0209\3\2\2\2O\u020d\3\2\2\2Q\u0210"+
		"\3\2\2\2S\u0212\3\2\2\2U\u0214\3\2\2\2W\u0216\3\2\2\2Y\u0218\3\2\2\2["+
		"\u021a\3\2\2\2]\u021c\3\2\2\2_\u021e\3\2\2\2a\u0220\3\2\2\2c\u0222\3\2"+
		"\2\2e\u0224\3\2\2\2g\u0226\3\2\2\2i\u0228\3\2\2\2k\u022b\3\2\2\2m\u022e"+
		"\3\2\2\2o\u0230\3\2\2\2q\u0233\3\2\2\2s\u0235\3\2\2\2u\u0238\3\2\2\2w"+
		"\u023a\3\2\2\2y\u023c\3\2\2\2{\u023e\3\2\2\2}\u0240\3\2\2\2\177\u0243"+
		"\3\2\2\2\u0081\u0245\3\2\2\2\u0083\u0248\3\2\2\2\u0085\u024a\3\2\2\2\u0087"+
		"\u024c\3\2\2\2\u0089\u024f\3\2\2\2\u008b\u0254\3\2\2\2\u008d\u025e\3\2"+
		"\2\2\u008f\u0267\3\2\2\2\u0091\u026f\3\2\2\2\u0093\u0275\3\2\2\2\u0095"+
		"\u0096\7r\2\2\u0096\u0097\7-\2\2\u0097\4\3\2\2\2\u0098\u0099\7r\2\2\u0099"+
		"\u009a\7t\2\2\u009a\u009b\7q\2\2\u009b\u009c\7e\2\2\u009c\u009d\7g\2\2"+
		"\u009d\u009e\7u\2\2\u009e\u00a9\7q\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1"+
		"\7n\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a9\7q\2\2"+
		"\u00a8\u0098\3\2\2\2\u00a8\u009f\3\2\2\2\u00a9\6\3\2\2\2\u00aa\u00ab\7"+
		"h\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00c1\7q\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7k\2\2"+
		"\u00b6\u00b7\7p\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba"+
		"\7i\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7o\2\2\u00bf\u00c1\7q\2\2\u00c0\u00aa\3\2\2"+
		"\2\u00c0\u00b4\3\2\2\2\u00c1\b\3\2\2\2\u00c2\u00c3\7U\2\2\u00c3\u00c4"+
		"\7w\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7R\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7u\2\2"+
		"\u00cb\u00cc\7q\2\2\u00cc\n\3\2\2\2\u00cd\u00ce\7H\2\2\u00ce\u00cf\7k"+
		"\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7U\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3"+
		"\7d\2\2\u00d3\u00d4\7R\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7e\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7q\2\2"+
		"\u00da\f\3\2\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7h"+
		"\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2"+
		"\7t\2\2\u00e2\16\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6"+
		"\7o\2\2\u00e6\u00e7\7q\2\2\u00e7\20\3\2\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea"+
		"\7g\2\2\u00ea\u00eb\7c\2\2\u00eb\u011a\7n\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7z\2\2\u00ef\u00f0\7v\2\2\u00f0\u011a\7q\2\2"+
		"\u00f1\u00f2\7p\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5"+
		"\7g\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7e\2\2\u00f8"+
		"\u011a\7q\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7v\2\2"+
		"\u00fc\u00fd\7g\2\2\u00fd\u00fe\7t\2\2\u00fe\u011a\7q\2\2\u00ff\u0100"+
		"\7p\2\2\u0100\u0101\7w\2\2\u0101\u0102\7o\2\2\u0102\u0103\7g\2\2\u0103"+
		"\u0104\7t\2\2\u0104\u011a\7q\2\2\u0105\u0106\7n\2\2\u0106\u0107\7q\2\2"+
		"\u0107\u0108\7i\2\2\u0108\u0109\7k\2\2\u0109\u010a\7e\2\2\u010a\u011a"+
		"\7q\2\2\u010b\u010c\7e\2\2\u010c\u010d\7c\2\2\u010d\u010e\7t\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7e\2\2\u0110\u0111\7v\2\2\u0111\u0112\7g\2\2"+
		"\u0112\u011a\7t\2\2\u0113\u0114\7e\2\2\u0114\u0115\7c\2\2\u0115\u0116"+
		"\7f\2\2\u0116\u0117\7g\2\2\u0117\u0118\7p\2\2\u0118\u011a\7c\2\2\u0119"+
		"\u00e8\3\2\2\2\u0119\u00ec\3\2\2\2\u0119\u00f1\3\2\2\2\u0119\u00f9\3\2"+
		"\2\2\u0119\u00ff\3\2\2\2\u0119\u0105\3\2\2\2\u0119\u010b\3\2\2\2\u0119"+
		"\u0113\3\2\2\2\u011a\22\3\2\2\2\u011b\u011c\7d\2\2\u011c\u011d\7q\2\2"+
		"\u011d\u011e\7t\2\2\u011e\u011f\7t\2\2\u011f\u0120\7c\2\2\u0120\u0121"+
		"\7t\2\2\u0121\u0122\7\"\2\2\u0122\u0123\7r\2\2\u0123\u0124\7c\2\2\u0124"+
		"\u0125\7p\2\2\u0125\u0126\7v\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2"+
		"\u0128\u0129\7n\2\2\u0129\u014a\7c\2\2\u012a\u012b\7g\2\2\u012b\u012c"+
		"\7u\2\2\u012c\u012d\7r\2\2\u012d\u012e\7g\2\2\u012e\u012f\7t\2\2\u012f"+
		"\u0130\7c\2\2\u0130\u0131\7t\2\2\u0131\u0132\7\"\2\2\u0132\u0133\7z\2"+
		"\2\u0133\u0134\7\"\2\2\u0134\u0135\7u\2\2\u0135\u0136\7g\2\2\u0136\u0137"+
		"\7i\2\2\u0137\u0138\7w\2\2\u0138\u0139\7p\2\2\u0139\u013a\7f\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u014a\7u\2\2\u013c\u013d\7g\2\2\u013d\u013e\7u\2\2"+
		"\u013e\u013f\7r\2\2\u013f\u0140\7g\2\2\u0140\u0141\7t\2\2\u0141\u0142"+
		"\7c\2\2\u0142\u0143\7t\2\2\u0143\u0144\7\"\2\2\u0144\u0145\7v\2\2\u0145"+
		"\u0146\7g\2\2\u0146\u0147\7e\2\2\u0147\u0148\7n\2\2\u0148\u014a\7c\2\2"+
		"\u0149\u011b\3\2\2\2\u0149\u012a\3\2\2\2\u0149\u013c\3\2\2\2\u014a\24"+
		"\3\2\2\2\u014b\u014c\7N\2\2\u014c\u014d\7g\2\2\u014d\u014e\7g\2\2\u014e"+
		"\u014f\7t\2\2\u014f\26\3\2\2\2\u0150\u0151\7G\2\2\u0151\u0152\7u\2\2\u0152"+
		"\u0153\7e\2\2\u0153\u0154\7t\2\2\u0154\u0155\7k\2\2\u0155\u0156\7d\2\2"+
		"\u0156\u0157\7k\2\2\u0157\u0158\7t\2\2\u0158\30\3\2\2\2\u0159\u015a\7"+
		"F\2\2\u015a\u015b\7k\2\2\u015b\u015c\7o\2\2\u015c\u015d\7g\2\2\u015d\u015e"+
		"\7p\2\2\u015e\u015f\7u\2\2\u015f\u0160\7k\2\2\u0160\u0161\7q\2\2\u0161"+
		"\u0162\7p\2\2\u0162\32\3\2\2\2\u0163\u0164\7x\2\2\u0164\u0165\7g\2\2\u0165"+
		"\u0166\7t\2\2\u0166\u0167\7f\2\2\u0167\u0168\7c\2\2\u0168\u0169\7f\2\2"+
		"\u0169\u016a\7g\2\2\u016a\u016b\7t\2\2\u016b\u016c\7q\2\2\u016c\34\3\2"+
		"\2\2\u016d\u016e\7h\2\2\u016e\u016f\7c\2\2\u016f\u0170\7n\2\2\u0170\u0171"+
		"\7u\2\2\u0171\u0172\7q\2\2\u0172\36\3\2\2\2\u0173\u0174\7R\2\2\u0174\u0175"+
		"\7c\2\2\u0175\u0176\7t\2\2\u0176\u0177\7c\2\2\u0177 \3\2\2\2\u0178\u0179"+
		"\7S\2\2\u0179\u017a\7w\2\2\u017a\u017b\7g\2\2\u017b\"\3\2\2\2\u017c\u017d"+
		"\7J\2\2\u017d\u017e\7c\2\2\u017e\u017f\7u\2\2\u017f\u0180\7v\2\2\u0180"+
		"\u0181\7c\2\2\u0181$\3\2\2\2\u0182\u0183\7E\2\2\u0183\u0184\7q\2\2\u0184"+
		"\u0185\7p\2\2\u0185&\3\2\2\2\u0186\u0187\7R\2\2\u0187\u0188\7c\2\2\u0188"+
		"\u0189\7u\2\2\u0189\u018a\7q\2\2\u018a(\3\2\2\2\u018b\u018c\7J\2\2\u018c"+
		"\u018d\7c\2\2\u018d\u018e\7e\2\2\u018e\u018f\7g\2\2\u018f\u0190\7t\2\2"+
		"\u0190*\3\2\2\2\u0191\u0192\7H\2\2\u0192\u0193\7k\2\2\u0193\u0194\7p\2"+
		"\2\u0194\u0195\7R\2\2\u0195\u0196\7c\2\2\u0196\u0197\7t\2\2\u0197\u0198"+
		"\7c\2\2\u0198,\3\2\2\2\u0199\u019a\7U\2\2\u019a\u019b\7k\2\2\u019b.\3"+
		"\2\2\2\u019c\u019d\7G\2\2\u019d\u019e\7p\2\2\u019e\u019f\7v\2\2\u019f"+
		"\u01a0\7q\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7e\2\2\u01a2\u01a3\7g\2\2"+
		"\u01a3\u01a4\7u\2\2\u01a4\60\3\2\2\2\u01a5\u01a6\7U\2\2\u01a6\u01a7\7"+
		"k\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7q\2\2\u01a9\62\3\2\2\2\u01aa\u01ab"+
		"\7H\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7p\2\2\u01ad\u01ae\7U\2\2\u01ae"+
		"\u01af\7k\2\2\u01af\64\3\2\2\2\u01b0\u01b1\7U\2\2\u01b1\u01b2\7g\2\2\u01b2"+
		"\u01b3\7i\2\2\u01b3\u01b4\7w\2\2\u01b4\u01b5\7p\2\2\u01b5\66\3\2\2\2\u01b6"+
		"\u01b7\7F\2\2\u01b7\u01b8\7g\2\2\u01b88\3\2\2\2\u01b9\u01ba\7q\2\2\u01ba"+
		"\u01bb\7v\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7q\2\2\u01bd:\3\2\2\2\u01be"+
		"\u01bf\7e\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7u\2\2\u01c1\u01c2\7q\2\2"+
		"\u01c2<\3\2\2\2\u01c3\u01c4\7o\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6\7f\2"+
		"\2\u01c6\u01c7\7q\2\2\u01c7>\3\2\2\2\u01c8\u01c9\7H\2\2\u01c9\u01ca\7"+
		"k\2\2\u01ca\u01cb\7p\2\2\u01cb\u01cc\7U\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce"+
		"\7i\2\2\u01ce\u01cf\7w\2\2\u01cf\u01d0\7p\2\2\u01d0@\3\2\2\2\u01d1\u01d2"+
		"\7O\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7p\2\2\u01d5"+
		"\u01d6\7v\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7c\2\2\u01d8\u01d9\7u\2\2"+
		"\u01d9B\3\2\2\2\u01da\u01db\7H\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd\7p\2"+
		"\2\u01dd\u01de\7O\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1"+
		"\7p\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7c\2\2\u01e4"+
		"\u01e5\7u\2\2\u01e5D\3\2\2\2\u01e6\u01e7\7T\2\2\u01e7\u01e8\7g\2\2\u01e8"+
		"\u01e9\7r\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7v\2\2\u01eb\u01ec\7k\2\2"+
		"\u01ec\u01ed\7t\2\2\u01edF\3\2\2\2\u01ee\u01ef\7H\2\2\u01ef\u01f0\7w\2"+
		"\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7e\2\2\u01f2\u01f3\7k\2\2\u01f3\u01f4"+
		"\7q\2\2\u01f4\u01f5\7p\2\2\u01f5H\3\2\2\2\u01f6\u01f7\7H\2\2\u01f7\u01f8"+
		"\7k\2\2\u01f8\u01f9\7p\2\2\u01f9\u01fa\7H\2\2\u01fa\u01fb\7w\2\2\u01fb"+
		"\u01fc\7p\2\2\u01fc\u01fd\7e\2\2\u01fd\u01fe\7k\2\2\u01fe\u01ff\7q\2\2"+
		"\u01ff\u0200\7p\2\2\u0200J\3\2\2\2\u0201\u0202\7n\2\2\u0202\u0203\7k\2"+
		"\2\u0203\u0204\7o\2\2\u0204\u0205\7r\2\2\u0205\u0206\7k\2\2\u0206\u0207"+
		"\7c\2\2\u0207\u0208\7t\2\2\u0208L\3\2\2\2\u0209\u020a\7o\2\2\u020a\u020b"+
		"\7q\2\2\u020b\u020c\7f\2\2\u020cN\3\2\2\2\u020d\u020e\7p\2\2\u020e\u020f"+
		"\7q\2\2\u020fP\3\2\2\2\u0210\u0211\7q\2\2\u0211R\3\2\2\2\u0212\u0213\7"+
		"{\2\2\u0213T\3\2\2\2\u0214\u0215\7-\2\2\u0215V\3\2\2\2\u0216\u0217\7/"+
		"\2\2\u0217X\3\2\2\2\u0218\u0219\7,\2\2\u0219Z\3\2\2\2\u021a\u021b\7\61"+
		"\2\2\u021b\\\3\2\2\2\u021c\u021d\7*\2\2\u021d^\3\2\2\2\u021e\u021f\7+"+
		"\2\2\u021f`\3\2\2\2\u0220\u0221\7]\2\2\u0221b\3\2\2\2\u0222\u0223\7_\2"+
		"\2\u0223d\3\2\2\2\u0224\u0225\7\'\2\2\u0225f\3\2\2\2\u0226\u0227\7?\2"+
		"\2\u0227h\3\2\2\2\u0228\u0229\7?\2\2\u0229\u022a\7?\2\2\u022aj\3\2\2\2"+
		"\u022b\u022c\7#\2\2\u022c\u022d\7?\2\2\u022dl\3\2\2\2\u022e\u022f\7>\2"+
		"\2\u022fn\3\2\2\2\u0230\u0231\7>\2\2\u0231\u0232\7?\2\2\u0232p\3\2\2\2"+
		"\u0233\u0234\7@\2\2\u0234r\3\2\2\2\u0235\u0236\7@\2\2\u0236\u0237\7?\2"+
		"\2\u0237t\3\2\2\2\u0238\u0239\7.\2\2\u0239v\3\2\2\2\u023a\u023b\7<\2\2"+
		"\u023bx\3\2\2\2\u023c\u023d\7=\2\2\u023dz\3\2\2\2\u023e\u023f\7$\2\2\u023f"+
		"|\3\2\2\2\u0240\u0241\7>\2\2\u0241\u0242\7/\2\2\u0242~\3\2\2\2\u0243\u0244"+
		"\7\u0080\2\2\u0244\u0080\3\2\2\2\u0245\u0246\7\61\2\2\u0246\u0247\7\61"+
		"\2\2\u0247\u0082\3\2\2\2\u0248\u0249\7~\2\2\u0249\u0084\3\2\2\2\u024a"+
		"\u024b\7(\2\2\u024b\u0086\3\2\2\2\u024c\u024d\7`\2\2\u024d\u0088\3\2\2"+
		"\2\u024e\u0250\t\2\2\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u024f"+
		"\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u008a\3\2\2\2\u0253\u0255\t\2\2\2\u0254"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\u025a\7\60\2\2\u0259\u025b\t\2\2\2\u025a"+
		"\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u008c\3\2\2\2\u025e\u0262\5{>\2\u025f\u0261\t\3\2\2\u0260\u025f"+
		"\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266\5{>\2\u0266\u008e\3\2\2"+
		"\2\u0267\u026b\t\4\2\2\u0268\u026a\t\5\2\2\u0269\u0268\3\2\2\2\u026a\u026d"+
		"\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0090\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u0270\t\6\2\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\bI\2\2\u0274\u0092\3\2\2\2\u0275\u0279\5\u0081A\2\u0276\u0278\13"+
		"\2\2\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u027a\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7\f"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u027f\bJ\2\2\u027f\u0094\3\2\2\2\16\2\u00a8"+
		"\u00c0\u0119\u0149\u0251\u0256\u025c\u0262\u026b\u0271\u0279\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}