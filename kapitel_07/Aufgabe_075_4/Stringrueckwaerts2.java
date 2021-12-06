package kapitel_07.Aufgabe_075_4;

import javax.swing.JOptionPane;

public class Stringrueckwaerts2 {
	/*
	 * Aufgabe 4
	 * 
	 * Erstellen Sie das Programm aus Aufgabe 3 noch einmal, diesmal unter dem Namen
	 * Stringrueckwaerts2 und mit dem Unterschied, dass Sie für die Ausgabe nicht
	 * die Konsole, sondern JOptionPane.showMessageDialog verwenden.
	 * 
	 * Hinweis: Legen Sie den Eingabetext rückwärts zuerst in einer zusätzlichen
	 * Variablen ab, und geben Sie diesen dann mit showMessageDialog aus.
	 */
	public static void main(String[] args) {

		// String input = JOptionPane.showInputDialog("Bitte gib ein Wort ein: ");
		String input = "Hallo Deutscheland";
		String reverse = "";
		char ch;
		// System.out.println("Dein Wort: " + input);

		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			reverse = ch + reverse;
		}
		JOptionPane.showMessageDialog(null, reverse);
	}
}
