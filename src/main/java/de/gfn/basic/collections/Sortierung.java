package de.gfn.basic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortierung {

    public static void main(String[] args) {

        List<Fahrzeug> fahrzeuge  = new ArrayList<>();
        fahrzeuge.add(new Fahrzeug("HH-AB123", "Renault", "Scenic"));
        fahrzeuge.add(new Fahrzeug("B-XY123", "Fiat", "Panda"));
        fahrzeuge.add(new Fahrzeug("HB-ZE789", "Renault", "R4"));
        fahrzeuge.add(new Fahrzeug("OD-VX345", "Ford", "Mustang"));

        Collections.sort(fahrzeuge);

        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f);
        }
    }
}
