package theorie;

import java.util.Arrays;

public class _410_Arrays {

	public static void main(String[] args) {
		// Klasse Arrays
		// Mit statischen Methoden zum Thema Arrays
		
		int[] zahlen = new int[23];
		
		for (int zahl : zahlen) {
			System.out.print(zahl + " ");  				// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
		}
		System.out.println();
		
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = i + 1;
			System.out.print(i + " "); 					// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
		}
		
		System.out.println();
		
		// static void fill(Typ[] a, Typ w)
		Arrays.fill(zahlen, 42);
		for (int zahl : zahlen) {
			System.out.print(zahl + " "); 				// 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 
		}
		System.out.println();
		
		// static void fill(Typ[] a, int von, int bis, Typ w)
		Arrays.fill(zahlen, 2, 9, 7);
		for (int zahl : zahlen) {
			System.out.print(zahl + " "); 				// 42 42 7 7 7 7 7 7 7 42 42 42 42 42 42 42 42 42 42 42 42 42 42 
		}
		System.out.println();
		
		// static void sort(Typ[] a)
		int[] zahlen2 = {3,2,1,9,7,6,4,5,8};
		Arrays.sort(zahlen2);
		for (int zahl : zahlen2) {
			System.out.print(zahl + " "); 				// 1 2 3 4 5 6 7 8 9 
		}
		System.out.println();
		
		// static int binarySearch(Typ[] a, Typ w)
		System.out.println(Arrays.binarySearch(zahlen2, 7)); // 6
		System.out.println(Arrays.binarySearch(zahlen2, 0)); // -1 (bei nicht finden)
		
		// Versuch mit einem nicht sortierten Array
		int[] zahlen3 = {3,2,1,9,7,6,4,5,8};
		System.out.println(Arrays.binarySearch(zahlen3, 7)); // 4
		System.out.println(Arrays.binarySearch(zahlen3, 0)); // -1
		
		// static boolean equals(Typ[] a, Typ[] b)
		int[] zahlen4 = {3,2,1,9,7,6,4,5,8};
		int[] zahlen5 = {3,2,1,9,7,6,4,5,8};
		System.out.println(Arrays.equals(zahlen4, zahlen5));  // true
		
		// static int mismatch (Typ[] a, Typ[] b)
		System.out.println(Arrays.mismatch(zahlen4, zahlen5)); // -1
		
		int[] zahlen6 = {3,2,1,9,7,6,4,5,8};
		int[] zahlen7 = {3,2,1,9,6,5,4,5,8};
		System.out.println(Arrays.mismatch(zahlen6, zahlen7)); // 4
	}

}
