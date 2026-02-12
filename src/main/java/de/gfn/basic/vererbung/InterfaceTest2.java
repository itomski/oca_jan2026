package de.gfn.basic.vererbung;

public class InterfaceTest2 {

    public static void main(String[] args) {

        Concrete1 concrete1 = new Concrete1();
        //concrete1.machWas(); // statische Methode des Interface wurde nicht vererbt
        System.out.println(concrete1.zahl);
        Interface1.machWas();

    }
}

interface Interface1 {

    // public static final
    int zahl = 100;

    static void machWas() {
        System.out.println();
    }
}

class Concrete1 implements Interface1 {

    void machWasAnderes() {
        //machWas();  // statische Interfacemethoden werden nicht vererbt
        System.out.println(zahl); // statische Attribute des Interface werden vererbt
    }
}
