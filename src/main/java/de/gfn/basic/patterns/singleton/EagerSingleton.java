package de.gfn.basic.patterns.singleton;

public class EagerSingleton {

    private final static EagerSingleton instance = new EagerSingleton();

    private int zahl;

    private EagerSingleton() {
        System.out.println("CREATE: EagerSingleton");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
