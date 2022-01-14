package theorie._700_790_._720_Lambda;

public class _020_ {
	
	// Anonyme Klasse
	
	public static void main(String[] args) {
		Runnable runI = new Runnable() {
			public void run() {
				printOut();
			}
		};
		System.out.println(runI);  					// _020_$1@7a81197d
			
		Thread t = new Thread(runI);
		t.start();
	}
	
	static void printOut() {
		System.out.println("Hello"); 			 	// Hello
	}
}