public class StringBeispiel {
    public static void main(String[] args) {
        // String erstellen
        String vorname = "Max";
        String nachname = "Müller";

        // Verketten
        String vollname = vorname + " " + nachname;
        System.out.println("Vollname: " + vollname);

        // Länge
        System.out.println("Länge: " + vollname.length());

        // Groß-/Kleinschreibung
        System.out.println("Großbuchstaben: " + vollname.toUpperCase());

        // Suchen
        if (vollname.contains("Max")) {
            System.out.println("Enthält 'Max'");
        }

        // Vergleichen
        String test = "Max Müller";
        if (vollname.equals(test)) {
            System.out.println("Namen sind gleich");
        }
    }
}


