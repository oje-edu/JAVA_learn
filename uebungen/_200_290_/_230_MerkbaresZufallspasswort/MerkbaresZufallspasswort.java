package uebungen._200_290_._230_MerkbaresZufallspasswort;

public class MerkbaresZufallspasswort {
	
    static char[] vowels = "aeiouäöü".toCharArray();
    static char[] capitalVowels = "AEUÄÖÜ".toCharArray();
    static char[] consonants = "bcdfhjkmnprstvwxz".toCharArray();
    static char[] specialCharacters = "/\\%$#@!-_=+?,.:;<>()[]{}*~|^".toCharArray();
    static char[] numbers = "23456789".toCharArray();
    static int maxChars = (int)(Math.random() * 3) + 4;
    static int maxNums = (int)(Math.random() * 3) + 1;
    static char[] pwd = new char[maxChars + 1 + maxNums];
    static String rndPwd = "";

	public static void main(String[] args) {
        /*
         * Merkbares Zufallspasswort
         *
         * Für eine Webseite muss ein Passwort erzeugt werden.
         * Du hast gemerkt, dass eine zufällige Folge von Buchstaben,
         * Ziffern und Sonderzeichen leicht zu progarmmieren,
         * jedoch schlecht zu merken ist.
         *
         * Nun mache folgende Vorgaben an ein automatisch generientes Passwort.
         * Das Passwort muss insgesamt mindestens sechs, maximal zehn Zeichen enthalten.
         * Das Passwort besteht aus einem selbst erstellten Wort,
         * gefolgt von genau einem Sonderzeichen und danach aus einer Zahl.
         * Das Wort hat vier, fünf oder sechs Buchstaben,
         * wobei nur der erste ein Großbuchstabe sein darf.
         * Die Zahl hat eine, zwei oder drei Stellen.
         * Im Wort wechseln Konsonanten mit Vokalen immer ab.
         * Verwechselbare Zeichen sollen nicht vorkommen.
         *
         * Schreibe ein Programm, das ein "merkbares" Zufallspasswort ausgibt.
         */
		
		String myBasePwd = "GFN123";
		
		
		System.out.println("Dein neues Passwort: ");
		System.out.println();
        System.out.println("\t" + generatePassword(myBasePwd));
		System.out.println();
		System.out.println("Keep it on a save place.");
        System.out.println();
        System.out.println("----");
        System.out.println("Thx Mr. G, for the inspiration.");
	}
	

    static String generatePassword(String s) {
    	
    	pwd[0] = rndChar(specialCharacters);    	
    	pwd[1] = (char)Character.toUpperCase(rndChar(consonants));
    	for (int i = 2; i < (maxChars + 1) ; i++) {
    		pwd[i] = i % 2 == 0 ? rndChar(vowels) : rndChar(consonants);
    	}
    	for (int j = maxChars + 1; j < (maxChars + 1 + maxNums); j++) {
    		pwd[j] = rndChar(numbers);
    	}
    	for (char p: pwd) {
    		rndPwd += p;
    	}
      	return s + rndPwd;
    }
    
	static char rndChar(char[] c) {
		char output = c[(int)Math.floor(Math.random() * (c.length))];
		return output;
	}
}
