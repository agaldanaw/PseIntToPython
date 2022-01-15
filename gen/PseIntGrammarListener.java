// Generated from C:/Users/nxpan/Desktop/LenguajesProgr/Taller3/PseIntToPython/grammar\PseIntGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseIntGrammarParser}.
 */
public interface PseIntGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PseIntGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PseIntGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#subproceso}.
	 * @param ctx the parse tree
	 */
	void enterSubproceso(PseIntGrammarParser.SubprocesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#subproceso}.
	 * @param ctx the parse tree
	 */
	void exitSubproceso(PseIntGrammarParser.SubprocesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#id_subproceso}.
	 * @param ctx the parse tree
	 */
	void enterId_subproceso(PseIntGrammarParser.Id_subprocesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#id_subproceso}.
	 * @param ctx the parse tree
	 */
	void exitId_subproceso(PseIntGrammarParser.Id_subprocesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PseIntGrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PseIntGrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(PseIntGrammarParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(PseIntGrammarParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#definicion_variables}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_variables(PseIntGrammarParser.Definicion_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#definicion_variables}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_variables(PseIntGrammarParser.Definicion_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#asignacion_variable}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#asignacion_variable}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PseIntGrammarParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PseIntGrammarParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(PseIntGrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(PseIntGrammarParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PseIntGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PseIntGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PseIntGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PseIntGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comandos_especiales}.
	 * @param ctx the parse tree
	 */
	void enterComandos_especiales(PseIntGrammarParser.Comandos_especialesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comandos_especiales}.
	 * @param ctx the parse tree
	 */
	void exitComandos_especiales(PseIntGrammarParser.Comandos_especialesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comando_escribir}.
	 * @param ctx the parse tree
	 */
	void enterComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comando_escribir}.
	 * @param ctx the parse tree
	 */
	void exitComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comando_leer}.
	 * @param ctx the parse tree
	 */
	void enterComando_leer(PseIntGrammarParser.Comando_leerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comando_leer}.
	 * @param ctx the parse tree
	 */
	void exitComando_leer(PseIntGrammarParser.Comando_leerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#dimensionamiento_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterDimensionamiento_arreglo(PseIntGrammarParser.Dimensionamiento_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#dimensionamiento_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitDimensionamiento_arreglo(PseIntGrammarParser.Dimensionamiento_arregloContext ctx);
}