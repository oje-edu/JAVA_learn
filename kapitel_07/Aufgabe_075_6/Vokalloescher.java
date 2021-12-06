package kapitel_07.Aufgabe_075_6;

import javax.swing.JOptionPane;

public class Vokalloescher {

	public static void main(String[] args) {
		/*
		Aufgabe 6

		Erstellen Sie ein Programm mit dem Namen Vokalloescher.
		Nachdem mit JOption- Pane.showInputDialog ein Text in einen String
		eingelesen worden ist, sollen alle Vokale aus dem String gelöscht werden.
		Zur Kontrolle soll anschließend der Stringinhalt mit
		JOptionPane.showMessageDialog ausgegeben werden.

		Hinweis:
		Sie sollten beachten, dass die Klasse String immutable ist.
		Denken Sie also daran, die eingelesene Zeichenkette zum Löschen
		der Vokale zunächst in ein Objekt der Klasse StringBuilder zu übertragen.
		*/
		
		String input = JOptionPane.showInputDialog("Bitte gib ein Wort ein: ").toLowerCase();
		String delete = "";
		
		for (int x = 0; x < input.length(); x++) {
			if (!(input.charAt(x) == 'a') && !(input.charAt(x) == 'e') && !(input.charAt(x) == 'u') && !(input.charAt(x) == 'i') && !(input.charAt(x) == 'o')) {
				delete = delete + input.charAt(x);
			}
		}
		JOptionPane.showInternalMessageDialog(null, delete);
	}

}
