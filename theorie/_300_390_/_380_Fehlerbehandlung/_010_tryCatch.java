package theorie._300_390_._380_Fehlerbehandlung;

public class _010_tryCatch {
		
	// Der Code im try-Block wird ausgeführt (bzw. ausprobiert).
	// Wenn dabei eine Exception entsteht,
	// wird nicht wie sonst die Ausführung des Programms beendet,
	// sondern der catch-Block wird ausgeführt
	// Danach geht es in jedem Fall im Quellcode weiter.

	public static void main(String[] args) {
		
		// System.out.println(1 / 0); // java.lang.ArithmeticException: / by zero
		try {
			System.out.println(1 / 0);
			System.out.println("Dies wird nur ausgeführt, wenn es vorher keine Exception gab.");
		} catch (Exception e) {
			System.out.println("Fehler: " + e); // Fehler: java.lang.ArithmeticException: / by zero
			System.out.println("Fehler: " + e.getMessage()); // Fehler: / by zero
			// e.printStackTrace(); // java.lang.ArithmeticException: / by zero at theorie._380_Fehlerbehandlung._010_tryCatch.main(_010_tryCatch.java:14)
		}
		
		// System.out.println("Hello");

	}

}
