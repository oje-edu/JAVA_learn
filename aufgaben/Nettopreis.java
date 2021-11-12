package aufgaben;

public class Nettopreis {
    
    public static void main(String[] args) {

        /*
         * Nettopreis
         *
         * Schreibe eine Methode zum Berechnen des Nettopreises.
         * Dieser Methode soll der Bruttopreis übergeben werden
         * und sie soll den Nettopreis zurück geben.
         * Der Mehrwertsteuersatz soll als zweiter Parameter
         * übergeben werden können.
         * Der Standardwert des Mehrwertsteuersatzes soll 19 sein.
         */

        System.out.println(berechneNettoPreis(116, 16));  // 100.0
        System.out.println(berechneNettoPreis(119));      // 100.0
    	

    }
	private static int berechneNettoPreis(int netto, int prozent) {
		return (int)(netto / (100 + prozent) * 100);
	}
	private static int berechneNettoPreis(int gesamt) {
		int prozent = 19;
		return (int)(gesamt / (100 + prozent) * 100);
	}
}
