import java.util.ArrayList;
import java.util.List;

public class ListBeispiel {

    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();

        namen.add("Anna");
        namen.add("Tom");
        namen.add("Anna"); // erlaubt doppelt

        System.out.println(namen);
        System.out.println("Erstes Element: " + namen.get(0));
    }
}



