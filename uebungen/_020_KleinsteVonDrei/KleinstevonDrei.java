package uebungen._020_KleinsteVonDrei;

import java.util.Random;

public class KleinstevonDrei {
	public static void main(String[] args) {
		/*
		 * Kleinste von drei Zahlenwerten
		 *
		 * Schreibe ein Programm, das drei Variablen mit zufälligen Zahlenwerten
		 * befüllt. Dann soll das Programm testen, welcher ZAHLENWERT der kleinste ist
		 * und diesen ausgeben.
		 */
		Random r = new Random();
		int n1 = r.nextInt(6) + 1;
		int n2 = r.nextInt(6) + 1;
		int n3 = r.nextInt(6) + 1;
		System.out.println("zahl1 = " + n1 + " - " + "zahl2 = " + n2 + " - " + "zahl3 = " + n3);
		if ((n1 < n2) && (n1 < n3)) {
			System.out.println(n1 + " ist die kleinste Zahl");
		} else if (n2 < n3) {
			System.out.println(n2 + " ist die kleinste Zahl");

		} else {
			System.out.println(n3 + " ist die kleinste Zahl");
		}
	}
}
