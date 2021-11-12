package kapitel_03;

import javax.swing.JOptionPane;

public class VokaltestSwitchCase {
    public static void main(String[] args) {
	String eingabe = JOptionPane
		.showInputDialog("Geben Sie einen Buchstaben ein: ");
	char c = eingabe.charAt(0);
	switch (c) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	    JOptionPane.showMessageDialog(null, c + " ist ein Vokal!");
	    break;
	default:
	    JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
	}
    }
}