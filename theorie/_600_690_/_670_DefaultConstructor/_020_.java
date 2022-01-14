package theorie._600_690_._670_DefaultConstructor;

class Test2  {
	Test2() {
		System.out.println("Test2");
	}
}

public class _020_ {
	// Wenn ein Konstruktor vorhanden ist, wird nichts vom Java-Compiler erzeugt.
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();  // Test2
		System.out.println(t);  // Test@7a81197d
	}
}
