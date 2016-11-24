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
	 * Enter a parse tree produced by {@link HelloParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(@NotNull HelloParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(@NotNull HelloParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#tipo_campo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_campo(@NotNull HelloParser.Tipo_campoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#tipo_campo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_campo(@NotNull HelloParser.Tipo_campoContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#campo_requerido}.
	 * @param ctx the parse tree
	 */
	void enterCampo_requerido(@NotNull HelloParser.Campo_requeridoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#campo_requerido}.
	 * @param ctx the parse tree
	 */
	void exitCampo_requerido(@NotNull HelloParser.Campo_requeridoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#valor_default}.
	 * @param ctx the parse tree
	 */
	void enterValor_default(@NotNull HelloParser.Valor_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#valor_default}.
	 * @param ctx the parse tree
	 */
	void exitValor_default(@NotNull HelloParser.Valor_defaultContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#nome_entidade}.
	 * @param ctx the parse tree
	 */
	void enterNome_entidade(@NotNull HelloParser.Nome_entidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nome_entidade}.
	 * @param ctx the parse tree
	 */
	void exitNome_entidade(@NotNull HelloParser.Nome_entidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull HelloParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull HelloParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#padrao}.
	 * @param ctx the parse tree
	 */
	void enterPadrao(@NotNull HelloParser.PadraoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#padrao}.
	 * @param ctx the parse tree
	 */
	void exitPadrao(@NotNull HelloParser.PadraoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nao_lista}.
	 * @param ctx the parse tree
	 */
	void enterNao_lista(@NotNull HelloParser.Nao_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nao_lista}.
	 * @param ctx the parse tree
	 */
	void exitNao_lista(@NotNull HelloParser.Nao_listaContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link HelloParser#novo_campo}.
	 * @param ctx the parse tree
	 */
	void enterNovo_campo(@NotNull HelloParser.Novo_campoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#novo_campo}.
	 * @param ctx the parse tree
	 */
	void exitNovo_campo(@NotNull HelloParser.Novo_campoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nome_campo}.
	 * @param ctx the parse tree
	 */
	void enterNome_campo(@NotNull HelloParser.Nome_campoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nome_campo}.
	 * @param ctx the parse tree
	 */
	void exitNome_campo(@NotNull HelloParser.Nome_campoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#def_nome_campo}.
	 * @param ctx the parse tree
	 */
	void enterDef_nome_campo(@NotNull HelloParser.Def_nome_campoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#def_nome_campo}.
	 * @param ctx the parse tree
	 */
	void exitDef_nome_campo(@NotNull HelloParser.Def_nome_campoContext ctx);
}