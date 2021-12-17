package uebungen._200_290_._250_Roboter2;

public class Roboter2 {

	public static void main(String[] args) {
		
		System.out.print("------------BEEP BEEP----------");

		Roboter r1 = new Roboter();
		System.out.print(r1);
		r1.move("south", 3);
		r1.move("west", 3);

		Roboter r2 = new Roboter("r2d2Terminator"); // r2d2Termin
		System.out.println(r2);
		r2.move("north", 20); // Neue Position: 50 70

		Roboter r3 = new Roboter("leerlauf");
		System.out.println(r3);
		r3.move("", 0);

		Roboter r4 = new Roboter("brrr");
		System.out.println(r4);
		r4.move("east", -1);
	}
}

class Roboter {
	private static int[] coordinates = new int[2];
	private String name = "";

	Roboter() {
		setName("x");
	}

	Roboter(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 10) {
			this.name = name.substring(0, 10);
		} else {
			this.name = name;
		}
	}

	@Override
	public String toString() {
		coordinates[0] = 50;
		coordinates[1] = 50;

		System.out.print("\n----\nStartposition: ");
		for (int c : coordinates) {
			System.out.print(c + " ");
		}
		System.out.println("\n");
		return "Hi, ich bin " + name;
	}

	void move(String orientation, int distance) {
		String res = "\n" + getName() + "\tgeht " + distance + " " + orientation;

		if (orientation.contains("ea")) {
			orientation = "east";
			coordinates[0] += distance;
			System.out.println(res);
		}
		if (orientation.contains("we")) {
			orientation = "west";
			coordinates[0] -= distance;
			System.out.println(res);
		}
		if (orientation.contains("no")) {
			orientation = "north";
			coordinates[1] += distance;
			System.out.println(res);
		}
		if (orientation.contains("so")) {
			orientation = "south";
			coordinates[1] -= distance;
			System.out.println(res);
		}
		if (orientation.isEmpty() && distance == 0) {
			System.out.println(getName() + "\tsteht");
		}

		System.out.print("\t\tNeue Position: ");
		for (int c : coordinates) {
			System.out.print(c + " ");
		}
	}
}