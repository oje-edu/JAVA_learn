package uebungen._070_Roboter;

public class RoboTest {

	public static void main(String[] args) {
        Roboter x = new Roboter("Herbert");
        Roboter y = new Roboter("Bernd");
        System.out.println(x.getName() + " und " + y.getName());
        Roboter z = new Roboter("Hans");
        z.setName("Bernd");
        System.out.println(z.getName());
	}

}
