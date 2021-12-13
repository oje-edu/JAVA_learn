package theorie._200_290_;

public class _290_Zahlensysteme {

	public static void main(String[] args) {
		// Oktal
		// Führende 0 macht den Wert dahinter zu einer Okalzahl
		// sonst oft: 0o10;
		int oktal = 010;
		System.out.println(oktal); 						// 8
		
		// hexadezimal (x | X)
		int hexa = 0x10;
		System.out.println(hexa); 						// 16
		
		int hexa2 = 0xff;
		System.out.println(hexa2);						// 255
		// CSS # FF8420 -> 255, 132, 32
		
		// Binär (b | B)
		int binA = 0b10;	
		System.out.println(binA); 						// 2
		int binB = 0b11111111;
		System.out.println(binB); 						// 255
		
		// Wrappertyp.valueOf(String string, int basis)
		System.out.println(Integer.valueOf("3F", 16)); 	// 3x16 + 15 = 63
		System.out.println(Integer.valueOf("37", 8));   // 3x8 + 7 = 31
		
		// to ... String		
		System.out.println(Integer.toBinaryString(9));  // 1001
		System.out.println(Integer.toOctalString(9));   // 11
		System.out.println(Integer.toHexString(29));    // 1d
	}

}
