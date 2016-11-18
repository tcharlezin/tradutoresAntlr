
public class Campo 
{
	private String nome;
	private String tipo;
	private boolean requerido;
	private boolean naoLista;
	
	public Campo(String nome, String tipo, boolean requerido, boolean naoLista)
	{
		this.nome = nome;
		this.tipo = tipo;
		this.requerido = requerido;
		this.naoLista = naoLista;
	}
}
