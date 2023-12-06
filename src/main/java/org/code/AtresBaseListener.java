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
		codigo+="\t}\n}" ;
	}

	@Override public void enterDeclaracao(AtresParser.DeclaracaoContext ctx) {	}

	@Override public void exitDeclaracao(AtresParser.DeclaracaoContext ctx) { codigo+= ";";}
	@Override public void enterVar_decl(AtresParser.Var_declContext ctx) {
		String aux = String.valueOf(ctx.TIPO());
		switch (aux) {
			case "inteiro":
				codigo += "\t\t\nint" + " " + ctx.ID();
				break;
			case "boolean":
				codigo += "\t\t\nboolean" + " " + ctx.ID();
				break;
			case "racional":
				codigo += "\t\t\ndouble" + " " + ctx.ID();
				break;
			case "String":
				codigo += "\t\t\nString" + " " + ctx.ID();
				break;
			default:
				codigo += "Erro Tipo\n"+ ";\n";
		}
	}
	@Override public void exitVar_decl(AtresParser.Var_declContext ctx) { }
	@Override public void enterVar_atrib(AtresParser.Var_atribContext ctx) {
		String aux = String.valueOf(ctx.TIPO());
		if(ctx.variavel() != null) {
			if (ctx.TIPO() != null) {
			switch (aux) {
				case "inteiro":
					codigo += "\t\t\nint" + " " + ctx.ID() + " " + ctx.OP_ATRIB();
					break;
				case "boolean":
					codigo += "\t\t\nboolean" + " " + ctx.ID() + " " + ctx.OP_ATRIB();
					break;
				case "racional":
					codigo += "\t\t\ndouble" + " " + ctx.ID() + " " + ctx.OP_ATRIB();
					break;
				case "String":
					codigo += "\t\t\nString" + " " + ctx.ID() + " " + ctx.OP_ATRIB();
					break;
				default:
					codigo += "Erro Tipo\n";
			}
			ctx.variavel();
			}
		}
	}

	@Override public void exitVar_atrib(AtresParser.Var_atribContext ctx) { }
	@Override public void enterComando(AtresParser.ComandoContext ctx) {

	}
	@Override public void exitComando(AtresParser.ComandoContext ctx) { }
	@Override public void enterCmdEntrada(AtresParser.CmdEntradaContext ctx) {
		codigo+= "Scanner entrada = new Scanner(System.in);\n";
	}
	@Override public void exitCmdEntrada(AtresParser.CmdEntradaContext ctx) { }
	@Override public void enterCmdSaida(AtresParser.CmdSaidaContext ctx) {
		codigo+= "System.out.println(";
	}
	@Override public void exitCmdSaida(AtresParser.CmdSaidaContext ctx) {
		codigo+= ");\n";
	}
	@Override public void enterCmdCondicao(AtresParser.CmdCondicaoContext ctx) {

		if(ctx.SE() != null) {
			codigo += "\n" + ctx.SE() + "(";
		}else {
			if(ctx.SENAO() != null) {
				codigo += "\n" + ctx.SENAO();
			}
		}

	}
	@Override public void exitCmdCondicao(AtresParser.CmdCondicaoContext ctx) {	}
	@Override public void enterComparacao(AtresParser.ComparacaoContext ctx) {
				codigo+= ctx.OP_RELAC();
	}
	@Override public void exitComparacao(AtresParser.ComparacaoContext ctx) {
		codigo+= "){\n";
	}
	@Override public void enterVariavel(AtresParser.VariavelContext ctx) {
		if(ctx.ID() != null){
			codigo += " " + ctx.ID();
		}
		if(ctx.INTEIRO_DEF() != null){
			codigo += " " + ctx.INTEIRO_DEF() ;
		}
		if(ctx.RACIONAL_DEF() != null){
			codigo += " " + ctx.RACIONAL_DEF();
		}
		if(ctx.BOOLEAN_DEF() != null){
			codigo+=" " + ctx.BOOLEAN_DEF() ;
		}if(ctx.string() != null){
			codigo+=" " + ctx.string() ;
		}
	}
	@Override public void exitVariavel(AtresParser.VariavelContext ctx) { }
	@Override public void enterString(AtresParser.StringContext ctx) {
		codigo += ctx.STRING_DEF() ;

	}
	@Override public void exitString(AtresParser.StringContext ctx) { }
	@Override public void enterCmdRept(AtresParser.CmdReptContext ctx) {

	}
	@Override public void exitCmdRept(AtresParser.CmdReptContext ctx) { }
	@Override public void enterWhile(AtresParser.WhileContext ctx) {
		codigo+= "\t\n\n" + ctx.WHILE() + "" + ctx.AB_PAR();
	}
	@Override public void exitWhile(AtresParser.WhileContext ctx) { codigo+="}";}
	@Override public void enterFor(AtresParser.ForContext ctx) {

	}
	@Override public void exitFor(AtresParser.ForContext ctx) {codigo+="}"; }
	@Override public void enterExprMat(AtresParser.ExprMatContext ctx) {

		//System.out.println("ExprMat");
	}
	@Override public void exitExprMat(AtresParser.ExprMatContext ctx) { }
	@Override public void enterNumber(AtresParser.NumberContext ctx) {	}
	@Override public void exitNumber(AtresParser.NumberContext ctx) { }
	@Override public void enterEveryRule(ParserRuleContext ctx) {	}
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }

	public String getCodigo(){
		return codigo;
	}
}