package uebungen;

public class App2 {

	public static void main(String[] args) {
		String line = new String("-");
		String anotherLine = line.concat("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());

	}

}
