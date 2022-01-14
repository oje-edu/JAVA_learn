package theorie._700_790_._710_Generics;

import java.util.ArrayList;
import java.util.List;

public class _010_RawTypeVsGenericType {

	public static void main(String[] args) {
		
		// Raw type
		// Eine Liste mit Objekten der Klasse Object (wenn ohne diamonds operator)
		List namen = new ArrayList<>();
		namen.add("Peter");
		// Das Object MUSS zum String gecastet werden:
		String name = (String)namen.get(0);
		System.out.println(name);					// Peter
		// In namen gehen alle Objekte:
		namen.add(23);
		
		// Generics
		// Reference type wird im "diamond operator" angegeben.
		List<String> namen2 = new ArrayList<>();
		namen2.add("Paul");
		String name2 = namen2.get(0);
		System.out.println(name2); 					// Paul
		// In namen2 gehen nur Strings:
		// namen2.add(23);

	}

}
