package kapitel_06.Aufgabe_065_3;

public class Bruch {
	private int zaehler;
	private int zaehler2;
	private int nenner;
	private int nenner2;

	Bruch() {
		this(0, 1);
		// zaehler = 0;
		// nenner = 1;
	}

	Bruch(int zaehler) {
		this(zaehler, 1);
		// setZaehler(zaehler);
		// nenner = 1;
	}

	Bruch(int zaehler, int nenner) {
		setZaehler(zaehler);
		setNenner(nenner);
		// System.out.println("Neue Bruch!");
	}

	int getZaehler() {
		return this.zaehler;
	}
	
	public int getZaehler2() {
		return this.zaehler2;
	}

	int getNenner() {
		return this.nenner;
	}
	
	public int getNenner2() {
		return this.nenner2;
	}

	void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}
	
	public void setZaehler2(int zaehler2) {
		this.zaehler2 = zaehler2;
	}
	
	void setNenner(int nenner) {
		this.nenner = nenner;
	}

	public void setNenner2(int nenner2) {
		this.nenner2 = nenner2;
	}


	void ausgeben() {
		System.out.println("Bruch = " + getZaehler() + "/" + getNenner());
	}

	String bruchToString() {
		return getZaehler() + "/" + getNenner();
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
	
    void addiere(int zaehler2, int nenner2) {
    	setZaehler2(zaehler2);
    	setNenner2(nenner2);
    	System.out.println("+" + getZaehler2() + "/" + getNenner2());
    	setZaehler(getZaehler() * getNenner2() + getZaehler2() * getNenner());
    	this.nenner = getNenner() * getNenner2();
    	gekuerztausgeben();
    }
    
    void subtrahiere(int zaehler2, int nenner2) {
    	setZaehler2(zaehler2);
    	setNenner2(nenner2);
    	System.out.println("-" + getZaehler2() + "/" + getNenner2());
    	this.zaehler = getZaehler() * getNenner2() - getZaehler2() * getNenner();
    	this.nenner = getNenner() * getNenner2();
    	gekuerztausgeben();
    }

	
    void dezimalwert() {
    	double dezi = (double)getZaehler() / (double)getNenner();
    	System.out.println("Dezimal: " + dezi);
    }


	void gekuerztausgeben() {
		kuerzen();
		ausgeben();
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
