package theorie._100_190_._190_OOP._010_KlassenAttribute;

public class App {
    
    public static void main(String[] args) {
	
	Pizza p1 = new Pizza();
	System.out.println(p1);  // _190_OOP._010_KlassenAttribute.Pizza@2f92e0f4
	
	p1.typ = "Margherita";
	p1.durchmesser = 28;
	System.out.println(p1.typ + ": " + p1.durchmesser + " cm");
	// Margherita: 28 cm
	
	Pizza p2 = new Pizza();
	p2.typ = "Salami";
	p2.durchmesser = 30;
	System.out.println(p2.typ + ": " + p2.durchmesser + " cm");
	// Salami: 30 cm
	
    }
}
