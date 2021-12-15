package uebungen;

import java.util.Random;

public class ZweiZahlen {
	public static void main(String[] args) {
		/*
         * Zwei Zahlen genau vergleichen
         *
         * Schreibe ein Programm, das zwei zuf�llige Zahlen erzeugt.
         * Dann soll das Programm testen und ausgeben,
         * welche von zwei Zahlen gr��er ist oder ob beide Zahlen gleich gro� sind.
         */
		Random r = new Random();
		int n1 = r.nextInt(6) + 1;
		int n2 = r.nextInt(6) + 1;
		System.out.println("Zufallszahl 1: " + n1 + " - " + "Zufallszahl 2: " + n2);
		if (n1 == n2) {
			System.out.println("Zufallszahl 1 ist gleich Zufallszahl 2");
		} else if (n1 < n2)	{
			System.out.println("Zufallszahl 1 ist kleiner ALS WIE Zufallszahl 2");
		
		} else if (n1 > n2) {
			System.out.println("Zufallszahl 1 ist groesser ALS WIE Zufallszahl 2");
		}
	}

}
