
public class _060_Rundungsfehler {
    
    public static void main(String[] args) {
	
	boolean test = (2.05-0.05) == 2.0;
	System.out.println(test);  // false
	
	System.out.println(2.05-0.05);  // 1.9999999999999998
    }

}
