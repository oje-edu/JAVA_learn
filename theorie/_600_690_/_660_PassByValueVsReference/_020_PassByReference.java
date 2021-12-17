package theorie._600_690_._660_PassByValueVsReference;

public class _020_PassByReference {
	
	// Bei Aufruf der Funktion entsteht eine Referenz
	// Parameter und Argument verweisen auf die gleiche Stelle im Speicher
		

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(29);
		
		System.out.println(s1.getAge()); 										// 29
		
		changeStudent(s1);
		System.out.println(s1.getAge()); 										// 39

	}
	
	static void changeStudent(Student s) {
		s.setAge(39);
	}

}

class Student {
	
	private int age = 0;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
