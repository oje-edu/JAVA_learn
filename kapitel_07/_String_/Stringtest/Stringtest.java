package kapitel_07._String_.Stringtest;

import javax.swing.JOptionPane;

public class Stringtest {

	public static void main(String[] args) {
		String vorname = JOptionPane.showInputDialog("Ihr Vorname:");
		String nachname = JOptionPane.showInputDialog("Ihr Nachname:");
		String altersangabe = JOptionPane.showInputDialog("Ihr Alter:");
		
		int alter = Integer.parseInt(altersangabe);
		String name = vorname + " " + nachname;
		
		System.out.println("Sie heißen " + name);
		System.out.println("Ihr Vorname besteht aus " + vorname.length() + " Zeichen");
		System.out.println("Ihr Nachname beginnt mit " + nachname.charAt(0));
		
		if ((alter - 18) >= 0) {
			System.out.println("Sie sind seit " + String.valueOf(alter - 18) + " Jahren volljährig!");
		} else {
			System.out.println("Sie werden in " + String.valueOf(18 - alter) + " Jahren volljährig!");
		}
		
		if (vorname.compareTo(nachname) < 0) {
			System.out.println("Ihr Vorname ist lexikalisch vor " + "dem Nachnamen einzusortieren!");
		} else {
			if (vorname.compareTo(nachname) > 0) {

				System.out.println("Ihr Vorname ist lexikalisch hinter dem Nachnamen einzusortieren!");
			} else {
				if (vorname.compareTo(nachname) == 0) {

					System.out.println("Ihr Vorname ist identisch mit dem Nachnamen!");
				}
			}
		}

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	}

}
