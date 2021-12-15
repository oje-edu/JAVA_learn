package kapitel_05._551;

public class Bruch {
    
    int zaehler;
    int nenner;
    
    double dezimalwert() {
	// return (double) zaehler/nenner;
	return (double) this.zaehler/this.nenner;
    }
    
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
    
    void ausgeben() {                              // Kopf der Methode
	System.out.println(zaehler + "/" + nenner);  // Rumpf der Methode
    }

    void kuerzen() {
	// int zaehler;
	// int m = Math.abs(zaehler);  // speichert in m den Betrag von zaehler
	int m = Math.abs(this.zaehler);  // speichert in m den Betrag von zaehler
	int n = Math.abs(nenner);   // speichert in n den Betrag von nenner
	int r = m % n;
	while (r > 0) {
	    m = n;
	    n = r;
	    r = m % n;
	}
	    // this.zaehler /= n; // in n steht jetzt der ggT
	    this.zaehler /= n; // in n steht jetzt der ggT
	    nenner /= n;
    }
    
    void gekuerztausgeben() {
	  kuerzen();
	  ausgeben();
    }
}
