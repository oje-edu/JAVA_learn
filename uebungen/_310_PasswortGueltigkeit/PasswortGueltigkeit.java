package uebungen._310_PasswortGueltigkeit;

public class PasswortGueltigkeit {

	public static void main(String[] args) {
	    /*
	     * Passwort-Gültigkeit
	     *
	     * Prüfe die Gültigkeit eines Passwortes.
	     * Dabei müssen die folgenden Kriterien erfüllt sein:
	     * Das Passwort muss aus mindestens neun Zeichen bestehen.
	     * Das Passwort muss Großbuchstaben aufweisen.
	     * Das Passwort muss Kleinbuchstaben aufweisen.
	     * Im Passwort müssen Ziffern vorkommen.
	     * Im Passwort müssen Sonderzeichen vorkommen.
	     * Aus jedem der vier oben genannten Zeichentypen müssen mindestens zwei Zeichen vorkommen.
	     * Also zwei Großbuchstaben, zwei Kleinbuchstaben usw.
	     */
		System.out.println(checkPassword("Pass1")); 		// Das Passwort ist zu kurz (min. 9 Zeichen).
		System.out.println(checkPassword("PASSWÖRT2")); 	// Es müssen mindestens 2 Kleinbuchstaben vorkommen.
		System.out.println(checkPassword("Passwört2")); 	// Es müssen mindestens 2 Grossbuchstaben vorkommen.
		System.out.println(checkPassword("PasswÖrt2")); 	// Es müssen mindestens 2 Ziffern vorkommen.
		System.out.println(checkPassword("2PasswÖrt3")); 	// Es müssen mindestens 2 Sonderzeichen vorkommen.
		System.out.println(checkPassword("^2PasswÖrt3~")); 	// Passwort ist OK
	}

	static String checkPassword(String pwd) {

		if (pwd.length() < 9) {
			return "Das Passwort ist zu kurz (min. 9 Zeichen).";
		}
		if (checkCapitals(pwd) < 2) {
			return "Es müssen mindestens 2 Grossbuchstaben vorkommen.";
		}
		if (checkLowers(pwd) < 2) {
			return "Es müssen mindestens 2 Kleinbuchstaben vorkommen.";
		}
		if (checkNumbers(pwd) < 2) {
			return "Es müssen mindestens 2 Ziffern vorkommen.";
		}
		if (checkSpecials(pwd) < 2) {
			return "Es müssen mindestens 2 Sonderzeichen vorkommen.";
		}
		return "Passwort ist OK";

	}

	// https://www.torsten-horn.de/techdocs/ascii.htm
	static int checkCapitals(String pwd) {
		return countLetters(pwd, 'A', 'Z') + countLetters(pwd, 'Ä', 'Ü');
	}

	static int checkLowers(String pwd) {
		return countLetters(pwd, 'a', 'z') + countLetters(pwd, 'ä', 'ü');
	}

	static int checkNumbers(String pwd) {
		return countLetters(pwd, '0', '9');
	}

	static int checkSpecials(String pwd) {
		return countLetters(pwd, '!', '/') + countLetters(pwd, ':', '@') + countLetters(pwd, '[', '`')
				+ countLetters(pwd, '{', '~');
	}

	static int countLetters(String pwd, char min, char max) {
		int count = 0;
		for (char c : pwd.toCharArray()) {
			if (c >= min && c <= max) {
				count += 1;
			}
		}
		return count;
	}
}
