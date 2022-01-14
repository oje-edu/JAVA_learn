package theorie._700_790_._710_Generics;

import java.util.ArrayList;

class Gebaeude {
	@Override
	public String toString() {
		return "Gebäude";
	}
}

class Buero extends Gebaeude {
	@Override
	public String toString() {
		return "Büro";
	}
}

public class _040_WildCardExtends {

	public static void main(String[] args) {
		
		ArrayList<Gebaeude> gebaeude1 = new ArrayList<>();
		gebaeude1.add(new Gebaeude());
		gebaeude1.add(new Gebaeude());
		printGebaeude(gebaeude1);
		
		ArrayList<Buero> gebaeude2 = new ArrayList<>();
		gebaeude2.add(new Buero());
		gebaeude2.add(new Buero());
		printGebaeude(gebaeude2);
		
		ArrayList<Gebaeude> gebaeude3 = new ArrayList<>();
		gebaeude3.add(new Gebaeude());
		gebaeude3.add(new Buero());
		printGebaeude(gebaeude3);
		
	}
	
	// <? extends ...>
	// Eine Klasse, die superclass erweitert, oder superclass selber
	static void printGebaeude(ArrayList<? extends Gebaeude> gebaeude) {
		for (int i = 0; i < gebaeude.size(); i++) {
			System.out.println(i + 1 + ": " + gebaeude.get(i).toString());
		}
	}
	
}
