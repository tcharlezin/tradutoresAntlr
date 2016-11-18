// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#def_app}.
	 * @param ctx the parse tree
	 */
	void enterDef_app(@NotNull HelloParser.Def_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#def_app}.
	 * @param ctx the parse tree
	 */
	void exitDef_app(@NotNull HelloParser.Def_appContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(@NotNull HelloParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(@NotNull HelloParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull HelloParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull HelloParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#definicao_nam}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao_nam(@NotNull HelloParser.Definicao_namContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#definicao_nam}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao_nam(@NotNull HelloParser.Definicao_namContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#definicao_app}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao_app(@NotNull HelloParser.Definicao_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#definicao_app}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao_app(@NotNull HelloParser.Definicao_appContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#def_nam}.
	 * @param ctx the parse tree
	 */
	void enterDef_nam(@NotNull HelloParser.Def_namContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#def_nam}.
	 * @param ctx the parse tree
	 */
	void exitDef_nam(@NotNull HelloParser.Def_namContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#crud}.
	 * @param ctx the parse tree
	 */
	void enterCrud(@NotNull HelloParser.CrudContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#crud}.
	 * @param ctx the parse tree
	 */
	void exitCrud(@NotNull HelloParser.CrudContext ctx);
}