public class Auto {
    // Instanzvariable (gehört zu jedem Objekt separat)
    private String marke;

    // Konstruktor (spezieller "Erzeuger" für Objekte)
    public Auto(String marke) {
        this.marke = marke; // this = bezieht sich auf das aktuelle Objekt
    }

    // Instanzmethode: gehört zum Objekt
    public void starten() {
        System.out.println(marke + " startet den Motor.");
    }

    // Instanzmethode mit Parameter
    public void fahren(int km) {
        System.out.println(marke + " fährt " + km + " Kilometer.");
    }

    // Getter (Instanzmethode zum Lesen der Variablen)
    public String getMarke() {
        return marke;
    }
}
