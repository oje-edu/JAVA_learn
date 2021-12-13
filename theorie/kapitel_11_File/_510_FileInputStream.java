package theorie.kapitel_11_File;

import java.io.FileInputStream;

import java.io.IOException;

public class _510_FileInputStream {

	public static void main(String[] args) throws IOException {
		
		// FileInputStream byte
		
		@SuppressWarnings("resource")
		FileInputStream iS = new FileInputStream("src/theorie/kapitel_11_File/stream.txt");
		
		// int available()
		System.out.println(iS.available()); 	// 8
		
		// read()
		System.out.println(iS.read()); 			// 65
		System.out.println(iS.read());			// 66
		
		// int read(byte[] ba)
		// 8 sind available nach 2 ausgaben bleiben rest 6 zum anzeigen im Array 
		byte[] ba = new byte[6];
		System.out.println(iS.read(ba)); 		// 6
		for (byte b : ba) {
			System.out.print(b + " ");			// 67 65 66 67 68 69 
		}
		System.out.println();
		
		// close()
		iS.close();
	}
}
