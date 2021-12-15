package kapitel_05._532;

public class Bruch {
	
	int zaehler;
	int nenner;
	
	void ausgeben() {                                           // Kopf
		System.out.println("Bruch: " + zaehler + "/" + nenner); // Rumpf
	}
	
	void kuerzen() {
		int m = Math.abs(this.zaehler);
		int n = Math.abs(this.nenner);
		int r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		this.zaehler /= n;
		this.nenner /= n;
	}
	
	void gekuerztAusgeben() {
		kuerzen();
		ausgeben();
	}

}


