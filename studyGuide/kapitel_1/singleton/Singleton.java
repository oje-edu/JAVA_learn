package studyGuide.kapitel_1.singleton;

public class Singleton {
	
	@SuppressWarnings("unused")
	private String mode;
	public boolean debug;
	
	public static Singleton s;
	
	static {
		s = null;
	}
	
	private Singleton() {
		this.mode = "database";
		this.debug = false;
	}
	
	public static void create() {
		if (s == null) {
			Singleton.s = new Singleton();
			System.out.println("Singleton Object wurde erstellt");
		} else {
			System.out.println("Objekt existiert bereits");
		}
	}

}
