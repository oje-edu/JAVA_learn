package theorie.kapitel_10_Arrays;

import java.util.Collection;
import java.util.HashMap;

public class _470_HashMap {

	public static void main(String[] args) {
		
		// HashMap
		HashMap<String, String> hauptstaedte = new HashMap<>();
		
		// V put(K key, V value)
		hauptstaedte.put("Deutschland", "Berlin");
		hauptstaedte.put("England", "London");
		hauptstaedte.put("Italien", "Rom");
		System.out.println(hauptstaedte);  						// {Deutschland=Berlin, England=London, Italien=Rom}
		
		// size()
		System.out.println(hauptstaedte.size()); 				// 3
		
		// V get(K key)
		// Liefert den Wert des übergebenen Schlüssels zurück
		System.out.println(hauptstaedte.get("Deutschland"));  	// Berlin
		
		// V remove(K key)
		System.out.println(hauptstaedte.remove("Deutschland")); // Berlin
		System.out.println(hauptstaedte);						// {England=London, Italien=Rom}

		// Collection values()
		Collection<String> c = hauptstaedte.values();
		for (String h : c) {
			System.out.print(h + " ");							// London Rom 
		}
		System.out.println(); 									
		

		for (String h : hauptstaedte.values()) {
			System.out.print(h + " ");							// London Rom 
		}
		System.out.println(); 									
		
		// Collection keySet()
		for (String land : hauptstaedte.keySet()) {
			System.out.print(land + " ");						// England Italien
		}
		System.out.println(); 	
		
		for (String land : hauptstaedte.keySet()) {
			System.out.println("Land " + land + " - Hauptstadt: " + hauptstaedte.get(land)); // Land England - Hauptstadt: London Land Italien - Hauptstadt: Rom
		}
		
		// clear()
		hauptstaedte.clear();
		System.out.println(hauptstaedte); 						// {}
	}
}
