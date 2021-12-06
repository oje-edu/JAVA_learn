package kapitel_06._642;

public class Bruch {

	int zaehler;
	int nenner;

	Bruch(int zaehler, int nenner) {

		this.zaehler = zaehler;
		if (nenner == 0) {
			System.out.println("Fehler! Der Nenner darf nicht 0 sein!");
			this.nenner = 1;
		} else {
			this.nenner = nenner;
			this.kuerzen();
		}
	}

	Bruch() {
		this(0, 1);
	}

	Bruch(int nenner) {
		this(1, nenner);
	}
	
	// Getter & Setter
	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

	// Normale Methoden
	boolean equals(Bruch x) {
		if (x == null) {
			return false;
		} else {
			Bruch a = new Bruch(getZaehler(), getNenner());
			Bruch b = new Bruch(x.zaehler, x.nenner);
			a.kuerzen();
			b.kuerzen();
			if (a.zaehler == b.zaehler && a.nenner == a.nenner) {
				return true;
			}
			return false;
		}
	}
	
	void setze(int z) {
		zaehler = z;
		nenner = 1;
		// return;
	}

	void setze(int z, int n) {
		zaehler = z;
		nenner = n;
	}
	
	double dezimalwert() {
		return (double) this.zaehler / this.nenner;
	}


	static Bruch multipliziere_static(Bruch m, Bruch n) {
		Bruch z = new Bruch();
		z.zaehler = m.zaehler;
		z.nenner = m.nenner;
		z.zaehler *= n.zaehler;
		z.nenner *= n.nenner;
		return z;
	}

	Bruch multipliziere(Bruch m) { // Referenz
		zaehler *= m.zaehler;
		nenner *= m.nenner;
		return m;
	}

	void erweitern(int a) {
		zaehler *= a;
		nenner *= a;
	}

	void ausgeben() { // Kopf der Methode
		System.out.println(zaehler + "/" + nenner); // Rumpf der Methode
	}

	void kuerzen() {
		// int zaehler;
		// int m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
		int m = Math.abs(this.zaehler); // speichert in m den Betrag von zaehler
		int n = Math.abs(this.nenner); // speichert in n den Betrag von nenner
		int r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		// this.zaehler /= n; // in n steht jetzt der ggT
		this.zaehler /= n; // in n steht jetzt der ggT
		this.nenner /= n;
	}

	void gekuerztausgeben() {
		kuerzen();
		ausgeben();
	}
}
