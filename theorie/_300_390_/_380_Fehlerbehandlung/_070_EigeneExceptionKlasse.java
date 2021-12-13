package theorie._300_390_._380_Fehlerbehandlung;

//Eigene Exception Klasse

@SuppressWarnings("serial")
class LeereEingabeException extends NumberFormatException {
	
	public LeereEingabeException() {
		super();
	}
	public LeereEingabeException(String s) {
		super(s);
	}
}

public class _070_EigeneExceptionKlasse {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// String hoehe = "10";
		String hoehe = "";
		
		try {
			if (hoehe.equals("")) {
				throw new LeereEingabeException("Bitte einen Wert eingeben");
			}
			int x = Integer.parseInt("23.456");
			
		} catch (LeereEingabeException e) {
			System.out.println("LeereEingabeException"); 
			System.out.println(e); 								// theorie._380_Fehlerbehandlung.LeereEingabeException: Bitte einen Wert eingeben
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException"); 
			System.out.println(e); 								// java.lang.NumberFormatException: For input string: "23.456"
		}
	}
}
