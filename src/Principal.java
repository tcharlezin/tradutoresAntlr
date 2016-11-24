import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Principal 
{
	public static void main(String[] args) throws Exception 
    {
		try
		{
			Path currentRelativePath = Paths.get("");
			
	        String inputFile = currentRelativePath.toAbsolutePath() + "\\src\\ExemploEntrada1.txt";
	        if ( args.length>0 ) 
	        {
	        	// inputFile = args[0]; ARQUIVO DE ENTRADA
	        }
	        InputStream is = System.in;
	        if ( inputFile!=null ) 
	        {
	            is = new FileInputStream(inputFile);
	        }
	        ANTLRInputStream input = new ANTLRInputStream(is);
	
	        HelloLexer lexer = new HelloLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        HelloParser parser = new HelloParser(tokens);
	        ParseTree tree = parser.prog(); // parse

        	ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        	GeradorCrud extractor = new GeradorCrud(parser);
        	walker.walk(extractor, tree); // initiate walk of tree with listener
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
    }

}
