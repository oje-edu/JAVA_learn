package kapitel_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kreisberechnung4Console {
    public static void main(String[] args) throws IOException {
	BufferedReader eingabepuffer = new BufferedReader(
		new InputStreamReader(System.in));
	System.out.print("Geben Sie den Kreisradius ein: ");
	String eingabe = eingabepuffer.readLine();
	double radius = Double.parseDouble(eingabe);
	System.out.print("Geben Sie die Einheit ein: ");
	eingabe = eingabepuffer.readLine();
	String einheit = eingabe;
	double umfang = 2.0 * 3.1415926 * radius;
	double flaeche = 3.1415926 * radius * radius;
	System.out.print("Umfang: ");
	System.out.print(umfang);
	System.out.println(" " + einheit);
	System.out.print("Flaeche: ");
	System.out.print(flaeche);
	System.out.println(" " + einheit + '\u00b2');
    }
}
