package kapitel_04;

public class Zeichensatz {

    public static void main(String[] args) {
	

	System.out.println("Test: " + (char) 65);
	System.out.println((char) 65);

	byte zahl = 65;
	// short zahl = 65;
	String zeichensatz = "";

	// while (zahl < 127) {
	while (zahl < 128) {
	    // zeichensatz = zeichensatz + (char) zahl;
	    zeichensatz += (char) zahl;
	    zahl++;
	    System.out.println(zeichensatz);
	}
    }
}
