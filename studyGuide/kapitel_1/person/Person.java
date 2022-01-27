package studyGuide.kapitel_1.person;

public class Person {
	
	private String firstname;
	private String lastname;
	public static int answer;
	
	// Initializer	
	{
		firstname = "Hans";
		lastname = "Wurst";
	}
	
	// Static Initializer
	static {
		answer = 42;
	}
	
	public Person() {}
	
	public Person(String firstname) {
		this(firstname, "Mustermann");
	}
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	// Setter mit Rückgabewert	
	public Person setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	public String toString() {
		return String.format("%s %s", this.getFirstname(), this.getLastname());
	}

}
