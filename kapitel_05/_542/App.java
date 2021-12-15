package kapitel_05._542;

public class App {
    
    public static void main(String[] args) {

        Bruch a = new Bruch();
        a.zaehler = 3;
        a.nenner = 9;

        Bruch b = new Bruch();
        b.zaehler = 1;
        b.nenner = 4;
        
        // Channing
        a.multipliziere(b).ausgeben();

        a.ausgeben();  // 3/36
        b.ausgeben();  // 1/4
        
        Bruch c = Bruch.multipliziere_static(a, b);
        c.ausgeben();  // 3/144
    }
}
