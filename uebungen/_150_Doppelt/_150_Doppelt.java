package uebungen._150_Doppelt;

import java.util.Arrays;

public class _150_Doppelt {
	
	static String[] yos = {"YO!", "..", " also", ",", " ich", " habn", " Loch", " im", " Kopf!"};
	
	static boolean doppelt;
	
	static int arr1[] = {1,2,3,4,5,6};
	static int arr2[] = {1,2,3,4,5,6};

	public static void main(String[] args) {
        /*
         * Doppelt
         *
         * Schreibe ein statische Methode, die überprüft, ob in einem Array keine doppelten Elemente sind.
         * Der Funktion wird das Array übergeben und sie soll true zurück geben,
         * wenn es doppelte Elemente in dem Array gibt.
         * Anderfalls soll die Funktion false zurück geben.
         */
		
		checkDouble();
	}
	
	static void checkDouble() {
		System.out.println("Check Arr1 vs Arr2 for duplicates");

		if (Arrays.equals(arr1, arr2)) {
			doppelt = true;
			System.out.println("Doppelt: " + doppelt);
		} else {
			System.out.println("Doppelt: " + doppelt);
		}
		
		

		System.out.println("\n-----");
		for (String yo : yos) {
			System.out.print(yo);
		}
		System.out.println();
		System.out.println("thats: true");
	}
}
