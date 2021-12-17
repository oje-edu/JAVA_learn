package theorie._600_690_;

import java.util.ArrayList;

public class _600_lambda {
	
	// Lambda ist eine higher-order funktion (die andere Funktionen als Parameter erwarten)
	// und ermöglicht Funktionale Programmierung
	
	static void addiere(int zahl) {
		zahl = zahl + zahl;
		System.out.print(zahl + " "); 					// 2 4 6 
	}

	public static void main(String[] args) {

		ArrayList<Integer> x = new ArrayList<>();
		
		x.add(1);
		x.add(2);
		x.add(3);
		
		// Methodenaufruf
		x.forEach(zahl -> addiere(zahl));
		System.out.println();
		
		// Methodenreferenz mit Klassennamen gefolgt von :: n und Methodenaufruf 
		x.forEach(_600_lambda::addiere);
		System.out.println();
		
		// Hardcodiert ("anonyme" Funktion)
		x.forEach(zahl -> {
			zahl = zahl + zahl;
			System.out.print(zahl + " ");  				// 2 4 6 
		});
		System.out.println();
		
		// removeIf()
		ArrayList <String> s1 = new ArrayList<>();
		s1.add("Hello");
		s1.add("");
		s1.add("World");
		
		s1.removeIf(s -> s.isEmpty());
		System.out.print(s1); 							// [Hello, World]
		
		s1.add("");
		
		// Bei geschweiften Klammern auch return und Semikolon
		s1.removeIf(s -> {
			return s.isEmpty();
		});
		System.out.println();
		
		s1.add("");
		
		// Mit Typenangabe auch runde Klammern
		s1.removeIf((String s) -> s.isEmpty());
		
		// Hier muss der Datentyp stehen und es darf keine Klammern geben.
		for (String s : s1) {
			System.out.print(s + " ");					// Hello World 
		}
		
		// Methodenreferenz
		s1.removeIf(String::isEmpty);

	}
}
