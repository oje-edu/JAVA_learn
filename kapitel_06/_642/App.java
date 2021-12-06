package kapitel_06._642;

public class App {

	public static void main(String[] args) {

		Bruch a = new Bruch(); // a als Bruch definiert
		a.setZaehler(3);
		a.setNenner(4);
		a.ausgeben(); // 1/3

		Bruch b = a;
		b.ausgeben(); // 1/3
		System.out.println(b == a); // true

		Bruch a1 = new Bruch();
		a1.setZaehler(3);
		a1.setNenner(4);
		
		Bruch b1 = new Bruch();
		b1.setZaehler(3);
		b1.setNenner(4);
		System.out.println(b1 == a1); // false
		
		Bruch a2 = new Bruch();
		a2.setZaehler(3);
		a2.setNenner(4);
		
		Bruch b2 = new Bruch();
		b2.setZaehler(3);
		b2.setNenner(4);
		
		System.out.println(a2.equals(b2));  // true
	}
}