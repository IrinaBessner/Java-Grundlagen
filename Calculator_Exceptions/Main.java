public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        //Exception behandelt
        try {
            int result = calc.divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fehler abgefangen: " + e.getMessage());
        }

        //ERROR -NICHT behandeln (nur Demo)
        try {
            calc.allocateMemory();
        } catch (OutOfMemoryError e) {
            System.out.println("ERROR: JVM-Speicher erschöpft");
        }
    }

}
