package theorie._700_790_._710_Generics;


public class _030_GenericMethod {

	public static void main(String[] args) {
		
		printArray(new String[] {"Peter", "Paul", "Mary"});
		printArray(new int[] {1, 2, 3});
		
		// Generic method
		// Alternative zum Überladen
		// Geht nur mit Referenz-Typ-Datentypen (Objekten)
		printArrayGeneric(new String[] {"Peter", "Paul", "Mary"});
		printArrayGeneric(new Integer[] {1, 2, 3});

	}
	
	static void printArray(String[] arr) {
		for (String a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	static void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	// Generic - der diamond operator <> muss vor dem Rückgabewert stehen
	static <E> void printArrayGeneric(E[] arr) {
		for (E a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
