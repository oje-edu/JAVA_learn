package studyGuide.mixed_uebungen;

public class Luhn {
	
	private String number;
	private int checkValue;
	private int sum;

	public static void main(String[] args) {
		
		Luhn x = new Luhn("2718281828458567");

		System.out.println(x.check());
	}

	public Luhn(String number) {
		this.number = number;
		this.setCheckValue();
		this.setSum();
	}
	
	private void setCheckValue() {
		int size = this.number.length();
		this.checkValue = Integer.parseInt(String.valueOf(this.number.charAt(size - 1)));		
	}
	
	private void setSum() {
		for(int i = 0; i < this.number.length() - 1; i++) {
			
			int value = Integer.parseInt(String.valueOf(this.number.charAt(i)));
			
			if((i + 1 ) % 2 == 0) {
				this.sum += value;
			} else {
				int odd = value * 2;
				this.sum += odd < 10 ? odd : odd - 9;
			}
		}
	}
	
	public boolean check() {
		if((10 - this.sum % 10) == this.checkValue) return true;
		return false;
	}
}
