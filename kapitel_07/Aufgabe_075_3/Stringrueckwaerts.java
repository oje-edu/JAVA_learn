package kapitel_07.Aufgabe_075_3;

// import javax.swing.JOptionPane;

public class Stringrueckwaerts {
	/*
	Aufgabe 3

	Erstellen Sie das Programm Stringrueckwaerts,
	das mit JOptionPane.showInputDialog einen Text einliest
	und diesen dann in der Konsole rückwärts ausgibt.
	*/
	public static void main(String[] args) {
		// String input = JOptionPane.showInputDialog("Bitte gib ein Wort ein: ");
		String input = "Hallo Deutscheland";
		String reverse = "";
		char ch;
		System.out.println("Dein Wort: " + input);
		
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println("Das Wort rückwärts: " + reverse);
	}
}
