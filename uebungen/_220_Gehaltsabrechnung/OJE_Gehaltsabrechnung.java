package uebungen._220_Gehaltsabrechnung;

import java.util.ArrayList;
import java.util.Collections;

public class OJE_Gehaltsabrechnung {

	public static void main(String[] args) {

		PersonalVerwaltung pv = new PersonalVerwaltung();
		Mitarbeiter m1 = new Mitarbeiter("Josef Maier");
		pv.addMitarbeiter(m1);
		Mitarbeiter m2 = new Mitarbeiter("Franz Huber");
		pv.addMitarbeiter(m2);
		Mitarbeiter m3 = new Mitarbeiter("Werner Müller");
		pv.addMitarbeiter(m3);
		pv.sortMitarbeiter();
		pv.listMitarbeiter();
		pv.addAbrechnung(new LohnAbrechnung(1, m1, 10, 158));
		pv.addAbrechnung(new GehaltsAbrechnung(1, m2, 3010));
		pv.addAbrechnung(new GehaltsAbrechnung(1, m3, 2700));
		pv.addAbrechnung(new LohnAbrechnung(2, m1, 16, 158));
		pv.addAbrechnung(new GehaltsAbrechnung(2, m2, 3010));
		pv.addAbrechnung(new GehaltsAbrechnung(2, m3, 2800));
		pv.listAbrechnungen(2);
	}
}

class Mitarbeiter implements Comparable<Mitarbeiter> {
	protected static int counter = 0;
	private int id;
	private String name;

	Mitarbeiter(String name) {
		this.setName(name);
		counter++;
		id = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return getId() + ", " + getName();
	}

	@Override
	public int compareTo(Mitarbeiter o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
}

abstract class Abrechnung {

	private int periode;
	private Mitarbeiter mitarbeiter;

	public Abrechnung(int periode, Mitarbeiter m) {
		setPeriode(periode);
		setMitarbeiter(m);
	}

	public int getPeriode() {
		return this.periode;
	}

	public Mitarbeiter getMitarbeiter() {
		return this.mitarbeiter;
	}

	public void setPeriode(int periode) {
		this.periode = periode;
	}

	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

	public abstract double getVerdienst();

	public String toString() {
		return getPeriode() + ", " + getMitarbeiter().getName() + ", " + getVerdienst();
	}
}

class GehaltsAbrechnung extends Abrechnung {
	private double gehalt;

	public GehaltsAbrechnung(int periode, Mitarbeiter m, double gehalt) {
		super(periode, m);
		setGehalt(gehalt);
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public double getVerdienst() {
		// TODO
		return gehalt;
	}
}

class LohnAbrechnung extends Abrechnung {
	private double stundenLohn;
	private double anzahlStunden;

	public LohnAbrechnung(int periode, Mitarbeiter m, double stundenLohn, int anzahlStunden) {
		super(periode, m);
		setStundenLohn(stundenLohn);
		setAnzahlStunden(anzahlStunden);
	}

	public double getStundenLohn() {
		return stundenLohn;
	}

	public void setStundenLohn(double stundenLohn) {
		this.stundenLohn = stundenLohn;
	}

	public double getAnzahlStunden() {
		return anzahlStunden;
	}

	public void setAnzahlStunden(double anzahlStunden) {
		this.anzahlStunden = anzahlStunden;
	}

	public double getVerdienst() {
		return anzahlStunden * stundenLohn;
	}
}

class PersonalVerwaltung {

	private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<Mitarbeiter>();
	private ArrayList<Abrechnung> abrechnungsListe = new ArrayList<Abrechnung>();

	public void addMitarbeiter(Mitarbeiter mitarbeiter) {
		mitarbeiterListe.add(mitarbeiter);
	}

	public void removeMitarbeiter(int index) {
		mitarbeiterListe.remove(index);
	}

	public String listMitarbeiter() {
		String list = "Mitarbeiterliste: \n";
		for (int i = 0; i < mitarbeiterListe.size(); i++) {
			list += mitarbeiterListe.get(i).toString() + " \n";
		}
		System.out.println(list);
		return list;
	}

	void sortMitarbeiter() {
		Collections.sort(mitarbeiterListe);
	}

	public void addAbrechnung(Abrechnung abrechnung) {
		abrechnungsListe.add(abrechnung);
	}

	public void removeAbrechnung(int index) {
		abrechnungsListe.remove(index);
	}

	public String listAbrechnungen(int periode) {
		String list = "Abrechnungsliste: \n";
		for (int i = 0; i < abrechnungsListe.size(); i++) {
			if (abrechnungsListe.get(i).getPeriode() == periode) {
				list += abrechnungsListe.get(i).toString() + " \n";
			}
		}
		System.out.println(list);
		return list;
	}
}


/**
 * 1.
 * Definiere eine Klasse Mitarbeiter.
 * Ein Mitarbeiter besitzt eine eindeutige Nummer (id) und einen Namen (name).
 * Die ID des Mitarbeiters soll durch die Klasse selbst fortlaufend nummeriert werden.
 * Der erste Mitarbeiter hat also die ID 1, der zweite Mitarbeiter die ID 2 usw.
 * Füge der Klasse sinnvolle Getter- und Setter-Methoden hinzu
 * und definiere zudem eine toString()-Methode,
 * die die ID und den Mitarbeiternamen als String zurückliefert.
 *
 * 2.
 * Schreibe eine Klasse PersonalVerwaltung.
 * Diese Klasse hat eine Mitarbeiterliste (mitarbeiterListe, Typ: ArrayList<Mitarbeiter>).
 * Sie hält Methoden zum Hinzufügen und zum Entfernen von Mitarbeitern bereit.
 * Außerdem benötigt sie eine Methode listMitarbeiter(),
 * um alle Mitarbeiter auf der Konsole aufzulisten.
 *
 * 3.
 * Füge der Klasse PersonalVerwaltung eine Methode sortMitarbeiter() hinzu.
 * Diese Methode soll die Mitarbeiter mittels Bubblesort sortieren.
 * Zu diesem Zweck muss in der Klasse Mitarbeiter
 * eine Methode boolean istKleiner(Mitarbeiter m) hinzugefügt werden.
 * Sie ist von Bubblesort zu verwenden, um die Rangfolge unter den Mitarbeitern zu erkennen.
 * Die sortMitarbeiter()-Methode soll dazu führen,
 * dass die Mitarbeiter alphabetisch nach ihren Namen sortiert werden.
 *
 * 4.
 * Implementiere die abstrakte Klasse Abrechnung und ihre beiden Unterklassen
 * LohnAbrechnung und GehaltsAbrechnung nach folgendem Grundriss:
 *
 *   public abstract class Abrechnung {
 *       private int periode;
 *       private Mitarbeiter mitarbeiter;
 *       public Abrechnung(int periode, Mitarbeiter m) { ... }
 *       public int getPeriode() { ... }
 *       public Mitarbeiter getMitarbeiter() { ... }
 *       public abstract double getVerdienst();
 *       public String toString() { ... }
 *   }
 *
 *   public class GehaltsAbrechnung extends Abrechnung {
 *       private double gehalt;
 *       public GehaltsAbrechnung(int periode,
 *                                Mitarbeiter m,
 *                                double gehalt) { ... }
 *       public double getVerdienst() { ... }
 *   }
 *
 *   public class LohnAbrechnung extends Abrechnung {
 *       private double stundenLohn;
 *       private double anzahlStunden;
 *       public LohnAbrechnung(int periode,
 *                             Mitarbeiter m,
 *                             double stundenlohn,
 *                             int stunden) { ... }
 *       public double getVerdienst() { ... }
 *   }
 *
 * Sowohl Lohn- als auch Gehaltsabrechnung erfolgen in einer Abrechnungsperiode
 * (in der Regel eine fortlaufend durchnummerierte Periodenummer)
 * und referenzieren einen Mitarbeiter.
 * Die abstrakte Methode getVerdienst() in der Klasse Abrechnung gibt in dem konkreten Fall
 * den Verdienst eines Mitarbeiters in der entsprechenden Periode zurück.
 * Bei einer Gehaltsabrechnung ist dies das Gehalt,
 * bei einer Lohnabrechnung ist es das Produkt aus Stundenlohn
 * und Anzahl der geleisteten Stunden.
 * Die toString()-Methode in Abrechnung soll die Periodennummer,
 * den Namen des Mitarbeiters und den Verdienst als String zurückgeben
 * (Hinweis: Verwende für letzteres die getVerdienst()-Methode)
 *
 * 5.
 * Erweiter die Klasse PersonalVerwaltung dahingehend,
 * dass analog zu den Mitarbeitern auch Abrechnungen hinzugefügt und entfernt werden können,
 * und schreibe eine Methode listAbrechnungen(),
 * welche alle Abrechnungen einer bestimmten Abrechnungsperiode auf der Konsole ausgibt.
 *
 * 6.
 * Java bietet zum Sortieren die statische Methode Collections.sort().
 * Verwende diese zum Sortieren der Mitarbeiterliste,
 * sodass du auf deine eigene Bubblesort-Implementierung verzichten kannst.
 * Damit dies funktioniert,
 * muss die Klasse Mitarbeiter das generische Interface Comparable<Mitarbeiter> implementieren.
 * Es ist demnach eine Methode int compareTo (Mitarbeiter m) erforderlich,
 * deren Rückgabewert sich im Prinzip verhält wie die compareTo()-Methode der Klasse String.
 * Arbeite ggf. mit Hilfe der Java-Dokumentation.
 * Im Anschluss kannst du die ist Kleiner()-Methode auskommentieren,
 * da sie quasi durch die compareTo()-Methode ersetzt wird.
 * Du kannst am Ende folgendes Testprogramm verwenden:
 *
 * public static void main(String[] args) {
 *   PersonalVerwaltung pv = new PersonalVerwaltung();
 *   Mitarbeiter m1 = new Mitarbeiter("Josef Maier");
 *   pv.addMitarbeiter(m1);
 *   Mitarbeiter m2 = new Mitarbeiter("Franz Huber");
 *   pv.addMitarbeiter(m2);
 *   Mitarbeiter m3 = new Mitarbeiter("Werner Müller");
 *   pv.addMitarbeiter(m3);
 *   pv.sortMitarbeiter();
 *   pv.listMitarbeiter();
 *   pv.addAbrechnung(new LohnAbrechnung(1,m1,10,158));
 *   pv.addAbrechnung(new GehaltsAbrechnung(1,m2,3010));
 *   pv.addAbrechnung(new GehaltsAbrechnung(1,m3,2700));
 *   pv.addAbrechnung(new LohnAbrechnung(2,m1,16,158));
 *   pv.addAbrechnung(new GehaltsAbrechnung(2,m2,3010));
 *   pv.addAbrechnung(new GehaltsAbrechnung(2,m3,2800));
 *   pv.listAbrechnungen(2);
 * }
 *
 * und solltest dann in etwa diese Ausgabe in der Konsole erhalten:
 *
 *  Mitarbeiter
 *  2, Franz Huber
 *  1, Josef Maier
 *  3, Werner Müller
 *
 *  Abrechnungen
 *  2, Josef Maier, 2528.0
 *  2, Franz Huber, 3010.0
 *  2, Werner Müller, 2800.0
 */