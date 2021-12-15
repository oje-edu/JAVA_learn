package kapitel_05._Uebungen._Aufgabe_2;

public class App {

	public static void main(String[] args) {

		Rechteck a = new Rechteck(4.0,3.0);
		System.out.println("-----JOptionPane Variablen-----");
		System.out.println("Länge: "  + a.getLaenge());
		System.out.println("Breite: " + a.getBreite());
		System.out.println("Fläche: " + a.getFlaeche());
		System.out.println("Diagonale" +  a.getDiagonale());
		System.out.println("Lange Seite: " + a.getLangeSeite());
		System.out.println("Kurze Seite: " + a.getKurzeSeite());
		System.out.println("Umfang: " + a.getUmfang());

	}

}
