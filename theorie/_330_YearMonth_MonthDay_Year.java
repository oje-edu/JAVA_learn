package theorie;

import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class _330_YearMonth_MonthDay_Year {

	public static void main(String[] args) {

		// (static) YearMonth
		YearMonth ym = YearMonth.now();
		System.out.println(ym); 										// 2021-11
		YearMonth ym2 = YearMonth.of(2022, 6);
		System.out.println(ym2); 										// 2022-06
		// isAfter(), isBefore() und isLeapYear() ist wie bei LocalDate zu verwenden
		
		
		// (static) MonthDay
		MonthDay md = MonthDay.now();
		System.out.println(md); 										// --11-24
		MonthDay md2 = MonthDay.of(2, 2);
		System.out.println(md2); 										// --02-02
		
		// (static )Year
		Year y = Year.now();
		System.out.println(y); 											// 2021
		Year y1 = Year.of(1999);
		System.out.println(y1); 										// 1999
	}

}
