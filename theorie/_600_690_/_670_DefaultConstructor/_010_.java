package theorie._600_690_._670_DefaultConstructor;

class Test  {}

public class _010_ {
	// Wenn eine Klasse (hier Test) keinen Konstruktor hat, 
	// wird automatisch vom Java-Compiler ein no-argument default contructor erzeugt.
	
	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t);  // Test@7a81197d
	}
}
