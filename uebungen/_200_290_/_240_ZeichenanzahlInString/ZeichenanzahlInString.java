package uebungen._200_290_._240_ZeichenanzahlInString;

import java.util.HashMap;

public class ZeichenanzahlInString {

	public static void main(String[] args) {
        /*
         * Zeichenanzahl in String
         *
         * Schreibe eine Funktion, die einen String entgegen nimmt  und die Anzahl der einzelnen Zeichen in Form einer HashMap zurück gibt.
         *
         * Z.B. 'Hello World' wird zu:
         * { =1, r=1, d=1, e=1, W=1, H=1, l=3, o=2}
         */
		String myString = "Hello World";
		
		System.out.println(MyHash(myString));
	}

	static HashMap<Character, Integer> MyHash(String s) {
		HashMap<Character, Integer> myHashMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (myHashMap.containsKey(s.charAt(i))) {
				int j = myHashMap.get(s.charAt(i));
				j++;
				myHashMap.put(s.charAt(i), j);
			} else {
				myHashMap.put(s.charAt(i), 1);
			}
		}
		return myHashMap;
	}
}
