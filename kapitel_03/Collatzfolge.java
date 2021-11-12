package kapitel_03;

import javax.swing.JOptionPane;

public class Collatzfolge {
    public static void main(String[] args) {

	// Eingabedialog anzeigen
	String eingabe = JOptionPane
		.showInputDialog("Geben Sie die Startzahl für die Collatzfolge ein: ");
	int n = Integer.parseInt(eingabe);
	System.out.println(n);
	do {
	    if (n % 2 == 0)
		n /= 2;
	    else
		n = 3 * n + 1;
	    System.out.println(n);
	} while (n != 1);
    }
}