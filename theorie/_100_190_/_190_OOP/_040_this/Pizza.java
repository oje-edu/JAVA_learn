package theorie._100_190_._190_OOP._040_this;

public class Pizza {
    
    // Standardwerte
    String typ = "Salami";
    int durchmesser = 32;
    
    // Methode (vom Objekt)
    void beschreibePizza() {
	System.out.print("Ich bin eine Pizza: ");
	// System.out.println(typ + " " + durchmesser + " cm");
	System.out.println(this.typ + " " + this.durchmesser + " cm");
    }
}
