package aufgabenZurWiederholung;

public class _W040_Quadratzahlen {

    public static void main(String[] args) {

        /*
         * Quadratzahlen
         *
         * Schreibe ein Programm, das alle Quadratzahlen von natürlichen
         * Zahlen (1, 2, 3, ...) ausgibt, die kleiner als 100 sind.
         * (Die Quadratzahlen sollen kleiner 100 sein!)
         *
         *  Zusatz: Gib auch die Anzahl der gefunden Quadratzahlen aus
         */
    	int maxNumber = 100;
    	for (int i = 1; i * i < maxNumber; i++) {
    		System.out.println(i + "x" + i + " = Quadratzahl:" + (i * i));
    	}
    }
}
