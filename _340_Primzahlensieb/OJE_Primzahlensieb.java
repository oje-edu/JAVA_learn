package _340_Primzahlensieb;

public class OJE_Primzahlensieb {
	
	static final int N=100;

	public static void main(String[] args) {
	    /*
	     * Primzahlensieb (Sieb des Eratosthenes)
	     *
	     * Schreibe eine Programm, das alle Primzahlen bis zur Zahl n ermittelt
	     * und diese in einer Tabelle mit zehn Spalten ausgibt.
	     *
	     * Die Primzahlen sollen mithilfe des Siebs des Eratosthenes ermittelt werden:
	     *
	     * - Lege eine HashMap an mit den Indexen von der kleinensten natürlichen Primzahl 2
	     *   bis zur Zahl n mit jeweils dem Wert true.
	     *
	     * - Setze den Wert aller Indexe, die ein Vielfaches der Zahl 2 sind, auf false.
	     *
	     * - Suche die nächstgrößere Zahl, deren Wert true ist
	     *   und setze wieder alle Vielfachen der Zahl auf false.
	     *
	     * - Führe diesen Schritt solange weiter durch, bis von einer Zahl
	     *   das kleinste Vielfache ausserhalb der HashMap liegt.
	     *
	     * - Alle Indexe, deren Wert jetzt noch true sind, sind die Primzahlen.
	     * 
	     */
		
        int curNum;
        int curPrim = 0;
        int[] primArr;
        System.out.println("Ausgabe der Primzahlen bis "+ N +"\n");
        /*
         * Zahlen mittels Array berechnen/speichern
         * (N+1)/2 reichen garantiert für alle Grenzwerte ab 2!
         */
        primArr=new int[(N+1)/2];
        // Alle Zahlen durchgehen
        for(curNum = 2; curNum <= N; curNum++) {
            int i=0;
            int range=(int)Math.sqrt(curNum); // (Original-Sieb sucht bis curNum/2)
            while(i < curPrim && primArr[i] <= range && curNum % primArr[i] != 0) {
                i++;
            }
            if(i >= curPrim || primArr[i] > range) { // Ist Primzahl --> Eintragen
                primArr[curPrim++] = curNum;
            }
        }

        // Ausgeben
        System.out.print("Array:  ");
        for(curNum = 0; curNum < curPrim; curNum++) {
            System.out.print(primArr[curNum] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Anzahl der Primzahlen bis "+ N +": " +curPrim);
        System.out.println("Fuellgrad:  " + ((float)curPrim) / primArr.length * 100 + " %");
	}
}
