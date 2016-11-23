import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ViewMakerForm 
{
	private GoLaravel gerador;
	
	public ViewMakerForm(GoLaravel gerador)
	{
		this.gerador = gerador;
	}
	
	public void Executar() throws IOException
	{
		try
		{
			ArrayList<String> linhasArquivo = this.gerador.ObterCamposForm();
			this.SalvarArquivoFormView(linhasArquivo);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	private void SalvarArquivoFormView(ArrayList<String> linhasNovoArquivo) throws IOException 
	{
		Utilitario.CriarArquivo(linhasNovoArquivo, this.ObterArquivoFormView());
	}
	
	private String ObterArquivoFormView()
	{
		return this.gerador.ObterNomeDiretorioView() + "\\_form.blade.php";
	}
}
