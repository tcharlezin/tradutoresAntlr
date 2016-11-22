import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ModelMaker 
{
	private GoLaravel gerador;
	
	private static final String MODEL = "%%MODEL%%";
	private static final String CAMPOS = "%%CAMPOS%%";
	private static final String TABELA = "%%MODEL_TABELA%%";

	public ModelMaker(GoLaravel gerador) 
	{
		this.gerador = gerador;
	}
	
	public void GerarCodigo()
	{
		try
		{
			ArrayList<String> linhasArquivo = this.ObterLinhasArquivoExemploModel();
			ArrayList<String> linhasNovoArquivo = this.ModificarArquivo(linhasArquivo);
			SalvarArquivoModel(linhasNovoArquivo);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	private ArrayList<String> ObterLinhasArquivoExemploModel() throws IOException 
	{
		Path currentRelativePath = Paths.get("");
		String arquivo = currentRelativePath.toAbsolutePath() + "\\src\\ExemploModel.txt";
		return Utilitario.ObterLinhasArquivo(arquivo);
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
			
			if(linha.contains(CAMPOS))
			{
				linha = linha.replace(CAMPOS, this.gerador.ObterCamposParaModelFillable());
			}
			
			if(linha.contains(TABELA))
			{
				linha = linha.replace(TABELA, this.gerador.ObterNomeMinusculo());
			}

			novoLista.add(linha);
		}
		
		return novoLista;
	}

	private void SalvarArquivoModel(ArrayList<String> linhasNovoArquivo) throws IOException 
	{
		Utilitario.CriarArquivo(linhasNovoArquivo, this.ObterArquivoModel());
	}
	
	private String ObterArquivoModel()
	{
		String nomeModel = this.gerador.ObterNome();
		String fullPath = this.gerador.ObterPath() + "\\app\\"+ nomeModel + ".php";
		return fullPath;
	}

}
