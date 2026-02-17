import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBeispiel {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("A");
        deque.addLast("B");

        System.out.println(deque);
    }

}
