public class PersonDemo {

        public static void main(String[] args) {
            //Ausdrucksanweisung
            String name = "Anna";   //Zuweisung eine Variable
            int alter = 25;         //Zuweisung einer Zahl
            double groesse = 1.70;  //Zuweisung einer Kommazahl

            alter++;                //Inkrement (Ausdrucksanweisung)

            System.out.println("Name: " + name);            //Methodenaufruf (auch Ausdrucksanweisung)
            System.out.println("Alter: " + alter);          //Ausgabe
            System.out.println("Größe: " + groesse + " m");

            ; // leere Anweisung (mach nichts, wird aber akzeptiert)
        }
    }


