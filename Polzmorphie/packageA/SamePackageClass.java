package packageA;

public class SamePackageClass {
    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.publicMethod();      //  erlaubt
        parent.protectedMethod();   //  erlaubt
        parent.defaultMethod();     //  erlaubt


    }
}


