package kapitel_07.Aufgabe_075_5;

// import javax.swing.JOptionPane;

public class StringSort {
	/*
	 * Aufgabe 5
	 * 
	 * Erstellen Sie ein Programm mit dem Namen Stringsort. Das Programm soll
	 * mithilfe von JOptionPane.showInputDialog drei Eingaben einlesen und in drei
	 * Stringvariablen speichern. Anschließend sollen die drei Strings lexikalisch
	 * sortiert ausgegeben werden.
	 */
	
	public static void testCompare(String input1, String input2, String input3) {
		if ((input1.compareTo(input2) <= 0) && (input2.compareTo(input3) <= 0)) {
			System.out.println(input1);
			System.out.println(input2);
			System.out.println(input3);
		} else {
			if ((input1.compareTo(input3) <= 0) && (input3.compareTo(input2) <= 0)) {
				System.out.println(input1);
				System.out.println(input3);
				System.out.println(input2);
			} else {
				if ((input2.compareTo(input1) <= 0) && (input1.compareTo(input3) <= 0)) {
					System.out.println(input2);
					System.out.println(input1);
					System.out.println(input3);
				} else {
					if ((input2.compareTo(input3) <= 0) && (input3.compareTo(input1) <= 0)) {
						System.out.println(input2);
						System.out.println(input3);
						System.out.println(input1);
					} else {
						if ((input3.compareTo(input2) <= 0) && (input2.compareTo(input1) <= 0)) {
							System.out.println(input3);
							System.out.println(input2);
							System.out.println(input1);
						} else {
							System.out.println(input3);
							System.out.println(input1);
							System.out.println(input2);
						}
					}
				}
			}
			
		}
	}
	public static void main(String[] args) {
		testCompare("a", "b", "c");
		System.out.println();
		testCompare("a", "c", "b");
		System.out.println();
		testCompare("b", "a", "c");
		System.out.println();
		testCompare("b", "c", "a");
		System.out.println();
		testCompare("c", "a", "b");
		System.out.println();
		testCompare("c", "b", "a");
		
	}
}
