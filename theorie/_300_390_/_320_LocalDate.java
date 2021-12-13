package theorie._300_390_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _320_LocalDate {

	public static void main(String[] args) {
		// LocalDate
		
		// MIN, MAX
		System.out.println(LocalDate.MIN); 											// -999999999-01-01
		System.out.println(LocalDate.MAX);                                          // +999999999-12-31
		
		// (static) LocalDate now()
		LocalDate ld = LocalDate.now();
		System.out.println(ld);      												// 2021-11-24
		System.out.println(ld.getClass());											// class java.time.LocalDate
		
		// (static) LocalDate of(int jahr, int monat, int jahr)
		LocalDate ld2 = LocalDate.of(1997, 7, 17);
		System.out.println(ld2);  													// 1997-07-17
		// LocalDate ld3 = LocalDate.of(1997, 7, 37);
		// System.out.println(ld3); 													// java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 37
		
		// (static) LocalDate ofEpochDay(long epochDay)
		LocalDate ld3 = LocalDate.ofEpochDay(1234); 								// 1973-05-19
		System.out.println(ld3);
		
		// (static) LocalDate parse(CharSequence text)
		LocalDate ld4 = LocalDate.parse("1973-05-19");
		System.out.println(ld4); 													// 1973-05-19
		
		// String format(DateTimeFormatter formatter)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(ld4.format(dtf));                                       	// 19.05.1973
		
		// int getDayOfMonth(), getMonthValue(), getYear()
		System.out.println(ld4.getDayOfMonth()); 									// 19
		
		// boolean isLeapYear()
		System.out.println(ld4.isLeapYear()); 										// false
		
		// int lengthOfMonth()
		LocalDate ld5 = LocalDate.parse("1900-02-02");
		System.out.println(ld5.lengthOfMonth()); 									// 28
		LocalDate ld6 = LocalDate.parse("1600-02-02");
		System.out.println(ld6.lengthOfYear()); 									// 366
		
		// boolean isAfter(), isBefore()
		LocalDate ld7 = LocalDate.parse("1600-02-02");
		LocalDate ld8 = LocalDate.parse("2600-02-02");
		System.out.println(ld7.isAfter(ld8)); 										// false
		System.out.println(ld7.isBefore(ld8)); 										// true
	}

}
