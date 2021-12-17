package uebungen._100_190_._170_CaesarChiffreBruteforcen;

public class _170_CaesarChiffreBruteforcen {
	public static void main(String[] args) {
		/*
		 * Cäsar-Chiffre bruteforcen
		 *
		 * Schreibe ein Programm das alle möglichen Lösungen eines Cäsar-chiffrierten
		 * Strings ausgibt.
		 *
		 * Was bedeutet "vxumxgssokxkt sginz yvgyy"?
		 * 
		 * Wer Cäsar-Chiffre nicht kennt:
		 * https://de.wikipedia.org/wiki/Caesar-Verschlüsselung
		 */

		//DCLXVI("vxumxgssokxkt sginz yvgyy");
		DCLXVI("rivs fyvrmrk vsq");

	}

	static void DCLXVI(String I) {
		for (int II = 0; II < 24; II++) {
			int III;
			String IV = "";
			for (int V = 0; V < I.length(); V++) {
				III = (int)I.charAt(V);
				III = III - II;
				IV = IV + (char)III;
				System.out.println(IV);
			}
		}
	}
}
