package studyGuide.mixed_uebungen;

import java.util.ArrayList;
import javax.swing.JOptionPane;

// Aufgabe: https://de.wikipedia.org/wiki/Sieb_des_Eratosthenes

public class Eratosthenes {

	private int max;
	private ArrayList<Integer> primes;
	
	{
		primes = new ArrayList<Integer>();
	}

	public static void main(String[] args) {
		
		try {
			Eratosthenes e = new Eratosthenes(50);
			e.calcPrimes();
			e.printPrimes();
			
		} catch (Exception e) {
			System.out.println("Fehlerhafte Eingabe");
		}
	}
	
	public Eratosthenes() throws Exception {
		this.max = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl angeben"));
	}
	
	public Eratosthenes(int max) {
		this.max = max;
	}
	
	private void calcPrimes() {
		
		outer: for(int i = 2; i <= this.max; i++) {
			
			if(primes.size() == 0) {
				primes.add(i);
				continue;
			}
			
			for(int p : primes) if(i % p == 0) continue outer;
		
			primes.add(i);	
		}
		
	}
	
	private void printPrimes() {
		for(int p : primes) System.out.print(p + " ");
	}
}
