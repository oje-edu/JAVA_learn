package theorie._600_690_;

public class _640_Expotential {

	public static void main(String[] args) {

		// Expotetialschreibweise (E | e)
		// Wissenschaftlicher Schreibweise (scientific notation)
		
		double d1 = 1.23456e4;
		System.out.println(d1); 											// 12345.6
		// enspricht 10 hoch 4
		System.out.println(1.23456 * Math.pow(10, 4));						// 12345.6
		System.out.println(1.23456 * 10000);								// 12345.6
		
		double d2 = 7.456243624e13;
		System.out.println(d2); 											// 7.456243624E13
		
		// Negativer Exponent
		double d3 = 4.5678e-2;
		System.out.println(d3); 											// 0.045678
		System.out.println(4.5678 / Math.pow(10, 2)); 						// 0.045678
		System.out.println(4.5678 / 100); 									// 0.045678
		
		// Rundungsfehler bei Fliesskommazahlen
		System.out.println(3 * 0.1 - 0.3); 									// 5.551115123125783E-17
		// entspricht eigentlich 0.0000000000000005551115123125783E-17 (also 0)

	}

}
