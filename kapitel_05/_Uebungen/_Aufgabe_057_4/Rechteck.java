package kapitel_05._Uebungen._Aufgabe_057_4;

public class Rechteck {
	private double laenge;
	private double breite;

	double l = 0;
	double b = 0;
	
	
	
	Rechteck(double laenge, double breite) {
		setLaenge(laenge);
		setBreite(breite);
		
	}

	Rechteck() {
		this.laenge = 0;
		this.breite = 0;
		
	}
	
	
	// setter
	
	public void setLaenge(double laenge) {
		this.laenge = laenge;
		//setLaenge(laenge);
	}
	
	public void setBreite(double breite) {
		this.breite = breite;
	}
	
	public void setSeite(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	
	// getter 
	public double getLaenge() {
		return this.laenge;
	}

	
	public double getBreite() {
		return this.breite;
	}

	
	public double getLangeSeite() {
		if (getLaenge() > getBreite()) {
			return this.laenge;
		} else {
			return this.breite;
		}
	}
	
	public double getKurzeSeite() {
		if (getLaenge() < getBreite()) {
			return this.breite;
		} else {
			return this.laenge;
		}

	}
	
	public double getDiagonale() {
		 double d = Math.sqrt((this.laenge * this.laenge) + (this.breite * this.breite));
		 return d;
	}

	public double getFlaeche() {
		return this.laenge * this.breite;
	}
	
	public double getUmfang() {
		return (2*this.laenge) + (2*this.breite);

	}
	
	void laengeAusgeben() {
		laenge = getLaenge();
		System.out.println("Laenge: " + laenge);	
	}
	
	void laengeVergroessern(double laenge) {
		setLaenge(getLaenge() + laenge);
	}

	void laengeVerkleinern(double l) {
		setLaenge(getLaenge() - laenge);
	}
	
	void breiteVergroessern(double b) {
		setBreite(getBreite() + breite);
	}
	void breiteVerkleinern(double b) {
		setBreite(getBreite() - breite);
	}
}
