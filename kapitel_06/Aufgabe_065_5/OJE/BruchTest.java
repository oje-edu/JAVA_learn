package kapitel_06.Aufgabe_065_5.OJE;

public class BruchTest {

	public static void main(String[] args) {
		Bruch a = new Bruch();
		a.setZaehler(3);
		a.setNenner(4);
				
		
		Bruch b = new Bruch();
		b.setZaehler(1);
		b.setNenner(2);
		
		
		System.out.println("------Brüche------");
		a.ausgeben();
		a.dezimalwert();
		System.out.println();
		b.ausgeben();
		b.dezimalwert();
		System.out.println("------Rechnen------");
		// a.addiere(b.getZaehler(), b.getNenner());
		System.out.println("------------");
		// a.subtrahiere(b.getZaehler(), b.getNenner());
	}
}
