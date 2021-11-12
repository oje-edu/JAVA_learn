
public class ObjectMy {

    public static void main(String[] args) {

        Object[] obj = new int[6][6];
        // Es entsteht ein Objekt-Array mit seche Elementen
        // Jedes dieser Elemente ist ein Integer-Array
        System.out.println(obj[0]);  // [I@38af3868
        System.out.println(obj[1]);  // [I@77459877
        System.out.println(obj[2]);  // [I@5b2133b1
        System.out.println(obj[3]);  // [I@72ea2f77
        System.out.println(obj[4]);  // [I@33c7353a
        System.out.println(obj[5]);  // [I@681a9515
        // System.out.println(obj[6]);  // ArrayIndexOutOfBoundsException

        // Das einzige, was man in diese Indexe schreiben kann,
        // sind Integer-Arrays
        obj[1] = new int[4];
        // obj[1] = new short[4];  // ArrayStoreException
        // obj[1] = "Hello";       // ArrayStoreException

        // Man kann die Werte aber nicht wieder auslesen,
        // da die Objekt-Klasse nicht über die passenden Funktionalitäten verfügt.
        int[] x = {1, 2, 3};
        obj[0] = x;
        System.out.println(obj[0]);  // [I@3af49f1c
        // System.out.println(obj[0][0]);  // java: array required, but java.lang.Object found
    }
}
