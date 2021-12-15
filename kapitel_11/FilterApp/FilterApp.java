package kapitel_11.FilterApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilterApp {

	public static void main(String[] args) throws IOException {
		String file = "src/kapitel_11/FilterApp/data.txt";
		
		try (VerschluesseltWriter vw = new VerschluesseltWriter(new FileWriter(file))) {
			vw.write("Hallo Deutschland");
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		
		BufferedReader bf = new BufferedReader(new FileReader(file));
		System.out.println(bf.readLine());
		bf.close();
		
		try (BufferedReader in = new BufferedReader(new VerschluesseltReader(new FileReader(file)))) {
		    int c;
		    StringBuffer inhalt = new StringBuffer();
		    while ((c = in.read()) >= 0) {
		      inhalt.append((char) c);
		    }
		    System.out.println(inhalt.toString());
		  } catch (Exception ex) {
			  System.out.println("Fehler beim Lesen.");
		}
	}
}
