package theorie;
import java.text.DecimalFormat;

public class _170_Runden {

    public static void main(String[] args) {

	// Math.round()
	// Kaufmännisches Runden
	System.out.println(Math.round(4.49)); // 4
	System.out.println(Math.round(4.5));  // 5
	
	// Math.floor() - Abrunden
	// Zieht zu Minus-Unendlich
	System.out.println(Math.floor(4.9));   // 4.0
	System.out.println(Math.floor(-4.9)); // -5.0

	// Math.ceil() - Aufrunden
	// Zieht zu Plus-Unendlich
	System.out.println(Math.ceil(4.1));   // 5.0
	System.out.println(Math.ceil(-4.1)); // -4.0

	// DecimalFormat
	// Rundet kaufmännisch
	// # (vor dem Komma) steht für eine beliebige Anzahl von Stellen
	// 0 steht für genau eine Stelle
	DecimalFormat df1 = new DecimalFormat("#.0");
	System.out.println(df1.format(123.45)); // 123,5
	System.out.println(df1.format(123.449)); // 123,4

	// Pattern für Währung
	DecimalFormat df2 = new DecimalFormat("#.00");
	System.out.println(df2.format(12.345)); // 12,35
	System.out.println(df2.format(12.3449)); // 12,34
	System.out.println(df2.format(12.3)); // 12,30

	// # (nach dem Komma) steht f�r die maximale Anzahl von Stellen
	DecimalFormat df3 = new DecimalFormat("#.##");
	System.out.println(df3.format(12.345)); // 12,35
	System.out.println(df3.format(12.3449)); // 12,34
	System.out.println(df3.format(12.3)); // 12,3
	
	DecimalFormat df4 = new DecimalFormat(",###");
	System.out.println(df4.format(1234567890)); // 1.234.567.890

	
	DecimalFormat df5 = new DecimalFormat(",###.00 \u00A4");
	System.out.println(df5.format(1234567890)); // 1.234.567.890,00 €

	
	DecimalFormat df6 = new DecimalFormat("00 %");
	System.out.println(df6.format(0.6)); // 50
	System.out.println(df6.format(1.5)); // 150
	
	
	// String.format("%.2f", zahl)
	// Rundet kaufmännisch
	System.out.println("Ausgabe: " + String.format("%.2f", 12.1149)); // 12,11
	System.out.println("Ausgabe: " + String.format("%.2f", 12.115)); // 12,12

	// System.out.printf();
	System.out.printf("%.2f%n", 12.345); // 12,35
	System.out.printf("%.2f%n", 12.3449); // 12,34
	



	

    }

}
