package theorie;

class Person {
	final int geburtsjahr;
	
	Person(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
}

class Calc {
	final double pi = 3.14;
}

class _260_final {
	

	public static void main(String[] args) {
		
		Person p1 = new Person(1975);
		System.out.println(p1.geburtsjahr);
				
		// p1.geburtsjahr = 1970; // The final field Person.geburtsjahr cannot be assigned
		
		Calc c1 = new Calc();
		System.out.println(c1.pi); // 3.14
	}
}
