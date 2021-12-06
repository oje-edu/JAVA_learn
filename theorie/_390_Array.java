package theorie;

public class _390_Array {
	

	public static void main(String[] args) {
		
		// Es darf nur eine Datentyp-Art im Array sein.
		// Die Länge von Arrays ist nicht veränderbar.
		// Arrays sind null-basiert
		
		// Ein Array wird mit den Standard-Werten des Datentypes initialisiert.
		
		int[] values1;
		values1 = new int[3];
		
		
		int[] values2 = new int[3];
		values2[0] = 11;
		
		// Weniger verbreitete Variante
		int values3[] = new int[3];
		values3[0] = 13;
		
		System.out.println(values1); // [I@36baf30c
		
		// Array befüllen
		values1[0] = 7;
		values1[1] = 17;
		values1[2] = 27;
		
		// ArrayIndexOutOfBoundsException
		// System.out.println(values1[3]);  // Index 3 out of bounds for length 3
		
		// Array hat Eigenschaft length - nicht die Methode ()
		System.out.println(values1.length); // 3
		for (int i = 0; i < values1.length; i++) {
			System.out.print(values1[i] + " "); // 7 17 27
		}
		
		System.out.println();
		
		// Array-Literal (Literal = Hardcodiert)
		// Schreibweise, wenn man die Werte schon weiss.
		// Auch hier ist die Länge festgelegt worden.
		double[] b = new double[] {1.0, 2.0, 3.0};
		System.out.println(b[0]); // 1.0
		
		String[] namen = {"Peter", "Paul", "Mary"};
		System.out.println(namen); // [Ljava.lang.String;@7a81197d
		
		// foreach Variante von der for-Schleife
		// Nur lesend, da nicht wie bei for der index zur Verfügung steht.
		for (String name : namen) {
			System.out.print(name + " "); // Peter Paul Mary 
		}
		System.out.println();
	}
}
