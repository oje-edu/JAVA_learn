package theorie;
import java.util.Random;

public class _120_switch {
    
    // case ist nur der Einstiegspunkt
    // Ohne break wird der n�chste cas auch ausgef�hrt
    // Erlaubte Datentypen: int, String, byte, short, char, enum
    
    public static void main(String[] args) {
	
	Random r = new Random();
	int num = r.nextInt(6) + 1;  // 1 - 6
	System.out.print(num + " entspricht: ");
	
	switch(num) {
	case 1:
	    System.out.println("sehr gut");
	    break;
	case 2:
	    System.out.println("gut");
	    break;
	case 3:
	    System.out.println("befriedigend");
	    break;
	case 4:
	    System.out.println("ausreichend");
	    break;
	case 5:
	    System.out.println("mangelhaft");
	    break;
	case 6:
	    System.out.println("ungen�gend");
	    break;
	default:
	    System.out.println("FEHLER");
	}
	
	// Begr��ung
	int tag = r.nextInt(7) + 1;
	System.out.print(tag + " - ");
	
	switch (tag) {
	    case 1:
	    case 2:
	    case 3:
	    case 4:
	    case 5:
		System.out.println("Sch�nes Arbeiten!");
		break;
	    case 6:
	    case 7:
		System.out.println("Sch�nes Wochenende!");
		break;
	    default:
		System.out.println("FEHLER");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    }
}
