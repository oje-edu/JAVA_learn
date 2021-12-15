package kapitel_06.KreisMitRundung;

public class Kreis extends TeilMitRundung{
	
	Kreis(double radius) {
		super(radius);
	}

    double getFlaeche() {
	return Math.PI * getRadius() * getRadius();
    }
    
    double getUmfang() {
	return 2 * Math.PI * getRadius();
    }
}

