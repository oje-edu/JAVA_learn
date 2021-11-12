package theorie;

public class _186_DefaultParameter {
	
	// Default Parameter für Funktionen in Python: def f(x, y=1)
	// Default Parameter durch Überladung (Overloading)
	
	static int addiere(int x) {
		return addiere(x, 1);
	}
	
	static int addiere(int x, int y) {
		return x + y;
	}
	

	
	public static void main(String[] args) {
		
		System.out.println(addiere(3, 4));  // 7
		System.out.println(addiere(3));     // 4
	}

}
