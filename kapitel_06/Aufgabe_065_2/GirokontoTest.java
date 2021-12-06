package kapitel_06.Aufgabe_065_2;

public class GirokontoTest {

	public static void main(String[] args) {

		Girokonto gkto = new Girokonto("0000000001", 10000.0, 1000.0);
		System.out.println("Kontostand: " + gkto.getKontostand());
		gkto.auszahlen(11000.0);
		System.out.println("Kontostand: " + gkto.getKontostand());
		gkto.einzahlen(11000.0);
		gkto.auszahlen(11001.0);
		System.out.println("Kontostand: " + gkto.getKontostand());
	}
}
