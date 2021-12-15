package kapitel_07.Aufgabe_075_9.OJE;

import java.time.Instant;
import java.time.Duration;

// import javax.swing.JOptionPane;

public class Eingabetest {

	public static void main(String[] args) {
		/*
		 * Aufgabe 9
		 * 
		 * Erstellen Sie ein Programm mit dem Namen Eingabetest. Ein Eingabedialog
		 * (JOptionPane.InputDialog) soll den Anwender dazu auffordern, die Textzeile
		 * »Fischers Fritz fischt frische Fische« einzugeben. Das Programm soll prüfen,
		 * ob die Eingabe korrekt ist und wie viel Zeit der Anwender für die Eingabe
		 * benötigt hat. Beides soll als Ergebnis in der Konsole ausgegeben werden. Die
		 * Ausgabe soll bei fehlerfreier Eingabe folgendermaßen aussehen: Fehlerfrei!
		 * Zeit: 0 Minuten, 7 Sekunden und 231 Millisekunden
		 */
		testInput("Fischers ", "Fritz ", "fischt ", "frische ", "Fische");
		testInput("Fritz ", "fischt ", "Fischers ",  "frische ", "Fische");
		testInput("frische ", "Fische ", "Fritz ", "fischt ", "Fischers");
	}

	public static void testInput(String w1, String w2, String w3, String w4, String w5) {
		String check = "Fischers Fritz fischt frische Fische";
		String resp;
		long min, sec, milli;

		Instant start = Instant.now();
		// String input = JOptionPane.showInputDialog("Bitte eingeben: " + check);
		String input1 = w1;
		try {
			Thread.sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String input2 = w2;
		try {
			Thread.sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String input3 = w3;
		try {
			Thread.sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String input4 = w4;
		try {
			Thread.sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String input5 = w5;
		String input = input1 + input2 + input3 + input4 + input5;

		Instant end = Instant.now();

		Duration dura = Duration.between(start, end);
		min = dura.toMinutes();
		sec = dura.getSeconds() - min * 60;
		milli = dura.getNano() / 1_000_000;

		if (input.equals(check)) {
			resp = "Fehlerfrei! \nZeit: " + min + " Minuten " + sec + " Sekunden " + milli + " Millisekunden";
		} else {
			resp = "Sorry, aber du hast dich vertippt! \nZeit: " + min + " Minuten " + sec + " Sekunden " + milli
					+ " Millisekunden";
		}
		System.out.println(resp);
		System.out.println("-----");
		System.out.println("Du hast eingegeben: " + input);
		System.out.println();
	}
}
