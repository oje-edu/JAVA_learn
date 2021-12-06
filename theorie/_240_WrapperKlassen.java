package theorie;

public class _240_WrapperKlassen {
    
    public static void main(String[] args) {
	
	// Wrapper-Klassen für die acht primitiven Datentypen
	// Es entstehen Objekt
	// Sie brauchen mehr Speicherplatz als die primitiven Datentypen
	
        /*
         * byte	    	Byte
         * short	    Short
         * int	    	Integer     (Ausgeschrieben) !!!
         * long	    	Long
         * float	    Float
         * double	    Double
         * boolean	    Boolean
         * char	    	Character   (Ausgeschrieben) !!!
         */
	
	Integer int1 = 711;
	System.out.println(int1);
	Double dou1 = 123.456;
	Character char1 = 'Z';
	System.out.println(char1);
	
	// Typenumwandlung läuft bei Wrappen-Klassen per Methoden
	System.out.println(dou1.intValue());  						// 123
	
	// Zum Vergleich Casting von primitiven Datentypen
	double dou2 = 123.456;
	System.out.println((int) dou2);  							// 123
	
	// Methoden
	System.out.println(dou1);  									// 123.456
	System.out.println(dou1.toString().length());  				// 7
	
	// null ist als Wert möglich
	Double dou3 = null;
	System.out.println(dou3); 									// null
	
	// parse...()
	int x = Integer.parseInt("12");
	// Integer x = Integer.parseInt("12");
	System.out.println(x);
	
	// MIN_VALUE, MAX_VALUE
	System.out.println(Byte.MIN_VALUE);							// -128
	System.out.println(Byte.MAX_VALUE);							// 127
	
	System.out.println(Short.MIN_VALUE);						// -32768
	System.out.println(Short.MAX_VALUE);                        // 32767
	
	System.out.println(Integer.MIN_VALUE);						// -2147483648
	System.out.println(Integer.MAX_VALUE);                      // 2147483647
	
	System.out.println(Long.MIN_VALUE);							// -9223372036854775808
	System.out.println(Long.MAX_VALUE);							// 9223372036854775807
	
	System.out.println(Float.MIN_VALUE);						// 1.4E-45
	System.out.println(Float.MAX_VALUE);						// 3.4028235E38
	
	System.out.println(Double.MIN_VALUE);						// 4.9E-324
	System.out.println(Double.MAX_VALUE);						// 1.7976931348623157E308
	
	
	// NaN - Not a Number
	// Nur bei Float und Double
	System.out.println(Float.NaN); 								// NaN
	System.out.println(0.0F / 0.0F);                            // NaN
	System.out.println(Double.NaN);                             // NaN
	System.out.println(0.0D / 0.0D);                            // NaN
	// System.out.println(0 / 0);                                  // java.lang.ArithmeticException: / by zero
	// Egal was man mit NaN rechnet, das Ergebnis ist immer NaN;
	System.out.println(Double.NaN + 3);    						// NaN
	
	// Infinity - Unendlich
	System.out.println(7 / 0.0F); 								// Infinity
	System.out.println(-7 / 0.0F); 								// -Infinity
	System.out.println(7 / 0.0D); 								// Infinity
	System.out.println(-7 / 0.0D); 								// -Infinity
	// System.out.println(7 / 0); 									// java.lang.ArithmeticException: / by zero
	
	System.out.println(Float.POSITIVE_INFINITY); 				// Infinity
	System.out.println(Float.NEGATIVE_INFINITY); 				// -Infinity
	System.out.println(Double.POSITIVE_INFINITY);				// Infinity
	System.out.println(Double.NEGATIVE_INFINITY); 				// -Infinity
	
	// Explizietes Unboxing
	int a = 5;
	@SuppressWarnings("deprecation")
	Integer b = new Integer(3);
	int c = a * b.intValue();
	System.out.println(c); 										// 15
    }

}
