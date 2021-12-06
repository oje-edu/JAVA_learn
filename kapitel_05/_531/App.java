package kapitel_05._531;

public class App {

	public static void main(String[] args) {
		
		bruch(3,4);

	}
	
	private static void bruch(int z, int n) {
		Bruch b = new Bruch();
		b.zaehler = z;
		b.nenner = n;
		b.ausgeben();	
		
	}

}
