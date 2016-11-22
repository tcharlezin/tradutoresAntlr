import java.io.IOException;

public class ViewMaker 
{
	private GoLaravel gerador;
	
	public ViewMaker(GoLaravel gerador)
	{
		this.gerador = gerador;
	}
	
	public void GerarCodigo()
	{
		try
		{
			this.CriarDiretorio();
			this.CriarEdit();
			this.CriarCreate();
			this.CriarForm();
			this.CriarIndex();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	private void CriarDiretorio() 
	{
		this.gerador.CriarDiretorioView();
	}

	private void CriarEdit() throws IOException 
	{
		new ViewMakerEdit(this.gerador).Executar();
	}

	private void CriarCreate() throws IOException 
	{
		new ViewMakerCreate(this.gerador).Executar();
	}

	private void CriarForm() throws IOException 
	{
		new ViewMakerForm(this.gerador).Executar();
	}

	private void CriarIndex() throws IOException 
	{
		new ViewMakerIndex(this.gerador).Executar();
	}
}
