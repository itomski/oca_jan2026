package de.gfn.basic.patterns.singleton;

public enum EnumSingleton {

    INSTANCE;

    private int zahl;

    EnumSingleton() {
        System.out.println("CREATE: EnumSingleton");
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
