package kapitel_06.Aufgabe_065_5;

public class Anteiltest {

	public static void main(String[] args) {
		double vermoegen = 200_000.00;
		Anteil a1 = new Anteil(1,4);
		Anteil a2 = new Anteil(1,2);
		System.out.println("Gesamtes Vermögen = " + vermoegen + " €");
		System.out.println();
		System.out.println("Betrag von a1 = " + vermoegen * a1.dezimalwert() + " €");
		System.out.println("Anteil a1: " + a1.toString());
		System.out.println();
		System.out.println("Betrag von a2 = " + vermoegen * a2.dezimalwert() + " €");
		System.out.println("Anteil a2: " + a2.toString());
		System.out.println();
		System.out.println("Verteilt: " + Anteil.verteilt.toString());
		System.out.println("Rest: " + a1.getRest().toString());
		System.out.println();
		System.out.println("Verbleibender Restbetrag: \n\n" + vermoegen * a1.getRest().dezimalwert() + " €");
		for (int i = 0; i < 2; i++) {
			System.out.println("----------");
		}
	}
}
