package uebungen;

public class Fakultaet {
	public static void main(String[] args) {
		// Fakultät
		//
		// schreibe ein Programm,
		// das ermittelt, welche Zahl möglichst gross ist
		// ohne dass ihre Faktualität über 1_000_000_000 ist.
		//
		// Hinweis:
		// Fakultät von 5 (Kurzschreibweise: 5!):
		// 1 * 2 * 3 * 4 * 5 = 120
		
		viaWhile();
		viaFor();
		viaDo();
		
		System.out.println();
		System.out.println("\tLetzte Aktualisierung: " + "\n\t14.11.2021 09:40:49 Uhr");

	}
	
	private static void viaWhile() {
		long i; 
		long f = 1;
		long n = 0;
		while (f <= 1_000_000_000) {
			n++;
			f = 1;
			for (i = 1; i <= n; i++) {
				f = f * i;
			}
		}
		// bekomme das ums verrecken ned mit 2 for Schleifen hin .. wieso ?
		int erg = (int)(n - 1);

		System.out.println("\t----------mit While----------");
		System.out.println("\tDie gesuchte Zahl ist " + erg + " ?");
		System.out.println("\t\t(n - 1)");
		System.out.println("\t-----------------------------");		
	}
	
	private static void viaFor() {
		long i, f;
		long n = 0;
		for (f = 1; f <= 1_000_000_000; n++) {
			f = 1;
			for (i = 1; i <= n; i++) {
				f = f * i;
			}
		}
		int erg = (int)(n - 2);
		
		System.out.println("\t-----------mit For-----------");
		System.out.println("\tDie gesuchte Zahl ist " + erg + " ?");
		System.out.println("\t\t(n - 2)");
		System.out.println("\t-----------------------------");	
	}
	
	private static void viaDo() {
	
		int i = 1;
		int res = 1;
		System.out.println("\t-----------mit doWhile-----------");
		do {
			System.out.print("\t" + i + " -> ");
			System.out.println(res);
			i++;
			res = res * i;
		} while (res < 1_000_000_000);
		System.out.println("\t-----------------------------");
	}
}
