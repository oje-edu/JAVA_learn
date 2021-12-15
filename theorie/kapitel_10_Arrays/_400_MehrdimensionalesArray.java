package theorie.kapitel_10_Arrays;

public class _400_MehrdimensionalesArray {
	
	// Multi- / Mehrdimensionales Array

	public static void main(String[] args) {
		
		int[][] zahlen = new int[2][3];
		zahlen[0][0] = 1;
		zahlen[0][1] = 2;
		zahlen[0][2] = 3;
		
		zahlen[1][0] = 4;
		zahlen[1][1] = 5;
		zahlen[1][2] = 6;
		
		System.out.println(zahlen[1][1]); 					 // 5
		
		// Array-Literal
		int[][] zahlen2 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		System.out.println(zahlen2[1][1]);  				// 5
		
		System.out.println(zahlen);  						// [[I@36baf30c
		
		for (int i = 0; i < zahlen.length; i++) {
			for (int j = 0; j < zahlen[0].length; j++) {
				System.out.print(zahlen[i][j] + " ");  		// 1 2 3 4 5 6 
			}
		}
		System.out.println();
		
		for (int[] zahl : zahlen) {
			for (int z : zahl) {
				System.out.print(z + " ");  				// 1 2 3 4 5 6 
			}
		}
		System.out.println();
		
		// Unterschiedliche Array-Längen auf zweiter Ebene
		// Array-Literal
		int[][] zahlen3 = {
				{1, 2, 3},
				{4},
				{5, 6}
		};
		System.out.println(zahlen3[2][1]);  				// 6 (index 3 aussen - index 2 innen)
		
		int[][] zahlen4 = new int[3][4];
		zahlen4[0] = new int[3];
		zahlen4[1] = new int[1];
		zahlen4[2] = new int[2];
		zahlen4[0][0] = 1;
		zahlen4[0][1] = 2;
		zahlen4[0][2] = 3;
		zahlen4[1][0] = 4;
		zahlen4[2][0] = 5;
		zahlen4[2][1] = 6;
		
		for (int[] zahl : zahlen4) {
			for (int z : zahl) {
				System.out.print(z + " ");  				// 1 2 3 4 5 6 
			}
		}
		System.out.println();
		
	}

}
