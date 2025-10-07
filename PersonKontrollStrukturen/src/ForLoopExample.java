public class ForLoopExample {
    public static void main(String[] args) {
        //1.Arras von Zahlen
        int[] numbers = {2, 4, 6, 8, 10};

        //Variable  zum Speichern der Summe
        int sum = 0;

        //3. Schleife FOR
        for (int i = 0; i < numbers.length; i++) {
            //i= Zähler, numbers.length= Länge des Arrays
            // numbers [i] - das aktuelle Element des Arrays

            sum = sum + numbers[i];  //das Element wird zur Summe addiert
            System.out.println("Schritt" + i + ": hin " + numbers[i] + ", сумма: " + sum);
        }

        //4. Выводим итог Das Ergebnis wird ausgegeben
        System.out.println("Итоговая сумма: " + sum);

    }
}
