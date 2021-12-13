package theorie._300_390_._380_Fehlerbehandlung;

public class _020_mehrereCatch {
		
	// Der Code im try-Block wird ausgeführt (bzw. ausprobiert).
	// Wenn dabei eine Exception entsteht,
	// wird nicht wie sonst die Ausführung des Programms beendet,
	// sondern der catch-Block wird ausgeführt
	// Danach geht es in jedem Fall im Quellcode weiter.

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// System.out.println(1 / 0); // java.lang.ArithmeticException: / by zero
		// String s = null; System.out.println(s.length()); // java.lang.NullPointerException
		// int x = Integer.parseInt("4.7"); // java.lang.NumberFormatException: For input string: "4.7"
		// char s = "Hello".charAt(10); // java.lang.StringIndexOutOfBoundsException: String index out of range: 10
		try {
			// System.out.println(1 / 0);
			//String s = null; System.out.println(s.length());
			// int x = Integer.parseInt("4.7");
			char s = "Hello".charAt(10);
			System.out.println("Dies wird nur ausgeführt, wenn es vorher keine Exception gab.");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("Fehler: " + e); // Fehler: java.lang.ArithmeticException: / by zero
			System.out.println("Fehler: " + e.getMessage()); // Fehler: / by zero
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			System.out.println("Fehler: " + e); // Fehler: java.lang.NullPointerException
			System.out.println("Fehler: " + e.getMessage()); // Fehler: null
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
			System.out.println("Fehler: " + e); // Fehler: java.lang.NumberFormatException: For input string: "4.7"
			System.out.println("Fehler: " + e.getMessage()); // Fehler: For input string: "4.7" 
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
			System.out.println("Fehler: " + e); // Fehler: java.lang.StringIndexOutOfBoundsException: String index out of range: 10
			System.out.println("Fehler: " + e.getMessage()); // Fehler: String index out of range: 10
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("Fehler: " + e);
			System.out.println("Fehler: " + e.getMessage()); 
		}
	}
}
