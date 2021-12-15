package aufgaben._080_._OJE_.Kostenberechnung;


public class Kostenberechnung {
	double preis;
	int anzahl;
	String waehrung;
	
	
	public static String berechneKosten(double preis, int anzahl, String waehrung) {
		String erg = ((preis * anzahl) + "0" + " " + waehrung);
    	return erg;
    }
	public static String berechneKosten(double preis, int anzahl) {
    	return berechneKosten(preis, anzahl, "$");
    }
	
	public static String berechneKosten(double preis, String waehrung) {
    	return berechneKosten(preis, 100, waehrung);
    }
	
	public static String berechneKosten(double preis) {
    	return berechneKosten(preis, 100, "$");
    }
	

	public static void main(String[] args) {
	    /*
	     * Kostenberechnung
	     *
	     * Erstelle eine Methode zur Kostenberechnung.
	     * Dieser wird Preis, Anzahl und Währung als Argument übergeben
	     * und sie soll daraus die Kosten berechnen und zurück geben.
	     * Standardmäßig soll die Anzahl 100 betragen und die Währung Euro sein.
	     * Die Rückgabe soll formatiert mit zwei Stellen hinterm Komma erfolgen.
	     */
	    System.out.println(berechneKosten(20, 20, "$"));  // 400,00 $
	    System.out.println(berechneKosten(20, 50));       // 1000,00 €
	    System.out.println(berechneKosten(20, "$"));      // 2000,00 $
	    System.out.println(berechneKosten(20));           // 2000,00 €
	}
	
}
