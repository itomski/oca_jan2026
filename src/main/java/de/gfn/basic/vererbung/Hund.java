package de.gfn.basic.vererbung;

import de.gfn.basic.Vererbung;

// Tier ist die Elternklasse
// Hund ist die Kindklasse
public class Hund extends Tier {

    String rasse;

    public Hund() {
        // super();
        System.out.println("C: Hund");
    }

    @Override
    String getInfo() {
        // Zugriff auf private Eigenschaften der Elternklasse nur über öffentliche Getter und Setter möglich
        //return getName() + ", " +  getAlter() + ", " + rasse;

        // this = Referenz auf dieses Objekt
        // super = Referenz auf ein Objekt der Elternklasse
        return super.getInfo() + ", " + rasse;
    }
}
