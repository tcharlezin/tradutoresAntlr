
public class ExecutarTeste {

	public static void main(String[] args) 
	{
		GoLaravel gerador = new GoLaravel();
		gerador.DefinirNamespace("");
		gerador.DefinirNome("Teste4");
		gerador.DefinirPath("C:\\Users\\Seven\\Projetos\\Tradutores\\tradutor");

		new MigrationMaker(gerador).GerarCodigo();
	}

}
