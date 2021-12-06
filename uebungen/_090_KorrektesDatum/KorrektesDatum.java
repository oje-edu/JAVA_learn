package uebungen._090_KorrektesDatum;

public class KorrektesDatum {
	public static void main(String[] args) {
		

	/*
	 * Korrektes Datum
	 *
	 * Die Meyer GmbH benötigt ein Modul, das ein Datum auf Korrektheit prüft. Ist
	 * das zu prüfende Datum korrekt, so ist die Variable datok auf 1, andernfalls
	 * auf 0 zu setzen.
	 *
	 * Beispiele:
	 *
	 * 29.02.1999 - datok: 0 29.02.2000 - datok: 1 13.05.2000 - datok: 1 32.05.2000
	 * - datok: 0 24.13.2000 - datok: 0
	 *
	 * Für die Jahre gilt: jahr > 1900 && jahr < 2100
	 */
		
	System.out.println("20.02.1999 -> 0 - " + checkDate(20, 2, 1999));
	System.out.println("29.02.2000 -> 1 - " + checkDate(29, 2, 2000));
	System.out.println("13.05.2000 -> 1 - " + checkDate(13, 5, 2000));
	System.out.println("32.05.2000 -> 0 - " + checkDate(32, 5, 2000));
	System.out.println("24.13.2000 -> 0 - " + checkDate(24, 13, 2000));
	System.out.println("24.12.2200 -> 0 - " + checkDate(24, 13,2200));
	}
	
	static int checkDate(int day, int month, int year) {
		if (year > 1900 && year < 2100) {
			System.out.println("JaVA korrekt");
			// if (month >= 1 && month <= 12) {
				// System.out.println("MonatVa korrekt");
				if (day >= 1 && day <= 31) {
					System.out.println("TagVA korrekt");
					
					switch (month) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						return 1;
					case 4:
					case 6:
					case 9:
					case 11:
						if (day <= 30) return 1;
						return 0;
						
					case 2:
						if (year % 4 != 0) {
							if (day <= 28) return 1;
							} else {
								if (day <= 29) return 1;
							}
						}
				}
		}
		return 0;
	}
	
}
