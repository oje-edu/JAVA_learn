package uebungen._100_190_._150_Doppelt;


public class _150_Doppelt {

    /*
     * Doppelt
     *
     * Schreibe ein statische Methode, die überprüft, ob in einem Array keine doppelten Elemente sind.
     * Der Funktion wird das Array übergeben und sie soll true zurück geben,
     * wenn es doppelte Elemente in dem Array gibt.
     * Anderfalls soll die Funktion false zurück geben.
     */

	static String arr[] = { "Hallo", "Welt", "Hallo", "Deutschland" };

	public static void main(String args[]) {
		if (checkForDuplicates(arr)) {
			System.out.println("Duplicate Found");
		} else {
			System.out.println("No Duplicate Found");
		}
	}

	@SuppressWarnings("unchecked")
	private static <T> boolean checkForDuplicates(T... array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != null && array[i].equals(array[j])) {
					return true;
				}
			}
		}
		return false;
	}

}
