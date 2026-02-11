package de.gfn.basic.vererbung;

public class VererbungsTest2 {

    public static void main(String[] args) {
        // Referenztyp: CC1
        // Objekttyp: CC2 (auf dem Heap)
        CC1 cc = new CC2();

        // Objekttyp wird NUR beim Aufruf von Instanzmethoden verwendet!!!!!!!

        // wird auf dem Objekttyp ausgeführt
        cc.doSomething();

        // wird auf dem Referenztyp ausgeführt, da static
        cc.doSomethingElse(); // CC1.doSomethingElse();

        // Attribute werden immer über den Referenztyp abgefragt
        System.out.println(cc.zahl);

        System.out.println(cc.staticZahl); // CC1.staticZahl;

        System.out.println(cc.getZahl());
    }
}

class CC1 {

    int zahl = 100;
    static int staticZahl = 200;

    void doSomething() {
        System.out.println("Instanz Methode CC1");
    }

    static void doSomethingElse() {
        System.out.println("Statische Methode CC1");
    }

    public int getZahl() {
        return zahl; // Variable wird in der nähe gesucht
    }
}

class CC2 extends CC1 {

    int zahl = 300;
    static int staticZahl = 400;

    void doSomething() {
        System.out.println("Instanz Methode CC2");
    }

    static void doSomethingElse() {
        System.out.println("Statische Methode CC2");
    }

    @Override
    public int getZahl() {
        return zahl;
    }
}
