package theorie._190_OOP._080_toString;

public class Pizza {
    
    private String typ;
    private int durchmesser;
        
    Pizza() {
	this.setTyp("Salami");
	this.setDurchmesser(32);
    }
    
    Pizza(String typ) {
	this.setTyp(typ);
	this.setDurchmesser(32);
    }
    
    Pizza(int durchmesser) {
	this.setTyp("Salami");
	this.setDurchmesser(durchmesser);
    }
    
    Pizza(String typ, int durchmesser) {
	this.setTyp(typ);
	this.setDurchmesser(durchmesser);
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
    
    // toString()
    // Wird automatisch ausgeführt, wenn ein print auf das Objekt gemacht wird.
    // Muss einen String zurück geben.
    // Annotation @Override zur Kontrolle, ob hier wirklich eine Methode überschrieben wird.
    @Override
    public String toString() {
	return "Ich bin eine Pizza: " + getTyp() + " " + getDurchmesser() + " cm";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
