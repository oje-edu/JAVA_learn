package theorie._500_590._580_Rekursion;

public class _010_Fakultaet {
	
	// Rekursion
	// Programm ruft sich innerhalb der Funktion immer wieder selbst auf, bis Bedingung erfüllt ist
	// und gibt das Ergebnis an den Aufrufer zurück

	public static void main(String[] args) {
		
		System.out.println(fac(5));                  // 120
		
		// Klassisch
		System.out.println(fac_Schleife(5));         // 120

	}
	
	public static int fac(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * fac(n - 1);
			
			// 5 * fac(4)
			// 5 * 4 * fac(3)
			// 5 * 4 * 3 * fac(2)
			// 5 * 4 * 3 * 2 * fac(1)
			// 5 * 4 * 3 * 2 * 1
			// 120
		}
	}
	
	// Klassisch
	static int fac_Schleife(int n) {
		
		int res = 1;
		while (n > 1) {
			res *= n;
			n--;
		}
		return res;
	}
}
