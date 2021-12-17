package uebungen._300_390_._300_KartenMischen;

import java.util.ArrayList;

public class KartenMischen {
	
	public static void main(String[] args) {
		ArrayList<String> karten = new ArrayList<>();
		karten.add("[Kreuz, Sieben]");
		karten.add("[Kreuz, Acht]");
		karten.add("[Kreuz, Neun]");
		karten.add("[Kreuz, Zehn]");
		karten.add("[Kreuz, Bube]");
		karten.add("[Kreuz, Dame]");
		karten.add("[Kreuz, König]");
		karten.add("[Kreuz, Ass]");

		karten.add("[Pik, Sieben]");
		karten.add("[Pik, Acht]");
		karten.add("[Pik, Neun]");
		karten.add("[Pik, Zehn]");
		karten.add("[Pik, Bube]");
		karten.add("[Pik, Dame]");
		karten.add("[Pik, König]");
		karten.add("[Pik, Ass]");

		karten.add("[Herz, Sieben]");
		karten.add("[Herz, Acht]");
		karten.add("[Herz, Neun]");
		karten.add("[Herz, Zehn]");
		karten.add("[Herz, Bube]");
		karten.add("[Herz, Dame]");
		karten.add("[Herz, König]");
		karten.add("[Herz, Ass]");

		karten.add("[Karo, Sieben]");
		karten.add("[Karo, Acht]");
		karten.add("[Karo, Neun]");
		karten.add("[Karo, Zehn]");
		karten.add("[Karo, Bube]");
		karten.add("[Karo, Dame]");
		karten.add("[Karo, König]");
		karten.add("[Karo, Ass]");

		System.out.println("Ungemischt:");


		for (int i = 0; i < karten.size(); i++) {
			if (i % 8 == 0) {
				System.out.print("\n");
			}
			System.out.print(karten.get(i) + " ");
		}
		System.out.println("\n");
		

		// For testing
		// Collections.shuffle(karten);
		// TODO maybe the other 50% of the quest :-)
		System.out.println("Gemischt:");
		// -- thx to Mr. G ---
		for (int s = 0; s < 100; s++) {
			int rnd1 = (int)Math.floor(Math.random()*32);
			int rnd2 = (int)Math.floor(Math.random()*32);
			String shuffle = karten.get(rnd2);
			karten.set(rnd2, karten.get(rnd1));
			karten.set(rnd1, shuffle);
		}
		// ---
		for (int i = 0; i < karten.size(); i++) {
			if (i % 8 == 0) {
				System.out.print("\n");
			}
			System.out.print(karten.get(i) + " ");
		}
	}
}


/*
 * Karten mischen
 *
 * Schreibe ein Programm, das das Mischen der 32 Karten eines Skatspiels simuliert.
 * Jede Karte wird durch eine ArrayList der Form [Farbe, Wert] dargestellt.
 * Die Farben sind: Kreuz, Pik, Herz und Karo.
 * Die Werte sind: Ass, König, Dame, Bube, Zehn, Neun, Acht, Sieben.
 *
 * Zunächst wird eine ArrayList mit den 32 Karten-ArrayListen erstellt.
 *
 * Durch wiederholtes Vertauschen zweier zufällig ausgewählter
 * Karten sollen die ArrayLists dann noch gemischt werden.
 * (Mischen ohne Collections.shuffle())
 *
 * Die Ausgabe könnte folgendermaßen aussehen:
 *
Ungemischt:
[Kreuz, Sieben] [Kreuz, Acht]   [Kreuz, Neun]   [Kreuz, Zehn]   [Kreuz, Bube]   [Kreuz, Dame]   [Kreuz, König]  [Kreuz, Ass]
[Pik, Sieben]   [Pik, Acht]     [Pik, Neun]     [Pik, Zehn]     [Pik, Bube]     [Pik, Dame]     [Pik, König]    [Pik, Ass]
[Herz, Sieben]  [Herz, Acht]    [Herz, Neun]    [Herz, Zehn]    [Herz, Bube]    [Herz, Dame]    [Herz, König]   [Herz, Ass]
[Karo, Sieben]  [Karo, Acht]    [Karo, Neun]    [Karo, Zehn]    [Karo, Bube]    [Karo, Dame]    [Karo, König]   [Karo, Ass]
Gemischt:
[Karo, Dame]    [Herz, König]   [Pik, Neun]     [Pik, Ass]      [Herz, Ass]     [Kreuz, Zehn]   [Karo, Sieben]  [Kreuz, Bube]
[Pik, Zehn]     [Kreuz, Neun]   [Pik, Acht]     [Karo, König]   [Pik, Sieben]   [Herz, Bube]    [Kreuz, Dame]   [Karo, Neun]
[Pik, Bube]     [Karo, Acht]    [Herz, Zehn]    [Kreuz, Acht]   [Kreuz, König]  [Kreuz, Sieben] [Pik, Dame]     [Kreuz, Ass]
[Pik, König]    [Herz, Sieben]  [Herz, Neun]    [Herz, Acht]    [Herz, Dame]    [Karo, Zehn]    [Karo, Bube]    [Karo, Ass]
 */