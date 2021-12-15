package kapitel_05._Uebungen._Aufgabe_057_6._OJE_;

public class App {
	
	static double radius = 5.0;
	static double erhoehung = radius;

	public static void main(String[] args) {
		Kreis k = new Kreis();
		
		for (int i = 0; i < 30; i++) {
			k.setRadius(radius + i * erhoehung);
			System.out.println(k.getRadius() + "\t\t" + k.getUmfang() + "\t\t" + k.getFlaeche());
		}	
	}
}
