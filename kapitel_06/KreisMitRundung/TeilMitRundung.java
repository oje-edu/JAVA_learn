package kapitel_06.KreisMitRundung;

public class TeilMitRundung {

	private double radius;
	
	TeilMitRundung(double radius) {
		setRadius(radius);
	}

	TeilMitRundung() {
		radius = 1;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	void radiusVergroessernUm(double vr) {
		this.radius = getRadius() + vr;
	}
}
