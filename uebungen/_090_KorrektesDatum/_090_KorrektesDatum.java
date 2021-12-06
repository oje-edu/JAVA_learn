package uebungen._090_KorrektesDatum;

public class _090_KorrektesDatum {
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

	static int year;
	static int month;
	static int day;

	public static void calc(int day, int month, int year) {
		if (year > 1900 && year < 2100) {
			if (month >= 1 && month <= 12) {
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if (day <= 31) {
						System.out.println(day + "." + month + "." + year + " dateok: 1" + " Month has 31 Days");
					} else {
						System.out.println(day + "." + month + "." + year + " dateok: 0" + " Month has only 31 Days");
					}
				} else if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (day <= 30) {
						System.out.println(day + "." + month + "." + year + " dateok: 1" + " Month has 30 Days");
					} else {
						System.out.println(day + "." + month + "." + year + " dateok: 0" + " Month has 30 only Days");
					}
				} else if (month == 2) {
					boolean leapYear = ((year & 3) == 0 && ((year % 25) != 0 || (year & 15) == 0));
					if (leapYear) {
						if (day >= 1 && day <= 29) {
							System.out.println(day + "." + month + "." + year + " dateok: 1" + " Leap Year");
						} else {
							System.out.println(day + "." + month + "." + year + " dateok: 0" + " no Leap Year");
						}
					} 
					if (!leapYear) {
						if (day >= 1 && day <= 28){
							System.out.println(day + "." + month + "." + year + " dateok: 1");
						} else {
							System.out.println(day + "." + month + "." + year + " dateok: 0");
						}
					}
				}

			} else {
				System.out.println(day + "." + month + "." + year + " dateok: 0" + " Wrong Month");
			}
		}
	}

	public static void main(String[] args) {
		calc(29, 2, 1999);
		calc(27, 2, 1999);
		calc(29, 2, 2000);
		calc(13, 5, 2000);
		calc(32, 5, 2000);
		calc(24, 13, 2000);
		System.out.println("SPAGHETTI");

	}
}
