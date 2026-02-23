package de.gfn.basic.vererbung;

public class InterfaceTest4 {

    public static void main(String[] args) {

        Class1 c1 = new Class2();
        c1.machWas();

        ((Class2)c1).machWasAnderes();


        boolean f = false;

        if(f = false) {
        }
    }
}

interface IFace1 {

    public default void machWas() {
        System.out.println("I1");
    }

    //void machWas();

    public String toString();
}

abstract class AClass1 {

    public abstract String toString();
}

class Class1 {

    public void machWas() {
        System.out.println("C1");
    }
}

class Class2 extends Class1 implements IFace1 {

    @Override
    public void machWas() {
        System.out.println("C2");
    }

    public void machWasAnderes() {
        System.out.println("C3");
    }
}