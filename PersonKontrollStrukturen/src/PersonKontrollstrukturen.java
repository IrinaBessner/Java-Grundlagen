public class PersonKontrollstrukturen {
    public static void main(String[] args) {
        String name = "Anna";
        int alter = 25;
        double groesse = 1.70;

// 1. Sequenz (Befehle werden nacheinander ausgeführt)
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Größe: " + groesse + " m");
//2- Auswahl (if/else)
        if (alter >= 18) {
            System.out.println(name + " ist erwachsen.");
        } else {
            System.out.println(name + " ist minderjährig.");
        }

//3- Iteration (Schleife, Wiederholung)
        System.out.println("Zähle die nächsten 3 Jahre: ");
        for (int i = 1; i <= 3; i++) {
            System.out.println("In " + i + " Jahr(en) ist " + name + " " + (alter + i) + " Jahre alt.");
        }
// Methodenaufruf

        beschreibePerson(name, alter, groesse);
    }

    //eigene Methode (wird aufgerufen)
    static void beschreibePerson(String name, int alter, double groesse) {
        System.out.println("--- Methodeaufruf---");
        System.out.println("Person: " + name + " , Alter: " + alter + " , Größe: " + groesse + "m");
    }
}
