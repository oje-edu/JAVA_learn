package kapitel_06._621;

public class Bruch {
    
    final int zaehler;
    final int nenner;

    Bruch(int zaehler, int nenner) {
	
	this.zaehler = zaehler;
	this.nenner = nenner;
	
	/*
	if (nenner == 0) {
	    System.out.println("Fehler! Der Nenner darf nicht 0 sein!");
	    this.nenner = 1;
	} else {
	    this.nenner = nenner;
	    this.kuerzen();
	}
	*/
	
    }
    
    Bruch multipliziere(Bruch m) {  // Referenz
	  int z = zaehler * m.zaehler;
	  int n = nenner * m.nenner;
	  Bruch produkt = new Bruch(z, n);
	  return produkt;
    }
     
    Bruch() {
    	this(0, 1);
    }

    Bruch(int nenner) {
    	this(1, nenner);
    }
    
    double dezimalwert() {
    	return (double) this.zaehler/this.nenner;
    }
    
    /*
    
    void setze(int z) {
	  zaehler = z;
	  nenner = 1;
	  // return;
    }
    void setze(int z, int n) {
		zaehler = z;
		nenner = n; 
    }
    
    static Bruch multipliziere_static(Bruch m, Bruch n) {
		Bruch z = new Bruch();
		z.zaehler = m.zaehler;
		z.nenner = m.nenner;
		z.zaehler *= n.zaehler;
		z.nenner *= n.nenner;
		return z;
    }
    
    Bruch multipliziere(Bruch m) {  // Referenz
	  zaehler *= m.zaehler;
	  nenner *= m.nenner;
	  return m;
    }
    
    void erweitern(int a) {
		zaehler *= a;
		nenner *= a;
    }
    */
    
    void ausgeben() {                              // Kopf der Methode
	System.out.println(zaehler + "/" + nenner);  // Rumpf der Methode
    }

    /*
    void kuerzen() {
		// int zaehler;
		// int m = Math.abs(zaehler);  // speichert in m den Betrag von zaehler
		int m = Math.abs(this.zaehler);  // speichert in m den Betrag von zaehler
		int n = Math.abs(this.nenner);   // speichert in n den Betrag von nenner
		int r = m % n;
		while (r > 0) {
	    	m = n;
	    	n = r;
	    	r = m % n;
		}
		// this.zaehler /= n; // in n steht jetzt der ggT
		this.zaehler /= n; // in n steht jetzt der ggT
		this.nenner /= n;
    }
    
    void gekuerztausgeben() {
	  kuerzen();
	  ausgeben();
    }
    */
}
