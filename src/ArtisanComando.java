import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArtisanComando 
{
	public static ArrayList<String> Executar(String diretorio, String comando) throws IOException
	{
		ArrayList<String> lista = new ArrayList<String>();
		
		String executar =  "cd \"" + diretorio + "\" && " + comando;
		
		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", executar);
	        builder.redirectErrorStream(true);
	        Process p = builder.start();
	        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        String line;
	        while (true) 
	        {
	            line = r.readLine();
	            if (line == null) { break; }
	            lista.add(line);
	        }
	        
	    return lista;
	}
}
