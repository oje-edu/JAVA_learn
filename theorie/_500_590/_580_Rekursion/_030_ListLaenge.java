package theorie._500_590._580_Rekursion;

import java.util.ArrayList;
import java.util.List;

public class _030_ListLaenge {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<>();
		liste.add(1);
		liste.add(1);
		liste.add(1);
		liste.add(1);
		liste.add(1);
		// "Neue" Java funktion Size (früher mittels Rekursion)
		System.out.println(liste.size());            // 5
		
		// Rekursiv
		System.out.println(listenLaenge(liste));     // 5

	}
	
	static int listenLaenge(List<Integer> liste) {
		
		if (liste.isEmpty()) return 0;
		else {
			liste.remove(0);
			return 1 + (listenLaenge(liste));
		}
		
		// 1 + listenLaenge(liste(4))
		// 1 + 1 + listenLaenge(liste(3))
		// 1 + 1 + 1 + listenLaenge(liste(2))
		// 1 + 1 + 1 + 1 + listenLaenge(liste(1))
		// 1 + 1 + 1 + 1 + 1 + listenLaenge(liste(0))
		// 1 + 1 + 1 + 1 + 1 + 0
	}
}
