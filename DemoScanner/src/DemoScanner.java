import java.util.Scanner;

public class DemoScanner {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String vorname;
        int alter;
        double groesse;

        System.out.println("Wie heißt du? > ");
        vorname = scanner.nextLine();

        System.out.println("Wie alt bist du? > ");
        alter = scanner.nextInt();

        System.out.println("Wie groß bist du? (in Meter) > ");
        groesse = scanner.nextDouble();

        System.out.println("Hallo " + vorname + "! Du bist " + alter + " Jahre alt und  " + groesse + "m groß.");

    }

}
