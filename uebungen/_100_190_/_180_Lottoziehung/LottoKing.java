package uebungen._100_190_._180_Lottoziehung;

import java.util.Random;

public class LottoKing {
	

	public static void main(String[] args) {
		int[] myNumZ = { 22, 14, 2, 8, 46, 30 };

		numbaZ(myNumZ);
	}

	static void numbaZ(int[] a) {
		try {

			System.out.println("Du hast folgende Zahlen getippt:");
			for (int i = 0; i < 6; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println("\n");

			int[] rndNumbaZ = new int[6];
			Random mygenerator = new Random();
			for (int i = 0; i < 6; i++) {
				rndNumbaZ[i] = mygenerator.nextInt(49) + 1;
				// check if number is duplicate
				for (int j = 0; j < i; j++) {
					if (rndNumbaZ[i] == rndNumbaZ[j]) {
						j = 6;
						i--;
					}
				}
			}

			System.out.println("Die Gewinnzahlen:" + "\n");

			for (int i = 0; i < 6; i++) {
				System.out.print("\t" + rndNumbaZ[i] + " ");
			}

			System.out.println("\n\nDiese Zahlen haben gewonnen:");

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (rndNumbaZ[i] == a[j])
						System.out.print(a[j] + " ");
				}
			}

		} catch (Exception e) {
			System.out.println("Oops, something went terrible wrong !!!" + e.getMessage());
		} finally {
			System.out.println("\n\nSpätestens jetzt wird klar .. ohne Systemschein geht da nix!");
		}
	}
}

/*
 * Lottoziehung
 *
 * Schreibe ein Programm, das sechs verschiedene Lottozahlen (6 aus 49) zieht
 * und in einem Array abspeichert.
 */
