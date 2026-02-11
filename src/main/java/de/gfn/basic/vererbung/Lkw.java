package de.gfn.basic.vererbung;

public class Lkw extends Fahrzeug {

    public Lkw() {
        System.out.println("K: Lkw");
    }

    void gibGas(int kmh) {
        if(kmh > 0 && kmh < 120) {
            this.kmh = kmh;
        }
    }
}
