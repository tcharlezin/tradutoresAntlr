import java.io.File;
import java.util.ArrayList;

public class GoLaravel 
{
	private ArrayList<Campo> campos;
	private String namespace;
	private String path;
	private String nome;
	
	public GoLaravel()
	{
		this.campos = new ArrayList<Campo>();		
	}
	
	public void AdicionarCampo(Campo campo)
	{
		this.campos.add(campo);
	}
	
	public void DefinirNamespace(String namespace)
	{
		this.namespace = namespace;
	}
	
	public void DefinirPath(String path)
	{
		this.path = path;
	}
	
	public String ObterPath()
	{
		return this.path;
	}
	
	public void DefinirNome(String nome)
	{
		this.nome = nome;
	}
	
	public String ObterNome() 
	{
		return this.nome;
	}
	
	public String ObterNomeMinusculo() 
	{
		return this.nome.toLowerCase();
	}
	
	public void Executar()
	{
		new MigrationMaker(this).GerarCodigo(); // OK
		new RotasMaker(this).GerarCodigo(); // OK
		new ControllerMaker(this).GerarCodigo(); // OK
		new ModelMaker(this).GerarCodigo(); // OK
		new ViewMaker(this).GerarCodigo();
		new MenuMaker(this).GerarCodigo();
		// REQUEST
	}
	
	public ArrayList<String> ObterCamposMigration() throws Exception
	{
		ArrayList<String> listaRetorno = new ArrayList<String>();
		
		for (Campo campo : this.campos) 
		{
			String novoCampo = campo.ObterLinhaMigration();
			listaRetorno.add(novoCampo);
		}
		
		return listaRetorno;
	}

	public String ObterCamposParaModelFillable() 
	{
		String fillable = "";
		
		for (Campo campo : campos) 
		{
			String nomeCampo = campo.ObterNome();
			fillable += String.format("'%s',", nomeCampo);
		}
		
		return fillable;
	}

	public void CriarDiretorioView() 
	{
		File dir = new File(this.ObterNomeDiretorioView());
		dir.mkdir();
	}
	
	public String ObterNomeDiretorioView() 
	{
		return  String.format("%s\\resources\\views\\%s",this.ObterPath(), this.ObterNomeMinusculo());
	}

	public ArrayList<String> ObterColunasHeaderListagem() 
	{
		ArrayList<String> colunas = new ArrayList<String>();
		
		for (Campo campo : this.campos) 
		{
			if(campo.IsApareceListagem())
			{
				colunas.add(String.format("                <th>%s</th>", campo.ObterNome()));
			}
		}
		
		return colunas;
	}
	
	public ArrayList<String> ObterColunasBodyListagem() 
	{
		ArrayList<String> colunas = new ArrayList<String>();
		
		for (Campo campo : this.campos) 
		{
			if(campo.IsApareceListagem())
			{
				colunas.add(String.format("                <td>$dado->%s</td>", campo.ObterNome()));
			}
		}
		
		return colunas;
	}
}
