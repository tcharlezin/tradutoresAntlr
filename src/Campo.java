
public class Campo 
{
	private String nome;
	private String tipo;
	private boolean requerido;
	private boolean naoLista;
	
	public static final String TIPO_STRING = "string";
	public static final String TIPO_TEXTO = "texto";
	public static final String TIPO_INTEIRO = "inteiro";
	public static final String TIPO_DECIMAL = "decimal";
	public static final String TIPO_DATE = "data";
	public static final String TIPO_BOOLEAN = "boolean";
	public static final String ESPACOS_INICIO = "            ";
	
	public Campo(String nome, String tipo, boolean requerido, boolean naoLista)
	{
		this.nome = nome;
		this.tipo = tipo;
		this.requerido = requerido;
		this.naoLista = naoLista;
	}
	
	public String ObterNome()
	{
		return this.nome;
	}

	public String ObterLinhaMigration() throws Exception 
	{
		String campo = this.ObterDefinicaoCampo();
		
		if(! this.requerido)
		{
			campo += "->nullable()";
		}
		
		return campo + ";";
	}
	
	private String ObterDefinicaoCampo() throws Exception
	{
		String nomeColuna = this.nome.toLowerCase();
		
		switch (this.tipo) 
		{
			case TIPO_STRING:
				return String.format("%s$table->%s('%s')", ESPACOS_INICIO, "string", nomeColuna);
			case TIPO_TEXTO:
				return String.format("%s$table->%s('%s')", ESPACOS_INICIO, "text", nomeColuna);
			case TIPO_INTEIRO:
				return String.format("%s$table->%s('%s')", ESPACOS_INICIO, "integer", nomeColuna);
			case TIPO_DECIMAL:
				return String.format("%s$table->%s('%s')", ESPACOS_INICIO, "decimal", nomeColuna);
			case TIPO_DATE:
				return String.format("%s$table->%s('%s')", ESPACOS_INICIO, "date", nomeColuna);
			case TIPO_BOOLEAN:
				return String.format("%s$table->%s('%s')", ESPACOS_INICIO, "bool", nomeColuna);

			default:
				throw new Exception("Tipo de campo não reconhecido: " + this.tipo);
		}
		
	}

	public boolean IsApareceListagem() 
	{
		return ! this.naoLista;
	}
}
