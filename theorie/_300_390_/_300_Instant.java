package theorie._300_390_;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class _300_Instant {

	public static void main(String[] args) {

		// Instant-Klasse
		
		// EPOCH, MIN, MAX
		System.out.println(Instant.EPOCH); 											// 1970-01-01T00:00:00Z
		System.out.println(Instant.MIN); 											// -1_000_000_000-01-01T00:00:00Z
		System.out.println(Instant.MAX); 											// +1_000_000_000-12-31T23:59:59.999999999Z

		// now()
		Instant zp = Instant.now();
		System.out.println(zp); 													// 2021-11-24T08:13:33.989415300Z
		System.out.println(zp.getClass());                          				// class java.time.Instant
		
		// ofEpochSecond()

		Instant zp2 = Instant.ofEpochSecond(20000000);
		System.out.println(zp2); 													// 1970-08-20T11:33:20Z
		
		Instant zp3 = Instant.ofEpochSecond(System.currentTimeMillis() / 1000);
		System.out.println(zp3); 													// 2021-11-24T08:19:20Z
		
		// parse()
		Instant zp4 = Instant.parse("2021-11-24T08:13:33.989415300Z");
		System.out.println(zp4); 													// 2021-11-24T08:13:33.989415300Z
		
		// minusMillis(), minusNanos(), minusSeconds(),
		Instant ep = Instant.EPOCH;
		System.out.println(ep);
		System.out.println(ep.minusNanos(1000)); 									// 1969-12-31T23:59:59.999999Z
		System.out.println(ep.minusMillis(1000)); 									// 1969-12-31T23:59:59Z
		System.out.println(ep.minusSeconds(1000)); 									// 1969-12-31T23:43:20Z
		
		// plusMillis(), plusNanos(), plusSeconds(),
		System.out.println(ep);
		System.out.println(ep.plusNanos(1000)); 									// 1970-01-01T00:00:00.000001Z
		System.out.println(ep.plusMillis(1000)); 									// 1970-01-01T00:00:01Z
		System.out.println(ep.plusSeconds(1000)); 									// 1970-01-01T00:16:40Z
		
		// ChronoUnit
		// DAYS
		// HOURS
		// MICROS
		// MILLIS
		// MINUTES
		// MONTH
		// NANOS
		// SECONDS
		// WEEKS
		// YEARS
		
		System.out.println(ep.minus(365, ChronoUnit.DAYS)); 						// 1969-01-01T00:00:00Z
		System.out.println(ep.plus(365, ChronoUnit.DAYS)); 							// 1971-01-01T00:00:00Z
	}

}
