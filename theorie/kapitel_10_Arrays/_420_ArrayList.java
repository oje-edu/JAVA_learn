package theorie.kapitel_10_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _420_ArrayList {

	public static void main(String[] args) {
		
		// ArrayList
		// Die Grösse der ArrayList ist veränderbar (mutable)
		// Benutzung per Methoden
		
		// Erwartete Objekte
		// Daher Wrapper-Klassen benutzen
		
		// Die Objekte müssen von der gleichen Klasse sein
		
		// ArrayList<Integer> zahlen = new ArrayList<Integer>();
		ArrayList<Integer> zahlen = new ArrayList<>();
		
		// add()
		zahlen.add(3);
		zahlen.add(7);
		zahlen.add(9);
		System.out.println(zahlen);  				// [3, 7, 9]
		
		for (int zahl : zahlen) {
			System.out.print(zahl + " "); 			// 3 7 9 
		}
		System.out.println();
		
		// void add(int index, Object o)
		zahlen.add(1, 17);
		System.out.println(zahlen); 				// [3, 17, 7, 9]
		
		// get(int index)
		System.out.println(zahlen.get(2));			// 7
		
		// set(int index, Object o)
		zahlen.set(2, 23);
		System.out.println(zahlen);             	// [3, 17, 23, 9]
		
		// int size
		System.out.println(zahlen.size());      	// 4
		
		// E remove(int index)
		// Die ArrayList wird neu indiziert
		System.out.println(zahlen.remove(2));   	// 23
		System.out.println(zahlen);  				// [3, 17, 9]
		
		// int indexOf(Object o)
		System.out.println(zahlen.indexOf(17)); 	// 1
		System.out.println(zahlen.indexOf(999)); 	// -1 (nicht gefunden)
		
		// void clear()
		zahlen.clear();
		System.out.println(zahlen);                 // []
		
		// boolean isEmpty()
		System.out.println(zahlen.isEmpty());       // true
		
		// Sortieren
		zahlen.add(3);
		zahlen.add(7);
		zahlen.add(9);
		Collections.sort(zahlen);
		System.out.println(zahlen);                 // [3, 7, 9]
		
		// Längen
		// length()
		String s = "Hallo";
		System.out.println(s.length()); 			// 5
		
		// length
		int[] z = {1, 2, 3};
		System.out.println(z.length);               // 3
		
		// size()
		ArrayList<Integer> n = new ArrayList<>();
		System.out.println(n.size());               // 0
	}

}
