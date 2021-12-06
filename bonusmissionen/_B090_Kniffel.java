package bonusmissionen;

public class _B090_Kniffel {
	static int dice1;
	static int dice2;
	static int dice3;
	static int dice4;
	static int dice5;
	static int result;
	
	static String[] count;

	public static void main(String[] args) {
		try {
			play(1000);
		} catch (Exception e) {
			System.out.println("You found a bug!");
			System.out.println("To claim your bug bounty please submit the following message: ");
			System.out.println("\nStacktrace: " + e.getStackTrace());
			System.out.println("\nto: du_bist_so_1pimmel@oracle.com");
		}
	}

	static int rndDice() {
		for (int i = 0; i < 1; i++) {
			dice1 = (int) (Math.random() * 6) + 1;
			dice2 = (int) (Math.random() * 6) + 1;
			dice3 = (int) (Math.random() * 6) + 1;
			dice4 = (int) (Math.random() * 6) + 1;
			dice5 = (int) (Math.random() * 6) + 1;
			result = dice1 + dice2 + dice3 + dice4 + dice5;
		}
		return result;
	}
	
	static void play(int r) {
		count = new String[26];
		for (int i = 0; i < 26; i++) {
			count[i] = String.valueOf(i + 5) + "->";
		}
		for (int j = 0; j <= r; j++) {
			count[rndDice() - 5] += "x";
		}
		for (int k = 0; k < 26; k++) {
			System.out.println(count[k]);
		}
		System.out.println("\nGespielte Runden: " + r);
	}
}

/*
 * Kniffel
 *
 * Verwende einen Zufallszahlengenerator
 * um Würfelergebnisse (1-6) zu simulieren.
 * Werfe nun 5 Würfel und bilde die Augensumme.
 * Spiele dieses Experiment 1000 Mal durch
 * und ermittel, wie oft jede mögliche Augensumme
 * (Minimum = 5, Maximum = 30) vorgekommen ist.
 * Gib das Ergebnis wie unten grafisch aus.
 */

/*
05->
06->
07->xx
08->xxxxx
09->xxxxxxxxx
10->xxxxxxxxxxxxx
11->xxxxxxxxxxxxxxxxxxxxxxxxxxx
12->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
13->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
14->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
15->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
16->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
17->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
18->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
19->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
20->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
21->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
22->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
23->xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
24->xxxxxxxxxxxxxxxx
25->xxxxxxxxxxxxxxxx
26->xxxxxxxxxxx
27->xxxxx
28->xx
29->xx
30->
*/