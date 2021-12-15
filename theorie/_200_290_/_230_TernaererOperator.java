package theorie._200_290_;

public class _230_TernaererOperator {
    
    public static void main(String[] args) {
	
	// Ternärer Operator
	// Kurzform von if else
	// Ternär, weil es drei Operanden gibt.
	// Drei Teile: bedingung ? true-Fall : false-Fall
	
	// Binären Operatoren: 7 > 3 (zwei Operanden)
	// Unäre Operatoren: !(4 == 5), !true (einen Operanden)
	
	int stunde = 20;  // Stunde kommt eigentlich vom OS
	
	// Per if else
	String begruessung;
	if (stunde > 18) {
	    begruessung = "Guten Abend";
	} else {
	    begruessung = "Guten Tag";
	}
	System.out.println(begruessung);
	
	if (stunde > 18) begruessung = "Guten Abend";
	else             begruessung = "Guten Tag";
	System.out.println(begruessung);
	
	// Per Ternärer Operator
	String begruessungT = stunde > 18 ? "Guten Abend" : "Guten Tag";
	System.out.println(begruessungT);
	
    }
}
