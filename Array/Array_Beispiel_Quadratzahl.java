public class Array_Beispiel_Quadratzahl {

    public static void main(String[] args) {

        int[] quagrat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < quagrat.length; i++) {
            //int a = i + 1;
            //System.out.print((a) * a);

            //Refactoring
            System.out.println((i + 1) * (i + 1));
        }
    }
}
