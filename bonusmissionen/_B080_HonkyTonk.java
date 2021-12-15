package bonusmissionen;

public class _B080_HonkyTonk {
	static int startMoney, rounds, bet;

	public static void main(String[] args) {

		/*
		 * Honky-Tonk
		 *
		 * Simuliere das Spiel Honky-tonk. Bei diesem Spiel bezahlt der Spieler pro
		 * Runde einen Euro als Einsatz. Er darf nun drei Würfel werfen. Zeigt
		 * mindestens ein Würfel eine sechs, so erhält er zunächst den Einsatz zurück.
		 * Zudem erhält er für jede geworfene Sechs einen Euro als Gewinn ausbezahlt.
		 * Liegt keine Sechs, so verliert er den Einsatz. Starte mit einem Kapital von
		 * 300 Euro und simuliere 1000 Runden.
		 */

		dice();

	}

	public static void dice() {
		startMoney = 300;
		rounds = 1000;
		bet = 1;

		for (int i = 0; i <= rounds; i++) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int dice3 = (int) (Math.random() * 6) + 1;

			//int dice1 = 6;
			//int dice2 = 6;
			//int dice3 = 6;
			startMoney = startMoney - bet;

			System.out.println();
			System.out.println("\nRound: " + i);
			System.out.println("You PAID: " + bet + " New Balance: " + startMoney);
			System.out.print("Dice1 " + dice1 + " ");
			System.out.print("Dice2 " + dice2 + " ");
			System.out.print("Dice3 " + dice3 + " ");

			if (dice1 == 6 || dice2 == 6 || dice3 == 6) {
				startMoney = startMoney + bet;
				System.out.println("\nYOU WIN - New Balance " + startMoney);

				if (dice1 == 6) {
					startMoney = startMoney + bet;
					System.out.println("DICE1 - extraWIN - New Balance " + startMoney);
				}
				if (dice2 == 6) {
					startMoney = startMoney + bet;
					System.out.println("DICE2 - extraWIN - New Balance " + startMoney);
				}
				if (dice3 == 6) {
					startMoney = startMoney + bet;
					System.out.println("DICE3 - extraWIN - New Balance " + startMoney);
				}
			} else if (startMoney <= 0) {
				System.out.println("YOU have no Money left");
				return;
			}
		}
	}
}
