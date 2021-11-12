package theorie._190_OOP._050_Konstruktor;

public class App {
    
    public static void main(String[] args) {
	
	Pizza p1 = new Pizza();
	p1.beschreibePizza();
	
	Pizza p2 = new Pizza();
	p2.typ = "Margherita";
	p2.durchmesser = 28;
	p2.beschreibePizza();
    }
}
