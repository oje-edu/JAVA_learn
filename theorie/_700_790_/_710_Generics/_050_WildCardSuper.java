package theorie._700_790_._710_Generics;

import java.util.ArrayList;

class Gebaeude1 {
	@Override
	public String toString() {
		return "Gebäude";
	}
}

class Buero1 extends Gebaeude1 {
	@Override
	public String toString() {
		return "Büro";
	}
}

public class _050_WildCardSuper {

	public static void main(String[] args) {
		
		ArrayList<Gebaeude1> gebaeude1 = new ArrayList<>();
		gebaeude1.add(new Gebaeude1());
		gebaeude1.add(new Gebaeude1());
		printGebaeude(gebaeude1);
		
		ArrayList<Buero1> gebaeude2 = new ArrayList<>();
		gebaeude2.add(new Buero1());
		gebaeude2.add(new Buero1());
		printGebaeude(gebaeude2);
		
		ArrayList<Gebaeude1> gebaeude3 = new ArrayList<>();
		gebaeude3.add(new Gebaeude1());
		gebaeude3.add(new Buero1());
		printGebaeude(gebaeude3);
		
	}
	
	// <? super ...>  (quasi das gegenteil von _040_WildCardExtends)
	// Eine Klasse, die Vorfahre von subclass ist, oder subclass selber 
	static void printGebaeude(ArrayList<? super Buero1> gebaeude1) {
		for (int i = 0; i < gebaeude1.size(); i++) {
			System.out.println(i + 1 + ": " + gebaeude1.get(i).toString());
		}
	}
	
}
