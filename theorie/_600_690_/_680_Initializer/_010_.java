package theorie._600_690_._680_Initializer;

class Auto {
	
	// Initializer wird vor dem Konstruktor ausgeführt.
	// 1. farbe wird deklariert.
	// 2. Initializer -> Rot
	// 3. farbe wird initialisiert -> Grün
	// 4. Konstruktor -> Blau
	Auto() {
		farbe = "Blau"; 					 // 3.
		System.out.println("Konstruktor");   // 2.
	}
	
	{
		farbe = "Rot";
		System.out.println("Initializer");   // 1.
	}
	
	String farbe = "Grün";
}

public class _010_ {

	public static void main(String[] args) {
		System.out.println(new Auto().farbe);

	}

}
