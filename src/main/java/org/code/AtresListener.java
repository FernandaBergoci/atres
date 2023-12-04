// Generated from C:/Users/nandi/Desktop/aula03CGRV/atres/src/main/java/org/code/Atres.g4 by ANTLR 4.13.1
package org.code;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AtresParser}.
 */
public interface AtresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AtresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AtresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AtresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AtresParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AtresParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(AtresParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(AtresParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#var_atrib}.
	 * @param ctx the parse tree
	 */
	void enterVar_atrib(AtresParser.Var_atribContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#var_atrib}.
	 * @param ctx the parse tree
	 */
	void exitVar_atrib(AtresParser.Var_atribContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AtresParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AtresParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#cmdEntrada}.
	 * @param ctx the parse tree
	 */
	void enterCmdEntrada(AtresParser.CmdEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#cmdEntrada}.
	 * @param ctx the parse tree
	 */
	void exitCmdEntrada(AtresParser.CmdEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#cmdSaida}.
	 * @param ctx the parse tree
	 */
	void enterCmdSaida(AtresParser.CmdSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#cmdSaida}.
	 * @param ctx the parse tree
	 */
	void exitCmdSaida(AtresParser.CmdSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#cmdCondicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdCondicao(AtresParser.CmdCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#cmdCondicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdCondicao(AtresParser.CmdCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(AtresParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(AtresParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(AtresParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(AtresParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(AtresParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(AtresParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#cmdRept}.
	 * @param ctx the parse tree
	 */
	void enterCmdRept(AtresParser.CmdReptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#cmdRept}.
	 * @param ctx the parse tree
	 */
	void exitCmdRept(AtresParser.CmdReptContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(AtresParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(AtresParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(AtresParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(AtresParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#exprMat}.
	 * @param ctx the parse tree
	 */
	void enterExprMat(AtresParser.ExprMatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#exprMat}.
	 * @param ctx the parse tree
	 */
	void exitExprMat(AtresParser.ExprMatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtresParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AtresParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtresParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AtresParser.NumberContext ctx);
}