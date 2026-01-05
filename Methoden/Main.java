public class Main {
    public static void sagHallo() {
        System.out.println("Hallo!");
    }

    public static void main(String[] args) {
        sagHallo();
        verdoppelt(2);
        System.out.println(verdoppelt(2));
    }


    public static int verdoppelt(int zahl) {
        return zahl * 2;
    }
}
