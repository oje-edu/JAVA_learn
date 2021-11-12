package kapitel_03;

import javax.swing.JOptionPane;

public class LoesungenQuadratischeGleichung {

    public static void main(String[] args) {
	var a = Double.parseDouble(JOptionPane.showInputDialog("ax" + '\u00b2'
		+ " + bx + c; Geben Sie den Koeffizienten a ein:"));
	var b = Double.parseDouble(JOptionPane.showInputDialog("ax" + '\u00b2'
		+ " + bx + c; Geben Sie den Koeffizienten b ein:"));
	var c = Double.parseDouble(JOptionPane.showInputDialog("ax" + '\u00b2'
		+ " + bx + c; Geben Sie den Koeffizienten c ein:"));
	var d = b * b - 4 * a * c;
	if (d < 0) {
	    JOptionPane.showMessageDialog(null,
		    "Die Gleichung hat keine Lösung!");
	} else {
	    if (d > 0) {
		JOptionPane.showMessageDialog(null,
			"Die Gleichung hat zwei Lösungen!");
	    } else {
		JOptionPane.showMessageDialog(null,
			"Die Gleichung hat eine Lösung!");
	    }
	}
    }

}
