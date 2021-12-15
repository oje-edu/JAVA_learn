package uebungen._210_Teilersumme;

import java.util.ArrayList;

public class Teilersumme {

	public static void main(String[] args) {
		/*
		 * Teilersumme
		 *
		 * Schreibe eine Methode, die überprüft, ob bei einer Zahl
		 * die Summe aller Teiler kleiner als die Zahl ist.
		 * Die Zahl selber soll hierbei nicht zu den Teilern zählen.
		 *
		 * Bei 81 würde true zurück gegeben werden, da
		 * 1 + 3 + 9 + 27 = 40
		 * und 40 < 81
		 *
		 * Bei 80 würde false zurück gegeben werden, da
		 * 1 + 2 + 4 + 5 + 8 + 10 + 16 + 20 + 40 = 106
		 * und 106 > 80
		 */

		System.out.println(pruefeTeilersumme(81)); // true
		System.out.println(pruefeTeilersumme(80)); // false

	}

	private static boolean pruefeTeilersumme(int num) {
		ArrayList<Integer> divider = new ArrayList<>();
		int res = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divider.add(i);
			}
		}

		for (int j = 0; j < divider.size(); j++) {
			res += divider.get(j);
		}

		// Statt if else
		return res < num;
	}
}
