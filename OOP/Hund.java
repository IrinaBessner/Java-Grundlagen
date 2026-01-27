public class Hund extends Tier {

    public Hund(String name) {
        super(name);
    }

    @Override
    public void machtGeraeusch() {
        System.out.println(name + " sagt :Wuff!");
    }
}
