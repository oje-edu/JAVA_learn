package kapitel_05._562;

public class App {
    
    public static void main(String[] args) {

        Bruch a = new Bruch();
        a.ausgeben();  // 0/1

        Bruch b = new Bruch(3);
        b.ausgeben();  // 1/3

        Bruch c = new Bruch(4, 10);
        c.ausgeben();  // 2/5
    }
}
