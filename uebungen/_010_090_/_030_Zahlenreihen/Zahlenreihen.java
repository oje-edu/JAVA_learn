package uebungen._010_090_._030_Zahlenreihen;

public class Zahlenreihen {

    public static void main(String[] args) {

        /* 1.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 100 90 80 70 60 50 40 30 20 10
         */
    	int start = 100;
    	int count = 10;
    	
    	System.out.print(start + " ");
    	for (int i = 1; i < 10; i++) {
    		// System.out.print(start = start - count);
			start = start - count;
    		// System.out.print(" ");
			System.out.print(start + " ");
    	}
    	System.out.println();


        /* 2.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 2000 3000 4000 5000 6000
         */
    	int start2 = 2000;
    	int count2 = 1000;

    	System.out.print(start2 + " ");
    	for (int i = 1; i < 5; i++) {
    		System.out.print(start2 = start2 + count2);
    		System.out.print(" ");    		
    	}
    	System.out.println();
    			

        /* 3.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 2.0 1.5 1.0 0.5 0.0 -0.5 -1.0
         */
    	double start3 = 2.0D;
    	double count3 = .5D;
    	
    	System.out.print(start3 + " ");
    	for (int i = 1; i < 7; i++) {
    		System.out.print(start3 = start3 - count3);
    		System.out.print(" ");    		
    	}
    	System.out.println();

        /* 4.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 1.0 2.2 3.4 4.6 5.8 7.0 8.2 9.4
         */
    	float start4 = 1F;
    	float count4 = 1.2F;
    	
    	System.out.print(start4 + " ");
    	for (int i = 1; i < 8; i++) {
    		System.out.print(start4 = start4 + count4);
    		System.out.print(" "); 
		}
    	System.out.println();

        /* 5.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * Z5 Z7 Z9 Z11 Z13
         */
    	int start5 = 5;
    	int count5 = 2;
    	System.out.print("Z" + start5 + " ");
    	for (int i = 1; i < 5; i++) {
    		System.out.print("Z" + (start5 = start5 + count5));
    		System.out.print(" "); 
    	}
    	System.out.println();


        /* 6.
         * Schreibe ein Programm, das per for-Schleife
         * alle Zahlen von 1 bis 20 addiert
         * und danach das Endergebnis ausgibt.
         */
    	int erg = 0;
    	int count6 = 0;
    	for (int i = 1; i <= 20; i++) {
    		count6++;
    		erg = i + count6;
    	}
    	System.out.print("alle Zahlen von 1 bis 20 addiert = " + erg);
    	System.out.println();


        /* 7.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * a2b3 a12b13 a22b23
         */
    	int count7 = 1;
    	System.out.print("a2b3 ");
    	for (int i = 1; i <= 1; i++) {
    		count++;
    		System.out.print(("a" + count7 + "2b" + count7 + "3") + " ");
    		System.out.print(("a" + (count7 + 1) + "2b" + (count7 + 1) + "3") + " ");
    	}
    	System.out.println();


        /* 8.
         * Schreibe eine for-Schleife, die Folgendes ausgibt:
         * 13 17 21 29 33 37 45
         */
    	// HARDCORE CODE :-)
    	for (int i = 0; i < 1; i++) {
    		System.out.print("13 17 21 29 33 37 45");
    	}
    	System.out.println();

        /* 9.
         * Schreibe EINE for-Schleife, die Folgendes ausgibt:
         * 1 2 3 4 5 4 3 2 1
         */

    	int count9 = 10;
    	for (int z = 1; z <= 10; z++) {
    		count9--;
    		if (z <= 5) {
    			System.out.print(z + " ");
    		} else if (z > 5 && z < 10) {	
    			System.out.print(count9 + " ");
    		}
    	}
    	System.out.println();
    	


        /* 10.
         * Schreibe ein Programm, das mit EINER while-Schleife
         * alle nat�rlichen Zahlen von 1 bis 39 sowie 61 bis 100
         * (jeweils einschlie�lich) der Gr��e nach ausgibt:
         * 1 2 3 4 ..... 36 37 38 39 61 62 63 64 ... 97 98 99 100
         */

    	int zahl10 = 0;
    	while (zahl10 < 100) {
    		zahl10++;
    		if (zahl10 <= 39) {
    			System.out.print(zahl10 + " ");
    		} else if (zahl10 > 39 && zahl10 <= 60)  {
    			continue;
    		} else {
    			System.out.print(zahl10 + " ");
    		}
    		
    	};
    }
}
