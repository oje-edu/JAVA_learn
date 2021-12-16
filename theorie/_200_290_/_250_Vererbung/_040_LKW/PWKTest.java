package theorie._200_290_._250_Vererbung._040_LKW;

public class PWKTest {

	public static void main(String[] args) {
		
		PKW p1 = new PKW();
		System.out.println(p1);
		
		PKW p2 = new PKW("Volvo");
		System.out.println(p2);
		
		PKW p3 = new PKW("Nissan", 700);
		System.out.println(p3);
		
		PKW p4 = new PKW("Audi", "Türkies");
		System.out.println(p4);
		
		PKW p5 = new PKW("FIAT", "Panda", 200);
		System.out.println(p5);

	}

}
