package kapitel_05._Uebungen._Aufgabe_057_1;

public class App {

	public static void main(String[] args) {
		Kreis k = new Kreis();
		Kreis l = new Kreis(75);
		Kreis i = new Kreis(999);
		System.out.println(k.getRadius());
		System.out.println(k.getUmfang());
		System.out.println(k.getFlaeche());
		System.out.println(l.getRadius());
		System.out.println(l.getUmfang());
		System.out.println(l.getFlaeche());
		System.out.println(i.getRadius());
		System.out.println(i.getUmfang());
		System.out.println(i.getFlaeche());

	}

}
