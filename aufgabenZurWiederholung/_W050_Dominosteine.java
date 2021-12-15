package aufgabenZurWiederholung;

public class _W050_Dominosteine {
	static String space = "     ";

    public static void main(String[] args) {

        /*
         * Dominosteine
         *
         * Gib alle möglichen Dominosteine in der folgenden Form aus.
         *
         * (0|0)(0|1)(0|2)(0|3)(0|4)(0|5)(0|6)
         *      (1|1)(1|2)(1|3)(1|4)(1|5)(1|6)
         *           (2|2)(2|3)(2|4)(2|5)(2|6)
         *                (3|3)(3|4)(3|5)(3|6)
         *                     (4|4)(4|5)(4|6)
         *                          (5|5)(5|6)
         *                               (6|6)
         */
    	for (int x = 0; x <= 6; x++) {
    		
    		for (int sp = 1; sp < (x + 1); sp++ ) {
    			System.out.print(space);
    		}
    		
			for (int y = x; y <= 6; y++) {
				System.out.print("(" + x + "|" + y + ")");
			}
			
			System.out.println("");
    	}
    }
}

