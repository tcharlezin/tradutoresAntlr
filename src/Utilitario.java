import java.io.File;
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
}
