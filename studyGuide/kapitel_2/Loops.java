package studyGuide.kapitel_2;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
		
		// Kopfgesteuerte
		
		int a = 10;
		while(a > 5) {
			System.out.print(a + " "); 				 				// 10 9 8 7 6
			a--;
		}
		
		System.out.println();
		
		// Fussgesteuerte (wird mindestens einmal durchlaufen)
		
		do {
			System.out.print(a); 									// 5
		} while(a > 1000);
		
		System.out.println();
		
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " "); 								// 0 1 2 3 4 5 6 7 8 9 
		}
		
		System.out.println();
		
		// enhanced for-Loop
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		
		for(int l : al) {
			System.out.print(l + " "); 								// 2 3 4
		}
		
		System.out.println();
		
		// forEach
		al.forEach((x) -> System.out.print(x + " ")); 				// 2 3 4
	}

}
