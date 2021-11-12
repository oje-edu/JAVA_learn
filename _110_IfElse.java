
public class _110_IfElse {
    
    public static void main(String[] args) {
	
	// if else
	int x = 7;
	
	// if
	if (x == 7) {
	    System.out.println("In x ist eine sieben!");
	}
	
	// if else
	x = 11;
	if (x == 7) {
	    System.out.println("In x ist eine sieben!");
	} else {
	    System.out.println("In x ist KEINE sieben!");
	}
	
	// if else if
	x = 11;
	if (x == 7) {
	    System.out.println("In x ist eine sieben!");
	} else if (x== 11) {
	    System.out.println("In x ist eine elf!");
	}
	
	// if else if else
	x = 17;
	if (x == 7) {
	    System.out.println("In x ist eine sieben!");
	} else if (x== 11) {
	    System.out.println("In x ist eine elf!");
	} else if (x== 12) {
	    System.out.println("In x ist eine zwölf!");
	} else if (x== 13) {
	    System.out.println("In x ist eine dreizehn!");
	} else {
	    System.out.println("In x ist KEINE der Zahlen!"); 
	}
	
    }

}
