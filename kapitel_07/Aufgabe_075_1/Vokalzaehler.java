package kapitel_07.Aufgabe_075_1;

import javax.swing.JOptionPane;

public class Vokalzaehler {
	/*
	 * Aufgabe 1
	 * 
	 * Erstellen Sie im Projekt JavaUebung07 im Package de.habelitz.uebung07 ein
	 * Programm mit dem Namen Vokalzaehler, das mit JOptionPane.showInputDialog
	 * einen String einliest. Das Programm soll anschließend überprüfen, wie oft in
	 * dem String die Vokale a, e, i, o und u vorkommen, und das Ergebnis in der
	 * Konsole ausgeben.
	 */

	public static void main(String[] args) {
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

		String input = JOptionPane.showInputDialog("Geben Deinen Namen ein: ").toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
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
