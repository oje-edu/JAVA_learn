package theorie.kapitel_10_Arrays;

import java.util.TreeSet;

public class _460_TreeSet {

	public static void main(String[] args) {
		
		// TreeSet
		// Wird sortiert eingefügt
		// Die Objekte der Klassen muessen einsortiert werden koennen
		
		TreeSet<String> ts = new TreeSet<>();
		
		// add()
		ts.add("Peter");
		ts.add("Paul");
		ts.add("Mary");
		System.out.println(ts);  				// [Mary, Paul, Peter]
		
		// forEach() mit Methodenreferenz
		ts.forEach(System.out::print);

	}

}
