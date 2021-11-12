package theorie;

public class _150_breakContinue {
    
    public static void main(String[] args) {
	
	// continue
	// Beendet den aktuellen Schleifendurchlauf vorzeitig
	for (int i = 1; i <= 10; i++) {
	    
	    if (i == 7) {
		continue;
	    }
	    System.out.print(i + " ");  // 1 2 3 4 5 6 8 9 10
	}
	System.out.println();
	
	// break
	// Beendet die komplette Schleife
	for (int i = 1; i <= 10; i++) {
	    
	    if (i == 7) {
		break;
	    }
	    System.out.print(i + " ");  // 1 2 3 4 5 6
	}
	System.out.println();
	
	
    }
}
