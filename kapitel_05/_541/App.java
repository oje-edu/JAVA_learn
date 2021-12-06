package kapitel_05._541;

public class App {

	public static void main(String[] args) {
		
		bruch(3,12);

	}
	
	private static void bruch(int z, int n) {
		Bruch b = new Bruch();
		b.zaehler = z;
		b.nenner = n;
		b.ausgeben();
		System.out.print("\nNach dem kürzen: ");
		// b.kuerzen();
		// b.ausgeben();
		b.gekuerztAusgeben();
		b.erweitern(4);
		System.out.print("\nNach dem erweitern: ");
		b.ausgeben();
		
	}

}
