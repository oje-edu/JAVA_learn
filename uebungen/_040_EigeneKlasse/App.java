package uebungen._040_EigeneKlasse;


public class App {
	public static void main(String[] args) {
		Mopped m1 = new Mopped();
		System.out.println(m1);
		// Nummer: 1
		// Hersteller: Kawasaki 
		// Modell: ZX-10R
		// Mit: 200PS entspricht 147KW
		// ---------
		// Webseite: <a href="https://www.kawasaki.de/de/products/Supersport/2021/Ninja_ZX-10R/overview?Uid=0841WVALW10MDl5cUF1QXAtdDglbXloNWVlaUAtRXglQWlA" target="_blank" rel="noopener noreferrer">ZX-10R</a>
		
		Mopped m2 = new Mopped("Honda");
		System.out.println();
		System.out.println(m2);
		
		Mopped m3 = new Mopped("Yamaha", "R1");
		System.out.println();
		System.out.println(m3);
		
		Mopped m4 = new Mopped("Suzuki", "Hayabusa", 175);
		System.out.println();
		System.out.println(m4);

		Mopped m5 = new Mopped("BMW", "M1000-RR", 212, "<a href=\"https://www.bmw-motorrad.de/de/models/sport/m1000rr.html\" target=\"_blank\" rel=\"noopener noreferrer\">M1000-RR</a>");
		System.out.println();
		System.out.println(m5);
	}
}
