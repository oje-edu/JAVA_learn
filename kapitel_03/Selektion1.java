package kapitel_03;

import javax.swing.JOptionPane;

public class Selektion1 {
    public static void main(String[] args) {
	String eingabe = JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: ");
	int alter = Integer.parseInt(eingabe);
	if (alter < 18) {
	    JOptionPane
		    .showMessageDialog(null, "Sorry, noch nicht vollj�hrig!");
	} else {
	    JOptionPane.showMessageDialog(null,
		    "Gl�ckwunsch! Sie sind vollj�hrig!");
	}

    }
}