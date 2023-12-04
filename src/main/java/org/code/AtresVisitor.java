// Generated from C:/Users/nandi/Desktop/aula03CGRV/atres/src/main/java/org/code/Atres.g4 by ANTLR 4.13.1
package org.code;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AtresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AtresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AtresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AtresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(AtresParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(AtresParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#var_atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_atrib(AtresParser.Var_atribContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(AtresParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#cmdEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEntrada(AtresParser.CmdEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#cmdSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSaida(AtresParser.CmdSaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#cmdCondicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCondicao(AtresParser.CmdCondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#comparacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacao(AtresParser.ComparacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(AtresParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AtresParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#cmdRept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRept(AtresParser.CmdReptContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(AtresParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(AtresParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#exprMat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMat(AtresParser.ExprMatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtresParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AtresParser.NumberContext ctx);
}