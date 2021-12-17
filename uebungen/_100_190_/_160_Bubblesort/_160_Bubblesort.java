package uebungen._100_190_._160_Bubblesort;

import java.util.Arrays;

public class _160_Bubblesort {
	
	static int[] array;
	static int lower;
	static int higher;
	static boolean isRunning = true;
	
	public static void main(String[] args) {
		
        /*
         * Bubblesort
         *
         * Schreibe ein Methode,
         * der man ein Array mit beliebig vielen Integern als Werten übergeben kann
         * und die dieses Array sortiert und zurück gibt.
         *
         * Benutze hierzu den Bubblesort-Algorithmus.
         * Bei diesem wird das Array durchlaufen
         * und jede Zahl mit der jeweils nachfolgenden Zahl verglichen.
         * Wenn die nachfolgende Zahl kleiner ist,
         * werden die Zahlen getauscht.
         * Das Array wird solange durchlaufen,
         * bis bei einem Durchlauf keine Zahlen getauscht werden müssen.
         */
		int[] array1  = {23,21,77,29,44};
		int[] array2  = {3,1,7,9,4};
		
		sort(array1);
		sort(array2);
		
		int[] array3  = {33,11,71,39,4};
		
		Arrays.sort(array3);
		System.out.println("\nBonus");
		System.out.println(Arrays.toString(array3));
	}
	
	static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			isRunning = false;
			
			for (int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j + 1]) {
					higher = array[j];
					lower = array[j + 1];
					array[j] = lower;
					array[j + 1] = higher;
					isRunning = true;
				}
			}
		}
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
