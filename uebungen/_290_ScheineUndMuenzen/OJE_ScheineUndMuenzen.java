package uebungen._290_ScheineUndMuenzen;

public class OJE_ScheineUndMuenzen {

	static double[] euroArray = { 500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.20, 0.10,
			0.05, 0.02, 0.01 };
	// private double[] euroArray = new double[8];
	static double rechenGenauigkeit = 0.0001;

	public static void main(String[] args) {
    /*
    * Scheine und Münzen
    *
    * Gebe von einem Geldbetrag (in Euro und Cent) die nötigen
    * Scheine und Münzen aus.
    *
    * In Euro existieren die folgenden Beträge:
    + Münzen (in Cent): 1, 2, 5, 10, 20, 50
    * Münzen und Noten (in Euro): 1, 2, 5, 10, 20, 50, 100, 200, 500
    *
    * Beispiele:
    * System.out.println(betraege(53.26)); // 50.00, 2.00, 1.00, 0.20, 0.05, 0.01
    * System.out.println(betraege(99.95)); // 50.00, 20.00, 20.00, 5.00,
    * 									   // 2.00, 2.00, 0.50, 0.20, 0.20, 0.05
    * 
    *  CODE FROM: https://www.programmieraufgaben.ch/aufgabe/geldbetrag/6juh7y3z#solution-code-43
    */
	double betrag = 53.26;
	int[] anzahlen = betraege(betrag);
	ausgabe(anzahlen);

	}

	static int[] betraege(double betrag) {
		int[] anzahlen = new int[euroArray.length];
		for (int i = 0; i < euroArray.length; i++) {
			betrag = reduziere(betrag, i, anzahlen);
		}
		return anzahlen;
	}

	static double reduziere(double betrag, int i, int[] anzahlen) {
		double aktuellerWert = euroArray[i];
		while (betrag + rechenGenauigkeit > aktuellerWert) {
			betrag = betrag - aktuellerWert;
			anzahlen[i]++;
		}
		return betrag;
	}

	static void ausgabe(int[] betrag) {
		for (int i = 0; i < euroArray.length; i++) {
			bedingteAusgabe(betrag[i], i);
		}
	}

	static void bedingteAusgabe(int anzahl, int index) {
		if (anzahl > 0) {
			System.out.print(anzahl + " x EURO ");
			formattierteBetragsausgabe(euroArray[index]);
			System.out.println();
		}
	}

	static void formattierteBetragsausgabe(double d) {
		System.out.printf("%6.2f", d);
	}
}
