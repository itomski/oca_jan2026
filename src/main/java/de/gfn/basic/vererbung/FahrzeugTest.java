package de.gfn.basic.vererbung;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class FahrzeugTest {

    public static void main(String[] args) {

        Pkw p1 = new Pkw();
        p1.setKennzeichen("HH-AB123");
        p1.setMarke("Ford");
        p1.setModell("Mustang");
        p1.gibGas(200);

        // IS-A wird durch Vererbung realisiert
        // HAS-A wird durch ein Attribut passender Klasse realisiert


        Fahrzeug f1 = p1; // Pkw IS-A Fahrzeug
        f1.gibGas(20);

        f1 = new Lkw();
        f1.gibGas(30);

        //f1 = new Fahrzeug(); // Error: Nicht möglich, da abstrakt

        AbstractCollection<Integer> coll = new ArrayList<>();

    }
}
