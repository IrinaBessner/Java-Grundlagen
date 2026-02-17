import java.util.LinkedList;
import java.util.Queue;

public class QueueBeispiel {
    public static void main(String[] args) {

        Queue<String> warteschlange = new LinkedList<>();

        warteschlange.add("Kunde1");
        warteschlange.add("Kunde2");

        System.out.println(warteschlange.poll()); // entfernt erstes
        System.out.println(warteschlange);
    }

}


