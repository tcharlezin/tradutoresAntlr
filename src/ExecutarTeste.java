public class ExecutarTeste {

	public static void main(String[] args) 
	{
		GoLaravel gerador = new GoLaravel();
		gerador.DefinirNamespace("");
		gerador.DefinirNome("Carros");
		gerador.DefinirPath("C:\\Users\\Seven\\Projetos\\Tradutores\\tradutor");
		
		Campo nome = new Campo("nome", "string", true, false);
		Campo idade = new Campo("idade", "inteiro", false, false);
		Campo email = new Campo("email", "string", true, false);
		
		gerador.AdicionarCampo(nome);
		gerador.AdicionarCampo(idade);
		gerador.AdicionarCampo(email);
		
		gerador.Executar();
	}

}
