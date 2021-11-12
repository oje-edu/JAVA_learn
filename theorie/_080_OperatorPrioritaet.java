package theorie;

public class _080_OperatorPrioritaet {
    
    public static void main(String[] args) {
	
	// Punkt- vor Strichrechnung
	System.out.println(3 + 4 * 5);    // 23
	System.out.println(3 + (4 * 5));  // 23
	
	// Klammer
	System.out.println((3 + 4) * 5);  // 35
	
	// Links assoziiert
	// Bei gleicher Priorit�t
	System.out.println(1000 / 10 / 10);    // 10
	System.out.println((1000 / 10) / 10);  // 10
	System.out.println(1000 / (10 / 10));  // 1000
    }

}
