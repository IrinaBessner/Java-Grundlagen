public class Methoden {
    //Methode mit Rückganewert
    public static int addieren(int a, int b) {
        return a + b;
    }

    //void-Methode
    public static void ausgabe(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        int summe = addieren(5, 3);      //Methodenaufruf
        ausgabe("Ergebnis: " + summe);
    }

}
