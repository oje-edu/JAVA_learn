package theorie._700_790_._720_Lambda._020_FunctionalInterface;

// Funktionales Interface
// Muss genau eine abstracte Methode haben

// Das Schlüsselwort abstract ist in Interfaces der Default-Modifier

@FunctionalInterface
interface Moveable {
	// abstract int move(int distance);
	int move(int distance);
}

class Person {
	static int MIN_DISTANCE = 5;
}

public class _010_Moveable {
	public static void main(String[] args) {
		// Die move() Methode 
		// Moveable moveable = x -> Person.MIN_DISTANCE + x;
		// Die runden Klammern um den Parameter können bei genau einem Parameter wegfallen:
		// Moveable moveable = (x) -> Person.MIN_DISTANCE + x;
		// Bei geschweiften Klammer braucht man auch das return und das abschließende Semikolon:
		Moveable moveable = (x) -> { return Person.MIN_DISTANCE + x; };
		
		System.out.println(moveable.move(20));  // 25
	}
}
