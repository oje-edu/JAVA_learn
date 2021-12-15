package aufgabenZurWiederholung;

public class _W030_Begruessung {

    public static void main(String[] args) {

        /*
         * Begrüßung
         *
         * Es soll eine Begrüssung in Abhängingkeit zur Uhrzeit
         * ausgegeben werden.
         * Zwischen 22Uhr und 5Uhr: Gute Nacht
         * Vor 11Uhr: Guten Morgen
         * Vor 15Uhr: Mahlzeit
         * Vor 18Uhr: Guten Nachmittag
         * Vor 22Uhr: Guten Abend
         *
         * Stunde per Random zwischen 0 - 23 erstellen.
         */
    	
    	int hour = (int)(Math.random() * 24);
    	
    	switch(hour) {
    	case 22:
    	case 23:
    	case 0:
    	case 1:
    	case 2:
    	case 3:
    	case 4:
    	case 5:
    		System.out.println("Es ist " + hour + " Uhr: Gute Nacht");
    		break;
    	case 6:
    	case 7:
    	case 8:
    	case 9:
    	case 10:
    		System.out.println("Es ist " + hour + " Uhr: Guten Morgen");
    		break;
    	case 11:
    	case 12:
    	case 13:
    	case 14:
    		System.out.println("Es ist " + hour + " Uhr: Mahlzeit");
    		break;
    	case 15:
    	case 16:
    	case 17:
    		System.out.println("Es ist " + hour + " Uhr: Guten Nachmittag");
    		break;
    	default:
    		System.out.println("Es ist " + hour + " Uhr: Guten Abend");
    	}
    }
}
