package theorie._300_390_;

import java.time.LocalDateTime;

public class _350_LocalDateTime {

	public static void main(String[] args) {
		
		// LocalDateTime
		// MAX, MIN
		System.out.println(LocalDateTime.MIN); 								// -999999999-01-01T00:00
		System.out.println(LocalDateTime.MAX); 								// +999999999-12-31T23:59:59.999999999
		
		// now()
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		// restliche Methoen wie bei LocaleDate & LocaleTime
		System.out.println(ldt.getHour()); 									// 14

	}

}
