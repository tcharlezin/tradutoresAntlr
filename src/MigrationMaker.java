import java.io.IOException;
import java.util.ArrayList;

public class MigrationMaker 
{
	private GoLaravel gerador;
	private String migration;
	
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
		String comando = "php artisan make:migration " + this.gerador.ObterNome();
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
				this.migration = quebras[1];
			}
		}
	}
	
	private void ModificarMigration() 
	{
		System.out.print("Migration criada: " + this.migration);
	}
	
	private void ExecutarMigration() throws IOException 
	{
		String comando = "php artisan migrate ";
		ArtisanComando.Executar(this.gerador.ObterPath(), comando);
	}
}
