package aufgabenZurWiederholung;

public class _W010_Wuerfeln {
	
	static int random;
	
    public static void main(String[] args) {
    	
    	random = (int)(Math.random() * 6) + 1;
    	
    	switch(random) {
    	case 1:
    	case 2:
    	case 3:
    	case 4:
    		System.out.println("Das reicht nicht! " + "(" + random + ")");
    		break;
    	case 5:
    		System.out.println("Immerhin noch eine 5");
    		break;
    	case 6:
    		System.out.println("Super, eine 6!");
    		break;
    	default:
    		System.out.println("Upps, something went terrible wrong!");
    	}
        /*
         * Würfeln
         *
         * Würfel eine Zahl (von 1 bis 6) und gib aus,
         * was gewürfelt wurde:
         * Super, eine 6!
         * Immerhin noch eine 5!
         * Das reicht nicht! (bei 1-4)
         */
    }
}
