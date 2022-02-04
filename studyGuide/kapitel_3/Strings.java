package studyGuide.kapitel_3;

public class Strings {

	public static void main(String[] args) {

		// String ist immutable (unveränderbar)
		// "Peter" ist ein literal
		
		String name = "Peter";
		String name2 = new String("Peter");
		
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
		System.out.println(name.equals(name2)); 					// true
		System.out.println(name.equalsIgnoreCase(name2));			// true
		
		System.out.println(name.startsWith("Pe")); 					// true
		System.out.println(name.endsWith("er")); 					// true
		System.out.println(name.contains("te"));					// true
		
		System.out.println(name.replace("te", "-"));				// Pe-r
		System.out.println(name.replaceAll("te", "-")); 			// Pe-r

	}

}
