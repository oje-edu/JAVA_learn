package uebungen._260_Frosch;

public class Frosch {

	public static void main(String[] args) {
		/*
		In dieser Aufgabe lernen wir einen besonderen Frosch kennen,
		so wie ihn sich nur Mathematiker ausdenken können.
		Besonders seine Art, eine Straße zu überqueren, macht es zweifelhaft,
		ob er in der realen Welt lange überleben könnte.
		Er überquert eine 2,50 Meter breite Straße wie folgt:
		Mit dem ersten Sprung legt er
		die erstaunliche Distanz von einem Meter zurück,
		dann springt er wegen zunehmender Erschöpfung mit jedem weiteren Schritt
		immer nur noch halb so weit wie vorher.
		Die Entfernung, die er dabei zurücklegt,
		berechnet sich also als Summe der Werte
		1 + 0,5 + 0,25 + 0,125 und so weiter.
		
		Versuche, mittels eines Programms herauszubekommen, ob der Frosch
		es auf die andere Straßenseite schafft.
		
		Zusatz: mittels Rekursion, wieviel Sprünge benötigt der Frosch für eine Strecke von 1,99 Metern
		*/

		//frogger(2.5);
		
		// System.out.println(frosch_while(1, 1.99));
		System.out.println(frosch_rec(0, 1, 1.99) + " Sprünge");

	}

	static void frogger(final double street) {
		double jump = 1.0;
		double jumpCount = 0;
		for (int i = 0; i < jumpCount + 52; i++) {
			System.out.println("Sprung " + i + ": " + jump + " QUAKs");
			jumpCount = jumpCount + jump;
			System.out.println("gesamt: " + jumpCount + "QUAKs");
			jump = jump / 2;
			System.out.println("");
		}
	}
	
	// Rekursiv
	static int frosch_rec(double position, double sprung, double strecke) {
		if (position >= strecke) return 0;
		return 1 + frosch_rec(position + sprung, sprung / 2, strecke);
	}
	
	// While
	static int frosch_while(double sprung, double strecke) {
		int c = 0;
		double position = 0;
		while (position < strecke) {
			position += sprung;
			sprung = sprung / 2;
			System.out.println(position);
			System.out.println(sprung);
			c++;
		}
		return c;
	}
}
