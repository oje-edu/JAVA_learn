package kapitel_02;

import javax.swing.JOptionPane;
	
public class Kreisberechnung4JOptionPane {
    public static void main(String[] args) {
	String eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
	double radius = Double.parseDouble(eingabe);
	eingabe = JOptionPane.showInputDialog(
                            "Geben Sie die Einheit ein: ");
	String einheit = eingabe;
	double umfang = 2.0 * 3.1415926 * radius;
	double flaeche = 3.1415926 * radius * radius;
	JOptionPane.showMessageDialog(
                  null,"Umfang: " + umfang + " "
                  + einheit + "\nFläche: " + flaeche + " "
                  + einheit + '\u00b2');
    }
}
