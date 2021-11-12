package kapitel_01;

public class Kreisberechnung2 {
  public static void main(String[] args) {
    double radius = Double.parseDouble(args[0]);
    double umfang = 2.0 * 3.1415926 * radius;
    double flaeche = 3.1415926 * radius * radius;
    System.out.print("Umfang: ");
    System.out.println(umfang);
    System.out.print("Fläche: ");
    System.out.println(flaeche);
  }
}
