package theorie._300_390_._380_Fehlerbehandlung;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _050_throws {

	// throws
	// Bei schwerwiegenden Exceptions ist throws Pflicht

	static void writeToFile() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		bw.write("Test");
		bw.close();
	}

	public static void main(String[] args) {

		try {
			writeToFile();

		} catch (IOException e) {
			System.out.println(e);  // Nothing happens - Konsole terminated
		}
	}
}
