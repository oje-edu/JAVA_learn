package theorie._190_OOP._090_StatischeAttribute;

public class Pizza {
    
    // Statische Attribute gehören der Klasse (und nicht einem Objekt)
    // Klassen-Variable
    protected static int counter = 0;
    
    private String typ;
    private int durchmesser;
        
    Pizza() {
	// int counter = 0;
	this.setTyp("Salami");
	this.setDurchmesser(32);
	// Solange es keine lokale Variable counter gibt,
	// dürfte Pizza. weggelassen werden.
	// counter++;
	Pizza.counter++;
    }
    
    Pizza(String typ) {
	this.setTyp(typ);
	this.setDurchmesser(32);
	Pizza.counter++;
    }
    
    Pizza(int durchmesser) {
	this.setTyp("Salami");
	this.setDurchmesser(durchmesser);
	Pizza.counter++;
    }
    
    Pizza(String typ, int durchmesser) {
	this.setTyp(typ);
	this.setDurchmesser(durchmesser);
	Pizza.counter++;
    }

    // Getter & Setter
    public String getTyp() {
	return this.typ;
	// return typ;
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
    
    @Override
    public String toString() {
	return "Ich bin eine Pizza: " + getTyp() + " " + getDurchmesser() + " cm";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
