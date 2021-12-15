package theorie;

public class _240_WrapperKlassen {
    
    public static void main(String[] args) {
	
	// Wrapper-Klassen für die acht primitiven Datentypen
	// Es entstehen Objekt
	// Sie brauchen mehr Speicherplatz als die primitiven Datentypen
	
        /*
         * byte	    	Byte
         * short	Short
         * int	    	Integer     !!!
         * long	    	Long
         * float	Float
         * double	Double
         * boolean	Boolean
         * char	    	Character   !!!
         */
	
	Integer int1 = 711;
	System.out.println(int1);
	Double dou1 = 123.456;
	Character char1 = 'Z';
	System.out.println(char1);
	
	// Typenumwandlung läuft bei Wrappen-Klassen per Methoden
	System.out.println(dou1.intValue());  // 123
	
	// Zum Vergleich Casting von primitiven Datentypen
	double dou2 = 123.456;
	System.out.println((int) dou2);  // 123
	
	// Methoden
	System.out.println(dou1);  // 123.456
	System.out.println(dou1.toString().length());  // 7
	
	// null ist als Wert möglich
	Double dou3 = null;
	System.out.println(dou3);
	
	
	
	
	
	
	
	
	
    }

}
