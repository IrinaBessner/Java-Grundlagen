import java.util.Stack;

public class StackBeispiel {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");

        System.out.println(stack.pop()); // entfernt B
        System.out.println(stack);
    }

}
