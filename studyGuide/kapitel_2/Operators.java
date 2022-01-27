package studyGuide.kapitel_2;

public class Operators {

	public static void main(String[] args) {
		
		// Binary Arithmetic Operators
		
		//  + - / * %
		System.out.println(3 + 4);   									// 7
		System.out.println(3 + "4");	 								// 34
		
		// explizite Typkonvertierung (selbst vorgegebene Anweisung)
		Integer.parseInt("42"); 										// Parser sind statische Methoden der Wrapperklassen von primitiven Datentypen
		
		// implizite Typkonvertierung (ohne Anweisung)
		System.out.println(3 + 3.0); 									// int + double -> Umwandlung in double + double
		
		
		// Inkrement Dekrement
		
		// Post
		int c = 3;
		System.out.println(c++); 										// 3
		System.out.println(c--); 										// 4
		System.out.println(c); 											// 3
		
		// Pre
		int d = 5;
		System.out.println(++d);										// 6
		System.out.println(--d); 										// 5
		System.out.println(d); 											// 5
		
		
		// kombinierte zuweisungs Operatoren

		int e = 5;
		// e = e + 6;
		e += 6;
		System.out.println(e); 											// 11
			
		// vergleichs Operatoren < > <= >= ==
		
		
		// logische Operatoren | &
		int f = 7;
		// non short circuit
		System.out.println(3 > 1 | 3 > f++); 							// true
		System.out.println(f); 											// 8
		
		// short circuit ( hier wird f++ nicht mehr ausgeführt und somit f auch nicht erhöht)
		System.out.println(3 > 1 || 3 > f++); 							// true
		System.out.println(f);											// 8
		
		// cast Operator (von grösseren auf kleineren, stufenweise)
		double g = 5.5;
		System.out.println(g); 											// 5.5
		System.out.println((int) g); 									// 5
		
			
	}

}
