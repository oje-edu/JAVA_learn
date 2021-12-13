package theorie._010_090_;

public class _030_PrimitiveDataTypes {
    
    public static void main(String[] args) {
	
	// Ganzzahlen
	// 256, 65000, (16.7 Millionen), 4.2 Millarden
	
	// Byte - 8-Bit (-128 bis 127)
	byte b1 = 127;
	System.out.println(b1);
	byte b2 = -128;
	System.out.println(b2);
	
	// Short - 16-Bit (65.536)
	short sh1 = -32768;
	System.out.println(sh1);
	short sh2 = 32767;
	System.out.println(sh2);
	
	// Integer - 32-Bit (4.294.967.296)
	System.out.println(Math.pow(2,  32));        // 4.294967296E9
	System.out.println(Math.pow(2,  32)/2-1);    // 2.147483647E9
	System.out.println(-(Math.pow(2,  32)/2));  // -2.147483648E9
	int i1 = 2_100_000_000;
	System.out.println(i1);
	System.out.println(i1);
	
	// Long - 64-Bit
	// Abschlie�endes L
	// Das kleine l geht technisch auch,
	// verst��t aber gegen die Programmierrichtlinie,
	// da es leicht mit der 1 verwechselt werden k�nnte.
	long lo1 = 5_000_000_000_000L;
	System.out.println(lo1);  // 5000000000000
	System.out.println(Math.pow(2,  64));        // 1.8446744073709552E19
	System.out.println(Math.pow(2,  64)/2-1);    // 9.223372036854776E18
	System.out.println(-(Math.pow(2,  64)/2));  // -9.223372036854776E18
	
	// Flie�kommazahlen
	
	// Float - 32-Bit
	// Abschlie�endes F
	float f1 = 1234.567F;
	System.out.println(f1);  // 1234.567
	
	// Double - 64-Bit
	// Das D am Ende ist optional
	double d1 = 1234567.1234567;
	System.out.println(d1);
	
	// Boolean - 8-Bit
	boolean boo1 = true;
	System.out.println(boo1);  // true
	boolean boo2 = false;
	System.out.println(boo2);  // false
	
	// Char - 16-Bit
	// Einfache Anf�hrungsstriche
	char c1 = 'A';
	System.out.println(c1);  // A
	
	// Char als ASCII-Wert dezimal angeben
	char c2 = 65;
	System.out.println(c2);  // A
	char c3 = 97;
	System.out.println(c3);  // a
	
	// Unicode
	char c4 = '\u0024';
	System.out.println(c4);  // $
	
	// Unterstrich
	System.out.println(1_000_000);  // 1000000
	System.out.println(1_______0);  // 10
	// System.out.println(_10);       // java.lang.Error
	// System.out.println(10_);       // java.lang.Error
	// System.out.println(123_.456);  // java.lang.Error
	// System.out.println(123._456);  // java.lang.Error
	

	
	
    }

}
