package kapitel_03;

import javax.swing.JOptionPane;

public class ggTEuklid {

    public static void main(String[] args) {

	String eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl f�r m ein: ");
	int m = Integer.parseInt(eingabe);
	// System.out.println("m = " + m);
	eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl f�r n ein: ");
	int n = Integer.parseInt(eingabe);
	// System.out.println("n = " + n);
	int r = m % n;
	System.out.println("m: " + m + " n: " + n + " r: " + r);

	while (r > 0) {
	    m = n;
	    n = r;
	    r = m % n;
	    System.out.println("m: " + m + " n: " + n + " r: " + r);
	}
	System.out.println("ggT = " + n);
    }

}
