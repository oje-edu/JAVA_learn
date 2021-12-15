package kapitel_06.Aufgabe_065_2;

public class KontoTest {

	public static void main(String[] args) {

		Konto kto = new Konto("0000000001",1000);
		System.out.println("Kontonummer: " + kto.getKontonummer() + " " + "Kontostand = " + kto.getKontostand() + " €");
		
		kto.einzahlen(500.00);
		System.out.println("Kontostand (+500.00) = " + kto.getKontostand() + " €");
		kto.auszahlen(750.50);
		System.out.println("Kontostand (-750.50) = " + kto.getKontostand() + " €");
		System.out.println("---");
		System.out.println("Kontonummer: " + kto.getKontonummer() + " " + "Kontostand (neu) = " + kto.getKontostand() + " €");
	}
}
