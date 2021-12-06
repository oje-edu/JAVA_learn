package kapitel_07.Aufgabe_075_2;

import javax.swing.JOptionPane;

public class Vokalzaehler2 {
	/*
	Aufgabe 2

	Für diese Aufgabe erstellen Sie als Programm Vokalzaehler2
	das Programm aus Aufgabe 1 so,
	dass auch die als Großbuchstaben vorkommenden Vokale gezählt werden.

	Hinweis:
	Erstellen Sie dazu eine Kopie der Eingabe,
	die Sie in Kleinbuchstaben umwandeln.
	*/

	public static void main(String[] args) {
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

		String input = JOptionPane.showInputDialog("Geben Deinen Namen ein: ");
		String lower = input.toLowerCase();
		System.out.println(lower);
		for (int i = 0; i <lower.length(); i++) {
			switch (lower.charAt(i)) {
			// check Chars
			case 'a':
				countA++;
				break;
			case 'e':
				countE++;
				break;
			case 'i':
				countI++;
				break;
			case 'o':
				countO++;
				break;
			case 'u':
				countU++;
				break;
			}
		}
		System.out.println("Deine Name: " + input + " enthält:" );
		System.out.println();
		System.out.println("\t" + countA + "x a ");
		System.out.println("\t" + countE + "x e ");
		System.out.println("\t" + countI + "x i ");
		System.out.println("\t" + countO + "x o ");
		System.out.println("\t" + countU + "x u ");
		System.out.println();
		System.out.println("Na, wer hätte das gedacht :-)");
	}

}
