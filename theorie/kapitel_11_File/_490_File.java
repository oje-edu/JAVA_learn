package theorie.kapitel_11_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class _490_File {

	public static void main(String[] args) throws IOException {
		
		// File
		
		File f1 = new File("src/theorie/kapitel_11_File/data.txt");
		System.out.println(f1); 													// src\theorie\_11File_\data.txt
		
		// boolean exists()
		System.out.println(f1.exists()); 											// false | false
		
		// boolean createNewFile()
		// true, wenn Datei erzeugt wurde
		// false, wenn die Datei schon existierte
		System.out.println(f1.createNewFile());   									// true  | false
		
		// boolean canRead(), canWrite(), canExecute
		System.out.println(f1.canRead()); 											// true
		System.out.println(f1.canWrite()); 											// true
		System.out.println(f1.canExecute()); 										// true
		
		// String getName()
		System.out.println(f1.getName()); 											// data.txt
		
		// String getParent()
		// Wenn man schon auf dem obersten Verzeichnis ist,
		// wird null zurück gegeben.
		System.out.println(f1.getParent()); 										// src\theorie\_11File_
		
		// String getPath()
		System.out.println(f1.getPath()); 											// src\theorie\_11File_\data.txt
		
		// boolean isFile()
		File f2 = new File("src/theorie/kapitel_11_File");
		System.out.println(f1.isFile()); 											// true
		System.out.println(f2.isFile()); 											// false
		
		// boolean isDirectory()
		System.out.println(f2.isDirectory()); 										// true
		System.out.println(f1.isDirectory()); 										// false
		
		// long length()
		System.out.println(f1.length()); 											// 0
		System.out.println(f2.length()); 											// 0
		
		// String[] list()
		String[] verzInhalt = f2.list();
		System.out.println(Arrays.toString(verzInhalt)); 							// [data.txt, _490_File.java]
		for (String v : verzInhalt) {
			System.out.println(v); 													// [data.txt, _490_File.java]
		}

		// boolean renameTo(File dest)
		// Datei wird umbenannt, der oben angebene Pfad des Objektes bleibt
		File f3 = new File("src/theorie/kapitel_11_File/data.csv");
		System.out.println(f1.renameTo(f3)); 										// true | false
		
		// boolean delete()
		System.out.println(f3.delete()); 											// true
	}
}
