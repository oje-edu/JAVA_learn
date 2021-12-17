package uebungen._300_390_._320_Gewichtssteine;


public class OJE_Gewichtssteine {

	public static void main(String[] args) {
    /*
     * Gewichtssteine
     *
     * Ein Kaufmann besitzt eine Waage mit zwei Waagschalen und sieben Gewichtssteine:
     * 1 kg, 2kg, 4 kg, 8 kg, 16 kg, 32 kg und 64 kg.
     * Auf die eine Schale legt der Kaufmann jeweils die Ware,
     * während er auf die andere Schale die Gewichtssteine hinstellt.
     * Er ist mit seinen sieben Gewichtssteinen in der Lage,
     * alle Gewichte von einem Kilo bis zu 127 kg abzuwägen.
     *
     * Schreiben Sie eine Methode, die ein Gewicht (0 kg ... 127 kg) entgegennimmt und ausgibt,
     * welche Gewichtssteine zu verwenden sind.
     */
		
		System.out.println(check(128));
		System.out.println(check(50));
	}
	
	static String check(int gewicht) {
		if (gewicht < 0 || gewicht > 127) {
			return "Gewicht muss grösser 0 und max. 127 sein";
		}
		return calc(gewicht);
	}
	
	static String calc(int gewicht) {
		String res = "";


		return res;
	}
}
