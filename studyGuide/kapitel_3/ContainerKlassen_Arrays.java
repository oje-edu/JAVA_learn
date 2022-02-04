package studyGuide.kapitel_3;

import java.util.Arrays;

public class ContainerKlassen_Arrays {

	String[] namen2 = new String[2];
	
	public static void main(String[] args) {

		// bei Java gibt es KEINE assoziative Arrays [name, lastname, etc.]
		
		int[] zahlen;
		
		String name = "Peter";
		String[] namen;
		
		zahlen = new int[5];
		int[] zahlen2 = new int[] {99, 67, 109, 44};
		int[] zahlen3 = new int[] {0, 8, 2, 7, 43, 11};
		
		namen = new String[] {"Hans", "Peter", "Andi"};
		
		// AUSGABE
		// Indexwert
		System.out.println(namen[1]); 					// Peter
		
		System.out.println(zahlen[2]); 					// 0 (vorinitialisiert)
		
		ContainerKlassen_Arrays ck = new ContainerKlassen_Arrays();
		System.out.println(ck.namen2[1]); 				// null (vorinititalisiert)
		
		// String ( length() )
		System.out.println(name.length()); 				// 5
		// Array ( length )
		System.out.println(namen.length); 				// 2
		
		
		Arrays.sort(zahlen2); 							// statischer Methodenaufruf
		System.out.println(zahlen2); 					// [I@533ddba
		for(int z : zahlen2) {
			System.out.print(z + " "); 					// 44 67 99 109
		}
		
		System.out.println();
		
		Arrays.sort(namen);
		for(String n : namen) {
			System.out.print(n + " "); 					// Andi Hans Peter 
		}
		
		System.out.println();
		
		// SUCHE 
		// Binary suche in einem sortierten Array
		System.out.println(Arrays.binarySearch(zahlen2, 67)); 		// 1
		
		// Binary suche in einem unsortierten Array ( klappt nicht zuverlässig, desshalb immer auf sortiertem Array verwenden ) 
		System.out.println(Arrays.binarySearch(zahlen3, 11));      // -5
	}

}
