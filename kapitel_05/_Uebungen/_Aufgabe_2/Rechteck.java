package kapitel_05._Uebungen._Aufgabe_2;

public class Rechteck {
	private double laenge;
	private double breite;

	
	
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
		setLaenge(laenge);
	}
	public void setBreite(double breite) {
		setBreite(breite);
	}
	public void setSeite(double laenge, double breite) {
		setLaenge(laenge);
		setBreite(breite);
	}
	
	// getter 
	public double getLaenge() {
		return this.laenge;
	}

	
	public double getBreite() {
		return this.breite;
	}

	
	public double getLangeSeite() {
		if (laenge < breite) {
			return this.breite;
		} else {
			return this.laenge;
		}
	}
	
	public double getKurzeSeite() {
		if (laenge > breite) {
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
	
}
