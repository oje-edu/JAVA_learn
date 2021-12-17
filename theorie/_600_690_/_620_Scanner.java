package theorie._600_690_;

import java.util.Scanner;

public class _620_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// nextLine() muss scheinbar an erster stelle stehen
		System.out.println("Bitte einen String eingeben: ");   			// Hello
		String s1 = sc.nextLine();
		System.out.println(s1); 										// Hello
		
		System.out.println("Bitte eine Fliesskommazahl eingeben: ");   	// 9,5  (Mit komma in Deutsch)
		double d1 = sc.nextDouble();
		System.out.println(d1); 										// 9.5
		
		System.out.println("Bitte eine Ganzzahl eingeben: ");   		// 9
		int i1 = sc.nextInt();
		System.out.println(i1); 										// 9
		
		sc.close();
	}

}
