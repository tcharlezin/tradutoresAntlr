import java.io.File;
import java.io.FileWriter;

public class MenuMaker 
{
	private GoLaravel gerador;

	public MenuMaker(GoLaravel gerador) 
	{
		this.gerador = gerador;
	}
	
	public void GerarCodigo()
	{
		try
		{
			File file = new File(this.ObterArquivoMenu());
			FileWriter fileWriter = new FileWriter(file,true);
			fileWriter.write(ObterLinhaMenu());
			fileWriter.close();
			
			System.out.println("Menu criado com sucesso!");
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	private String ObterArquivoMenu() 
	{
		return this.gerador.ObterPath() + "\\resources\\views\\_menu_topo.blade.php";
	}
	
	private String ObterLinhaMenu()
	{
		String nome = this.gerador.ObterNome();
		String rota = this.gerador.ObterNomeMinusculo();
		
		return String.format("<li><a href=\"{{ route('%s.index') }}\">%s</a></li>", rota, nome);
	}

}
