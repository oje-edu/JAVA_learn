package theorie;

public class _270_StringMethoden {

	public static void main(String[] args) {
		
		// String ist ein Objekt
		// Kann erzeugt werden wie ein primitiver Datentyp
		
		String s1 = new String("Mein Tanga");
		System.out.println(s1);
		
		String s2 = "Mein Tanga";
		System.out.println(s2);
		
		// Concat
		String s3 = "Guudn";
		String s4 = "Tach!";
		String s5 = s3.concat(s4);
		System.out.println(s5);  						// GuudnTach!
		
		// + Operator zum Konkatenieren (Verketten)
		String s6 = s3 + " " + s4;
		System.out.println(s6); 						// Guudn Tach!
		System.out.println(s3.concat(" ").concat(s4));	// Guudn Tach!
		System.out.println(s3.concat(" " + s4)); 		// Guudn Tach!
		
		// length()
		System.out.println(s6.length());				// 11
		
		// equals()
		if (s1.equals(s2)) {
			System.out.println(true);					// true
		} else {
			System.out.println(false);
		}
		
		// compareTo() - ASCII Werte vergleich
		String a = "Das ist ";
		String b = "eine Zeichenkette";
		System.out.println(a.compareTo(b));				// -33
		char c1 = 68;
		char c2 = 101;
		System.out.println(c1); 						// D
		System.out.println(c2);							// e
		
		// char charAt(int index)
		System.out.println(s6.charAt(0)); 				// G
		char c3 = s6.charAt(0);
		System.out.println(c3); 						// G
		
		// toUpperCase(), toLowerCase()
		System.out.println(s6.toUpperCase()); 			// GUUDN TACH!
		System.out.println(s6.toLowerCase());           // guudn tach!
		
		// valueOf()
		String s7 = String.valueOf(34.5);
		System.out.println(s7); 						// 34.5
		System.out.println(s7.getClass());              // class java.lang.String
		
		// Integer.parseInt(), Double.parseDouble()
		// int i1 = Integer.parseInt(s7);
		// System.out.println(i1);                         // java.lang.NumberFormatException: For input string: "34.5"
		double d1 = Double.parseDouble(s7);
		System.out.println(d1); 						// 34.5
		int i2 = (int)d1;
		System.out.println(i2); 						// 34
		
		String a1 = "ABCD";
		String a2 = "AABC";
		System.out.println(a1.compareTo(a2)); 			// 1
		
		String a3 = "ABCD";
		String a4 = "ABCD";
		System.out.println(a3.compareTo(a4)); 			// 0
		
		// int indexOf(String|char)
		String s8 = "abcdefghijklmnopqrstuvwxy";
		System.out.println(s8.indexOf('d'));      		// 3
		System.out.println(s8.indexOf("efg"));      	// 4
		// Wenn der String/Char nicht gefunden wird
		System.out.println(s8.indexOf('z'));            // -1
		
		// substring(index)
		System.out.println(s8.substring(3));     		// defghijklmnopqrstuvwxy
		// substring(index index)
		// Der zweite Index ist exclusiv
		System.out.println(s8.substring(3, 7));     	// defg
	}

}
