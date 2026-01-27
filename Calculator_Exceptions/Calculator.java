public class Calculator {


    public int divide(int a, int b) {
        if (b == 0) {
            // UNCHECKED Exception
            throw new ArithmeticException("Division durch 0 ist nicht erlaubt");
        }
        return a / b;
    }

    public void allocateMemory() {
        //simuliert einene schweren JVM-Fehler
        int[] array = new int[Integer.MAX_VALUE];
    }
}
