public class Hund extends Tier {


    @Override
    public void machtGeraeusch() {
        System.out.println("Wuff");
    }

    public int essen(int essenZahl) {
        return essenZahl;
    }
}
