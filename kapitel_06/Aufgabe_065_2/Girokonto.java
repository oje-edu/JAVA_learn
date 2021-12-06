package kapitel_06.Aufgabe_065_2;

public class Girokonto extends Konto {
	private double limit;  // private bei Getter & Setter

	Girokonto(String kontonummer, double kontostand, double limit) {
		super(kontonummer, kontostand);
		setLimit(limit);
	}
	
	// Methode
	void auszahlen(double wert) {
		if ((getKontostand() - wert) >= getLimit() * (-1)) {
			super.auszahlen(wert);
		} else {
			System.out.println("Fehler - Kreditlimit Überschritten!");
		}
	}

	// Getter & Setter
	public double getLimit() {
		return this.limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

}
