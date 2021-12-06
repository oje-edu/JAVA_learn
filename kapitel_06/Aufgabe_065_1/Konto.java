package kapitel_06.Aufgabe_065_1;

public class Konto {
	String kontonummer;
	double kontostand;
	
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
	public void einzahlen(double wert) {
		setKontostand(this.kontostand += wert) ;
	}
	
	public void auszahlen(double wert) {
		setKontostand(this.kontostand -= wert);
	}
	
	

}
