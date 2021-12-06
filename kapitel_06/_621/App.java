package kapitel_06._621;

public class App {
    
    public static void main(String[] args) {


        Bruch b = new Bruch(3);
        b.ausgeben();  // 1/3

        Bruch c = new Bruch(4, 10);
        c.ausgeben();  // 4/10
        
        // Hier wird der neue Wert nicht aufgefangen
        b.multipliziere(c);
        b.ausgeben(); // 1/3
        
        Bruch d = b.multipliziere(c);
        d.ausgeben(); // 4 /30
    }
}
