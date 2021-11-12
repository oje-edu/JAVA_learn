package theorie;

public class _070_ArithmeticOperators {
    
    public static void main(String[] args) {

	// Modulo
	System.out.println(11 % 2);  // 1
	System.out.println(12 % 2);  // 0
	System.out.println(12 % 12);  // 0
	System.out.println(11 % 12);  // 11 (die erste Zahl)
	System.out.println(12.6 % 2.5);  // 0.09999999999999964
	
	// Pre/Post-Increment/Decrement-Operators
	int x = 7;
	x++;
	System.out.println(x);  // 8
	--x;
	x--;
	System.out.println(x);    // 6
	System.out.println(x--);  // 6
	System.out.println(--x);  // 4
	int y = 6 + --x;
	System.out.println(y);  // 9
	// y = 11 + y++;
	y = 11 + y;
	System.out.println(y);  // 20
	
	// Ganzzahl-Division
	System.out.println(y/x);  // 6 (20/3)
	
	int z = 7;
	z /= 4;
	System.out.println(z);  // 1

	System.out.println(100 / 70);  // 1
	System.out.println(100 / 70.0);  // 1.4285714285714286
    }
}
