package theorie._600_690_;

import java.util.ArrayList;
import java.util.stream.Stream;

public class _610_Stream {
	
	// Stream (Seit Java 8) 

	public static void main(String[] args) {

		ArrayList<Integer> zahlen = new ArrayList<>();
		zahlen.add(7);
		zahlen.add(11);
		zahlen.add(19);
		zahlen.add(23);
		zahlen.add(42);
		
		Stream<Integer> zahlenStream = zahlen.stream();
		
		// filter()
		zahlenStream = zahlenStream.filter(i -> i > 15);
		zahlenStream.forEach(i -> System.out.print(i + " ")); 											// 19 23 42 
		System.out.println();
		
		// darf nicht doppelt verwendet werden
		// zahlenStream.forEach(i -> System.out.print(i + " "));										// stream has already been operated upon or closed
		
		// Als einzeiler
		zahlen.stream().filter(i -> i > 15).forEach(i -> System.out.print(i + " "));      				// 19 23 42
		System.out.println();
		
		// map()
		zahlen.stream().map(i -> i * i).forEach(i -> System.out.print(i + " "));
		System.out.println();   																		// 49 121 361 529 1764
		
		// filter() & map()
		zahlen.stream().filter(i -> i > 15).map(i -> i * i).forEach(i -> System.out.print(i + " "));	// 361 529 1764
		System.out.println();
		
	}

}
