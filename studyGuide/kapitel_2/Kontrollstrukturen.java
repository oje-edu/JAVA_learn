package studyGuide.kapitel_2;

public class Kontrollstrukturen {

	public static void main(String[] args) {
		
		// Verzweigungen
		
		int a = 3;
		int b = 5;
		if(a < b) {
			System.out.println("kleiner");
		} else if(a == 4) {
			System.out.println("gleich");
		} else {
			System.out.println("grösser");
		}
		
		// tenärer Operator (if else, und performanter)
		System.out.println((a < 5) ? "kleiner" : "grösser");
		
		// tenärer Operator verschachtelt (if else if und else)
		System.out.println((a < 5) ? "kleiner" : (a == 5) ? "gleich" : "grösser");
		
		// Switch
		int c = 42;
		switch(c) {
			case 12:
				System.out.println("zwölf");
				break;
			case 13:
				System.out.println("dreizehn");
				break;
			case 42:
				System.out.println("korrekt");
				break;
			default: // wenn am Ende steht wird kein break benötigt
				System.out.println("Error");
		}

	}

}
