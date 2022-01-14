package theorie._600_690_._670_DefaultConstructor;

class Test3  {
	
	Test3() {}
	Test3(int x, int y) {
		System.out.println("Test3");
	}
}

public class _030_ extends Test3{
	// Wenn ein Konstruktor keinen super() Aufruf hat, 
	// baut Java einen parameterlosen super()- Aufruf ein.
	
	// 1. Selber einen stimmigen super()-Aufruf einbauen.
	// 2. den parameterlosen Konstruktor einbauen
	
	_030_(int x, int y) {
		// super(x, y);
		
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		_030_ x = new _030_(23,25);

	}
}
