package nightmare;

public class nightMare {

	public static void main(String[] args) {
		System.out.println(checkLoser("Plocher"));
		System.out.println();
		System.out.println(checkLoser("Allen Andrén"));
	}
	
	public static String checkLoser(String n) {
		if(n.contains("Plocher") || n.contains("plocher")) {
			System.out.println(n + "?");
			return "https://www.youtube.com/watch?v=lGWhZptUnNU";
		} else {
			System.out.println(n + "?");
			return "https://youtu.be/aS91UaGJEqI?t=325";
			
		}
	}
}
