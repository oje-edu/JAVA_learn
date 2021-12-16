package theorie._200_290_._250_Vererbung._020_ExtendsSuper;

public class PWKTest {

	public static void main(String[] args) {
		
		PKW p1 = new PKW();
		System.out.println(p1);
		
		PKW p2 = new PKW("Volvo");
		System.out.println(p2);
		
		PKW p3 = new PKW("Audi", "Türkies");
		System.out.println(p3);

	}

}
