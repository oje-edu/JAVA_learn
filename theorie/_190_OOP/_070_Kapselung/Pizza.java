package theorie._190_OOP._070_Kapselung;

public class Pizza {
    
    // Kapselung - Encapsulation
    
    // Access modifier
    // public:					class, package, subclass, world
    // protected:				class, package, subclass
    // no modifier (package):   class, package
    // private:					class
    
    // Ab jetzt überall die Getter & Setter benutzen !!!
    
    private String typ;
    private int durchmesser;
        
    Pizza() {
	this.setTyp("Salami");
	this.setDurchmesser(32);
	System.out.println("Es wurde eine Pizza gebacken!");
    }
    
    Pizza(String typ) {
	this.setTyp(typ);
	this.setDurchmesser(32);
	System.out.println("Es wurde eine Pizza gebacken!");
    }
    
    Pizza(int durchmesser) {
	this.setTyp("Salami");
	this.setDurchmesser(durchmesser);
	System.out.println("Es wurde eine Pizza gebacken!");
    }
    
    Pizza(String typ, int durchmesser) {
	this.setTyp(typ);
	this.setDurchmesser(durchmesser);
	System.out.println("Es wurde eine Pizza gebacken!");
    }

    // Getter & Setter
    public String getTyp() {
	return this.typ;
    }
    
    public void setTyp(String typ) {
	this.typ = typ;
    }
    
    public int getDurchmesser() {
	return this.durchmesser;
    }
    
    public void setDurchmesser(int durchmesser) {
	if (durchmesser < 10 || durchmesser > 100) {
	    System.out.println("Solche Pizzen gibt es nicht!");
	    this.durchmesser = 0;
	} else {
	    this.durchmesser = durchmesser;
	}
    }
    
    // Methode (vom Objekt)
    void beschreibePizza() {
	System.out.print("Ich bin eine Pizza: ");
	System.out.println(getTyp() + " " + getDurchmesser() + " cm");
    }
}
