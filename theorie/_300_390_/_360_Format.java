package theorie._300_390_;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _360_Format {
	
	public static void main(String[] args) {
		
		// DecimalFormat
		// Rundet kaufmännisch
		DecimalFormat df1 = new DecimalFormat("#.0");
		System.out.println(df1.format(123.45)); // 123,5
		
		// String.format("%.2f", zahl)
		// Rundet kaufmännisch
		System.out.println(String.format("%.2f", 12.1149)); // 12,11
		
		// DateTimeFormatter bei LocalDate
		// String LocalDate.format(DateTimeFormatter formatter)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate loda5 = LocalDate.now();
		System.out.println(loda5.format(dtf));  // 25.11.2021
		
		// DateTimeFormatter bei LocalTime
		// format()
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH-mm-ss");
		LocalTime lt7 = LocalTime.now();
		System.out.println(lt7.format(dtf1));  // 11-08-27
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
