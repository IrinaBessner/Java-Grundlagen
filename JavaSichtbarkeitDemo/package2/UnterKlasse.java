package package2;

import package1.BasisKlasse;

public class UnterKlasse extends BasisKlasse {

    public static void testZugriff() {
        System.out.println(a); // ✔ public
        System.out.println(b); // ✔ protected (Vererbung)
        // System.out.println(c); // ❌ package-private
        // System.out.println(d); // ❌ private
    }
}


