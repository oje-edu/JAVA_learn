package theorie.kapitel_11_File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _520_FileWriter {

	public static void main(String[] args) throws IOException {
		
		// FileWriter
		
		String path = "src/theorie/kapitel_11_File/zeichen.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		// write()
		writer.write("Peter\n");
		writer.newLine();
		writer.write("Paul\n");
		writer.newLine();
		writer.write("Mary\n");
		writer.newLine();
		
		// close()
		// Es wird erst beim Schliessen geschrieben
		writer.close();
	}
}
