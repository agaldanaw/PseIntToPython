// Generated from C:/Users/nxpan/Desktop/LenguajesProgr/Taller3/PseIntToPython/grammar\PseIntGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseIntGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseIntGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PseIntGrammarParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#subproceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproceso(PseIntGrammarParser.SubprocesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#id_subproceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subproceso(PseIntGrammarParser.Id_subprocesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(PseIntGrammarParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(PseIntGrammarParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#definicion_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_variables(PseIntGrammarParser.Definicion_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#asignacion_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PseIntGrammarParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(PseIntGrammarParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PseIntGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PseIntGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comandos_especiales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos_especiales(PseIntGrammarParser.Comandos_especialesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comando_escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comando_leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_leer(PseIntGrammarParser.Comando_leerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#dimensionamiento_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionamiento_arreglo(PseIntGrammarParser.Dimensionamiento_arregloContext ctx);
}