public class ExecutarTeste {

	public static void main(String[] args) 
	{
		GoLaravel gerador = new GoLaravel();
		gerador.DefinirNamespace("");
		gerador.DefinirNome("Cidadao");
		gerador.DefinirPath("C:\\Users\\Seven\\Projetos\\Tradutores\\tradutor");
		
		Campo nome = new Campo("nome", "string", true, false);
		Campo datanasc = new Campo("nascimento", "data", true, false);
		Campo idade = new Campo("idade", "inteiro", false, false);
		
//		Campo historia = new Campo("historia", "texto", true, false);
//		Campo peso = new Campo("peso", "decimal", false, false);
//		Campo vivo = new Campo("vivo", "boolean", true, false);
		
		gerador.AdicionarCampo(nome);
		gerador.AdicionarCampo(idade);
		gerador.AdicionarCampo(datanasc);
		
//		gerador.AdicionarCampo(historia);
//		gerador.AdicionarCampo(peso);
//		gerador.AdicionarCampo(vivo);		
		
		
		gerador.Executar();
	}

}
