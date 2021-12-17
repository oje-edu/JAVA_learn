package theorie._500_590._590_interface._010_Printable;

public class Person implements Printable {
	
	@Override
	public void print() {
		System.out.println("Ich bin eine Person");
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.print();

	}

}
