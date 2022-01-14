package theorie._600_690_._680_Initializer;

class Auto2 {
	
	// Initializer wird vor dem Konstruktor ausgeführt.
	// 1. farbe wird deklariert.
	// 2. Initializer -> Rot
	// 3. farbe wird initialisiert -> Grün

	Auto2() {
		// farbe = "Blau"; 					 
		System.out.println("Konstruktor");   	// 2.
	}
	
	{
		farbe = "Rot";
		System.out.println("Initializer");   	// 1.
	}
	
	String farbe = "Grün"; 						// 3.
}

public class _020_ {

	public static void main(String[] args) {
		System.out.println(new Auto2().farbe);

	}

}
