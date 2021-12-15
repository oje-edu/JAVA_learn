package theorie._250_Verebung._030_NeuesAttribut;

public class PKW extends Fahrzeug {
	
	// Neues Attribut für PKW
	private int kofferraumVolumen;  // In Litern
	
	public PKW() {
		super();
		setKofferraumVolumen(400);
	}
	
	public PKW(String hersteller) {
		super(hersteller);
		setKofferraumVolumen(400);
	}
	
	public PKW(String hersteller, int kofferraumVolumen) {
		super(hersteller);
		setKofferraumVolumen(kofferraumVolumen);
	}
	
	public PKW(String hersteller, String farbe) {
		super(hersteller, farbe);
		setKofferraumVolumen(400);
	}
	
	public PKW(String hersteller, String farbe, int kofferraumVolumen) {
		super(hersteller, farbe);
		setKofferraumVolumen(kofferraumVolumen);
	}
	
	@Override // Die Annotation macht den Code robuster
	public String toString() {
		return "PKW extends - " 
				+ super.toString() 
				+ " - Kofferraumvolumen=" 
				+ getKofferraumVolumen() 
				+ "L";
	}
	
	// Getter & Setter
	public int getKofferraumVolumen() {
		return kofferraumVolumen;
	}

	public void setKofferraumVolumen(int kofferraumVolumen) {
		this.kofferraumVolumen = kofferraumVolumen;
	}
	
	
}

