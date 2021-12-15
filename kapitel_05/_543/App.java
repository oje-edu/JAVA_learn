package kapitel_05._543;

public class App {
    
    public static void main(String[] args) {

        Bruch a = new Bruch();
        a.setze(3);

        Bruch b = new Bruch();
        b.setze(3, 5);
        
        a.ausgeben();  // 3/1
        b.ausgeben();  // 3/5
    }
}
