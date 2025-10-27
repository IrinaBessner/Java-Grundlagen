import java.util.Scanner;

public class EinkaufsAssistent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gesamtPreis = 0;

        System.out.println("Willkommen im Supermarkt!");
        System.out.print("Wie viele Produkte möchten Sie kaufen? ");
        int anzahl = scanner.nextInt();

        // for-Schleife -Benutzer  gibt Produkte nacheinander ein

        for (int i = 1; i <= anzahl; i++) {
            System.out.println("\nProdukt " + i + ":");
            System.out.print("Geben Sie die Preis ein : ");
            double preis = scanner.nextDouble();

            if (preis < 0) {
                System.out.println("Fehler : Preis kann nicht negativ sein!");
                i--;  //Schritt wiederholen
                continue;
            }
            gesamtPreis += preis;
        }
        //switch  -Rabbat nach Anzahl der Produkte
        int rabbat;
        switch (anzahl) {
            case 1:
            case 2:
                rabbat = 0;
                break;
            case 3:
            case 4:
                rabbat = 5;
                break;
            default:
                rabbat = 10;
        }
        //if-else - Endpreis berechnen
        if (rabbat > 0) {
            double rabbatBetrag = gesamtPreis * rabbat / 100;
            gesamtPreis -= rabbatBetrag;
            System.out.println("\nSie erhalten " + rabbat + "% Rabbat!");
        } else {
            System.out.println("\nKein Rabbat bei weniger als 3 Produkten.");
        }
        System.out.printf("Gesamtpreis nach Rabbat: %.2f $\n", gesamtPreis);
        scanner.close();
    }
}
