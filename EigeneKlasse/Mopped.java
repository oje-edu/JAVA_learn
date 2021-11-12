package EigeneKlasse;


public class Mopped {
	
	protected static int counter = 0;

	private String marke;
	private String modell;
	private String url;
	private int ps;
	
	Mopped() {
		this.setMarke("Kawasaki");
		this.setModell("ZX-10R");
		this.setPs(200);
		this.setUrl("<a href=\"https://www.kawasaki.de/de/products/Supersport/2021/Ninja_ZX-10R/overview?Uid=0841WVALW10MDl5cUF1QXAtdDglbXloNWVlaUAtRXglQWlA\" target=\"_blank\" rel=\"noopener noreferrer\">ZX-10R</a>");
		Mopped.counter++;
	}

	// Overloading - Überladen
	Mopped(String marke) {
		this.setMarke(marke);
		this.setModell("No Name");
		this.setPs(176);
		this.setUrl("");
		Mopped.counter++;
	}
	
	Mopped(String marke, String modell) {
		this.setMarke(marke);
		this.setModell(modell);
		this.setPs(200);
		this.setUrl("");
		Mopped.counter++;
	}

	Mopped(int ps) {
		this.setMarke("Honda");
		this.setPs(ps);
		this.setUrl("");
		Mopped.counter++;
	}

	Mopped(String marke, String modell, int ps) {
		this.setMarke(marke);
		this.setModell(modell);
		this.setPs(ps);
		this.setUrl("");
		Mopped.counter++;
	}

	Mopped(String marke, String modell, int ps, String url) {
		this.setMarke(marke);
		this.setModell(modell);
		this.setPs(ps);
		this.setUrl(url);
		Mopped.counter++;
	}
	
	
	// Getter & Setter
	public String getMarke() {
		return this.marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}
	
	
	public String getModell() {
		return this.modell;
	}
	
	public void setModell(String modell) {
		this.modell = modell;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public void setUrl(String url) {
		if (url != "" ) {
			this.url = url;
		} else {
			this.url = "Nicht vorhanden";
		}
	}


	public int getPs() {
		return this.ps;
	}

	public void setPs(int ps) {
		if (ps < 170 ) {
			System.out.println("Das ist doch kein MOPPED!");
			this.ps = 0;
		} else {
			this.ps = ps;
		}
	}
	
	@Override
	public String toString() {
		return "Nummer: " + Mopped.counter + "\nHersteller: " + getMarke() + " " + "\nModell: " + getModell() + "\nMit: " + getPs() + "PS" + " entspricht " + this.berechneKw() + "KW" + "\n---------" + "\nWebseite: " + this.getUrl();
	}
	
	// Normale Methode
	public int berechneKw() {
		// 1PS = 0.735KW
		return (int)(getPs() * 0.735);
	}

}
