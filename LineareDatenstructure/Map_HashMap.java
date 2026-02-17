import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {

        Map<String, Integer> noten = new HashMap<>();

        noten.put("Anna", 1);
        noten.put("Tom", 2);
        noten.put("Anna", 3); // überschreibt Wert

        System.out.println(noten);
        System.out.println("Note von Anna: " + noten.get("Anna"));
    }

}
