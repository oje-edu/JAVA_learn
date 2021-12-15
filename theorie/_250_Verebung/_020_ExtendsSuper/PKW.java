package theorie._250_Verebung._020_ExtendsSuper;

public class PKW extends Fahrzeug {
	
	// extends, super(), super
	
	// Attribute und Methoden werden vererbt
	
	// Kontruktoren müssen neu geschrieben werden.
	public PKW() {
		super();
	}
	
	public PKW(String hersteller) {
		super(hersteller);
	}
	
	public PKW(String hersteller, String farbe) {
		super(hersteller, farbe);
	}
	
	@Override // Die Annotation macht den Code robuster
	public String toString() {
		return "PKW extends - " + super.toString();
	}
}

