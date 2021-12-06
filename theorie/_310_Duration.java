package theorie;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class _310_Duration {

	public static void main(String[] args) {
		
		// Duration - Zeitintervall
		
		// Statische Methode die ein Object zurück gibt (desshalb kein new Duration)
		
		Duration du = Duration.ofDays(10);
		System.out.println(du); 													// PT240H
		
		Duration du2 = Duration.ofHours(10);
		System.out.println(du2); 													// PT10H
		
		Duration du3 = Duration.ofMinutes(10);
		System.out.println(du3); 													// PT10M
		
		Duration du4 = Duration.ofSeconds(10);
		System.out.println(du4); 													// PT10S
		
		Duration du5 = Duration.of(7, ChronoUnit.DAYS);
		System.out.println(du5); 													// PT168H
		
		Instant in = Instant.now();
		Instant in2 = Instant.EPOCH;
		Duration du6 = Duration.between(in2, in);
		System.out.println(du6); 													// PT454928H56M6.3412892S
		
		// (long) toDays(), toHours(), toMinutes(), toMillis(), toNanos()
		Duration du7 = Duration.ofDays(1000);
		System.out.println(du7.toDays()); 											// 1_000
		
		Duration du8 = Duration.ofNanos(1_000_000_000);
		System.out.println(du8.toNanos()); 											// 1_000_000_000
		
		// getSeconds() & getNanos() bilden zusammen die gesamte Zeit
		Duration du9 = Duration.ofNanos(1_000_000_000);
		System.out.println(du9.getNano()); 											// 0
		System.out.println(du9.getSeconds());										// 1
	}

}
