import java.util.Scanner;

public class KontorllStrukturen {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int zahl;
        boolean istNull = false;

        System.out.print("Bitte positive Zahl eingeben: ");
        zahl = scanner.nextInt();


        if (zahl == 0) {
            System.out.print("Falsch ! Es wurde eine Null eingeben.");
            istNull = true;
        }
        if (!istNull) {
            if (zahl < 0)
                System.out.print("Falsch! Es wurde eine  " + " negative Zahl eingegeben.");
            else
                System.out.print("Richtig! Es wurde  eine " + "positive Zahl eingegebn");
        }

        //besser gelöst
        if (zahl == 0)
            System.out.print("Falsch ! Es wurde eine Null eingeben.");
        else if (zahl < 0)
            System.out.print("Falsch! Es wurde eine " + " negative Zahl eingegeben.");
        else System.out.print("Richtig! Es wurde  eine " + "positive Zahl eingegebn");
    }
}
