package packageB;

import packageA.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        child.publicMethod();// erlaubt
        child.protectedMethod();// erlaubt
    }
}
