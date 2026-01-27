public class Fahrzeug {
    protected String marke;
    protected int baujahr;


    //Standartkonstruktor
    public Fahrzeug() {
        this.marke = "Unbekannt";
        this.baujahr = 0;
        System.out.println("Fahrzeug : Standartkonstruktor");
    }

    //Konstruktor mit einem Attribut
    public Fahrzeug(String marke) {
        this.marke = marke;
        this.baujahr = 0;
        System.out.println("Fahrzeug : Standartkonstruktor mit Marke");
    }

    //Konstruktor mit zwei  Attributen
    public Fahrzeug(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
        System.out.println("Fahrzeug : Standartkonstruktor mit Marke & Baujahr");
    }

    public void info() {
        System.out.println("Marke: " + marke +
                ", Baujahr: " + baujahr);
        System.out.println("");
    }
}
