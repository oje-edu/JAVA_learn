package uebungen._200_290_._200_EinmaligesArray;

import java.util.ArrayList;
import java.util.Collections;


public class EinmaligesArray {

	public static void main(String[] args) {
		/*
		 * Einmaliges in ArrayList
		 * 
		 * Schreibe ein Programm, das eine ArrayList mit neun Zahlen befüllt Dabei
		 * sollen vier Zahlen doppelt vorkommen und eine Zahl nur einmal
		 * 
		 * Mische dann die ArrayList per Collection.shuffle(ArrayList)
		 * 
		 * Schreibe dann ein Programm, das aus dieser ArrayList die Zahl findet, die nur
		 * einmal vorkommt
		 */

		Integer[] arr = { 4, 4, 5, 5, 6, 6, 7, 7, 8 };

		ArrayList<Integer> arrList = new ArrayList<>();

		Collections.addAll(arrList, arr);
		Collections.shuffle(arrList);

		System.out.println("shuffled Array: " + arrList);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					arrList.remove(arr[i]);
					arrList.remove(arr[j]);
					break;
				}	
			}
		}
		System.out.println("Unique Number: " + arrList);
	}
}
