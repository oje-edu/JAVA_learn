package theorie._190_OOP._050_Konstruktor;

public class Pizza {
    
    String typ;
    int durchmesser;
    
    // Den Default-Konstruktor ergänzen
    Pizza() {
	this.typ = "Salami";
	this.durchmesser = 32;
	System.out.println("Es wurde eine Pizza gebacken!");
    }
    
    // Methode (vom Objekt)
    void beschreibePizza() {
	System.out.print("Ich bin eine Pizza: ");
	System.out.println(this.typ + " " + this.durchmesser + " cm");
    }
}
