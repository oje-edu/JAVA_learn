package theorie._500_590;

public class _570_instanceof {

	public static void main(String[] args) {
		
		// instanceof-Operator
		
		Tiger t1 = new Tiger();
		
		System.out.println(t1 instanceof Tiger);                   		// true
		System.out.println(t1 instanceof Raubtier);						// true
		System.out.println(t1 instanceof Saeugetier);					// true
		
		// Vorfahrenklasse als Dastentyp angeben
		Raubtier t2 = new Tiger();
		Saeugetier t3 = new Tiger();
		
		System.out.println(t2 instanceof Tiger); 						// true
		System.out.println(t3 instanceof Tiger); 						// true
		
		// Tiger t4 = new Raubtier(); // Type mismatch: cannot convert from Raubtier to Tiger
		
		// Wrapper Klassen
		Double d1 = 4.6;
		System.out.println(d1 instanceof Double); 						// true
		
		// primitiver Datentyp muss in ein Object gecastet werden
		double d2 = 1.23;
		System.out.println((Object)d2 instanceof Double);  				// true
		
		int i1 = 1;
		System.out.println((Object)i1 instanceof Double);  				// false
		System.out.println((Object)i1 instanceof Object);  				// immer true
		
		// getClass(), getClass().getSimpleName()
		System.out.println(((Object)i1).getClass()); 					// class java.lang.Integer
		System.out.println(((Object)i1).getClass().getSimpleName());    // Integer
	}
}

class Saeugetier {
	
}

class Raubtier extends Saeugetier {
	
}

class Tiger extends Raubtier {
	
}
