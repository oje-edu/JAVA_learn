package kapitel_05._Uebungen._Aufgabe_057_7;

public class Kreis {
    double radius;

    Kreis() {
	this.radius = 0;
    }

    Kreis(double radius) {
	this.radius = radius;
    }

    double getRadius() {
	return this.radius;
    }

    void setRadius(double radius) {
	this.radius = radius;
    }

    double getUmfang() {
	return 2 * Math.PI * this.radius;
    }

    double getFlaeche() {
	return Math.PI * this.radius * this.radius;
    }

    void setUmfang(double umfang) {
	radius = umfang / (2 * Math.PI);
    }

    void setFlaeche(double flaeche) {
	radius = Math.sqrt(flaeche / Math.PI);
    }
}
