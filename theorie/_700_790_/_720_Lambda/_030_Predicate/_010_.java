package theorie._700_790_._720_Lambda._030_Predicate;

import java.util.function.Predicate;

public class _010_ {

	public static void main(String[] args) {
		
		// Predicate
		// Wird von Java zur Verfügung gestellt
		// Ein spezielles funktionales Interface, das etwas testet.
		// Es übernimmt einen Wert und liefert true oder false zurück.
		
		Predicate<Integer> pre1 = i -> i < 0;
		// Die Parameter-Klammern dürfen entfallen, wenn es genau einen Parameter gibt:
		Predicate<Integer> pre2 = (i) -> i < 0;
		// Die geschweiften Klammern können entfallen, wenn es nur einen Ausdruck.
		// Bei geschweiften Klammern braucht man return und ein Semikolon.
		Predicate<Integer> pre3 = (i) -> {return i < 0;};
		// Der Datentyp der Parameter kann angegeben werden, muss aber nicht.
		// Dann braucht man in jedem Fall die runden Klammern (auch bei nur einem Parameter):
		Predicate<Integer> pre4 = (Integer i) -> i < 0;
		System.out.println(pre1.test(-1));   									// true
		System.out.println(pre2.test(1)); 										// false
		System.out.println(pre3.test(0)); 										// false
		System.out.println(pre4.test(-1)); 										// true
		
		// Funktionen, die ein Predicate als Parameter übernehmen
		System.out.println(checkInt(10, i -> i % 2 == 0)); 						// true
		System.out.println(checkInt(5, i -> i % 2 == 0)); 						// true
		
		System.out.println(checkString("Hello", s -> s.startsWith("H"))); 		// true
		
		// Generisch
		System.out.println(checkGeneric(5, i -> i % 2 == 0)); 					// false
		System.out.println(checkGeneric("Hello", s -> s.startsWith("H")));		// true

	}
	
	static boolean checkInt(Integer i, Predicate<Integer> lambda) {
		return lambda.test(i);
	}
	
	static boolean checkString(String s, Predicate<String> lambda) {
		return lambda.test(s);
	}
	
	static <T> boolean checkGeneric(T g, Predicate<T> lambda) {
		return lambda.test(g);
	}

}
