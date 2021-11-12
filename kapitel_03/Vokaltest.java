package kapitel_03;

import javax.swing.JOptionPane;

public class Vokaltest {
    public static void main(String[] args) {
	var istVokal = false;
	var eingabe = JOptionPane
		.showInputDialog("Geben Sie einen Buchstaben ein: ");
	var c = eingabe.charAt(0);
	if (c == 'a')
	    istVokal = true;
	else if (c == 'e')
	    istVokal = true;
	else if (c == 'i')
	    istVokal = true;
	else if (c == 'o')
	    istVokal = true;
	else if (c == 'u')
	    istVokal = true;
	else
	    istVokal = false;
	if (istVokal) {
	    JOptionPane.showMessageDialog(null, c + " ist ein Vokal!");
	} else {
	    JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
	}
    }

}