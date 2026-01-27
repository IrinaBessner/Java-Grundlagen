public class Main {
    public static void main(String[] args) {

        Tier tier1 = new Hund("Bello");
        Tier tier2 = new Katze("Mimi");

        tier1.machtGeraeusch();
        tier2.machtGeraeusch();

        tier1.schlafen();
        tier2.schlafen();
    }
}
