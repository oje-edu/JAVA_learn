package theorie;

public class _250_Enum {
	
	// Enum - enumerated list
	enum Spielfarbe {KREUZ, PIK, HERZ, KARO};

	public static void main(String[] args) {
		
		Spielfarbe f1 = Spielfarbe.KREUZ;
		System.out.println("Enum = " + f1); // Enum = KREUZ
		
		switch(f1) {
		case KREUZ:
			// TODO
			break;
		case PIK:
			// TODO
			break;
		case HERZ:
			// TODO
			break;
		case KARO:
			// TODO
			break;
		}
	}
}
