package theorie._200_290_;

public class _200_equals {
	public static void main(String[] args) {
		
		// equals() zum Vergleichen von Strings
		
		String s1 = "Hallo Welt";
		String s2 = "Hallo";
		String s3 = s2 + " Welt";
		
		System.out.println(s1);            // Hallo Welt
		System.out.println(s2);            // Hallo
		System.out.println(s3);            // Hallo Welt
		System.out.println(s1.getClass()); // class java.lang.String
		
		System.out.println(s1 == s3);      // false
		System.out.println(s1.equals(s3)); // true
		System.out.println(s3.equals(s1)); // true
		
		// Bei einfachen Strings geht es LEIDER auch mit dem Vergleichsoperator
		String s4 = "Hallo";
		System.out.println(s2 == s4);      // true
		System.out.println(s2.equals(s4)); // true
	}


}
