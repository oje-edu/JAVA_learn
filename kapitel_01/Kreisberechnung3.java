package kapitel_01;

public class Kreisberechnung3 {
    public static void main(String[] args) {
        String einheit = args[1];
        double radius = Double.parseDouble(args[0]);
        double umfang = 2.0 * 3.1415926 * radius;
        double inhalt = 3.1415926 * radius * radius;
        System.out.print("Umfang: ");
        System.out.print(umfang);
        System.out.println(" " + einheit);
        System.out.print("Flaeche: ");
        System.out.print(inhalt);
        System.out.println(" " + einheit + '\u00b2');
    }
}
