
public class _160_Scope {
    
    public static void main(String[] args) {
	
	// Scope - Gültigkeitsbereich
	// Variablen aus dem größeren Scope sind im kleiner Scope sichtbar,
	// aber NICHT umgekehrt.
	
	int x = 23;
	
	{
	    System.out.println(x);  // 23
	    int y = 42;
	    System.out.println(y);  // 42

	    // int x = 23;  // Duplicate local variable x
	}
	// System.out.println(y);  // y cannot be resolved to a variable
	
	for (int i = 1; i < 3; i++) {
	    System.out.println(i); // 1 2
	}
	// System.out.println(i);  // i cannot be resolved to a variable
	
	int j;
	for (j = 1; j < 3; j++) {
	    System.out.println(j); // 1 2
	}
	System.out.println(j);  // 3
	
	// OCA-Gespiele
	// else fehlt!
        int a = 7;
        if (a == 7) {
            System.out.println(true);  // true
        } {
            System.out.println(false);  // false
        }
        
        // Variablen in einer Schleife werden jedesmal neu erzeugt
	String text = "Hello";
	int k;
	for (k = 1; k < 3; k++) {
	    String text2 = "Welt";
	    System.out.println(text + text2); // HelloWelt HelloWelt
	}
        
    }
}












