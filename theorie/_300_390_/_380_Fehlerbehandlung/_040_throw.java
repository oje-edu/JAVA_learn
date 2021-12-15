package theorie._300_390_._380_Fehlerbehandlung;

public class _040_throw {
		
	// throw übermittelt eine benutzerdefinierte Exception

	public static void main(String[] args) {
		
		String hoehe = "10";
		String breite = "20";
		String tiefe = "";
		
		try {
			if (hoehe.equals("")) {
				throw new NumberFormatException("Bitte die Höhe eingeben"); // java.lang.NumberFormatException: Bitte die Höhe eingeben
			}
			if (breite.equals("")) {
				throw new NumberFormatException("Bitte die Breite eingeben"); // java.lang.NumberFormatException: Bitte die Breite eingeben
			}
			if (tiefe.equals("")) {
				throw new NumberFormatException("Bitte die Tiefe eingeben"); // java.lang.NumberFormatException: Bitte die Breite eingeben
			}
			/*
			System.out.println(tiefe);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
			System.out.println(e);
			*/
			// default
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
