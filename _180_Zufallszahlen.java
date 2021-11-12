import java.util.Random;

public class _180_Zufallszahlen {
    
    public static void main(String[] args) {
	
	Random r = new Random();
	System.out.println(r);  // java.util.Random@372f7a8d
	
	// nextInt(bound)
	// Gibt 0 bis bound (exklusiv) zurück
	System.out.println(r.nextInt(6));  // 0 - 5
	System.out.println(r.nextInt(6) + 1);  // 1 - 6
	
	// Math.random()
	// 0 - 0.99999999
	System.out.println(Math.random());                      // 0 - 0.9999999
	System.out.println(Math.random() * 6);                  // 0 - 5.9999999
	System.out.println((int)(Math.random() * 6));           // 0 - 5
	System.out.println((int)(Math.random() * 6) + 1);       // 1 - 6
	System.out.println(Math.floor(Math.random() * 6) + 1);  // 1.0 - 6.0
	
    }
}
