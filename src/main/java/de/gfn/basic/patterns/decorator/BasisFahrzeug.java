package de.gfn.basic.patterns.decorator;

public class BasisFahrzeug implements Fahrzeug {
    @Override
    public void zusammenbauen() {
        System.out.println("Basis Fahrzeug");
    }
}
