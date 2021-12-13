package theorie.kapitel_11_File;

import java.io.FileOutputStream;
import java.io.IOException;

public class _500_FileOutputStream {

	public static void main(String[] args) throws IOException {
		
		// FileOutputStream (byte)
		
		@SuppressWarnings("resource")
		FileOutputStream oS = new FileOutputStream("src/theorie/kapitel_11_File/stream.txt");
		
		
		// write(int b)
		oS.write(65);  									// A
		oS.write(66);  									// B
		oS.write(67);  									// C
		
		// write(byte[] ba)
		byte[] ba = {65, 66, 67, 68, 69};
		oS.write(ba);
		
		// close()
		oS.close();
	}
}
