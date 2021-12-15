package kapitel_05._511;

public class App {

	public static void main(String[] args) {
		
		bruch(13,6);
		bruch(15,3);
		bruch(77,15);

	}
	
	private static void bruch(int z, int n) {
		Bruch b = new Bruch();
		b.zaehler = z;
		b.nenner = n;
		
		System.out.println("Bruch: " + b.zaehler + "/" + b.nenner);
		
	}

}
