package theorie._700_790_._730_Polymorphism;

// Polymorphismus - Vielgestalt

class Person {
	static void printStatic() {
		System.out.println("static in Person");
	}
	
	void printObject() {
		System.out.println("object in Person");
	}
}

class Kunde extends Person {
	static void printStatic() {
		System.out.println("static in Kunde");
	}
	@Override
	void printObject() {
		System.out.println("object in Kunde");
	}
}

public class _010_ {

	public static void main(String[] args) {
		
		
		// Referenz-Typ Person - Object-Typ Person
		Person p1 = new Person();
		// Referenz-Typ Person - Object-Typ Kunde
		Person p2 = new Kunde();
		
		// Beim Kompilieren werden die statischen Methoden des Referenz-Typ gebunden.
		p1.printStatic(); 						// static in Person	                    
		p2.printStatic(); 						// static in Person
		
		// In der Runtime werden die Object-Methoden des Object-Typ  ausgeführt
		p1.printObject(); 						// object in Person
		p2.printObject(); 						// object in Kunde
		
		Kunde k1 = new Kunde();
		k1.printStatic(); 						// static in Kunde
		k1.printObject(); 						// object in Kunde

		// Objekt ist gleich - Referenz-Typ bleibt unterschiedlich
		Person m = new Kunde();
		Kunde n = (Kunde) m;
		m.printStatic();  						// static in Person
		n.printStatic();  						// static in Kunde
		System.out.println(m);  				// Kunde@246b179d
		System.out.println(n);  				// Kunde@246b179d
		
	}

}
