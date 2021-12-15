package theorie._250_Verebung._040_LKW;

public class LKW extends Fahrzeug {
	
	private boolean liftAchse;
	
	protected LKW() {
		super();
		setLiftAchse(liftAchse);
	}
	
	protected LKW(String hersteller) {
		super(hersteller);
	}
	
	protected LKW(String hersteller, String farbe) {
		super(hersteller, farbe);
	}
	
	protected LKW(String hersteller, String farbe, boolean liftAchse) {
		super(hersteller, farbe);
		setLiftAchse(liftAchse);
	}
	
	protected LKW(boolean liftAchse) {
		super();
		setLiftAchse(liftAchse);
	}
	
	protected LKW(String hersteller, boolean liftAchse) {
		super(hersteller);
		setLiftAchse(liftAchse);
	}

	public boolean isLiftAchse() {
		return liftAchse;
	}

	public void setLiftAchse(boolean liftAchse) {
		this.liftAchse = liftAchse;
	}
	
	public String janein() {
		if (isLiftAchse() == true) {
			return "Ja";
		} else {
			return "Nein";
		}
	}

	@Override
	public String toString() {
		return "LKW - " + super.toString() + " - Hat eine Liftachse=" + janein();
	}
}
