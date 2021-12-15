package kapitel_05._Uebungen._Aufgabe_057_7;


public class App {

	public static void main(String[] args) {

		Rechteck a = new Rechteck(10.0,20.0);
		Kreis k = new Kreis();
		k.setFlaeche(a.getFlaeche());
		System.out.println("Rechteck Laenge:" + a.getLaenge());
		System.out.println("Rechteck Breite: " + a.getBreite());
		System.out.println("Rechteck Flaeche: " + a.getFlaeche());
		System.out.println("Kreis Radius: " + k.getRadius());
		System.out.println("Kreis Flaeche " + k.getFlaeche());

	}

}

