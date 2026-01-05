public class FinalExample {
    public static void main(String[] args) {
        final int MAX_SPEED = 120;  // Konstante
        System.out.println("Maximale Geschwindigkeit: " + MAX_SPEED);

        //MAX_SPEED =130;  //-Fehler! final -Wert kann nicht geändert werden

        class Fahrzeug {
            public final void starten() {
                System.out.println("Fahrzeug startet...");
            }
        }

        class Auto extends Fahrzeug {
            //Fehler:
            //public void starten() {System.out.println("Auto startet...");
        }

        final class Mathe {
            public static double PI = 3.14159;
        }
        //Fehler:
        //class MeineMathe extends Mathe {}
    }
}
