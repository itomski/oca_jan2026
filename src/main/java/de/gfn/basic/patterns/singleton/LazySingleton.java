package de.gfn.basic.patterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private int zahl;

    private LazySingleton() {
        System.out.println("CREATE: LazySingleton");
    }

    public static LazySingleton getInstance() {
        // Double-Checked Locking nötig im parallelen Umfeld
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
