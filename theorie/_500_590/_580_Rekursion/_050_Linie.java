package theorie._500_590._580_Rekursion;

public class _050_Linie {

	public static void main(String[] args) {
		
		// Rekursion
		System.out.println(linie_rec(10, '*'));
		// Klassisch While
		System.out.println(linie_while(10, '*'));
		// Klassisch For
		System.out.println(linie_for(10, '*'));

	}
	
	static String linie_rec(int anz, char zeichen) {
		if (anz <= 0) return "";
		return zeichen + linie_rec(anz - 1, zeichen);
	}
	
	// While
	static String linie_while(int anz, char zeichen) {
		String erg = "";
		while(anz > 0) {
			erg += zeichen;
			anz--;
		}
		return erg;
	}
	
	// For
	static String linie_for(int anz, char zeichen) {
		String erg = "";
		for (int i = 1; i <= anz; i++) {
			erg += zeichen;
		}
		return erg;
	}
}


