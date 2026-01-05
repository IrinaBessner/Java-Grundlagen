public class Main {
    public static void main(String[] args) {

        Tier meinHund = new Hund();
        meinHund.machtGeraeusch();
        System.out.println(((Hund) meinHund).essen(3));
    }
}
