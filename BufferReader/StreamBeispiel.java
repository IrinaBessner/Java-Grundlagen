import java.io.*;

public class StreamBeispiel {

        public static void main(String[] args) throws IOException {

            // SCHREIBEN: Writer + Buffer -> in eine Datei (Senke)
            // try-with-resources schließt den Stream automatisch
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("notiz.txt"))) {
                writer.write("Hallo Welt");   // Text in den Puffer
                writer.newLine();             // Zeilenumbruch
                writer.write("Java ist toll");
            } // hier wird der Buffer geleert und die Datei geschlossen

            // LESEN: Reader + Buffer <- aus der Datei (Quelle)
            try (BufferedReader reader = new BufferedReader(new FileReader("notiz.txt"))) {
                String zeile;
                while ((zeile = reader.readLine()) != null) {  // Zeile für Zeile
                    System.out.println("Gelesen: " + zeile);
                }
            }
        }
    }

