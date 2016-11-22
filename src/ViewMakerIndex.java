import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ViewMakerIndex 
{
	private GoLaravel gerador;
	public static final String MODEL = "%%MODEL%%";
	public static final String MODEL_CREATE = "%%MODEL_CREATE%%";
	public static final String MODEL_HEADER = "%%CAMPOS_HEADER%%";
	public static final String MODEL_BODY = "%%CAMPOS_BODY%%";
	public static final String MODEL_EDIT = "%%MODEL_EDIT%%";
	
	public ViewMakerIndex(GoLaravel gerador)
	{
		this.gerador = gerador;
	}
	
	public void Executar() throws IOException
	{
		ArrayList<String> linhasArquivo = this.ObterLinhasArquivoIndexView();
		ArrayList<String> linhasNovoArquivo = this.ModificarArquivoIndexView(linhasArquivo);
		SalvarArquivoIndexView(linhasNovoArquivo);
	}
	
	private ArrayList<String> ObterLinhasArquivoIndexView() throws IOException 
	{
		Path currentRelativePath = Paths.get("");
		String arquivo = currentRelativePath.toAbsolutePath() + "\\src\\view\\index.blade.php";
		return Utilitario.ObterLinhasArquivo(arquivo);
	}

	private ArrayList<String> ModificarArquivoIndexView(ArrayList<String> linhasArquivo) 
	{
		ArrayList<String> novoLista = new ArrayList<String>();
		
		for (String linha : linhasArquivo) 
		{
			if(linha.contains(MODEL))
			{
				linha = linha.replace(MODEL, this.gerador.ObterNome());
			}
			
			if(linha.contains(MODEL_CREATE))
			{
				linha = linha.replace(MODEL_CREATE, String.format("%s.create", this.gerador.ObterNomeMinusculo()));
			}
			
			if(linha.contains(MODEL_EDIT))
			{
				linha = linha.replace(MODEL_EDIT, String.format("%s.edit", this.gerador.ObterNomeMinusculo()));
			}
			
			if(linha.contains(MODEL_HEADER))
			{
				ArrayList<String> colunas = this.gerador.ObterColunasHeaderListagem();
				for (String campo : colunas) 
				{
					novoLista.add(campo);
				}
				
				continue;
			}
			
			if(linha.contains(MODEL_BODY))
			{
				ArrayList<String> colunas = this.gerador.ObterColunasBodyListagem();
				for (String campo : colunas) 
				{
					novoLista.add(campo);
				}
				
				continue;
			}
			
			novoLista.add(linha);
		}
		
		return novoLista;
	}

	private void SalvarArquivoIndexView(ArrayList<String> linhasNovoArquivo) throws IOException 
	{
		Utilitario.CriarArquivo(linhasNovoArquivo, this.ObterArquivoIndexView());
	}
	
	private String ObterArquivoIndexView()
	{
		return this.gerador.ObterNomeDiretorioView() + "\\index.blade.php";
	}
}
