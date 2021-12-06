package uebungen._110_Fibonacci;

public class Fibonacci {
	/*
	 * Fibonacci
	 *
	 * Schreibe ein Programm, das die ersten 10 Zahlen der Fibonacci-Folge ausgibt:
	 * 0 1 1 2 3 5 8 13 21 34
	 *
	 * Die ersten beiden Zahlen dürfen hardcodiert ausgegeben werden.
	 *
	 * Die Fibonacci-Folge beginnt mit 0 und 1. Ab dann entsteht die folgende Zahl
	 * indem man jeweils die beiden vorherigen Zahlen addiert.
	 *
	 * Zusatz: Gib alle Zahlen unter 500 aus
	 */

	public static void main(String[] args) {
		int zahl1 = 1, zahl2 = 1, zahl3;
		
		System.out.println(zahl1 + " " + zahl2);
		
		for (int i = 0; i < 12; i++) {
			zahl3 = zahl1 + zahl2;
			System.out.println(zahl3 + " ");
			zahl1 = zahl2;
			zahl2 = zahl3;
		}
	}
}
