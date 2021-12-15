package theorie._500_590._580_Rekursion;

import java.util.ArrayList;
import java.util.List;

public class _040_ListenSumme {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<>();
		liste.add(1);
		liste.add(3);
		liste.add(7);
		liste.add(11);
		liste.add(23);
		
		// Rekursiv
		System.out.println(listenSumme(liste));     // 45

	}
	
	static int listenSumme(List<Integer> liste) {
		
		if (liste.isEmpty()) return 0;
		return liste.remove(0) + listenSumme(liste);
	}
}
