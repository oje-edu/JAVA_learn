package theorie._010_090_;

public class _090_LogischeOperatoren {
    
    public static void main(String[] args) {
	
	// Logische Operatoren
	// Boolesche Operatoren
	
	// &&, ||, !
	
	// && - UND (sowohl als auch)
	// System.out.println(3 < 2 && 7 != 8);  // false
	// Mit vollst�ndiger Auswertung
	System.out.println(3 < 2 & 7 != 8);   // false
	
	System.out.println(true && true);    // true
	// System.out.println(false && true);   // false	
	System.out.println(true && false);   // false	
	// System.out.println(false && false);  // false
	
	// || - ODER (und/oder)
	// System.out.println(true || true);    // true
	System.out.println(false || true);   // true	
	// System.out.println(true || false);   // true	
	System.out.println(false || false);  // false
	
	// ! NICHT (not)
	// System.out.println(!(1 == 1));  // false
	System.out.println(!true);      // false

	// ^ - XOR (entweder oder)
	System.out.println(true ^ true);    // false
	System.out.println(false ^ true);   // true	
	System.out.println(true ^ false);   // true	
	System.out.println(false ^ false);  // false
	
	
	
	
    }

}
