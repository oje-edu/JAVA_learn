package WhoIsWho;

public class WhoIsWho {
	public static void main(String[] args) {
		System.out.println("\t-----\n\tNOTE:\n\t-----");
		System.out.println(names("Cord", "Mählmann"));
		System.out.println("\n\tPlease also NOTE: \n");
		System.out.println(names("Gabriel", "Gunske"));
		System.out.println(names("André", "Meier"));
		System.out.println(names("Thorsten", "OJE"));
		System.out.println(names("Ich", "haben"));
		System.out.println(names("Alle", "anderen"));
		// System.out.println(names("Wladimir", "Linker"));
		System.out.println(names("Wladimirowitsch", "Linker"));
		System.out.println(names("Rottweil", "Jeep"));
		System.out.println(names("Wuschelkopp", "Zenelli"));
		System.out.println(names("Jens", "KREWER"));
	}

	public static String names(String firstName, String lastName) {
		if (firstName.toLowerCase().contains("jens") || lastName.toLowerCase().contains("krewer")) {
			return "\n\tDU BIST UNSER ALLE(N) OCP MEISTER.. alle(n) *verbeugen* sich vor: " + firstName + " "
					+ lastName;
		} else if (firstName.toLowerCase().contains("co") && lastName.toLowerCase().contains("m")) {
			return "\tEs kann nur einen: " + firstName + " " + lastName + " geben!";
		} else if (firstName.toLowerCase().contains("gab") && lastName.toLowerCase().contains("gun")) {
			return "\t" + firstName + " " + lastName + " is a Genius.";
		} else if (firstName.toLowerCase().contains("andr") && lastName.toLowerCase().contains("mei")) {
			return "\t" + firstName + " " + lastName + " is a Genius too.";
		} else if (firstName.toLowerCase().contains("thor") && lastName.toLowerCase().contains("oj")) {
			return "\t" + firstName + " " + lastName + " is just Thor Odinson -> 'Mjölnir OJE'.";
		} else if (firstName.toLowerCase().contains("alle") && lastName.toLowerCase().contains("a")) {
			return "\t" + firstName + " " + lastName + " wissen es einfach besser!";
		} else if (firstName.toLowerCase().contains("") && lastName.toLowerCase().contains("ze")) {
			return "\n\t-----\n\tDANGER!" + "\n\tSchliest SOFORT ALLE Eure WhatsAppGroups,"
					+ "\n\tdenn Ihr befindet Euch im KRIEG! - mit mir, " + "dem: " + firstName + " " + lastName + "!"
					+ "\n\t-----";
		} else if (firstName.toLowerCase().contains("") && lastName.toLowerCase().contains("li")) {
			return "\tJA ABA!!! (JaVA) : " + firstName + " " + lastName + ": Nu schto? Dawajte!" + " -> Skål!";
		} else if (firstName.toLowerCase().contains("ic") && lastName.toLowerCase().contains("ha")) {
			return "\tÄhh Err nuschel, ähh Err Cord ?!!!! : " + firstName + " " + lastName + " Mercedes mit 4 Tür, Farbe WEISSE!!";
		}else if (firstName.toLowerCase().contains("rottweil") && lastName.toLowerCase().contains("jeep")) {
			return "\tIch bin der M. Plocha weeschd, unnn isch bin des eenzischde Spatzenhirn on this Planet who have not found the Exit of Tarkov." ;
		} else {
			return "\n\tWATT? .. " + lastName + " " + firstName + " .. wer bist Du denn?";
		}
	}
}
