package bonusmissionen;

import java.util.Random;

public class _B070_WebCode {

	
	public static void main(String[] args) {
		
        /*
         * Web-Code
         *
         * Für ein Buchprojekt wird ein Web-Code benötigt.
         * Mit diesem Web-Code können Artikel direkt online abgefragt werden.
         * Der Code soll aus acht Zeichen bestehen.
         * Vorkommen dürfen Ziffern und Kleinbuchstaben.
         * Um Verwechslungen zu vermeiden,
         * kommen die Ziffer Eins (1) und der Kleinbuchstabe "ell" (l) nicht vor.
         * Ebenso kommt die Null (0) nicht vor.
         * Dass das große "Oh" (O) nicht vorkommen kann, ist klar,
         * denn die Vorgabe erlaubt nur Kleinbuchstaben.
         *
         * Schreibe ein Programm, das fünf zufällige Web-Codes erzeugt.
         */
		
		// ASCII TABLE https://www.torsten-horn.de/techdocs/ascii.htm
		// CODE HELP https://www.baeldung.com/java-random-string
		
	    int leftLimit = 50; // numeral '2'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 8;
	    Random random = new Random();
	    
	    for (int i = 0; i < 5; i++) {
		    String generatedString = random.ints(leftLimit, rightLimit + 1)
		      .filter(y -> (y <= 57 || y >= 97) && y != 108)
		      .limit(targetStringLength)
		      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		      .toString();
	
		    System.out.println("\tWebCode" + (i + 1) + ": " + generatedString);
	    }
	}
}
