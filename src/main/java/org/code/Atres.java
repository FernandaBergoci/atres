package org.code;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;

public class Atres {
    public static void main(String[] args) throws Exception {

        File arquivo = new File("C:\\Users\\nandi\\Desktop\\compilador\\atres\\src\\main\\java\\org\\code\\codigo");
        CharStream entrada = CharStreams.fromFileName(arquivo.getAbsolutePath());
        AtresLexer anaLexer = new AtresLexer(entrada);
        CommonTokenStream tokens = new CommonTokenStream(anaLexer);
        AtresParser anaSemantico = new AtresParser(tokens);

        ParseTree arvore = anaSemantico.programa();

        ParseTreeWalker andarilho = new ParseTreeWalker();
        AtresBaseListener escutador = new AtresBaseListener();

        andarilho.walk(escutador,arvore);

        String codigo = escutador.getCodigo();

        System.out.println(codigo   );
    }
}
