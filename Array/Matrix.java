public class Matrix {
    public static void main(String[] args) {
        //1. deklaration und Initialisierung eines 2D-Arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // 2.Zugriff auf ein Elemnt
        System.out.println((" Element in Zeile 2, Spalte 3: " + matrix[1][2]));
        System.out.println((" Element in Zeile 1, Spalte 1: " + matrix[1][1]));

        //Ausgabe aller Werte

        for (int i = 0; i < matrix.length; i++) {         //Zeilen
            for (int j = 0; j < matrix[i].length; j++) {  // Spalten
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();    //Zeilenumbruch
        }
    }
}
