package uebungen._120_Mittelwert;

public class _120_Mittelwert {

	public static void main(String[] args) {
		
        /*
         * Mittelwert
         *
         * Schreibe eine statische Methode,
         * die drei Zahlen entgegen nimmt,
         * den Mittelwert berechnet und diesen zurückgibt.
         */
		
		System.out.println(berechneMittelwert(100, 200, 300));  // 200.0
	}
	
	public static int berechneMittelwert(int z1, int z2, int z3) {
		int sum = (z1 + z2 + z3);
		int res = sum / 3;
		return res;
	}
}
