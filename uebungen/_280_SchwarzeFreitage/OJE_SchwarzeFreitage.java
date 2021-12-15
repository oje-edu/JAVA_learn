package uebungen._280_SchwarzeFreitage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class OJE_SchwarzeFreitage {

	private static List<String> fridayHistory;
	
	public static void main(String[] args) {
        /*
        * Schwarze Freitage
        *
        * Schreibe ein Programm, mit dem alle Freitage einer beliebigen
        * Zeitspanne aufgezeigt werden, die auf einen 13. fielen.
        */
		
		int startYear = 1990;
		int endYear = 1995;

		System.out.println("\tAnfangsjahr: " + startYear + " Endjahr: " + endYear + "\n");

		new OJE_SchwarzeFreitage(startYear, endYear);

		for (String fridays : fridayHistory) {
			System.out.println(fridays);
		}
	}

	public OJE_SchwarzeFreitage(int startYear, int endYear) {
		OJE_SchwarzeFreitage.fridayHistory = new ArrayList<String>();
		searchFridays(startYear, endYear);
	}

	private void searchFridays(int startYear, int endYear) {
		Calendar date = new GregorianCalendar();
		while (startYear <= endYear) {
			for (int i = 0; i < 12; i++) {
				date.set(startYear, i, 13);
				if (date.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
					fridayHistory.add("\tDer 13." + (i + 1) + "." + startYear + " war ein \"Schwarzer Freitag\"");
				}
			}
			startYear++;
		}
	}
}
