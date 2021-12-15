package threeNplusOne;

public class problem {
	static long number;

	public static void main(String[] args) {
		
		number = 15;
		
		if (number % number == 0) {
			number = number / 2;
		} else {
			number = (3 * number) + 1;
		}
		System.out.println(number);
	}
}
