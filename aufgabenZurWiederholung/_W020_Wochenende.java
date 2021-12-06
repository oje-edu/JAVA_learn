package aufgabenZurWiederholung;

public class _W020_Wochenende {

	public static void main(String[] args) {

        /*
         * Wochenende
         *
         * Schreibe ein Programm, das in der Woche "Gute Woche"
         * und am Wochenende "Schönes Wochenende" ausgibt.
         *
         * Der Wochentag soll als Zufallszahl zwischen 1-7 ermittelt werden,
         * wobei 1 für Montag steht.
         */
    	int rnd = (int)(Math.random() * 7) + 1;
    	String day;
    	
    	switch(rnd) {
    	case 1:
    	case 2:
    	case 3:
    	case 4:
    	case 5:
    		if (rnd == 1) {
    			day = "Montag";
    		} else if (rnd == 2) {
    			day = "Dienstag";
    		} else if (rnd == 3) {
    			day = "Mittwoch";
    		} else if (rnd == 4) {
    			day = "Donnerstag";
    		} else {
    			day = "Freitag";
    		}
    		System.out.println("Es ist " + day + " - Gute Woche");
    		break;
    	case 6:
    	case 7:
    		if (rnd == 6) {
    			day = "Samstag";
    		} else {
    			day = "Sonntag";
    		}
    		System.out.println("Es ist " + day + " - Schönes Wochenende");
    		break;
    	default:
    		System.out.println("Oops, something went terrible wrong!");
    	}
    }
}
