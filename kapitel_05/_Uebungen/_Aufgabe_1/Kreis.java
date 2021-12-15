package kapitel_05._Uebungen._Aufgabe_1;

public class Kreis {
	private double radius;
	
	// radius * 
	
	Kreis(double radius) {
		this.radius=radius;
		
	}
	
	Kreis() {
		this(5);
	}
	
	// getter & setter
	
	public double getRadius() {
		return this.radius;
		
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	double getUmfang() {
		return Math.PI * this.radius * 2;
	}

	double getFlaeche() {
		return Math.pow(radius,2) * Math.PI;
	}


}
