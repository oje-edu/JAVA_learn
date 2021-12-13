package theorie.kapitel_10_Arrays;

import java.util.List;
import java.util.Stack;

@SuppressWarnings("unused")
public class _430_Stack {

	public static void main(String[] args) {
		
		// Stack (LIFO Last In First Out)
		Stack<Integer> sta = new Stack<>();
		// List<Integer> sta = new Stack<>();
		
		System.out.println(sta); 				// []
		
		// boolean empty()
		System.out.println(sta.isEmpty()); 		// true
		
		// E push (E e)
		sta.push(7);
		sta.push(11);
		sta.push(23);
		System.out.println(sta.push(42));		// 42
		System.out.println(sta); 				// [7, 11, 23, 42]
		
		// E peak()
		System.out.println(sta.peek()); 		// 42
		
		// E pop()
		System.out.println(sta.pop()); 			// 42
		System.out.println(sta); 				// [7, 11, 23]
		
		// int search(Object o)
		// Das wievielte Element von oben
		System.out.println(sta.search(7));  	// 3 (zählt von oben / hinten)
		

	}

}
