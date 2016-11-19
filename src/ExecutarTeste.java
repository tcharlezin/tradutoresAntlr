import java.util.Random;

public class ExecutarTeste {

	public static void main(String[] args) 
	{
		GoLaravel gerador = new GoLaravel();
		gerador.DefinirNamespace("");
		gerador.DefinirNome("Teste" + new Random().nextInt(1000));
		gerador.DefinirPath("C:\\Users\\Seven\\Projetos\\Tradutores\\tradutor");
		
		Campo nome = new Campo("nome", "string", true, false);
		Campo idade = new Campo("idade", "inteiro", false, false);
		
		gerador.AdicionarCampo(nome);
		gerador.AdicionarCampo(idade);
		
		gerador.Executar();
	}

}
