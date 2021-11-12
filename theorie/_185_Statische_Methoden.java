package theorie;

public class _185_Statische_Methoden {
	// Statische Methoden/Attribute werden in Eclipse kursiv dargestellt
	
	static void gibAus() {
		System.out.println("Ich bin eine statische Methode");
	}
	
	static int addiere (int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		gibAus();		
		System.out.println(addiere(3, 4));
	} 
}
