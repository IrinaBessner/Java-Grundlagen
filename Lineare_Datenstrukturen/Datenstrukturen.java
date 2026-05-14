import java.util.*;

public class Datenstrukturen {
    //Array
    int[] zahlen = new int[5];

    public void init() {
        zahlen[0] = 10;
    }
//    {        zahlen[0] = 10;    }

    //ArrayList
    ArrayList<String> liste = new ArrayList<>();

    public void addArraListe() {
        liste.add("Brot");
    }

    //LinkedListe
    LinkedList<String> kette = new LinkedList<>();

    public void add() {
        kette.add("A");
    }

    //Stack(Stapel
    Stack<Integer> stapel = new Stack<>();

    public void pushPop() {
        stapel.push(1);
        stapel.pop();
    }

    //Queue (Warteschlange
    Queue<String> schlange = new LinkedList<>();

    public void offerPoll() {
        schlange.offer("Anna");
        schlange.poll();
    }
    //Deque (doppelseitige Warteschlange

    Deque<Integer> deque = new ArrayDeque<>();

    public void addDeque() {
        deque.addFirst(1);
        deque.addLast(2);
    }

    //Vektor (Vektor - Klasiker
    Vector<String> v = new Vector<>();

    public void addV() {
        v.add("Termin");
    }

    // Map
//    Map<String, String> telefonbuch = new HashMap<>();
//telefonbuch.put("Anna", "0171-1234");
//System.out.println(telefonbuch.get("Anna"));
//Set
    Set<String> marken = new HashSet<>();

    public void addSet() {
        marken.add("Deutschland");
        marken.add("Deutschland");
        System.out.println(marken.size());   // 1
    }
}

