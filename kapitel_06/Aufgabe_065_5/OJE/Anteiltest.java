package kapitel_06.Aufgabe_065_5.OJE;

public class Anteiltest {

	public static void main(String[] args) {
		double vermoegen = 200000.00;
		Anteil a1 = new Anteil(1,2);
		Anteil a2 = new Anteil(2,4);
		/*
		System.out.println("\t---------- D I S C L A I M E R ----------");
		System.out.println();
		System.out.println("\t\t28 D A Ys OF DOING \"Bruch\"");
		System.out.println("\t PLEASE watch/listen 2: https://www.youtube.com/watch?v=rkX-HxwZTX8");
		System.out.println();
		System.out.println("\t-----------------------------------------");
		System.out.println("\tString and = " + "setHelp(\"<strong>US OUT HERE!</strong>\");");
		System.out.println("\n\tgetHelp() {\n\t\t return this.help;\n\t}");
		System.out.println("\tthis.help = \"https://www.youtube.com/watch?v=sdl7PZmlGQI\";");
		System.out.println();
		System.out.println("\t-----------------------------------------");
		System.out.println("\tThe above CODE does not work !? .. \n\tWell did YOU DO 28 DAYs OF \"Bruch\"?");
		System.out.println("\tYou should! ... to understand what BROKEN (lost) MEANS!");
		System.out.println();
		System.out.println("\t------------- R E S U L T -------------");
		System.out.println();
		*/
		System.out.println("\tGesamtes Vermögen = " + vermoegen + " €");
		System.out.println();
		System.out.println("\tBetrag von a1 = " + vermoegen * a1.dezimalwert() + " €");
		System.out.println("\tAnteil a1: " + a1.toString());
		System.out.println();
		System.out.println("\tBetrag von a2 = " + vermoegen * a2.dezimalwert() + " €");
		System.out.println("\tAnteil a2: " + a2.toString());
		System.out.println();
		System.out.println("\tVerteilt: " + Anteil.verteilt.toString());
		System.out.println("\tRest: " + a1.getRest().toString());
		System.out.println();
		System.out.println("\tVerbleibender Restbetrag: " + vermoegen * a1.getRest().dezimalwert() + " €");
		/*
		for (int i = 0; i < 2; i++) {
			System.out.println("----------");
		}
		*/
	}
}
