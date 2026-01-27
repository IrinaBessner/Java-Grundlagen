public class Auto extends Fahrzeug {

    private int ps;

    //Standartkonstruktor
    public Auto() {
        super();
        this.ps = 0;
        System.out.println("Auto: Standartkonstruktor");
    }

    //Konstruktor mit einem eigenem Attribut
    public Auto(int ps) {
        super("Unbekannt");
        this.ps = ps;
        System.out.println("Konstruktor mit PS");
    }


    //Konstruktor mitallen Attributen
    public Auto(String marke, int baujahr, int ps) {
        super(marke, baujahr);
        this.ps = ps;
        System.out.println("Auto: Konstruktor mit allen Attributen");
    }


    @Override
    public void info() {
        System.out.println(("Marke: " + marke +
                ", Baujahr: " + baujahr +
                ", PS: " + ps));
        System.out.println("");
    }

}
