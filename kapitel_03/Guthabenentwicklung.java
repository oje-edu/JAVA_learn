package kapitel_03;

import javax.swing.JOptionPane;

public class Guthabenentwicklung {

    public static void main(String[] args) {

	double guthaben = Double.parseDouble(JOptionPane
		.showInputDialog("Geben Sie das Startguthaben ein: "));
	double zinssatz = Double.parseDouble(JOptionPane
		.showInputDialog("Geben Sie den Zinssatz ein: "));
	
	for (var i = 1; i <= 10; i++) {
	    guthaben = guthaben * (1 + zinssatz / 100);
	    System.out.println("Guthaben nach " + i + " Jahren: " + guthaben
		    + " Euro");
	}
	
    }

}
