package theorie._250_Verebung._020_ExtendsSuper;

public class FahrzeugTest {

	public static void main(String[] args) {

		Fahrzeug f = new Fahrzeug();
		System.out.println("Fahrzeug " + f);
		Fahrzeug g = new Fahrzeug("Mercedes");
		System.out.println("Fahrzeug " + g);
		Fahrzeug h = new Fahrzeug("Mercedes", "Silber");
		System.out.println("Fahrzeug " + h);

	}

}
