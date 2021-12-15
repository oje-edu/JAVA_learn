package theorie._500_590._580_Rekursion;

public class _020_Summe {

	public static void main(String[] args) {
		
		System.out.println(sum(5));  // 5+4+3+2+1 = 15
		
	}
	
	static int sum(int n) {
		if (n == 0) return 0;    // Der Wert der nichts ausmacht
		return n + sum(n - 1);
	}
}
