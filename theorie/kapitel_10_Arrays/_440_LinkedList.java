package theorie.kapitel_10_Arrays;

import java.util.LinkedList;

public class _440_LinkedList {

	public static void main(String[] args) {
		
		// LinkedList
		// Zwischen ArrayList und Stack
		// Einfügen und löschen eines Elementes geht sehr schnell
		// das Auffinden eines bestimmten Elements ist Zeitaufwenig.
		
		LinkedList<Integer> lli = new LinkedList<>();
		
		System.out.println(lli);  						// []
		
		// isEmpty(
		System.out.println(lli.isEmpty()); 				// true
		
		// boolean add(E e)
		lli.add(7);
		lli.add(17);
		lli.add(27);
		System.out.println(lli.add(37)); 				// true
		System.out.println(lli); 						// [7, 17, 27, 37]
		
		// E get(int index)
		// Indexierung wie bei Array/ArrayList
		System.out.println(lli.get(2));  				// 27
		
		// E removeLast()
		System.out.println(lli.removeLast());  			// 37
		System.out.println(lli);  						// [7, 17, 27]
		
		// E removeFirst()
		System.out.println(lli.removeFirst());  		// 7
		System.out.println(lli);  						// [17, 27]
	}
}
