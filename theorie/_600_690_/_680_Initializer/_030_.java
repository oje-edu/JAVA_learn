package theorie._600_690_._680_Initializer;

class Auto3 {
	
	// Initializer wird vor dem Konstruktor ausgeführt.
	// 1. farbe wird initialisiert -> Grün
	// 2. Initializer -> Rot

	Auto3() {
		// farbe = "Blau"; 					 
		System.out.println("Konstruktor");   	// 2.
	}
	
	String farbe = "Grün"; 
	
	{
		farbe = "Rot";							// 3.
		System.out.println("Initializer");   	// 1.
	}
	
	
}

public class _030_ {

	public static void main(String[] args) {
		System.out.println(new Auto3().farbe);
	}

}
