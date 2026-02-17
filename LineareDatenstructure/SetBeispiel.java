import java.util.HashSet;
import java.util.Set;

public class SetBeispiel {
    public static void main(String[] args) {

        Set<String> farben = new HashSet<>();

        farben.add("Rot");
        farben.add("Blau");
        farben.add("Rot"); // wird ignoriert

        System.out.println(farben);
    }

}
