import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ViewMakerEdit 
{
	private static final String MODEL = "%%MODEL%%";
	private static final String MODEL_UPDATE = "%%MODEL_UPDATE%%";
	private static final String MODEL_FORM = "%%MODEL_FORM%%";
	
	private GoLaravel gerador;
	
	public ViewMakerEdit(GoLaravel gerador)
	{
		this.gerador = gerador;
	}
	
	public void Executar() throws IOException
	{
		ArrayList<String> linhasArquivo = this.ObterLinhasArquivoEditView();
		ArrayList<String> linhasNovoArquivo = this.ModificarArquivoEditView(linhasArquivo);
		SalvarArquivoEditView(linhasNovoArquivo);
	}
	
	private ArrayList<String> ObterLinhasArquivoEditView() throws IOException 
	{
		Path currentRelativePath = Paths.get("");
		String arquivo = currentRelativePath.toAbsolutePath() + "\\src\\view\\edit.blade.php";
		return Utilitario.ObterLinhasArquivo(arquivo);
	}

	private ArrayList<String> ModificarArquivoEditView(ArrayList<String> linhasArquivo) 
	{
		ArrayList<String> novoLista = new ArrayList<String>();
		
		for (String linha : linhasArquivo) 
		{
			if(linha.contains(MODEL))
			{
				linha = linha.replace(MODEL, this.gerador.ObterNome());
			}
			
			if(linha.contains(MODEL_UPDATE))
			{
				linha = linha.replace(MODEL_UPDATE, String.format("%s.update", this.gerador.ObterNomeMinusculo()));
			}
			
			if(linha.contains(MODEL_FORM))
			{
				linha = linha.replace(MODEL_FORM, String.format("%s._form", this.gerador.ObterNomeMinusculo()));
			}
			
			novoLista.add(linha);
		}
		
		return novoLista;
	}

	private void SalvarArquivoEditView(ArrayList<String> linhasNovoArquivo) throws IOException 
	{
		Utilitario.CriarArquivo(linhasNovoArquivo, this.ObterArquivoEditView());
	}
	
	private String ObterArquivoEditView()
	{
		return this.gerador.ObterNomeDiretorioView() + "\\edit.blade.php";
	}
}
