public class ExpessionsOperatorsPostfixPrefixIncrementDecrement {
    public static void main(String[] args) {

        int amount = 12;
        System.out.println(amount);

        //amount=amount-1
        amount--;
        System.out.println(amount);

        amount--;
        System.out.println(amount);

        System.out.println("-----------------------");

        //Fakultät= factorial
        amount++;
        System.out.println(amount);
        amount++;
        System.out.println(amount);

        System.out.println("-----------------------");

        // Fakultät= factorial
        int factorial = 1;
        System.out.println(factorial);
        factorial = factorial * 2;
        System.out.println(factorial);
        factorial = factorial * 3;
        System.out.println(factorial);
        factorial = factorial * 4;
        System.out.println(factorial);


        int counter = 1;
        factorial = counter;
        factorial = factorial * counter;
        System.out.println(factorial);
        counter++;
        factorial = factorial * counter;
        System.out.println(factorial);
        counter++;
        factorial = factorial * counter;
        System.out.println(factorial);
        counter++;

        factorial = factorial * counter;
        System.out.println(factorial);

        int a = 10;
        System.out.println(a++); //10
        System.out.println(a);   //11

        int b = 10;
        System.out.println(++b); //11
        System.out.println(b);   //11


    }
}
