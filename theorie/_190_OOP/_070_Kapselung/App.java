package theorie._190_OOP._070_Kapselung;

public class App {
    
    public static void main(String[] args) {
	
	Pizza p1 = new Pizza();
	p1.beschreibePizza();
	
	Pizza p2 = new Pizza();
	p2.setTyp("Margherita");
	p2.setDurchmesser(128);
	// p2.durchmesser = 128;
	p2.beschreibePizza();
	
	Pizza p3 = new Pizza("Funghi");
	p3.beschreibePizza();
	
	Pizza p4 = new Pizza(34);
	p4.beschreibePizza();
	
	Pizza p5 = new Pizza("Hawaii", 36);
	p5.beschreibePizza();
    }
}
