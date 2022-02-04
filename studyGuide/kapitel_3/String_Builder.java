package studyGuide.kapitel_3;

public class String_Builder {

	public static void main(String[] args) {

		// StringBuilder ist mutable (veränderbar)
		
		StringBuilder name = new StringBuilder("Peter");
		StringBuilder name2 = new StringBuilder("Peter");
		StringBuilder name3 = name;
		
		String lastname = new String("Hansen");
		
		// sobald bei String in Verbindung mit dem + Operator verwendet wird, handelt es sich um eine Verkettung.
		
		System.out.println((name + lastname).charAt(5)); 			// H
		System.out.println((name + lastname).length()); 			// 11
		System.out.println((name + lastname).indexOf('H')); 		// 5
		System.out.println((name + lastname).lastIndexOf('t')); 	// 2
		
		System.out.println((name + lastname).substring(2)); 		// terHansen
		
		// erster Wert inklusive zweiter Wert exclusive
		System.out.println((name + lastname).substring(2, 9)); 		// terHans
		
		System.out.println((name + lastname).toLowerCase()); 		// peterhansen
		System.out.println((name + lastname).toUpperCase()); 		// PETERHANSEN
		
		System.out.println(name == name2); 							// false (zwei unterschiedliche Objekte)
		System.out.println(name.equals(name3)); 					// true
		
		System.out.println(name.append('1'));  						// Peter1
		System.out.println(name.insert(1, '-')); 					// P-eter1
		System.out.println(name.delete(6, 7)); 						// P-eter
		
		System.out.println(name.toString()); 						// P-eter
		
	}

}
