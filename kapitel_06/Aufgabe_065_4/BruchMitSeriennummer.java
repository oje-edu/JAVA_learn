package kapitel_06.Aufgabe_065_4;

public class BruchMitSeriennummer extends Bruch {
	
	final int seriennummer;
	protected static int counter = 0;
	
	BruchMitSeriennummer() {
		super();
		seriennummer = ++counter;
	}
	
	BruchMitSeriennummer(int zaehler, int nenner) {
		super(zaehler, nenner);
		seriennummer = ++counter;
	}
	

	public int getSeriennummer() {
		return seriennummer;
	}


    @Override
    public String toString() {
	return super.toString() + "/" + " | Snr: " + getSeriennummer();
    }
}
