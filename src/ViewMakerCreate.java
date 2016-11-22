import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ViewMakerCreate 
{
	private GoLaravel gerador;
	private static final String MODEL = "%%MODEL%%";
	private static final String MODEL_STORE = "%%MODEL_STORE%%";
	private static final String MODEL_FORM = "%%MODEL_FORM%%";
	
	public ViewMakerCreate(GoLaravel gerador)
	{
		this.gerador = gerador;
	}
	
	public void Executar() throws IOException
	{
		ArrayList<String> linhasArquivo = this.ObterLinhasArquivoCreateView();
		ArrayList<String> linhasNovoArquivo = this.ModificarArquivoCreateView(linhasArquivo);
		SalvarArquivoCreateView(linhasNovoArquivo);
	}

	private ArrayList<String> ObterLinhasArquivoCreateView() throws IOException 
	{
		Path currentRelativePath = Paths.get("");
		String arquivo = currentRelativePath.toAbsolutePath() + "\\src\\view\\create.blade.php";
		return Utilitario.ObterLinhasArquivo(arquivo);
	}

	private ArrayList<String> ModificarArquivoCreateView(ArrayList<String> linhasArquivo) 
	{
		ArrayList<String> novoLista = new ArrayList<String>();
		
		for (String linha : linhasArquivo) 
		{
			if(linha.contains(MODEL))
			{
				linha = linha.replace(MODEL, this.gerador.ObterNome());
			}
			
			if(linha.contains(MODEL_STORE))
			{
				linha = linha.replace(MODEL_STORE, String.format("%s.store", this.gerador.ObterNomeMinusculo()));
			}
			
			if(linha.contains(MODEL_FORM))
			{
				linha = linha.replace(MODEL_FORM, String.format("%s._form", this.gerador.ObterNomeMinusculo()));
			}
			
			novoLista.add(linha);
		}
		
		return novoLista;
	}

	private void SalvarArquivoCreateView(ArrayList<String> linhasNovoArquivo) throws IOException 
	{
		Utilitario.CriarArquivo(linhasNovoArquivo, this.ObterArquivoCreateView());
	}
	
	private String ObterArquivoCreateView()
	{
		return this.gerador.ObterNomeDiretorioView() + "\\create.blade.php";
	}
}
