package bonusmissionen;

public class _B020_PotenzenVonZwei {
    
    public static void main(String[] args) {
	
	       /*
         * Potenzen von Zwei
         *
         * Schreibe ein Programm, das alle Potenzen von 2 ausgibt
         * deren Ergebnis kleiner als 10.000 ist.
         * Hilfsmittel: Schleife, **
         *
         * Zusatz: Die Ausgabe soll folgenderma�en aussehen:
         * 2 ** 0 = 1
         * 2 ** 1 = 2
         * ...
         * 2 ** 12 = 4096
         * 2 ** 13 = 8192
         */
        double p = 0, n = 0;
        while (Math.pow(2, p) <= 10_000) {
        	if (p == 0) {
        		n = 1;
        	} else {
        		n = Math.pow(2, p);
        	}
        	System.out.println("2 ** " + (int)p + " = " + (int)n);
        	++p;
        }
    }
}
