package de.gfn.basic.vererbung;

import java.time.LocalTime;

public class InitializerTest {

    public static void main(String[] args) {

        System.out.println(C2.class.getName()); // Hier wird der static Initializer nicht ausgeführt
        System.out.println(C2.zahl); // Hier schon!

        C2 c1 = new C2();

        System.out.println();

        C2 c2 = new C2(1);

    }
}

class C1 {

    static { // Werden beim Laden der Klasse ausgeführt
        // Können Klassenkonstanten belegen
        System.out.println("Static Initializer: C1");
    }

    // Instanzinitializer
    {
        System.out.println("Instanz-Initialiser: C1");
    }

    public C1() {
        // super();
        // <-- Hier direkt nach dem Konstruktor der Elternklasse ausgeführt
        System.out.println("K: C1");
    }
}

class C2 extends C1 {

    static final int zahl;

    private String name;

    static { // Werden beim Laden der Klasse ausgeführt
        // Können Klassenkonstanten belegen
        System.out.println("Static Initializer: C2");
        zahl = 1;
    }

    // Instanzinitializer
    {
        System.out.println("Instanz-Initialiser: C2");
//        if (LocalTime.now().getHour() < 12) {
//            name = "little";
//        }
//        else {
//            name = "big";
//        }
    }

    public C2() {
        //super();
        // <-- Hier direkt nach dem Konstruktor der Elternklasse ausgeführt
        System.out.println("K: C2");
    }

    public C2(int i) {
        this();
        System.out.println("K: C2 (mit Parameter)");
    }
}
