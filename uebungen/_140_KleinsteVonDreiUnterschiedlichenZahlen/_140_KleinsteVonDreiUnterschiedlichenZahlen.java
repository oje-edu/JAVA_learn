package uebungen._140_KleinsteVonDreiUnterschiedlichenZahlen;

public class _140_KleinsteVonDreiUnterschiedlichenZahlen {

    public static void main(String[] args) {

        /*
         * Kleinste von drei UNTERSCHIEDLICHEN Zahlen
         *
         * Schreibe ein Programm,
         * das drei Variablen mit zufälligen, UNTERSCHIEDLICHEN Zahlen befüllt.
         * Dann soll das Programm testen,
         * welche der Zahlen die Kleinste ist und diese ausgeben.
         */
    	
    	System.out.println("Should be 1: -> " + smallestNumber(1,2,3));   
    	System.out.println("Should be 9: -> " + smallestNumber(999,98,9));
    	System.out.println("Should be 998: -> " + smallestNumber(999,998,9999));
    }
    
    public static int smallestNumber(int z1, int z2, int z3) {
    	if (z1 < z2 && z1 < z3) {
    		return z1;
    	} else if (z2 < z1 && z2 < z3) {
    		return z2;
    	} else {
    		return z3;
    	}
    }
 }
