package theorie;

public class _220_DefaultWerteVonAttributen {
    
    // Attribute werden automatisch mit ihren Default-Werten initialisiert.
    // Dies gilt für statische Attribute und für Objekt-Attribute.
    
    // byte, short, int, long -> 0
    // float, double -> 0.0
    // boolean -> false
    // char -> '\u0000'

    static int counter;
    // static int counter = 0;
    
    double groesse;
    boolean geloescht;
    char buchstabe;
    
    public static void main(String[] args) {
	
	System.out.println(counter);                                                     // 0
	System.out.println(new _220_DefaultWerteVonAttributen().groesse);                // 0.0
	System.out.println(new _220_DefaultWerteVonAttributen().geloescht);              // false
	System.out.println("x" + new _220_DefaultWerteVonAttributen().buchstabe + "x");  // x x
    }
}
