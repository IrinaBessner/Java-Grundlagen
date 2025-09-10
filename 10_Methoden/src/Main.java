public class Main {
    public static void main(String[] args) {
        Auto bmw = new Auto("BMW");     // neues Auto-Objekt
        Auto audi = new Auto("Audi");   // zweites Auto-Objekt

        // Aufruf von Instanzmethoden über das jeweilige Objekt
        bmw.starten();                  // BMW startet den Motor.
        bmw.fahren(50);                 // BMW fährt 50 Kilometer.

        audi.starten();                 // Audi startet den Motor.
        audi.fahren(120);               // Audi fährt 120 Kilometer.

        // Instanzmethode zum Auslesen der Marke
        System.out.println("Marke von bmw: " + bmw.getMarke());
        System.out.println("Marke von audi: " + audi.getMarke());
    }
}
