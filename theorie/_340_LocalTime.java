package theorie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class _340_LocalTime {

	public static void main(String[] args) {
		
		// MAX, MIN, NOON, MIDNIGHT
		System.out.println(LocalTime.MIN); 							// 00:00
		System.out.println(LocalTime.MAX);                     	 	// 23:59:59.999999999
		System.out.println(LocalTime.NOON);							// 12:00
		System.out.println(LocalTime.MIDNIGHT);						// 00:00
		
		// now()
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1); 									// 13:34:17.111216600
		
		// of()
		LocalTime lt2 = LocalTime.of(14, 12);					
		System.out.println(lt2);									// 14:12
		LocalTime lt3 = LocalTime.of(14, 12, 59);
		System.out.println(lt3); 									// 14:12:59
		LocalTime lt4 = LocalTime.of(14, 12, 59, 123456789);
		System.out.println(lt4); 									// 14:12:59.123456789
		
		
		// parse()
		LocalTime lt5 = LocalTime.parse("14:12:45.123456789");
		System.out.println(lt5); 									// 14:12:45.123456789
		
		// getHour(), getMinute(), getSecond(), getNano()
		System.out.println(lt5.getNano()); 							// 123456789
		
		// atDate()
		LocalDate ld = LocalDate.of(2021, 11, 24);
		System.out.println(ld); 									// 2021-11-24
		LocalTime lt6 = LocalTime.now();
		System.out.println(lt6); 									// 13:44:24.786789800
		LocalDateTime ldt = lt6.atDate(ld); 						
		System.out.println(ldt);									// 2021-11-24T13:45:54.368591500
		
		// format()
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H-m-s");
		LocalTime lt7 = LocalTime.now();
		System.out.println(lt7.format(dtf));						// 13-50-37
		
		// isBefore(), isAfter()
		System.out.println(lt3.isBefore(lt4)); 						// true
		System.out.println(lt3.isAfter(lt4)); 						// false
		
		// plus(), minus() - am besten vom parse Object
		System.out.println(lt5.plus(2, ChronoUnit.HOURS));          // 16:12:45.123456789
		System.out.println(lt5.minus(2, ChronoUnit.HOURS));			// 12:12:45.123456789
	}

}
