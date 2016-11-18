import java.awt.Menu;
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
	
	public void DefinirNome(String nome)
	{
		this.nome = nome;
	}
	
	public void Executar()
	{
		new MigrationMaker(this).GerarCodigo();
		new RotasMaker(this).GerarCodigo();
		new ControllerMaker(this).GerarCodigo();
		new ModelMaker(this).GerarCodigo();
		new ViewMaker(this).GerarCodigo();
		new MenuMaker(this).GerarCodigo();
	}
}
