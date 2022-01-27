package studyGuide.kapitel_1;

import studyGuide.kapitel_1.person.Person;
import static studyGuide.kapitel_1.person.Person.answer;
//import studyGuide.kapitel_1.person.privat.*;

public class Start {
	
	public String name;

	public static void main(String[] args) {
		Start st = new Start();
		st.name = "Peter";
		
		st.sayHello();
		System.out.println(st.getName());
		
		Person p = new Person();
		System.out.println(p.getFirstname() + " " + p.getLastname()); 	// Hans Wurst
		System.out.println(p); 											// Hans Wurst  (toString())
		// Static Import
		System.out.println(answer);										// 42
		
		Person p2 = new Person("Max");									// Max Mustermann
		System.out.println(p2);
		
		Person p3 = new Person("Max", "Muster");						// Max Muster
		System.out.println(p3);
		
		// mit Rückgabewert im setLastname Setter
		Person p4 = new Person();
		p4.setLastname("Wurst").setFirstname("Hans"); 					// Hans Wurst
		System.out.println(p4);
		
		studyGuide.kapitel_1.person.privat.Person x = new studyGuide.kapitel_1.person.privat.Person();
		System.out.println(x); 											// Person to String Privat
		
	}
	
	public void sayHello() {
		System.out.print("Hello ");
	}
	
	public String getName() {
		String name = "Paul";
		// return this.name;        	// Peter
		return name; 					// Paul
	}
 
}
