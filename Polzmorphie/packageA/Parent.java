package packageA;

public class Parent {


    public void publicMethod() {
        System.out.println("publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void defaultMethod() {   // KEIN Modifier → package-private
        System.out.println("defaultMethod");
    }

    // private lassen wir bewusst weg

}
