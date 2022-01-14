package theorie._700_790_._720_Lambda;

public class _010_ {
	
	// Anonyme Klasse
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				printOut();
			}
		});
		t.start();
	}
	
	static void printOut() {
		System.out.println("Hello");
	}
}