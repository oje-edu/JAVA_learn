package theorie._700_790_._720_Lambda._010_AbstractClassToLambda;

public class _020_ {
	
	// Anonyme Klasse
	
	public static void main(String[] args) {
		
		Runnable runi = new Runnable() {
			public void run() {
				printOut();
			}
		};
		System.out.println(runi);  // _020_$1@b81eda8
	
		Thread t = new Thread(runi);
		t.start();
	
	}
	
	static void printOut() {
		System.out.println("Hello");  // Hello
	}
	

}
