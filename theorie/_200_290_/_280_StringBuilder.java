package theorie._200_290_;

public class _280_StringBuilder {

	public static void main(String[] args) {
		
		// StringBuilder
		// Veränderbar (mutable)
		// Es entsteht ein Objekt, das immer wieder verändert wird.
		// Dadurch ist der StringBuilder speichersparender als der String (bei Veränderungen)
		
		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(sb1); 								// Hello
		
		// append()
		sb1.append(" ");
		sb1.append("World");
		System.out.println(sb1); 								// Hello World
		System.out.println(sb1.getClass());                     // class java.lang.StringBuilder
		
		// Hier werden insgesamt drei String-Objekte erzeugt
		String s1 = "Hello";
		s1 += " ";
		s1 += "World";
		System.out.println(s1);                                 // Hello World
		
		// Chaining
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.append(" ").append("World");
		System.out.println(sb2);    							// Hello World
		
		// insert(index, string)
		StringBuilder sb3 = new StringBuilder("abcdefgehijklmn");
		sb3.insert(0, "xyz");
		System.out.println(sb3); 								// xyzabcdefgehijklmn
		sb3.insert(10, "-----");
		System.out.println(sb3); 								// xyzabcdefg-----ehijklmn
		
		// Vergleiche
		StringBuilder sb4 = new StringBuilder("Hello");
		StringBuilder sb5 = new StringBuilder("Hello");
		System.out.println(sb4.equals(sb5)); 					// false
		// contentEquals()
		String s2 = "Hello";
		System.out.println(s2.contentEquals(sb5)); 				// true
		System.out.println(sb4.toString().contentEquals(sb5)); 	// true
		
		// toString() - ultra Platzsparend
		StringBuilder sb6 = new StringBuilder("Hello");
		sb6.append(" ").append("World");
		String s6 = sb6.toString();
		System.out.println(s6);									// Hello World
		
		// Drei KOnstruktoren
		StringBuilder sb7 = new StringBuilder();
		System.out.println(sb7.capacity()); 					// 16
		StringBuilder sb8 = new StringBuilder(20);
		System.out.println(sb8.capacity());                     // 20
		StringBuilder sb9 = new StringBuilder("Hello");
		System.out.println(sb9.capacity()); 					// 21
		
		// void setCharAt(int index, char ch) - hier wird das e zu a
		StringBuilder sb10 = new StringBuilder("Hello");
		sb10.setCharAt(1, 'a');
		System.out.println(sb10); 								// Hallo
		
		// StringBuilder delete(int start, int end)
		// start = inklusiv, end exclusiv
		StringBuilder sb11 = new StringBuilder("0123456789");
		sb11.delete(3, 7);
		System.out.println(sb11); 								// 012789
	}

}
