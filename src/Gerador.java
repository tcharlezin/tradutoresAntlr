import java.util.ArrayList;

public class Gerador 
{
	ArrayList<Campo> campos;
	
	public Gerador()
	{
		this.campos = new ArrayList<Campo>();
	}
	
	public void AdicionarCampo(Campo campo)
	{
		this.campos.add(campo);
	}
}
