package theorie._010_090_;

public class _040_String {
    
    // String - Zeichenkette
    // Objekt einer Klasse -> Datentyp gro�geschrieben
    // Doppelte Anf�hrungszeichen
    
    public static void main(String[] args) {
    
        String text = "Hello";
        System.out.println(text); // Hello
        
        // String Verkettung - Konkatenation
        // String concatenation
        // Pluszeichen als Operator

        // var name = "Peter";
        String name = "Peter";
        System.out.println(text + " " + name);  // Hello Peter
        
        // Nur ein Operand muss ein String
        // Implizite Typenkonvertierung
        System.out.println(text + " " + 42);    // Hello 42
        System.out.println(42 + text);          // 42Hello
        System.out.println(text + ' ' + name);  // Hello Peter
        
        // length()
        System.out.println(name.length());  // 5
    }

}
