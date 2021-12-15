package kapitel_07._String_.StringBuildertest;

public class StringBuildertest {
	public static void main(String[] args) {
		var puffer = new StringBuilder();
		System.out.println("Puffergröße: " + puffer.capacity());
		System.out.println("Länge des Pufferinhalts: " + puffer.length());
		System.out.println(puffer);
		puffer.append("Drei Chinesen");
		System.out.println("Puffergröße: " + puffer.capacity());
		System.out.println("Länge des Pufferinhalts: " + puffer.length());
		System.out.println(puffer);
		puffer.setCharAt(2, 'i');
		puffer.setCharAt(9, 'i');
		puffer.setCharAt(11, 'i');
		System.out.println(puffer);
		puffer.delete(0, puffer.length());
		System.out.println(puffer);
		System.out.println("Puffergröße: " + puffer.capacity());
		System.out.println("Länge des Pufferinhalts: " + puffer.length());
		puffer.append("Drei Chinesen");
		puffer.append(" mit dem Kontrabass");
		System.out.println(puffer);
		System.out.println("Puffergröße: " + puffer.capacity());
		System.out.println("Länge des Pufferinhalts: " + puffer.length());
	}
}
