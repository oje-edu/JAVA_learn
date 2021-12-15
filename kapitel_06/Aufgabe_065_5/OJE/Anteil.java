package kapitel_06.Aufgabe_065_5.OJE;

public class Anteil extends Bruch {

	static Bruch verteilt = new Bruch(0, 1);

	Anteil() {
		super();
	}

	Anteil(int zaehler, int nenner) {
		super(zaehler, nenner);
		verteilt = verteilt.addiere(this);
		if (this.getVerteilt() > 1)
			System.out.println("Fehler!! Es wurde zu viel verteilt!");
	}

	double getVerteilt() {
		return (double) verteilt.getZaehler() / verteilt.getNenner();
	}

	Bruch getRest() {
		Bruch gesamt = new Bruch(1);
		return gesamt.subtrahiere(verteilt);

	}

	@Override
	public String toString() {
		return super.toString() + "\n\tDezimal: " + getVerteilt();
	}

}
