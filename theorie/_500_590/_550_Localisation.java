package theorie._500_590;

import java.text.NumberFormat;
import java.util.Locale;

public class _550_Localisation {

	public static void main(String[] args) {
		
		// Localisation
		// Locale
		Locale locale_us = new Locale("us", "US");
		
		double d1 = 1_234_567.89;
		
		// NumberFormat.getNumberInstance()
		NumberFormat nf_de = NumberFormat.getNumberInstance();
		System.out.println(nf_de.format(d1));   								// 1.234.567,89
		NumberFormat nf_us = NumberFormat.getNumberInstance(locale_us);
		System.out.println(nf_us.format(d1));   								// 1,234,567.89
		
		// NumberFormat.getCurrencyInstance()
		NumberFormat nf_de_cur = NumberFormat.getCurrencyInstance();
		System.out.println(nf_de_cur.format(d1));     							// 1.234.567,89 €
		NumberFormat nf_us_cur = NumberFormat.getCurrencyInstance(locale_us);
		System.out.println(nf_us_cur.format(d1));     							// US$ 1,234,567.89
		
		// toUpperCase(), toLowerCase()
		Locale locale_tr = new Locale("tr", "TR");
		System.out.println("titel".toUpperCase());                              // TITEL
		System.out.println("titel".toUpperCase(locale_tr));                     // TİTEL
		System.out.println("TITEL".toLowerCase());                              // titel
		System.out.println("TITEL".toLowerCase(locale_tr));                     // tıtel
		
		System.out.println(Locale.getDefault());                                // de_DE
		System.out.println(Locale.getDefault().getLanguage());                  // de

	}
}
