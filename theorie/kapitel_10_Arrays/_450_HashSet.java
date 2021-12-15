package theorie.kapitel_10_Arrays;

import java.util.HashSet;

public class _450_HashSet {

	public static void main(String[] args) {
		
		// HashSet
		// Ungeordnet und ohne Duplikate (wie bei allen Sets)
		// Daten werden als hash-basierte Datenstruktur gespeichert.
		// Sehr schnelles Einfügen und sehr schnelles Wiederfinden
		
		HashSet<Integer> hs = new HashSet<>();
		
		// add()
		hs.add(7);
		hs.add(17);
		hs.add(27);
		System.out.println(hs.add(37)); 			// true
		System.out.println(hs);   					// [17, 37, 7, 27]
		// Keine duplikate
		hs.add(27);
		System.out.println(hs); 					// [17, 37, 7, 27]
		
		// int size()
		System.out.println(hs.size());  			// 4
		
		// forEach() als Methode
		// Higher-Order Methode
		// Eine Methode die eine andere Methode, als Parameter erwartet
		// um der dann jdes seiner Elemente zu übergeben.
		hs.forEach(x -> multiplizieren(x)); 		// 289 1369 49 729
		System.out.println();
		
		// "Lange" foreach-Schleife Variante
		for (int e : hs) {
			multiplizieren(e); 						// 289 1369 49 729
		}
		System.out.println();
		
		// Anyonyme Funktion
		hs.forEach(zahl -> {
			zahl = zahl * zahl;
			System.out.print(zahl + " "); 			// 289 1369 49 729
		});
		System.out.println();
		
		// Methodenreferenzen (andere Schreibweise .. Klassennamen wird benötigt)
		hs.forEach(_450_HashSet::multiplizieren); 	// 289 1369 49 729 

	}
	
	static void multiplizieren(int zahl) {
		zahl = zahl * zahl;
		System.out.print(zahl + " "); 		
	}
}
