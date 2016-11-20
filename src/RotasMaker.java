import java.io.IOException;
import java.util.ArrayList;

public class RotasMaker 
{
	private GoLaravel gerador;
	
	public RotasMaker(GoLaravel gerador)
	{
		this.gerador = gerador;
	}
	
	public void GerarCodigo()
	{
		try
		{
			ArrayList<String> linhasArquivo = this.ObterLinhasArquivoRota();
			
			linhasArquivo.add(String.format("// Adicionando rota para %s", this.gerador.ObterNome()));
			linhasArquivo.add(ObterLinhaRota());
			linhasArquivo.add("");
			
			Utilitario.RemoverArquivo(this.ObterArquivoRota());
			Utilitario.CriarArquivo(linhasArquivo, this.ObterArquivoRota());
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	private ArrayList<String> ObterLinhasArquivoRota() throws IOException 
	{
		return Utilitario.ObterLinhasArquivo(this.ObterArquivoRota());
	}

	private String ObterArquivoRota() 
	{
		return this.gerador.ObterPath() + "\\routes\\web.php";
	}
	
	private String ObterLinhaRota()
	{
		String nome = this.gerador.ObterNome();
		String rota = this.gerador.ObterNomeMinusculo();
		
		return String.format("Route::resource('%s', '%sController');", rota, nome);
	}
}
