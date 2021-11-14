package bonusmissionen;

import java.util.Random;

public class _B030_DurchQuersummeTeilbar {

	public static void main(String[] args) {

		/*
		 * Durch Quersumme teilbar
		 *
		 * Schreibe ein Programm, das alle Zahlen bis n ausgibt, die durch ihre
		 * Quersumme teilbar sind.
		 *
		 * Z.B. 777 / (7 + 7 + 7) = 37
		 */
		Random r = new Random();
		int ra = r.nextInt(1000) + 1;
		// int ra = 777;

		System.out.println("Alle Zahlen die durch Ihre Quersummen teilbar sind bis: " + ra);

		for (int i = 1; i <= ra; i++) {
			String z = Integer.toString(i);
			int summe = 0;
			for (int k = 0; k < z.length(); k++) {
				char a = z.charAt(k);
				String s = Character.toString(a);
				summe += Integer.parseInt(s);
			}
			if (i % summe == 0) {
				System.out.println(i + " ");
			}
		}

	}

}
