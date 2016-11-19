import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MigrationMaker 
{
	private GoLaravel gerador;
	private String migration;
	private static final int INICIO_CAMPOS = 17;
	
	public MigrationMaker(GoLaravel gerador) 
	{
		this.gerador = gerador;
	}
	
	public void GerarCodigo()
	{
		try 
		{
			this.LimparComposer();
			this.CriarMigration();
			this.ModificarMigration();
			this.ExecutarMigration();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	private void LimparComposer() throws IOException 
	{
		String comando = "composer dump-autoload ";
		ArtisanComando.Executar(this.gerador.ObterPath(), comando);
	}

	private void CriarMigration() throws Exception
	{
		String tabela = this.gerador.ObterNome();
		
		String comando = String.format("php artisan make:migration %s --create=%s", tabela, tabela.toLowerCase()) ;
		ArrayList<String> retorno = ArtisanComando.Executar(this.gerador.ObterPath(), comando);
		if(! retorno.isEmpty())
		{
			String primeiroElemento = retorno.get(0).trim();
			
			if(primeiroElemento == "" || primeiroElemento.length() == 0)
			{
				throw new Exception("Não foi possível criar a migration " + this.gerador.ObterNome());
			}
			
			String[] quebras = primeiroElemento.split(":");
			if(quebras.length != 0)
			{
				this.migration = quebras[1].trim();
			}
		}
	}
	
	private void ModificarMigration() throws Exception 
	{
		// Obtem as linhas que vamos adicionar no arquivo de migrations
		ArrayList<String> linhasParaAdicionar = this.gerador.ObterCamposMigration();
		
		// Obtem todas as linhas do arquivo de migration
		ArrayList<String> linhasArquivo = this.ObterLinhasArquivoMigration();
		
		// Posição onde serão inseridos os campos
		int indexStart = INICIO_CAMPOS;
		
		for (String linha : linhasParaAdicionar) 
		{
			linhasArquivo.add(indexStart, linha);
			indexStart++;
		}
		
		// Remover arquivo antigo
		this.RemoverArquivoMigration();
		
		// Criar novo arquivo
		this.CriarArquivoMigration(linhasArquivo);
		
	}
	
	private void RemoverArquivoMigration() 
	{
		Utilitario.RemoverArquivo(this.ObterArquivoMigration());
	}

	private void CriarArquivoMigration(ArrayList<String> linhasArquivo) throws IOException 
	{
		Utilitario.CriarArquivo(linhasArquivo, this.ObterArquivoMigration());
	}

	private ArrayList<String> ObterLinhasArquivoMigration() throws IOException
	{
		return Utilitario.ObterLinhasArquivo(this.ObterArquivoMigration());
	}
	
	private String ObterArquivoMigration() 
	{
		return this.gerador.ObterPath() + "\\database\\migrations\\" + this.migration + ".php";
	}

	private void ExecutarMigration() throws IOException 
	{
		String comando = "php artisan migrate ";
		ArtisanComando.Executar(this.gerador.ObterPath(), comando);
	}
}
