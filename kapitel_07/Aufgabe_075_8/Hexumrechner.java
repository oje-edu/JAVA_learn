package kapitel_07.Aufgabe_075_8;

// import javax.swing.JOptionPane;

public class Hexumrechner {

	public static void main(String[] args) {
		/*
		Aufgabe 8

		Erstellen Sie ein Programm mit dem Namen Hexumrechner.
		Nach der Eingabe einer Hexadezimalzahl in einem JOptionPane.showInputDialog
		soll das Programm mit JOptionPane.showMessageDialog die Zahl als Dezimalzahl
		und als Dualzahl ausgeben.
		*/
		
		// String input = JOptionPane.showInputDialog("Bitte gebe eine Hexadezimal Zahl ein: ");
		testDeci("badbabea9ed18");
	}
	
	public static void testDeci(String input) {
		long deci = Long.valueOf(input, 16);
		String dual = Long.toBinaryString(Long.valueOf(deci));
		
		
		String output = "Hexadezimal: " + input + "\n"
						+ "Dezimal: " + deci + "\n" 
						+ "Dual: " + dual;
		
		
		// JOptionPane.showMessageDialog(null, output);
		System.out.println(output);
	}
}
