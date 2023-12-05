// Generated from C:/Users/nandi/Desktop/aula03CGRV/atres/src/main/java/org/code/Atres.g4 by ANTLR 4.13.1
package org.code;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.w3c.dom.ls.LSOutput;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class AtresBaseListener implements AtresListener {

	private String codigo = "";

	@Override public void enterPrograma(AtresParser.ProgramaContext ctx) {
		codigo+="import java.util.*;\n";
		codigo+="public class " + ctx.ID() + "{\n";
		codigo+="\tpublic static void main(String[] args){\n" ;
	}

	@Override public void exitPrograma(AtresParser.ProgramaContext ctx) {
		codigo+="}";
	}

	@Override public void enterDeclaracao(AtresParser.DeclaracaoContext ctx) {

	}

	@Override public void exitDeclaracao(AtresParser.DeclaracaoContext ctx) { }
	@Override public void enterVar_decl(AtresParser.Var_declContext ctx) {
		codigo+= ctx.TIPO() + " " + ctx.ID()  + ";\n";
	}
	@Override public void exitVar_decl(AtresParser.Var_declContext ctx) { }
	@Override public void enterVar_atrib(AtresParser.Var_atribContext ctx) {
		if(ctx.TIPO() != null) {
			codigo += ctx.TIPO() + " " + ctx.ID() + " " + ctx.OP_ATRIB() + ctx.variavel() +";\n";
		}else{
			codigo += ctx.ID() + " " + ctx.OP_ATRIB() + ctx.variavel() +";\n";
		}
	}
	@Override public void exitVar_atrib(AtresParser.Var_atribContext ctx) { }
	@Override public void enterComando(AtresParser.ComandoContext ctx) {

	}
	@Override public void exitComando(AtresParser.ComandoContext ctx) { }
	@Override public void enterCmdEntrada(AtresParser.CmdEntradaContext ctx) {

	}
	@Override public void exitCmdEntrada(AtresParser.CmdEntradaContext ctx) { }
	@Override public void enterCmdSaida(AtresParser.CmdSaidaContext ctx) {

	}
	@Override public void exitCmdSaida(AtresParser.CmdSaidaContext ctx) { }
	@Override public void enterCmdCondicao(AtresParser.CmdCondicaoContext ctx) {

	}
	@Override public void exitCmdCondicao(AtresParser.CmdCondicaoContext ctx) { }
	@Override public void enterComparacao(AtresParser.ComparacaoContext ctx) {
		codigo+= ctx.variavel() + " "+ ctx.OP_RELAC() + " "+ ctx.variavel();
	}
	@Override public void exitComparacao(AtresParser.ComparacaoContext ctx) { }
	@Override public void enterVariavel(AtresParser.VariavelContext ctx) {
		if(ctx.ID() != null){
			codigo += ctx.ID();
		}else if(ctx.INTEIRO_DEF() != null){
			codigo += ctx.INTEIRO_DEF();
		}else if(ctx.RACIONAL_DEF() != null){
			codigo += ctx.RACIONAL_DEF();
		}else if(ctx.BOOLEAN_DEF() != null){
			codigo+=ctx.BOOLEAN_DEF();
		}else{
			ctx.string();
		}

	}
	@Override public void exitVariavel(AtresParser.VariavelContext ctx) { }
	@Override public void enterString(AtresParser.StringContext ctx) {
		if(ctx.OP_SOMA() != null){
			if(ctx.ID() != null) {
				codigo += " " + ctx.STRING_DEF() + " " + ctx.OP_SOMA() + " " + ctx.STRING_DEF() + "\n";
			}else {
				codigo += " " + ctx.STRING_DEF() + " " + ctx.OP_SOMA() + " " + ctx.ID() + "\n";
			}
		}else {
			codigo += " " + ctx.STRING_DEF()+ "\n";
		}
	}
	@Override public void exitString(AtresParser.StringContext ctx) { }
	@Override public void enterCmdRept(AtresParser.CmdReptContext ctx) {

	}
	@Override public void exitCmdRept(AtresParser.CmdReptContext ctx) { }
	@Override public void enterWhile(AtresParser.WhileContext ctx) {

	}
	@Override public void exitWhile(AtresParser.WhileContext ctx) { }
	@Override public void enterFor(AtresParser.ForContext ctx) {

	}
	@Override public void exitFor(AtresParser.ForContext ctx) { }
	@Override public void enterExprMat(AtresParser.ExprMatContext ctx) {

	}
	@Override public void exitExprMat(AtresParser.ExprMatContext ctx) { }
	@Override public void enterNumber(AtresParser.NumberContext ctx) {

	}
	@Override public void exitNumber(AtresParser.NumberContext ctx) { }
	@Override public void enterEveryRule(ParserRuleContext ctx) {

	}
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }

	public String getCodigo(){
		return codigo;
	}
}