public class Katze extends Tier {

    public Katze(String name) {
        super(name);
    }

    @Override
    public void machtGeraeusch() {
        System.out.println(name + " sagt: Miau!");
    }
}
