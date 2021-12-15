package kapitel_10._Bruch_;

import java.util.TreeSet;

public class BruchTreeSet {

	public static void main(String[] args) {
		Bruch bruch1 = new Bruch(1, 2);
		Bruch bruch2 = new Bruch(3, 4);
		Bruch bruch3 = new Bruch(2, 6);
		TreeSet<Bruch> bruchSet = new TreeSet<>();
		bruchSet.add(bruch1);
		bruchSet.add(bruch2);
		bruchSet.add(bruch2); // Wird nicht eingefügt da duplikat
		bruchSet.add(bruch3);
		
		bruchSet.forEach(bruch -> bruch.ausgeben()); // 1/3 1/2 3/4

	}
}
