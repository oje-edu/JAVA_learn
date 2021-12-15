package theorie._500_590._580_Rekursion;

public class _060_Rechteck {
	public static void main(String[] args) {
		System.out.println(rechteck_rec(5, 10, '*'));
	}
	
	static String rechteck_rec(int hoehe, int breite, char zeichen) {
		if (hoehe <= 0) return "";
		return linie_rec(breite, zeichen) + "\n" + rechteck_rec(hoehe - 1, breite, zeichen);
	}
	
	static String linie_rec(int anz, char zeichen) {
		if (anz <= 0) return "";
		return zeichen + linie_rec(anz - 1, zeichen);
	}
}
