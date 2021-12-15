package kapitel_07.Aufgabe_075_7;

import javax.swing.JOptionPane;

public class Zahlensysteme {

	public static void main(String[] args) {
		/*
		 * Aufgabe 7
		 * 
		 * Erstellen Sie das Programm Zahlensysteme. Lesen Sie mit
		 * JOptionPane.showInputDialog eine ganze Zahl ein, und geben Sie diese
		 * anschließend mit JOptionPane.showMessageDialog untereinander (Zeilenumbrüche
		 * können Sie als "\n" eintragen) als Dezimal-, Dual- und Hexadezimalzahl aus.
		 * Bei der hexadezimalen Schreibweise sollen die Großbuchstaben verwendet
		 * werden.
		 */
		
		// String input = JOptionPane.showInputDialog("Bitte gebe eine ganze Zahl ein: ");
		String input = "182";
		int number = Integer.parseInt(input);
		
		String binary = Integer.toBinaryString(number);
		String hexa = Integer.toHexString(number).toUpperCase();
		String oct = Integer.toOctalString(number);
		
		String output = "Dezimal: " + number + "\n" 
						+ "Binär: " + binary + "\n" 
						+ "Hexadezimal: " + hexa + "\n"
						+ "Octal: " + oct;
		
		JOptionPane.showMessageDialog(null, output);
	}
}
