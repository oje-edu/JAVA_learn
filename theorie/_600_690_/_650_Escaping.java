package theorie._600_690_;

public class _650_Escaping {

	public static void main(String[] args) {


		// Escaping & Maskieren
		
		// Maskieren
		// Einem nornalen Zeichen eine Bedeutung geben
		System.out.println("Hello\nWorld");  									// Zeilenumbruch
		System.out.println("Hello\tWorld"); 									// Tab
		
		// Escaping
		// Einem Zeichen seine syntaktische Bedeutung in der Sprache nehmen
		System.out.println("Er sagte: \"Hallo\""); 								// Er sagte: "Hallo"
		System.out.println("Zum Escapen benutzt man einen Backslash (\\).");	// Zum Escapen benutzt man einen Backslash (\).
		System.out.println("\\\\".length()); 									// 2
		System.out.println("\\\\");												// \\
	}

}
