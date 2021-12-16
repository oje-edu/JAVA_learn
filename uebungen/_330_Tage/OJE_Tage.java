package uebungen._330_Tage;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OJE_Tage {
	static Calendar startDate = new GregorianCalendar();
	static Calendar endDate = new GregorianCalendar();

	public static void main(String[] args) {

	    /*
	     * Tage
	     *
	     * Berechne wieviele Tage zwischen dem 13.8.1961 und
	     * dem 9.11.1989 vergangen sind (jeweils inklusive).
	     */
		startDate.set(1961, 8, 13);
		endDate.set(1989, 11, 9);
		
		System.out.println("Es sind " + NumberFormat.getInstance().format((calc(startDate, endDate))) + " Tage vergangen.");
	}
	
	public static int calc(Calendar d1, Calendar d2) {
		return daysBetween(startDate.getTime(),endDate.getTime());
	}
	
	public static int daysBetween(Date d1, Date d2) {
        return (int)((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
}
