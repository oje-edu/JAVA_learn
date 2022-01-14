package theorie._700_790_._720_Lambda._010_AbstractClassToLambda;

public class _030_ {
	
	public static void main(String[] args) {
		
		// Lambda expression	
		Runnable runi = () -> printOut();

		System.out.println(runi);  // _030_$$Lambda$47/0x0000000800bad840@68de145
	
		Thread t = new Thread(runi);
		t.start();
	
	}
	
	static void printOut() {
		System.out.println("Hello");  // Hello
	}
	

}
