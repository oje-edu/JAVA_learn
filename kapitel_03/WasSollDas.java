package kapitel_03;

import javax.swing.JOptionPane;

public class WasSollDas {

    public static void main(String[] args) {

	String eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl für m ein: ");
	int m = Integer.parseInt(eingabe);
	eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl für n ein: ");
	int n = Integer.parseInt(eingabe);
	
        System.out.println("m: " + m + " n: " + n);

	while (m != n) {
	    if (m > n) {
		m = m - n;
	    } else {
		n = n - m;
	    }
            System.out.println("m: " + m + " n: " + n);
	}
	System.out.println("m = " + m);
    }
}
