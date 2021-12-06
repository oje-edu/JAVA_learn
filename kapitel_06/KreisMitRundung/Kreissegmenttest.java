package kapitel_06.KreisMitRundung;

public class Kreissegmenttest {
	public static void main(String[] args) {
		var segment = new Kreissegment(2, 180);
		System.out.println("Radius des Kreissegments: " + segment.getRadius());
		segment.radiusVergroessernUm(2);
		System.out.println("Neuer Radius des Kreissegments: " + segment.getRadius());
		System.out.println("Fläche des Kreissegments: " + segment.getFlaeche());
		System.out.println("Umfang des Kreissegments: " + segment.getUmfang());
	}
}
