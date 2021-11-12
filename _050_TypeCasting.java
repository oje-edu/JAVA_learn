
public class _050_TypeCasting {
    
    public static void main(String[] args) {
	
	// Type-Casting - Typen-Umwandlung
	
	// Kleiner Wert in größeren Container ist erlaubt
	byte b1 = 100;
	int int1 = b1;
	// int int1 = (int)b1;  // Funktioniert, ist aber nicht nötig
	System.out.println(int1);  // 100
	
	// Größerer Datentyp geht nicht in einen kleineren Container
	// int int2 = 42;
	// byte b2;
	// b2 = int2;  // Type mismatch: cannot convert from int to byte
	
	// Casting
	// Datentyp in Klammern davorschreiben
	int int3 = 42;
	byte b3 = (byte)int3;
	System.out.println(b3);  // 42
	// Bei zu großen Werten gibt es einen Überlauf
	int int4 = 128;
	byte b4 = (byte)int4;
	System.out.println(b4);  // -128
	int int5 = 129;
	byte b5 = (byte)int5;
	System.out.println(b5);  // -127
	
	// Integer <-> Double
	int int6 = 78;
	double dou6 = int6;
	// double dou6 = (double)int6;  // Funktioniert, ist aber nicht nötig
	System.out.println(dou6);  // 78.0
	
	// Hinter dem Punkt wird abgeschnitten
	double dou7 = 123456.78;
	int int7 = (int)dou7;
	System.out.println(int7);  // 123456
	
	// Integer direkt in einen Float
	float flo8 = 42;
	System.out.println(flo8);  // 42.0
	
	// Integer <-> String
	int int9 = 12345;
	String str9 = Integer.toString(int9);
	System.out.println(str9);             // 12345
	System.out.println(str9.getClass());  // class java.lang.String
	System.out.println(str9.length());    // 5
	
	String str10 = "6789";
	int int10 = Integer.parseInt(str10);
	System.out.println(int10);  // 6789
	System.out.println(((Object)int10).getClass());  // class java.lang.Integer
		
	
    }

}
