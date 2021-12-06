package kapitel_05._522;

public class App {

	public static void main(String[] args) {
		
		bruch(3,4);

	}
	
	private static void bruch(int z, int n) {
		/* 
		Bruch a = new Bruch();
		a.zaehler = z;
		a.nenner = n;
		
		System.out.println("Bruch: " + a.zaehler + "/" + a.nenner);
		
		Bruch b = a; // Referenz
		b.zaehler = 5;
		b.nenner = 8;
		System.out.println("Bruch: " + a.zaehler + "/" + a.nenner);
		*/
		
		Bruch a = new Bruch();
		a.zaehler = z;
		a.nenner = n;
		Bruch b = new Bruch();
		b.zaehler = a.zaehler;
		b.nenner = a.nenner;
		System.out.println(a == b);
		System.out.println("Bruch a = " + a.zaehler + "/" + a.nenner);
		System.out.println("Bruch b = " + b.zaehler + "/" + b.nenner);
		
		
	}

}
