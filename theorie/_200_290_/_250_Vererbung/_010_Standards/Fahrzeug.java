package theorie._200_290_._250_Vererbung._010_Standards;

public class Fahrzeug {
	// Attribute, Konstruktoren, Getter & Setter, toString()
	
	private String hersteller;
	private String farbe;
	
	// Konstruktoren
	Fahrzeug(String hersteller, String farbe) {
		setHersteller(hersteller);
		setFarbe(farbe);
	}
	
	Fahrzeug() {
		this("BMW", "Schwarz");
	}
	
	Fahrzeug(String hersteller) {
		this(hersteller, "Schwarz");
	}
	
	
	// Getter & Setter
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	
	public String getHersteller() {
		return this.hersteller;
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public String getFarbe() {
		return this.farbe;
	}
	
	// toString()
    @Override
    public String toString() {
    	return "[hersteller=" + getHersteller() + "," + "farbe=" + getFarbe() + "]";
    }
}
