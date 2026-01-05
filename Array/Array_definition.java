public class Array_definition {

    public static void main(String[] args) {
        // Deklation and Initialisierung eines Arrays
        int[] zahlen = {10, 20, 30, 40, 50};

        // Zugriff auf ein Element  über seinen Index
        System.out.println("Erstes Element: " + zahlen[0]);  //10

        //Iteration durch des Array mit einer for-Schleife
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(("Index " + i + ": " + zahlen[i]));
        }
        // Änderung eines Werts im Array
        zahlen[2] = 99;
        System.out.println("Neuer Wert an Index 2: " + zahlen[2]);
        
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(("Index " + i + ": " + zahlen[i]));
        }

    }
}
