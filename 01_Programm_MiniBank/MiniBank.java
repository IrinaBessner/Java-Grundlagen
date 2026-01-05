import java.util.Scanner;

public class MiniBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String richtigesPassword = "1234";
        double kontostand = 0.0;
        boolean eingeloggt = false;
        int versuche = 0;

        // do-while -> Benutzer musss sich zuerst einloggen
        do {
            System.out.print("Bitte Password eingeben: ");
            String eingabe = scanner.nextLine();

            if (eingabe.equals(richtigesPassword)) {
                eingeloggt = true;
                System.out.println("  Login erfolgreich!\n");
            } else {
                versuche++;
                System.out.println(" Falses Password. Versuch " + versuche + " von 3.\n");
            }

            if (versuche >= 3 && !eingeloggt) {
                System.out.println("Zu viele Fehlversuche. Programm beendet.");
                return;  // Programm wird gestoppt
            }

        } while (!eingeloggt);

        // Hauptmenü läuft mit while-Schleife

        boolean laeuft = true;
        while (laeuft) {
            System.out.println("=== Minibank Menü ===");
            System.out.println("1 - Geld einzahlen");
            System.out.println("2 - Geld abheben");
            System.out.println("3 - Kontostand anzeigen");
            System.out.println("4 - Zinsen berechnen (for-Schleife)");
            System.out.println("0 - Beenden");
            System.out.println("Ihre auswahl : ");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.print("Betrag zum Einzahlen: ");
                    double einzahlung = scanner.nextDouble();
                    if (einzahlung > 0) {
                        kontostand += einzahlung;
                        System.out.println(" Eingezahlt: " + einzahlung + " $\n");
                    } else {
                        System.out.println("Ungültiger Betrag!\n");
                    }
                    break;
                case 2:
                    System.out.print("Betrag zum Abheben: ");
                    double abhebung = scanner.nextDouble();
                    if (abhebung > 0 && abhebung <= kontostand) {
                        kontostand -= abhebung;
                        System.out.println("Abgehoben: " + abhebung + " $\n");
                    } else {
                        System.out.println("Nicht genug Guthabe oder ungültiger Betrag! \n");
                    }
                    break;

                case 3:
                    System.out.println("Aktueller Kontostand: " + kontostand + " €\n");
                    break;

                case 4:
                    System.out.print("Wie viele Jahre sollen Zinsen berechnet werden?");
                    int jahre = scanner.nextInt();
                    System.out.print("Zinssatz in %: ");
                    double zinssatz = scanner.nextDouble();

                    double kapital = kontostand;
                    // for-Schleife -> jedes Jahr Zinsen berecnhen
                    for (int i = 1; i <= jahre; i++) {
                        kapital += kapital * zinssatz / 100;
                        System.out.printf("Nach Jahr %d: %.2f €\n", i, kapital);
                    }
                    System.out.println();
                    break;

                case 0:
                    laeuft = false;
                    System.out.println("Auf Wiedersehen!");
                    break;

                default:
                    System.out.println("Ungültige Eingabe!\n");
            }
        }
        scanner.close();
    }
}
