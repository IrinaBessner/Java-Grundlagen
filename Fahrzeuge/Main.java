public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Fahrzeug Objekte ---------");

        Fahrzeug f1 = new Fahrzeug();
        f1.info();

        Fahrzeug f2 = new Fahrzeug("BMW");
        f2.info();

        Fahrzeug f3 = new Fahrzeug("Audi", 2022);
        f3.info();

        System.out.println("\n----------Auto Objekte-----------");

        Auto a1 = new Auto();
        a1.info();

        Auto a2 = new Auto(150);
        a2.info();

        Auto a3 = new Auto("Tesla", 2024, 420);
        a3.info();


    }
}
