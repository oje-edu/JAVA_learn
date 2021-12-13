package theorie.kapitel_11_File;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _530_FileReader {

	public static void main(String[] args) throws IOException {
		
		// FileWriter
		
		String path = "src/theorie/kapitel_11_File/zeichen.txt";
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		// readLine()
		System.out.println(reader.readLine());   			// Peter
		System.out.println(reader.readLine()); 
		System.out.println(reader.readLine()); 				// Paul
		System.out.println(reader.readLine()); 
		System.out.println(reader.readLine()); 				// Mary
		System.out.println(reader.readLine()); 
		System.out.println(reader.readLine());				// null
		
		// close()
		// Es wird erst beim Schliessen geschrieben
		reader.close();
	}
}
