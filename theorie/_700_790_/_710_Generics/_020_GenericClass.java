package theorie._700_790_._710_Generics;


class GenericDemo<T> {
	public T data;
}

public class _020_GenericClass {

	public static void main(String[] args) {
		
		// Generic class
		// Eine Klasse parametrisieren (parameterize a class)
		// Einer Klasse den Umgang mit generischen Typen ermöglichen.
		
		GenericDemo<String> strDemo = new GenericDemo<>();
		strDemo.data = "Peter";
		
		GenericDemo<Integer> intDemo = new GenericDemo<>();
		intDemo.data = 42;

	}

}
