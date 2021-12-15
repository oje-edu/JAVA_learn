package uebungen._270_Ablaufdatum;

public class Ablaufdatum {

	public static void main(String[] args) {
	/*
	 * Ablaufdatum
	 *
	 * Arzneimittel enthalten einen kritischen Wirkstoff.
	 * Dieser darf eine gewisse Konzentration nicht unterschreiten,
	 * sonst verliert das Medikament an Wirkung.
	 * Gehen wir davon aus,
	 * dass ein Medikament bei der Herstellung 80mg des Wirkstoffs enthält
	 * aber jeden Monat 0.25% des Wirkstoffs verliert.
	 * Minimal muss das Medikament jedoch immer 70mg des Wirkstoffs enthalten.
	 * Ihr Programm soll berechnen, nach wie vielen Monaten
	 * das Medikament seine kritische Wirkstoffkonzentration unterschreitet.
	 * Nach wie vielen Monaten darf das Medikament nicht mehr angewendet werden.
	 * Der Anwender gibt die Anfangskonzentration (mg)
	 * und die kritische Minimalkonzentration (mg) ein.
	 * Ebenso muss er die monatliche prozentuale Abnahme angeben.
	 */
		Ablaufdatum ab1 = new Ablaufdatum();
		System.out.println("Das Medikament läuft nach " + ab1.calc(80.0f, 70.0f, 0.25f)	+ " Monaten ab");
		Ablaufdatum ab2 = new Ablaufdatum();
		System.out.println("Das Medikament läuft nach " + ab2.calc(180.0f, 100.0f, 0.55f)	+ " Monaten ab");
	}
	
	private int calc(float anfangK, float minimalK, float verlust) {
		int monat = 0;
		
		while (anfangK > minimalK) {
			anfangK = anfangK - (anfangK / 100 * verlust);
			monat++;
		}
		return monat;
	}
}
