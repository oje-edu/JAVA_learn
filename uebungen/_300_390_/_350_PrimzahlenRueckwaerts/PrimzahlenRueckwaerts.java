package uebungen._300_390_._350_PrimzahlenRueckwaerts;

import static java.lang.Math.*;

public class PrimzahlenRueckwaerts {
	static int rebmun = 0;

	public static void main(String[] args) {
	    /*
	     * Primzahlen rückwärts
	     *
	     * Schreibe eine Programm, das alle Primzahlen bis 1000 ausgibt,
	     * die, wenn man sie rückwärts liest, auch eine Primzahl sind.
	     *
	     * Z.B. 199 und 991 sind beides Primzahlen.
	     */
		
		check(1000);

	}
	
	static void check(int number) {
		for (int i = 1; i <= number; i++) {
			if (isMirp(i)) {
				System.out.println(i + "-" + rebmun);
			}
		}
	}
	
	static boolean isMirp(int number) {
		if (!isPrim(number)) {
			return false;
		}
		rebmun = reverse(number);
		return isPrim(number) && number != rebmun;
	}
	
	static boolean isPrim(int number) {
		if (number < 2) return false;
		if (number < 4) return true;
		for (int i = 2; i < sqrt(number + 1); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int reverse(int number) {
		int rev = 0;
		for (int i = 0; i <= number; i++) {
			int mod = number % 10;
			rev = rev * 10 + mod;
			number = number / 10;
		}
		return rev;
	}
}
