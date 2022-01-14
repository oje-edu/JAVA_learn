package theorie._700_790_._720_Lambda._010_AbstractClassToLambda;

public class _040_ {
	
	public static void main(String[] args) {
		
		// Lambda expression	
		Thread t = new Thread(() -> printOut());
		t.start();
	
	}
	
	static void printOut() {
		System.out.println("Hello");  // Hello
	}
	

}
