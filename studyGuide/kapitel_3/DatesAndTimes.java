package studyGuide.kapitel_3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

	public static void main(String[] args) {
		
		// statischer Aufruf .. kein new LocalTime, new LocalDate oder new LocalDateTime 

		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);
		
		LocalTime t2 = LocalTime.of(20, 15);
		System.out.println(t2);
		
		LocalDate d2 = LocalDate.now();
		System.out.println(d2);
		d2 = d2.plusDays(14);
		System.out.println(d2);
		
		
		switch(d1.getDayOfWeek()) {
		case MONDAY:
			System.out.println("Montag");
			break;
		case TUESDAY:
			System.out.println("Dienstag");
			break;
		case WEDNESDAY:
			System.out.println("Mittwoch");
			break;
		case THURSDAY:
			System.out.println("Donnerstag");
			break;
		case FRIDAY:
			System.out.println("Freitag");
			break;
		case SATURDAY:
			System.out.println("Samstag");
			break;
		case SUNDAY:
			System.out.println("Sonntag");
			break;
		default:
			System.out.println("Fehler");
		}
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.y");
		DateTimeFormatter dtfl = DateTimeFormatter.ofPattern("dd.MMMM.y");
		System.out.println(d1.format(dtf));
		System.out.println(d1.format(dtfl));
		
		// Periode
		Period p = Period.ofDays(7);
		System.out.println(d1.plus(p).format(dtfl));
		
		Period pb = Period.between(d1, d2);
		System.out.println(pb.getDays() + " Tage");
	}

}
