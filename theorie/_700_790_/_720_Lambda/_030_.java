package theorie._700_790_._720_Lambda;

public class _030_ {

	public static void main(String[] args) {
		// Lambda expression (Ausdruck)
		Runnable runI = () -> printOut();
			
		System.out.println(runI);  					// _030_$$Lambda$1/0x0000000800ba0840@23fc625e
			
		Thread t = new Thread(runI);
		t.start();
	}
	
	static void printOut() {
		System.out.println("Hello"); 			 	// Hello
	}
}