package studyGuide.kapitel_3;


public class ContainerKlassen_MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int[][] zahlenInZahlen;
		
		zahlenInZahlen = new int[3][2];
		
		zahlenInZahlen[0][0] = 1;
		
		System.out.println(zahlenInZahlen[1][1]); 								// 0
		System.out.println(zahlenInZahlen[0][0]); 								// 1


		int[][] multiValues = new int[][] {{0,1,2}, {3,4,5}, {6,7,8}, {9}};
		
		System.out.println(multiValues[1][2]);  								// 5
		// System.out.println(multiValues[3][1]); 								// java.lang.ArrayIndexOutOfBoundsException:
		
	}

}
