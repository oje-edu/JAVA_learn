package aufgaben.Aufgabe_4;


public class App {

	public static void main(String[] args) {

		Rechteck a = new Rechteck(10.0,10.0);
		a.laengeAusgeben();
		System.out.println("Breite: " + a.getBreite());
		System.out.println(a.getLaenge());  // 20.0
		System.out.println(a.getBreite());

	}

}

