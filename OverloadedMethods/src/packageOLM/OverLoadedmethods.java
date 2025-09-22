package packageOLM;

public class OverLoadedmethods {
    public static void main(String[] args) {
        System.out.println();

        System.out.print("World");
        System.out.print(' ');
        System.out.print(5678);


        System.out.println();
        System.out.print("\n\n");  // пустая строка

        int a = 12;
        int b = 234;
        System.out.printf("%s * %s = %s%n", a, b, a * b);
        //                     a    b    a+b

    }
}
