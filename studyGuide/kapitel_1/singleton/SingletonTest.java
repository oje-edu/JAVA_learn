package studyGuide.kapitel_1.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton.create(); 						// Singleton Object wurde erstellt
		Singleton.create(); 						// Objekt existiert bereits
		
		System.out.println(Singleton.s.debug);      // false

	}

}
