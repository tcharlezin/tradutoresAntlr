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
		ArrayList<String> linhasArquivo = this.ObterLinhasArquivoFormView();
		ArrayList<String> linhasNovoArquivo = this.ModificarArquivoFormView(linhasArquivo);
		SalvarArquivoFormView(linhasNovoArquivo);
	}
	
	private ArrayList<String> ObterLinhasArquivoFormView() throws IOException 
	{
		Path currentRelativePath = Paths.get("");
		String arquivo = currentRelativePath.toAbsolutePath() + "\\src\\view\\_form.blade.php";
		return Utilitario.ObterLinhasArquivo(arquivo);
	}

	private ArrayList<String> ModificarArquivoFormView(ArrayList<String> linhasArquivo) 
	{
		return null;
	}

	private void SalvarArquivoFormView(ArrayList<String> linhasNovoArquivo) 
	{
	}
}
