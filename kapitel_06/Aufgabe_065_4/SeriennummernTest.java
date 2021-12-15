package kapitel_06.Aufgabe_065_4;

public class SeriennummernTest {

	public static void main(String[] args) {
		BruchMitSeriennummer bsnr1 = new BruchMitSeriennummer();
		bsnr1.setZaehler(1);
		bsnr1.setNenner(2);
		System.out.println(bsnr1);
		
		BruchMitSeriennummer bsnr2 = new BruchMitSeriennummer(2, 4);
		System.out.println(bsnr2);
		
		BruchMitSeriennummer bsnr3 = new BruchMitSeriennummer(4, 8);
		System.out.println(bsnr3);
		
		BruchMitSeriennummer bsnr4 = new BruchMitSeriennummer(8, 16);
		System.out.println(bsnr4);
		
		BruchMitSeriennummer bsnr5 = new BruchMitSeriennummer(47, 11);
		System.out.println(bsnr5);
		
		/*
		System.out.println();
		System.out.println("Die Seriennummer eines Objekts soll als unveränderliches (final-) Attribut definiert werden.");
		for (int i = 0; i < 10; i++) {
			System.out.println("\tI HAVE NO IDEA!");
		}
		*/
	}
}
