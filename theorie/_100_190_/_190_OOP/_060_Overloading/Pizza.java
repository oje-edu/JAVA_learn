package theorie._100_190_._190_OOP._060_Overloading;

public class Pizza {
    
    String typ;
    int durchmesser;
    
    Pizza() {
	this.typ = "Salami";
	this.durchmesser = 32;
	System.out.println("Es wurde eine Pizza gebacken!");
    }
    
    // Overloading - Überladen
    Pizza(String typ) {
	this.typ = typ;
	this.durchmesser = 32;
	System.out.println("Es wurde eine Pizza gebacken!");
    }
    
    Pizza(int durchmesser) {
	this.typ = "Salami";
	// durchmesser = durchmesser_para;
	this.durchmesser = durchmesser;
	System.out.println("Es wurde eine Pizza gebacken!");
    }
    
    Pizza(String typ, int durchmesser) {
	this.typ = typ;
	this.durchmesser = durchmesser;
	System.out.println("Es wurde eine Pizza gebacken!");
    }
    
    // Methode (vom Objekt)
    void beschreibePizza() {
	System.out.print("Ich bin eine Pizza: ");
	System.out.println(this.typ + " " + this.durchmesser + " cm");
    }
}
