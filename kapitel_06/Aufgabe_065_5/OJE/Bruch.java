package kapitel_06.Aufgabe_065_5.OJE;

public class Bruch {
	private int zaehler;
	private int nenner;

	Bruch() {
		zaehler = 0;
		nenner = 1;
	}

	Bruch(int zaehler) {
		this(zaehler, 0);
		nenner = 1;
	}

	Bruch(int zaehler, int nenner) {
		setZaehler(zaehler);
		setNenner(nenner);
	}

	void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	void setNenner(int nenner) {
		this.nenner = nenner;
	}

	int getZaehler() {
		return this.zaehler;
	}

	int getNenner() {
		return this.nenner;
	}
	
	@Override
	public String toString() {
		return getZaehler() + "/" + getNenner();
	}

	void ausgeben()
	{
		System.out.print(getZaehler() + "/" + getNenner());
	}

	void kuerzen() {
		int zaehler, nenner, ggt;
		zaehler = Math.abs(getZaehler());
		nenner = Math.abs(getNenner());
		ggt = zaehler % nenner;
		while (ggt > 0) {
			zaehler = nenner;
			nenner = ggt;
			ggt = zaehler % nenner;
		}
		this.zaehler /= nenner;
		this.nenner /= nenner;
	}

	void gekuerztausgeben() {
		kuerzen();
		ausgeben();
	}

	double dezimalwert() {
		return (double) getZaehler() / getNenner();
	}

	Bruch addiere(Bruch b) {
		int zaehler = getZaehler() * b.getNenner() + b.getZaehler() * getNenner();
		int nenner = getNenner() * b.getNenner();
		Bruch summe = new Bruch(zaehler, nenner);
		return summe;
	}

	Bruch subtrahiere(Bruch b) {
		int zaehler = getZaehler() * b.getNenner() - b.getZaehler() * getNenner();
		int nenner = getNenner() * b.getNenner();
		Bruch differenz = new Bruch(zaehler, nenner);
		return differenz;
	}

	Bruch multipliziere(Bruch m) {
		int zaehler = getZaehler() * m.getZaehler();
		int nenner = getNenner() * m.getNenner();
		Bruch produkt = new Bruch(zaehler, nenner);
		return produkt;
	}

	int signum() {
		if (this.dezimalwert() == 0.0) {
			return 0;
		}
		if (this.dezimalwert() > 0.0) {
			return 1;
		}
		return -1;
	}

	boolean equals(Bruch x) {
		Bruch a = new Bruch(getZaehler(), getNenner());
		Bruch b = new Bruch(x.getZaehler(), x.getNenner());
		a.kuerzen();
		b.kuerzen();
		if ((a.getZaehler() == b.getZaehler()) && (a.getNenner() == b.getNenner())) {
			return true;
		} else {
			return false;
		}
	}
}