package studyGuide.kapitel_3;

import java.util.ArrayList;

public class ContainerKlassen_ArrayList {
	
	public static void main(String[] args) {

		// generische Datentypen <> - keine primitiven Datentypen sondern nur WrapperKlassen (Referenz)
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		ArrayList<Integer> arr3 = arr1;
		
		arr1.add(2);
		arr1.add(20);
		
		arr2.add(2);
		arr2.add(20);
		
		System.out.println(arr1);   						// [2, 20]
		
		System.out.println(arr1.equals(arr2)); 				// true
		System.out.println(arr1.equals(arr3)); 				// true
		System.out.println(arr1 == arr2);					// false
		System.out.println(arr1 == arr3);					// true
		
		for(int i = 0; i < 10; i++) {
			arr1.add(i);
		}
		
		System.out.println(arr1); 							// [2, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(arr3); 							// [2, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		// ANZAHL ( size() )
		System.out.println(arr1.size()); 					// 20
		
		
		arr1.remove(0);										
		System.out.println(arr1);							// [20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(arr1.get(0)); 					// 20
		
		arr1.set(0, 0);
		System.out.println(arr1); 							// [0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		System.out.println(arr1.contains(9));   			// true
		
		arr1.forEach(x -> System.out.print(x + " "));       // 0 0 1 2 3 4 5 6 7 8 9 
		System.out.println();
		
		System.out.println(arr1.isEmpty()); 				// false
		arr1.clear();
		System.out.println(arr1); 							// []
		
	}

}
