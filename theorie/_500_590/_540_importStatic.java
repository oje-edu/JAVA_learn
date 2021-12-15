package theorie._500_590;

import static java.lang.Math.*;

public class _540_importStatic {
	
	// Statisches Importieren (In diesem Beispiel muss Math nicht mehr davor geschrieben werden)

	public static void main(String[] args) {
		
		System.out.println(pow(2, 2));         	// 4.0
		System.out.println(round(4.49));       	// 4
		System.out.println(random() * 6 + 1);
		System.out.println(sqrt(4)); 			// 2.0
		System.out.println(abs(-7)); 			// 7

	}
}
