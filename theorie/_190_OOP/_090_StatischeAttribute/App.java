package theorie._190_OOP._090_StatischeAttribute;

public class App {
    
    public static void main(String[] args) {
	
	Pizza p1 = new Pizza();
	System.out.println(p1);
	System.out.println("Gebackene Pizzen: " + Pizza.counter);
	// Gebackene Pizzen: 1
	
	Pizza p2 = new Pizza("Funghi");
	System.out.println(p2);
	
	Pizza p3 = new Pizza(34);
	System.out.println(p3);
	
	Pizza p4 = new Pizza("Hawaii", 36);
	System.out.println(p4);
	System.out.println("Gebackene Pizzen: " + Pizza.counter);
	// Gebackene Pizzen: 4
    }
}
