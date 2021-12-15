package theorie._500_590;

public class _560_virtuellesAttribut {

	public static void main(String[] args) {
		
		// Virtuelles Attribut (hier Bruttopreis)
		// Nicht im Kontruktor, nur getter & setter die sich auf nettopreis beziehen
		
		Buch b1 = new Buch("Westermann", 34.99);                // Buch [titel=Westermann, nettopreis=34.99]
		System.out.println(b1);
		
		System.out.println(b1.getNettopreis()); 				// 34.99
		System.out.println(b1.getBruttopreis());                // 37,44
		b1.setBruttopreis(74.88);
		System.out.println(b1.getNettopreis());                 // 69.98130841121494

	}
}


class Buch {
	String titel;
	double nettopreis;
	public Buch(String titel, double nettopreis) {
		setTitel(titel);
		setNettopreis(nettopreis);
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public double getNettopreis() {
		return nettopreis;
	}
	public void setNettopreis(double nettopreis) {
		this.nettopreis = nettopreis;
	}
	public String getBruttopreis() {
		return String.format("%.2f", nettopreis * 1.07);
	}
	public void setBruttopreis(double bruttopreis) {
		this.nettopreis = bruttopreis / 1.07;
	}
	@Override
	public String toString() {
		return "Buch [titel=" + titel + ", nettopreis=" + nettopreis + "]";
	}
}
