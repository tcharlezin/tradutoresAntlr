import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Utilitario 
{
	public static void RemoverArquivo(String fullpath) 
	{
		File file = new File(fullpath);
		file.delete();
	}

	public static void CriarArquivo(ArrayList<String> linhasArquivo, String fullpath) throws IOException 
	{
		FileWriter writer = new FileWriter(fullpath); 
		for(String str: linhasArquivo) 
		{
			writer.write(str +"\n");
		}
		writer.close();
	}
	
	public static ArrayList<String> ObterLinhasArquivo(String fullpath) throws IOException
	{
		ArrayList<String> lista = new ArrayList<String>();
		
		File file = new File(fullpath);
		BufferedReader reader = new BufferedReader(new FileReader(file));;

		try
		{
			reader = new BufferedReader(new FileReader(file));
	    	String text = null;

	    	while ((text = reader.readLine()) != null) 
	    	{
	    		lista.add(text);
	    	}
		}
		finally
		{
			reader.close();
		}
		
		return lista;
	}
}
