package studyGuide.mixed_uebungen;


public class CaesarVerschluesselung {
	
	static String text = "Nero burning Rom";
	static int keyShift = 10;

	public static void main(String[] args) {

		String encoded = encode(text, keyShift);
		System.out.println("Klartext: " + text + "\nVerschlüsselt: " + encoded);
		
		System.out.println();
		
		String decoded = decode(encoded, keyShift);
		System.out.println("Verschlüsselt: " + encoded + "\nKlartext: " + decoded);

	}

	public static String encode(String text, int keyShift) {
		
		String encoded = "";
		text = text.toLowerCase();
		int length = text.length();
		
		for(int i = 0; i < length; i++) {
			char next = text.charAt(i);
			encoded += shift(next, keyShift);
		}
		
		return encoded;
	}
	
	public static String decode(String encoded, int keyShift) {
		
		String decoded = "";
		encoded = encoded.toLowerCase();
		int length = encoded.length();
		
		for(int i = 0; i < length; i++) {
			char next = encoded.charAt(i);
			decoded += shift(next, 26 - keyShift);
		}
		
		return decoded;
	}
	
	public static char shift(char letter, int keyShift) {
		
		if(letter >= 'a' && letter <= 'z') {
			letter += keyShift;
		}
		
		while(letter > 'z') letter -= 26;
		
		return letter;
	}

	
}
