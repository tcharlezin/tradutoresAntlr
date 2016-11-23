import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ControllerMaker 
{
	private GoLaravel gerador;
	
	private static final String MODEL = "%%MODEL%%";
	private static final String MODEL_MINUSCULO = "%%MODEL_MINUSCULO%%";


	public ControllerMaker(GoLaravel gerador) 
	{
		this.gerador = gerador;
	}
	
	public void GerarCodigo()
	{
		try
		{
			ArrayList<String> linhasArquivo = this.ObterLinhasArquivoExemploController();
			ArrayList<String> linhasNovoArquivo = this.ModificarArquivo(linhasArquivo);
			SalvarArquivoController(linhasNovoArquivo);
			
			System.out.println("Controller criada com sucesso!");
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	private void SalvarArquivoController(ArrayList<String> linhasArquivo) throws IOException 
	{
		Utilitario.CriarArquivo(linhasArquivo, this.ObterArquivoController());
	}

	private ArrayList<String> ModificarArquivo(ArrayList<String> linhasArquivo)
	{
		ArrayList<String> novoLista = new ArrayList<String>();
		
		for (String linha : linhasArquivo) 
		{
			if(linha.contains(MODEL))
			{
				linha = linha.replace(MODEL, this.gerador.ObterNome());
			}
			
			if(linha.contains(MODEL_MINUSCULO))
			{
				linha = linha.replace(MODEL_MINUSCULO, this.gerador.ObterNomeMinusculo());
			}
			novoLista.add(linha);
		}
		
		return novoLista;
	}
	
	private String ObterArquivoController()
	{
		String nomeController = this.ObterNomeController();
		return this.gerador.ObterPath() + "\\app\\Http\\Controllers\\"+ nomeController + ".php";
	}
	
	private String ObterNomeController()
	{
		return this.gerador.ObterNome() + "Controller";
	}

	private ArrayList<String> ObterLinhasArquivoExemploController() throws IOException 
	{
		Path currentRelativePath = Paths.get("");
		String arquivo = currentRelativePath.toAbsolutePath() + "\\src\\ExemploController.txt";
		return Utilitario.ObterLinhasArquivo(arquivo);
	}
}
