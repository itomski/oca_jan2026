package de.gfn.basic;

public class Konstruktoren2 {

    int i;
    int j;

    public static void main(String[] args) {

        Konstruktoren2 k;
        // k = new Konstruktoren2();
        k = new Konstruktoren2(100);
        k.hashCode();

    }

    // Ein eigener Konstruktor verhindert, dass ein Default-Konstruktor bereitgestellt wird

    public Konstruktoren2() {
        // ruft automatich den parameterlosen Konstruktor der Elternklasse auf
        //super(); // wird automatich ausgeführt
        System.out.println("LEER");
    }

    public Konstruktoren2(int zahl) {
        // super(); oder
        this();
        System.out.println("ZAHL");
    }

    public Konstruktoren2(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
