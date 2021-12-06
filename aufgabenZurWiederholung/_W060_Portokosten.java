package aufgabenZurWiederholung;

import java.text.DecimalFormat;

public class _W060_Portokosten {
	static double price, delivery;
	

    public static void main(String[] args) {
        /*
         * Portokosten
         *
         * Die Portokosten sind wie folgt festgelegt:
         *  0 - 39.99€ Bestellwert kosten 3.99€ Porto
         * 40 - 69.99€ Bestellwert kosten 2.99€ Porto
         * 70 - 99.99€ Bestellwert kosten 1.99€ Porto
         * ab 100€ ist portofrei
         *
         * Es soll eine Zufallszahl ($bestellwert)
         * von 1.00 - 130.00 erzeugt werden (z.B. 40.47, 123.78)
         * Dann soll ermittelt werden,
         * wie hoch die entsprechenden Portokosten sind.
         * Am Ende sollen der Bestellwert,
         * die Portokosten und der Gesamtbetrag
         * ausgegeben werden:
         * "Bei einem Bestellwert von 67,54 € betragen die
         *  Portokosten 2,99 €. Der Gesamtbetrag beträgt somit 70,53 €."
         */
    	DecimalFormat f = new DecimalFormat("#.00");
    	price = Math.random() * 130 + 1;
    	
    	if (price <= 39.99) {
    		delivery = 3.99;
    	} else if (price >= 40.00 && price <= 69.99) {
    		delivery = 2.99;
    	} else if (price >= 70.00 && price <= 99.99) {
    		delivery = 1.99;
    	} else if (price >= 100.00) {
    		delivery = 0.00;
    	} else {
    		System.out.println("Oops, something went terrible wrong");
    	}
    	System.out.println("Bestellwert: " + f.format(price) + "€" + "\n\tPorto: " + delivery + "€" + "\n\nGesamtbetrag: " + f.format(price+delivery) + "€");
    }
}
