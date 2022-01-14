package theorie._700_790_._730_Polymorphism;

class Fahrzeug {
	void printInherit() {
		System.out.println("Fahrzeug: printInherit()");
	}
}

class PKW extends Fahrzeug {
	@Override
	void printInherit() {
		System.out.println("PKW: printInherit()");
	}
	void printOut() {
		System.out.println("PKW: printOut()");
	}
}

public class _020_ {

	public static void main(String[] args) {
		
		Fahrzeug f1 = new PKW();
		
		f1.printInherit(); 										// PKW: printInherit()
		
		// Beim Kompilieren merkt sich Java alle Methoden der Referenz-Klasse
		// und wenn eine Methode dort nicht existiert, kann sie auch beim Ausführen nicht benutzt werden
		// (selbst wenn sie im  Object-Typ existiert)
		//
		// f1.printOut(); 										// The method printOut() is undefined for the type Fahrzeug
		
		// Object casting 
		// Downcasting		
		((PKW)f1).printOut(); 									// PKW: printOut()
		
		PKW f2 = (PKW)f1;
		f2.printOut(); 											// PKW: printOut()
		
		// getClass() gibt den Object-Typ zurück
		System.out.println(f1.getClass().getSimpleName()); 		// PKW
		
		// ClassCastException
		// Man kann nur den Referenz-Typen downcasten aber nicht den Object-Typen!
		Fahrzeug f3 = new Fahrzeug();
		// PKW f4 = (PKW)f3; 									// ClassCastException

	}

}
