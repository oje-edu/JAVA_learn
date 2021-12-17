package theorie._500_590._590_interface._020_Tiere;

public class Dog implements Animal {
	
	@Override
	public void move() {
		System.out.println("Bewegt sich wie ein Hund");
	}
	
	@Override
	public void eat() {
		System.out.println("Frisst wie ein Hund");
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.move();
		d1.eat();
	}

}
