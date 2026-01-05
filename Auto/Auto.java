public class Auto {
    //Attribute

    private String marke;
    private String model;
    private String farbe;
    private int baujahr;

    public Auto(String marke, String model, String farbe, int baujahr) {
        this.marke = marke;
        this.model = model;
        this.farbe = farbe;
        this.baujahr = baujahr;
    }

    // Getter
    public String getMarke() {
        return marke;
    }

    public String getModel() {
        return model;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getBaujahr() {
        return baujahr;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marke='" + marke + '\'' +
                ", model='" + model + '\'' +
                ", farbe='" + farbe + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
