import java.util.Random;

public class _130_whileDoWhile {
    
    public static void main(String[] args) {
	
	// while
	// Kopfgesteuerte Schleife
	int i = 0;
	while (i < 10) {
	    System.out.print(i + " ");  // 0 1 2 3 4 5 6 7 8 9 
	    i++;
	}
	System.out.println();
	
	// do while
	// Fußgesteuerte Schleife
	// Wird immer mindestens einmal ausgeführt.
	i = 0;
	do {
	    System.out.print(i + " ");  // 0 1 2 3 4 5 6 7 8 9 
	    i++;
	} while (i < 10);
	System.out.println();
	
	// Stärke von while/do while
	// Die Anzahl der Durchläufe kann offen sein.
	Random r = new Random();
	int w = 0;
	int c = 0;
	while (w != 6) {
	    w = r.nextInt(6) + 1;  // 1-6
	    System.out.print(w + " ");
	    c++;
	}
	System.out.println("Anzahl: " + c);
	
	
	
	
    }

}
