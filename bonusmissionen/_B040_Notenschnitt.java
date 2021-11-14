package bonusmissionen;

import java.util.Random;

public class _B040_Notenschnitt {
	
    
    public static void main(String[] args) {

        /*
         * Notenschnitt
         *
         * Schreibe eine Methode, die 20 Zeugnisnoten (1.0 bis 6.0)
         * in Zehntelnoten (z.B. 4.3, 3.1, 5.6, ...) zufällig erzeugt.
         *
         * Verwende diese 20 Noten, um damit den relevanten Durchschnitt
         * nach folgendem Verfahren zu berechnen:
         *
         * - streiche die beste und die schlechteste Note
         * - ermittel den Durchschnitt der verbleibenden Zahlen
         * - runde auf die nächste halbe Note (1, 1.5, 2, ..., 4.5, 5, 5.5, 6)
         */
    	randomNote(20);
    }
    
    
    private static void randomNote(int anzahl) {
    	float max = 0;
    	float min = 100;
    	float sum = 0;
    	
    	System.out.println("Gewürfelte Noten: ");
		for (int i = 0; i < anzahl; i++) {
			Random r = new Random();
			int mini = 10;
			int maxi = 60; 
			int ra  = r.nextInt(maxi - mini) + mini;
			float fa = (float)ra / 10;
			sum += fa;
			if (fa < min) {
				min = fa;
			} else if (fa > max)  {
				max = fa;
			}
			switch((int)fa) {
			case 1:
				System.out.println("\t" + fa + " sehr gut");
				break;
			case 2:
				System.out.println("\t" + fa + " gut");
				break;
			case 3:
				System.out.println("\t" + fa + " befriedigend");
				break;
			case 4:
				System.out.println("\t" + fa + " ausreichend");
				break;
			case 5:
				System.out.println("\t" + fa + " mangelhaft");
				break;
			case 6:
				System.out.println("\t" + fa + " ungenügend");
				break;
			default:
				System.out.println("Fehler");
			} 
		}
		float erg = Math.round(sum - (max + min)) / 18;
		


		
		System.out.println();
		System.out.println("Streber: " +  "\t\t" + min);
		System.out.println("Ehren-Mann: " + "\t\t" + max);
		System.out.println("Summe aller Noten: " + "\t" + "~ " + (int)sum );
		System.out.println("Noten Ø: " + "\t\t" + "PI * Daumen = " + erg);
		System.out.println();
		System.out.println("\t-------HINWEIS-------");
		System.out.println("\t\t©2021 \n\t       André M.");
		System.out.println("\t---------------------");
		System.out.println("\nDanke dem o.g. Herrn für die Inspiration! Hammer geil!");
		System.out.println();
		System.out.println("\t---------------------");
		System.out.println();
		System.out.println("\tLetzte Aktualisierung: " + "14.11.2021 - 09:19:47 Uhr");
    }
}
