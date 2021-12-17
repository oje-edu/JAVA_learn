package uebungen._200_290_._290_ScheineUndMuenzen;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ScheineUndMuenzen {

	ArrayList<String> ergebnisse = new ArrayList<String>();

	public static void main(String[] args) {
		
	    /*
	    * Scheine und Münzen
	    *
	    * Gebe von einem Geldbetrag (in Euro und Cent) die nötigen
	    * Scheine und Münzen aus.
	    *
	    * In Euro existieren die folgenden Beträge:
	    + Münzen (in Cent): 1, 2, 5, 10, 20, 50
	    * Münzen und Noten (in Euro): 1, 2, 5, 10, 20, 50, 100, 200, 500
	    *
	    * Beispiele:
	    * System.out.println(betraege(53.26)); // 50.00, 2.00, 1.00, 0.20, 0.05, 0.01
	    * System.out.println(betraege(99.95)); // 50.00, 20.00, 20.00, 5.00,
	    * 									   // 2.00, 2.00, 0.50, 0.20, 0.20, 0.05
	    * 
	    */
		ScheineUndMuenzen b1 = new ScheineUndMuenzen();
		System.out.println(b1.betraege(53.26)); // [1x 50,00€, 1x 2,00€, 1x 1,00€, 1x 0,20€, 1x 0,05€, 1x 0,01€]

		ScheineUndMuenzen b2 = new ScheineUndMuenzen();
		System.out.println(b2.betraege(99.95)); // [1x 50,00€, 2x 20,00€, 1x 5,00€, 2x 2,00€, 1x 0,50€, 2x 0,20€, 1x 0,05€]
	}

	public ArrayList<String> getErgebnisse() {
		return getErgebnisse();
	}

	public void setErgebnisse(ArrayList<String> ergebnisse) {
		this.ergebnisse = ergebnisse;
	}

	ArrayList<String> betraege(Double b) {
		DecimalFormat df = new DecimalFormat("0.00");
		double[] euroArray = { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int betrag = (int) (b * 100);
		int i = 0;
		int count = 0;
		while (i < euroArray.length) {
			if (betrag >= euroArray[i]) {
				count++;
				betrag -= euroArray[i];
				if (betrag < euroArray[i]) {
					ergebnisse.add(count + "x " + df.format(euroArray[i++] / 100) + "€");
					count = 0;
				}
			} else {
				i++;
			}
		}
		return this.ergebnisse;
	}
}
