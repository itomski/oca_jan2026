package de.gfn.basic.patterns.decorator;

public class FahrzeugDecorator implements Fahrzeug {

    private Fahrzeug fahrzeug;

    public FahrzeugDecorator(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    @Override
    public void zusammenbauen() {
        fahrzeug.zusammenbauen();
    }
}
