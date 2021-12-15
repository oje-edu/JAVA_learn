package kapitel_06.KreisMitRundung;

public class Kreissegment extends TeilMitRundung {

	double winkel;

	Kreissegment() {
		super();
		setWinkel(90);
	}

	Kreissegment(double radius, double winkel) {
		super(radius);
		setWinkel(winkel);
	}
	
	double getFlaeche() {
		return Math.PI * getRadius() * getRadius() * getWinkel() / 360;
	}

	double getUmfang() {
		return 2 * Math.PI * getRadius() * getWinkel() / 360 + 2 * getRadius();
	}
	

	public double getWinkel() {
		return winkel;
	}

	public void setWinkel(double winkel) {
		this.winkel = winkel;
	}
}
