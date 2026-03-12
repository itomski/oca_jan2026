package de.gfn.basic;

public class HidingTest {

    static {
        y = 30;
    }

    int j = y;
    static int y = 10;


    public static void main(String[] args) {

        A1 a = new A2();
        // Variablen und statische Methoden werden IMMER auf dem Referenztyp ausgeführt
        System.out.println(a.i);

        // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt
        System.out.println(a.getI());
    }
}

class A1 {

    int i = 10;

    public int getI() {
        return i;
    }
}


class A2 extends A1 {

    int i = 20;

    public int getI() {
        return i;
    }
}