package theorie._700_790_._730_Polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _030_ {

	public static void main(String[] args) {
		
		List <String> a = new ArrayList<>();
		List <String> b = new LinkedList<>();
		
		test(a);
		test(b);
		
	}
	
	static void test(List<String> x) {
		System.out.println(x);
	}

}
