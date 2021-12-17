package theorie._600_690_._660_PassByValueVsReference;

public class _010_PassByValue {
	
	// Pass by value.
	// Es wird nur der Wert übergeben.
	// Parameter und Argument zeigen auf unterschiedliche Stellen im Speicher.
	// Bei den acht primitiven Datentypen und beim String.

	public static void main(String[] args) {
		
		int i1 = 11;
		System.out.print(i1 + " "); 					// 11
		changeInt(i1);
		System.out.print(i1 + " "); 					// 11
		System.out.println();
		
		String s1 = "Harry";
		System.out.print(s1 + " "); 					// Harry
		changeString(s1);
		System.out.print(s1 + " "); 					// Harry
		System.out.println();
				
	}
	
	public static void changeInt(int x) {
		x += 99;
	}
	
	public static void changeString(String x) {
		x += "Hello";
	}
}
