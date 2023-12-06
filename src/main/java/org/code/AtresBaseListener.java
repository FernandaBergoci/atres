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

	@Override public void enterDeclaracao(AtresParser.DeclaracaoContext ctx) {


	}

	@Override public void exitDeclaracao(AtresParser.DeclaracaoContext ctx) { }
	@Override public void enterVar_decl(AtresParser.Var_declContext ctx) {
		String aux = String.valueOf(ctx.TIPO());
		switch (aux) {
			case "inteiro":
				codigo += "\t\tint" + " " + ctx.ID() + ";\n";
				break;
			case "boolean":
				codigo += "\t\tboolean" + " " + ctx.ID()+ ";\n";
				break;
			case "racional":
				codigo += "\t\tdouble" + " " + ctx.ID()+ ";\n";
				break;
			case "String":
				codigo += "\t\tString" + " " + ctx.ID()+ ";\n";
				break;
			default:
				codigo += "Erro Tipo\n"+ ";\n";
		}

		//codigo+= ctx.TIPO() + " " + ctx.ID()  + ";\n";


	}
	@Override public void exitVar_decl(AtresParser.Var_declContext ctx) { }
	@Override public void enterVar_atrib(AtresParser.Var_atribContext ctx) {
		String aux = String.valueOf(ctx.TIPO());
		if(ctx.variavel() != null) {
			if (ctx.TIPO() != null) {
			switch (aux) {
				case "inteiro":
					codigo += "\t\tint" + " " + ctx.ID() + " " + ctx.OP_ATRIB();
					break;
				case "boolean":
					codigo += "\t\tboolean" + " " + ctx.ID() + " " + ctx.OP_ATRIB();
					break;
				case "racional":
					codigo += "\t\tdouble" + " " + ctx.ID() + " " + ctx.OP_ATRIB();
					break;
				case "String":
					codigo += "\t\tString" + " " + ctx.ID() + " " + ctx.OP_ATRIB();
					break;
				default:
					codigo += "Erro Tipo\n";
			}
			ctx.variavel();
			} else {
			codigo += ctx.ID() + " " + ctx.OP_ATRIB() + ctx.variavel();
			ctx.variavel();
			}
		}else{
			ctx.exprMat();
		}
	}

	@Override public void exitVar_atrib(AtresParser.Var_atribContext ctx) { }
	@Override public void enterComando(AtresParser.ComandoContext ctx) {
//		if(ctx.cmdEntrada() != null) ctx.cmdEntrada();
//		if(ctx.cmdSaida() != null) ctx.cmdSaida();
//		if(ctx.cmdCondicao() != null) ctx.cmdCondicao();
//		if(ctx.cmdRept() != null) ctx.cmdRept();
	}
	@Override public void exitComando(AtresParser.ComandoContext ctx) { }
	@Override public void enterCmdEntrada(AtresParser.CmdEntradaContext ctx) {
		codigo+= "Scanner entrada = new Scanner(System.in);\n";
		codigo+= ctx.ID() + " " + ctx.OP_ATRIB() + " " + ctx.ENTRADA() + ";\n";
	}
	@Override public void exitCmdEntrada(AtresParser.CmdEntradaContext ctx) { }
	@Override public void enterCmdSaida(AtresParser.CmdSaidaContext ctx) {
		codigo+= "System.out.println(" + ctx.string() + ");\n";
	}
	@Override public void exitCmdSaida(AtresParser.CmdSaidaContext ctx) { }
	@Override public void enterCmdCondicao(AtresParser.CmdCondicaoContext ctx) {
			if(ctx.SE() != null) {
				do {
					codigo += "if(" + ctx.comparacao() + "){" + ctx.comando() + "}\n";
				} while (ctx.comando() == null);
			}
			if(ctx.SENAO() != null && ctx.SE() != null){
				do {
				codigo += "else if(" + ctx.comparacao() + "){" + ctx.comando() + "}\n";
				} while (ctx.comando() == null);
			}
			if(ctx.SENAO() != null){
				do{
					codigo += "else{" + ctx.comando() + "}\n";
				} while (ctx.comando() == null);
			}
	}
	@Override public void exitCmdCondicao(AtresParser.CmdCondicaoContext ctx) { }
	@Override public void enterComparacao(AtresParser.ComparacaoContext ctx) {
		codigo+= ctx.variavel() + " "+ ctx.OP_RELAC() + " "+ ctx.variavel();
	}
	@Override public void exitComparacao(AtresParser.ComparacaoContext ctx) { }
	@Override public void enterVariavel(AtresParser.VariavelContext ctx) {
		if(ctx.ID() != null){
			codigo += " " + ctx.ID() + ";\n";
		}
		if(ctx.INTEIRO_DEF() != null){
			codigo += " " + ctx.INTEIRO_DEF() + ";\n";
		}
		if(ctx.RACIONAL_DEF() != null){
			codigo += " " + ctx.RACIONAL_DEF() + ";\n";
		}
		if(ctx.BOOLEAN_DEF() != null){
			codigo+=" " + ctx.BOOLEAN_DEF() + ";\n";
		}if(ctx.string() != null){
			codigo+=" " + ctx.string() + ";\n";
		}
	}
	@Override public void exitVariavel(AtresParser.VariavelContext ctx) { }
	@Override public void enterString(AtresParser.StringContext ctx) {

		if (ctx.OP_SOMA() != null && ctx.STRING_DEF() != null) {
				codigo += " " + ctx.STRING_DEF() + " " + ctx.OP_SOMA() + " " + ctx.STRING_DEF() + "\n";
		}
		if (ctx.OP_SOMA() != null && ctx.ID() != null) {
				codigo += " " + ctx.STRING_DEF() + " " + ctx.OP_SOMA() + " " + ctx.ID() + "\n";
		}
		if(ctx.OP_SOMA() == null) {
			codigo += " " + ctx.STRING_DEF() + "\n";
		}
	}
	@Override public void exitString(AtresParser.StringContext ctx) { }
	@Override public void enterCmdRept(AtresParser.CmdReptContext ctx) {
		if(ctx.for_() != null) ctx.for_();
		if(ctx.while_() != null) ctx.while_();
	}
	@Override public void exitCmdRept(AtresParser.CmdReptContext ctx) { }
	@Override public void enterWhile(AtresParser.WhileContext ctx) {
		codigo+= ctx.WHILE() + "(" + ctx.comparacao() + "){" + ctx.comando() + ";\n}";
	}
	@Override public void exitWhile(AtresParser.WhileContext ctx) { }
	@Override public void enterFor(AtresParser.ForContext ctx) {

	}
	@Override public void exitFor(AtresParser.ForContext ctx) { }
	@Override public void enterExprMat(AtresParser.ExprMatContext ctx) {

		//System.out.println("ExprMat");
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