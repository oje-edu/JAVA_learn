package uebungen._100_190_._100_KleinesEinmaleins;

import java.text.DecimalFormat;

public class EinMalEinsMusterLoesung {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("000.#");
		/*
		 * Kleines Einmaleins
		 *
		 * Schreibe ein Programm, das das kleine Einmaleins formatiert ausgibt:
		 *
		*/
		for (int i = 1; i <= 10; i++) {

			for (int y = 1; y <= 10; y++) {
				String calc = df.format(i * y);
				System.out.print(calc);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
