package package1;


public class BasisKlasse {

    public static int a = 1;        // überall sichtbar
    protected static int b = 2;     // Package + Unterklassen
    static int c = 3;               // package-private
    private static int d = 4;       // nur in dieser Klasse

    public static void zeigeWerte() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d); // ✔ erlaubt
    }
}





