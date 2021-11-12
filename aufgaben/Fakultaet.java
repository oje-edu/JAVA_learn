package aufgaben;

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

		System.out.println("Die gesuchte Zahl ist " + erg + " ?");
		System.out.println("Ob das stimmt? ... woher soll ich das wissen?");
		System.out.println("Anyway check this out: " + "https://audio-animation.vercel.app/");
	}
}
