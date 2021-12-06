package kapitel_06.Aufgabe_065_2;

public class Konto {
	private String kontonummer;
	private double kontostand;
	
	Konto(String kontonummer, double kontostand) {
		setKontonummer(kontonummer);
		setKontostand(kontostand);
	}
	
	
	// Getter & Setter
	public String getKontonummer() {
		return this.kontonummer;
	}
	public void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}
	public double getKontostand() {
		return this.kontostand;
	}
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	
	// Methoden
	void einzahlen(double wert) {
		setKontostand(this.kontostand += wert);
	}
	
	void auszahlen(double wert) {
		setKontostand(this.kontostand -= wert);
	}
}
