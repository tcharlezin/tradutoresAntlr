public class GeradorCrud extends HelloBaseListener 
{
	private HelloParser parser;
	private GoLaravel gerador;
	private Campo campo;
	
	public GeradorCrud(HelloParser parser)
	{
		this.parser = parser;
		this.gerador = new GoLaravel();
	}
	
	public void enterDefinicao_app(HelloParser.Definicao_appContext ctx) 
	{
		String definicao = ctx.getText();
		String[] opcoes = definicao.split(" = ");
		
		String diretorio = opcoes[1].replace("'", "");
		this.gerador.DefinirPath(diretorio);
	}
	
	public void enterNome_entidade(HelloParser.Nome_entidadeContext ctx) 
	{ 
		String nomeEntidade = ctx.getText();
		this.gerador.DefinirNome(nomeEntidade);
	}
	
	public void enterNovo_campo(HelloParser.Novo_campoContext ctx) 
	{		
		this.campo = new Campo();
		this.campo.DefinirRequerido(false);
		this.campo.DefinirNaoLista(false);
	}
	
	public void enterNome_campo(HelloParser.Nome_campoContext ctx) 
	{
		String nomeCampo = ctx.getText();
		this.campo.DefinirNome(nomeCampo);
	}
	
	public void enterTipo_campo( HelloParser.Tipo_campoContext ctx) 
	{ 
		try 
		{
			String tipoCampo = ctx.getText();
			
			switch (tipoCampo.toLowerCase()) 
			{
				case "string":
					this.campo.DefinirTipo("string");
					break;
				case "texto":
					this.campo.DefinirTipo("texto");
					break;
				case "inteiro":
					this.campo.DefinirTipo("inteiro");
					break;
				case "decimal":
					this.campo.DefinirTipo("decimal");
					break;
				case "data":
					this.campo.DefinirTipo("data");
					break;
				case "boolean":
					this.campo.DefinirTipo("boolean");
					break;
	
				default:
					throw new Exception("Não foi possível reconhecer o tipo de campo!");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("EXCEPTION: " + e.getMessage());
			System.exit(0);
		}
	}
	
	public void enterCampo_requerido(HelloParser.Campo_requeridoContext ctx) 
	{
		String textoRequerido = ctx.getText();
		if(textoRequerido.equals("+ REQUERIDO"))
		{
			// Se tem a sequencia de caracteres, define o campo como requerido
			this.campo.DefinirRequerido(true);
		}
	}
	
	public void enterNao_lista(HelloParser.Nao_listaContext ctx) 
	{
		String textoNaoLista = ctx.getText();
		if(textoNaoLista.equals("+ NAO_LISTA"))
		{
			// Se tem a sequencia de caracteres, define o campo como requerido
			this.campo.DefinirNaoLista(true);
		}
	}
	
	public void enterValor_default(HelloParser.Valor_defaultContext ctx) 
	{
		String valorDefault = ctx.getText();
		this.campo.DefinirValorDefault(valorDefault);
	}
	
	public void exitNovo_campo(HelloParser.Novo_campoContext ctx) 
	{
		this.gerador.AdicionarCampo(this.campo);
	}
	
	public void exitCrud(HelloParser.CrudContext ctx) 
	{	
		this.gerador.Executar();
	}
	
}
