package theorie._300_390_._380_Fehlerbehandlung;


public class _060_throws2 {

	// throws
	// bei leichten Exceptions ist throws optional

	static String check(String eingabe) {
		if (eingabe.equals("")) {
			throw new NumberFormatException("Bitte einen Wert eingeben");
		}
		return eingabe;
	}
	
	static String check2(String eingabe) throws NumberFormatException {
		if (eingabe.equals("")) {
			throw new NumberFormatException("Bitte einen Wert eingeben");
		}
		return eingabe;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String hoehe = "10";
		String breite = "20";
		String tiefe = "";
		
		try {
			System.out.println(check(hoehe));
			System.out.println(check2(tiefe));
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
