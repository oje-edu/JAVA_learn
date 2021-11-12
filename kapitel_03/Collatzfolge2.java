package kapitel_03;

import javax.swing.JOptionPane;

public class Collatzfolge2 {
    public static void main(String[] args) {

	String eingabe = JOptionPane
		.showInputDialog("Geben Sie die Startzahl für die Collatzfolge ein: ");
	int n = Integer.parseInt(eingabe);
	int anzahl = 1;
	int maximum = n;
	System.out.println(n);
	do {
	    if (n % 2 == 0)
		n /= 2;
	    else
		n = 3 * n + 1;
	    System.out.println(n);
	    anzahl++;
	    if (n > maximum) {
		maximum = n;
	    }
	} while (n != 1);
	anzahl--;
	System.out.println("Länge der Collatzfolge: " + anzahl);
	System.out.println("Maximum der Collatzfolge: " + maximum);
    }
}