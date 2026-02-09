package de.gfn.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parkhaus {

    private List<Fahrzeug>  fahrzeuge = new ArrayList<>();

    public boolean einparken(Fahrzeug fahrzeug) {
        return fahrzeuge.add(fahrzeug);
    }

    public boolean ausparken(String kennzeichen) {
        return fahrzeuge.removeIf(f -> f.getKennzeichen().equals(kennzeichen));
        // throw  new UnsupportedOperationException("Noch nicht eingebaut");
    }

    public List<Fahrzeug> getFahrzeuge() {
        return Collections.unmodifiableList(fahrzeuge); // Gibt eine nicht veränderbare Liste zurück
    }

//    public void print() {
//        for(Fahrzeug f : fahrzeuge) {
//            System.out.println(f);
//        }
//    }
}
