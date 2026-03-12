package de.gfn.basic;

public class InitTest {

    public static void main(String[] args) {

        new B2();

    }
}

class B1 {

    {
        System.out.println("I : B1");
    }

    public B1() {
        super();
        // Initializer
        System.out.println("C: B1");
    }
}

class B2 extends B1 {

    {
        System.out.println("I : B2");
    }

    public B2() {
        super();
        // Initializer: Wird immer nach super und vor dem Rest des Konstruktors ausgeführt
        System.out.println("C: B2");
    }

}