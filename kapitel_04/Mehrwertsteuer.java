package kapitel_04;

import javax.swing.JOptionPane;

public class Mehrwertsteuer {

    public static void main(String[] args) {

	double mwstsatz = 19;
	int betrag = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie den Rechnungsbetrag ein: "));
	System.out.println("Betrag: " + betrag);
	System.out.println("Schritt 1: " + (mwstsatz/100));
	System.out.println("Schritt 2: " + (mwstsatz/100*betrag));
	double mwst = mwstsatz / 100 * betrag;
	System.out.println("Mehrwertsteuer: " + mwst + " €");
    }

}
